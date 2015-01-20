/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BO.Film;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mohamed
 */
public class DaFilm {
    public static Connection GetConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");
    }
    
    public List<Film> GetAll(boolean pastOnly){
        ArrayList<Film> antwoord = new ArrayList<>();
        try {
            Connection conn = GetConnection();
            String sql = "SELECT * FROM films";
            if (pastOnly) sql += "WHERE Uitgiftejaar<'"+ new java.sql.Date(new java.util.Date().getTime()) + "'";
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {                
                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(rs.getDate("Uitgiftejaar"));
                Film f = new Film(
                        rs.getInt("FilmID"),
                        rs.getString("Titel"),
                        rs.getString("Genre"),
                        rs.getString("Acteur"), 
                        rs.getString("Regisseur"), 
                        cal1, 
                        rs.getDouble("Score"), 
                        rs.getBlob("Foto"), 
                        rs.getString("3D"));
                        
                antwoord.add(f);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return antwoord;
    }
    
    
}
