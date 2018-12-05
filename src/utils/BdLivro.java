/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Livro;


public class BdLivro {
    
    private /*@ nullable @*/ Connection conexao;
    private /*@ spec_public nullable @*/ List<Livro> lista = new ArrayList<>();
    private /*@ spec_public nullable @*/ int cont_list = 0;
    
    public BdLivro() throws SQLException {       
        this.conexao = CriaConexao.getConexao();
    }

    /*@	requires l.exemplar != null && !l.exemplar.equals("");
	@*/
    public void adicionaLivro(Livro l) throws SQLException {    	
        String sql = "INSERT INTO livro(exemplar, autor, edicao, ano, disponibilidade)"
                + "VALUES(?, ?, ?, ?, ?)";       
        PreparedStatement stmt;
        
        stmt = this.conexao.prepareStatement(sql);
        
        stmt.setString(1, l.getExemplar());
        stmt.setString(2, l.getAutor());
        stmt.setString(3, String.valueOf(l.getEdicao()));
        stmt.setString(4, String.valueOf(l.getAno()));
        stmt.setString(5, l.getDisponibilidade());
        
        stmt.execute();
        stmt.close();
        
    }
    

    /* @ ensures (\forall int i; 0 <= i && i < cont_list;
    @ 					lista.get(i) !=  null);  		
    @*/
    public List<Livro> getLista(String exemplar) throws SQLException{
    	lista.clear();
    	cont_list = 0;
    	
        String sql = "SELECT * FROM livro WHERE exemplar like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, exemplar);
        
        ResultSet rs = stmt.executeQuery();
        
        
        
        while(rs.next()) {
        	cont_list ++;
            Livro l = new Livro();
            l.setId(Integer.valueOf(rs.getString("id_livro")));
            l.setExemplar(rs.getString("exemplar"));
            l.setAutor(rs.getString("autor"));
            l.setEdicao(Byte.valueOf(rs.getString("edicao")));
            l.setAno(Short.valueOf(rs.getString("ano")));
            l.setDisponibilidade(rs.getString("disponibilidade"));
            
            lista.add(l);            
        }
        
        rs.close();
        stmt.close();
        
        return lista;          
    }
    
    /* @ requires l.id > 0 
    @*/
    public void altera(Livro l) throws SQLException {
        String sql = "UPDATE livro set exemplar=?, autor=?, edicao=?, ano=?, disponibilidade=?"
                + "WHERE id_livro=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        stmt.setString(1, l.getExemplar());
        stmt.setString(2, l.getAutor());
        stmt.setString(3, String.valueOf(l.getEdicao()));
        stmt.setString(4, String.valueOf(l.getAno()));
        stmt.setString(5, l.getDisponibilidade());
        stmt.setInt(6, l.getId());
        
        stmt.execute();
        stmt.close();
    }
    
    
    public void alteraDisponibilidadeLivro(Livro l) throws SQLException {
        String sql = "UPDATE livro set disponibilidade=?"
                + "WHERE id_livro=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        stmt.setString(1, l.getDisponibilidade());
        stmt.setInt(2, l.getId());
        
        stmt.execute();
        stmt.close();
    }
    
    /* @ requires l.id > 0 
    @*/
    public void remove(int id) throws SQLException {       
        String sql = "DELETE FROM livro WHERE id_livro=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }
   

}
