package DBSProject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnection {
    
    Connection con=null;
       public Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger123");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, null, JOptionPane.WARNING_MESSAGE);
        }
        return con;
       }
    
    
}
