/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinepolisswingapplicatie;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed
 */
public class TabelModel {
    Connection conn;
    DefaultTableModel dtm;
    Statement stmt;
    
    public DefaultTableModel GetFilms (String sql){
        conn = Connectie.connect();
        try {
            Vector kolomNaam = new Vector();
            Vector gegevens = new Vector();
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int kolommen = rsmd.getColumnCount();
            for(int i = 1;1<=kolommen;i++){
                kolomNaam.addElement(rsmd.getColumnName(i));
            }
            while(rs.next()){
                Vector rij = new Vector(kolommen);
                for(int i = 1; i<= kolommen; i++){
                    rij.addElement(rs.getObject(i));
                }
                gegevens.add(rij);
            }
            dtm = new DefaultTableModel(gegevens, kolomNaam);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return dtm;
    }
    
    
    
}
