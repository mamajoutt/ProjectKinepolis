/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kinepolis;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mohamed
 */
public class Connectie {
    Connection con = null;
    
    public static Connection connect(){
    try{
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3307/kinepolisdb?zeroDateTimeBehavior=convertToNull","root", "usbw");
    return con;
}
catch(Exception e){
    return null;
}
 

}
}


