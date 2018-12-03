package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import model.Livro;
import utils.CriaConexao;

public class Biblioteca {

    public static void main(String[] args) throws SQLException, ParseException {
//        JFPrincipal principal = new JFPrincipal();
//        principal.setVisible(true);
//        System.out.println("Conectando ao bdasdasdanco de dados.");

//        Livro l = new Livro();
//        short a  = 34;
//        l.setAno(a);
//        l.setId(3);
//        System.out.println(l.getId());

        
      Livro l = new Livro();
      l.setExemplar("a");
      l.getExemplar();
      System.out.println(l.getExemplar());  
        
    }
    
}
