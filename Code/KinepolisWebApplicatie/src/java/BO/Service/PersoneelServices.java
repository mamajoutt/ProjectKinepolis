/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Service;

import BO.Personeel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed
 */
public class PersoneelServices {
    
    public List<Personeel> personeelLijstOphalen(){
        List<Personeel> personeelLijst = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from personeel ORDER BY PersoneelID");
            while(rs.next()){
                Personeel pers = new Personeel();
                pers.setPersoneelID(rs.getInt(1));
                pers.setAccount(rs.getString(2));
                pers.setPaswoord(rs.getString(3));
                pers.setFunctie(rs.getString(4));
                pers.setNaam(rs.getString(5));
                pers.setVoornaam(rs.getString(6));
                pers.setGsm(rs.getString(7));
                pers.setEmail(rs.getString(8));
                personeelLijst.add(pers);
            }
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersoneelServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        return personeelLijst;
    }
    
    public Personeel personeelOphalen(int personeelID){
        Personeel pers = null;
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");   
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from personeel where PersoneelID=" + personeelID);
            if(rs.next()){
                pers = new Personeel();
                pers.setPersoneelID(rs.getInt(1));
                pers.setAccount(rs.getString(2));
                pers.setPaswoord(rs.getString(3));
                pers.setFunctie(rs.getString(4));
                pers.setNaam(rs.getString(5));
                pers.setVoornaam(rs.getString(6));
                pers.setGsm(rs.getString(7));
                pers.setEmail(rs.getString(8));
            }
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersoneelServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if(stmt !=null){
                    stmt.close();
                }
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        
        return pers;
        
    }
    
    public void personeelToevoegen(Personeel p){
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");
            pstmt = conn.prepareStatement("insert into personeel(Account,Paswoord,Functie,Naam,Voornaam,GSM, Email) values (?,?,?,?,?,?,?)");
            pstmt.setString(1, p.getAccount());
            pstmt.setString(2, p.getPaswoord());
            pstmt.setString(3, p.getFunctie());
            pstmt.setString(4, p.getNaam());
            pstmt.setString(5, p.getVoornaam());
            pstmt.setString(6, p.getGsm());
            pstmt.setString(7, p.getEmail());
            pstmt.executeUpdate();
            System.out.println("insert gelukt!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersoneelServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
           
        
        
        
    }
    
    public void personeelVerwijderen(int personeelID){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");
            stmt = conn.createStatement();
            stmt.execute("delete from personeel where PersoneelID=" + String.valueOf(personeelID));
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersoneelServices.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
    }
    
    public void personeelWijzigen(Personeel p){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");
            pstmt = conn.prepareStatement("update personeel set Account=?, Paswoord=?, Functie=?, Naam=?, Voornaam=?, GSM=?, Email=? WHERE PersoneelID=?");
            pstmt.setString(1, p.getAccount());
            pstmt.setString(2, p.getPaswoord());
            pstmt.setString(3, p.getFunctie());
            pstmt.setString(4, p.getNaam() );
            pstmt.setString(5, p.getVoornaam());
            pstmt.setString(6, p.getGsm());
            pstmt.setString(7, p.getEmail());
            pstmt.setInt(8, p.getPersoneelID());
            
            pstmt.executeUpdate();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersoneelServices.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
    }
}
