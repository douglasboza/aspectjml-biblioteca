package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import model.Cliente;
import model.Livro;
import utils.CriaConexao;

public class Biblioteca {

    public static void main(String[] args) throws SQLException, ParseException {
        JFPrincipal principal = new JFPrincipal();
        principal.setVisible(true);
    	
    	// Teste invariante edição
	    /*
	      Livro l = new Livro();
	      l.setEdicao((byte) 2);
	      l.setEdicao((byte) -12);
	      System.out.println(l.getEdicao());
		*/
    	
    	// Teste ano
	    /*
	      Livro l = new Livro();
	      l.setAno((byte) 2);
	      l.setEdicao((byte) -12);
	      System.out.println(l.getEdicao());
		*/
    	
//        Livro l = new Livro();
//        short a  = 34;
//        l.setAno(a);
//        l.setId(3);
//        System.out.println(l.getId());
//
//        
//      Livro l = new Livro();
//      l.setExemplar("a");
//      l.getExemplar();
//      System.out.println(l.getExemplar());  
//        
    }
    
}
