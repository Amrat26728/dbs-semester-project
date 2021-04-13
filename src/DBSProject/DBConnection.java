
package DBSProject;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
    Connection con=null;
       public Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
       }
    
    
}
