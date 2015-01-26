/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static kinepolisswingapplicatie.Connectie.connect;

/**
 *
 * @author Mohamed
 */
public class CheckInputZalen {
    Connection conn;
    Statement st;
    ResultSet rs;
    public boolean controleLocaties(String locatie){
        conn=connect();
        String sql= "select Locatie from zalen  where  Locatie='"+locatie+"'";
        try {
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()) {
               
                  return true;
              
              
            }
        } catch (Exception e) {
        }
        return false;
    }
    
}
