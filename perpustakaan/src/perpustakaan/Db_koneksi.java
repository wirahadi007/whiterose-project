/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

    import com.mysql.jdbc.Driver;
    import java.sql.DriverManager;
    import java.sql.Connection;
    import java.sql.SQLException;

    /**
     *
     * @author Faw
     */
    public class Db_koneksi {
        public static Connection koneksi;
        
        public static Connection getConnection()throws SQLException {
            if (koneksi == null) {
                new Driver();
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","password");
            }
            return koneksi;
        }
    }


