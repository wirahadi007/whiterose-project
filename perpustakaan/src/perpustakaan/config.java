package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class config {
    com.mysql.jdbc.Connection con;
    Statement stm;
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/perpustakaan"; 
            String user="root"; 
            String pass="password"; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("Error Connection "+e.getMessage()); 
        }
        return mysqlconfig;
    }    
}