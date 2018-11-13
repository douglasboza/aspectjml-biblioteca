package view;

import java.sql.SQLException;
import java.text.ParseException;

public class Biblioteca {

//	private /*@ spec_public @*/ int age;
//	/*@ requires a == 150;
//	@ assignable age;
//	@ ensures age == a;
//	@ also
//	@ requires a < 0;
//	@ assignable \nothing;
//	@ ensures age == \old(age);
//	@*/
//	public void setAge(int a) { 
//		if (0 <= a && a <= 150) { 
//			age = a; 
//		} 
//	}

    public static void main(String[] args) throws SQLException, ParseException {
        JFPrincipal principal = new JFPrincipal();
        principal.setVisible(true);
        
    }
    
}
