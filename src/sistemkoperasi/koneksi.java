package sistemkoperasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn;

    public static Connection getKoneksi() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://127.0.0.1:3306/db_koperasi";
                String user = "root";
                String pass = "123456";

                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);

                System.out.println("Koneksi database berhasil");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Koneksi database gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}