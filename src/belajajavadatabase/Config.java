package belajajavadatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    // koneksi ke database
    private static Connection MySQLconfig;
    
    public static Connection configDB()throws SQLException {
        try {
            // meng set host/localhost & database
            String url = "jdbc:mysql://localhost:3306/belajarJavaDatabase";
            
            // username (default)
            String user = "root";
            
            // password (default)
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLconfig = DriverManager.getConnection(url, user, pass);
        }
        
        // jika koneksi gagal
        catch(SQLException e) {
            System.out.print("koneksi gagal" + e.getMessage());
        }
        
        return MySQLconfig;
    }
}
