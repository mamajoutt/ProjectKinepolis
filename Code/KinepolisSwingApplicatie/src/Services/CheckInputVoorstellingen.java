/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import kinepolisswingapplicatie.Connectie;

/**
 *
 * @author Mohamed
 */
public class CheckInputVoorstellingen {
    Connection conn = null;
    Statement st;
    ResultSet rs;
    
    public boolean controleerPlanningTijdstip(int zaalID, String tijdstip){
        conn= Connectie.connect();
        String sql = "select ZaalID,Tijdstip from voorstellingen where ZaalID='" + zaalID + "'and Tijdstip='" + tijdstip+"'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
//    public boolean controleer3DCompabiliteit(int filmID, int zaalID){
//        conn= Connectie.connect();
//        String sql= "select 3D,3DCompatibel from films,zalen where films.FilmID='"+filmID+"'and zalen.ZaalID='"+zaalID+"'";
//        try {
//            st = conn.createStatement();
//            rs = st.executeQuery(sql);
//            while (rs.next()) {
//               if(rs.getString("3D").equals("true")^ rs.getString("3DCompatibel").equals("false")){
//                  return true;
//               }
//              
//            }
//        } catch (Exception e) {
//        }
//        return false;
//    }
    
    
}
