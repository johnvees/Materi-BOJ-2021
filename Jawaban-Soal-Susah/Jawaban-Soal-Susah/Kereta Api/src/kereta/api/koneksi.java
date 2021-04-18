/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kereta.api;

/**
 *
 * @author ANANDA
 */
import java.sql.*;
import javax.swing.*;

public class koneksi {
    private static Connection conn;
    public static Connection connDB() throws SQLException {
        try {
            //deklarasi variabel
            //nama databse
            String db = "jdbc:mysql://localhost/kereta_api";
            //user database
            String username = "root";
            //pass database
            String password = "";
            //ambil driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //tes koneksi
            conn = (Connection) DriverManager.getConnection(db, username, password);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return conn;
    }
}
