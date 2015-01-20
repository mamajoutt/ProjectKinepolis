/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinepolisswingapplicatie;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mohamed
 */
public class Connectie {
    Connection conn = null;
    
    public static Connection connect(){
        try{
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb","root", "usbw");
            return conn;
        }
        catch(Exception e){
            return null;
        }  
    }
}
