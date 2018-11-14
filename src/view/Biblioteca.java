package view;

import java.sql.SQLException;
import java.text.ParseException;

import model.Livro;

public class Biblioteca {

    public static void main(String[] args) throws SQLException, ParseException {
//        JFPrincipal principal = new JFPrincipal();
//        principal.setVisible(true);
        Livro l = new Livro();
        short a  = 34;
        l.setAno(a);
    }
    
}
