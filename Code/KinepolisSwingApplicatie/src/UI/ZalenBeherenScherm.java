/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Services.CheckInputZalen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kinepolisswingapplicatie.Connectie;

/**
 *
 * @author Mohamed
 */
public class ZalenBeherenScherm extends javax.swing.JFrame {
    Connection conn;
    int id;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    DefaultTableModel dtm;
    BeheerderScherm beheerderScherm = new BeheerderScherm();
    CheckInputZalen checkInputZalen = new CheckInputZalen();
    
    /**
     * Creates new form ZalenBeherenScherm
     */
    public ZalenBeherenScherm() {
        initComponents();
        try {
            vulZalenTabel();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ZaalTabel = new javax.swing.JTable();
        btnZaalVerwijderen = new javax.swing.JButton();
        btnZaalWijzigen = new javax.swing.JButton();
        btnZaalToevoegen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLocatieZaalToevoegen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxAantalZitplaatsenZaalToevoegen = new javax.swing.JComboBox();
        lblZaalID = new javax.swing.JLabel();
        chk3DCompatibelZaalToevoegen = new javax.swing.JCheckBox();
        btnTerugNaarBeheerdersScherm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zalen beheren", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        ZaalTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ZaalTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZaalTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ZaalTabel);

        btnZaalVerwijderen.setText("Zaal verwijderen");
        btnZaalVerwijderen.setEnabled(false);
        btnZaalVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaalVerwijderenActionPerformed(evt);
            }
        });

        btnZaalWijzigen.setText("Zaal wijzigen");
        btnZaalWijzigen.setEnabled(false);
        btnZaalWijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaalWijzigenActionPerformed(evt);
            }
        });

        btnZaalToevoegen.setText("Zaal toevoegen");
        btnZaalToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaalToevoegenActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Locatie");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aantal zitplaatsen");

        cbxAantalZitplaatsenZaalToevoegen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "225", "250", "275", "300", " " }));

        lblZaalID.setForeground(new java.awt.Color(240, 240, 240));

        chk3DCompatibelZaalToevoegen.setText("3D compatibel?");

        btnTerugNaarBeheerdersScherm.setText("Terug naar voorstellingen");
        btnTerugNaarBeheerdersScherm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerugNaarBeheerdersSchermActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnTerugNaarBeheerdersScherm)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocatieZaalToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAantalZitplaatsenZaalToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(chk3DCompatibelZaalToevoegen)
                .addGap(165, 165, 165))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(lblZaalID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnZaalVerwijderen)
                        .addGap(18, 18, 18)
                        .addComponent(btnZaalWijzigen)
                        .addGap(18, 18, 18)
                        .addComponent(btnZaalToevoegen)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnTerugNaarBeheerdersScherm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(chk3DCompatibelZaalToevoegen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocatieZaalToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxAantalZitplaatsenZaalToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZaalVerwijderen)
                    .addComponent(btnZaalWijzigen)
                    .addComponent(btnZaalToevoegen))
                .addGap(22, 22, 22)
                .addComponent(lblZaalID))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(758, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnZaalVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaalVerwijderenActionPerformed
        // TODO add your handling code here:
        conn = kinepolisswingapplicatie.Connectie.connect();
        String sql = "Delete from zalen where ZaalID=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(lblZaalID.getText()));
            ps.execute();
            JOptionPane.showMessageDialog(null, "Zaal verwijderd!");
            vulZalenTabel();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnZaalVerwijderenActionPerformed

    private void btnZaalWijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaalWijzigenActionPerformed
        // TODO add your handling code here:
        try {
            conn = kinepolisswingapplicatie.Connectie.connect();
            String sql = "update zalen set Locatie=?,AantalPlaatsen=?,3DCompatibel=? where ZaalID=?";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(4, Integer.parseInt(lblZaalID.getText()));
            ps.setString(1, txtLocatieZaalToevoegen.getText());
            ps.setInt(2, Integer.parseInt(cbxAantalZitplaatsenZaalToevoegen.getSelectedItem().toString()));
            if (chk3DCompatibelZaalToevoegen.isSelected() == true) {
                ps.setString(3, "true");
            } else {
                ps.setString(3, "false");
            }
            ps.execute();
            JOptionPane.showMessageDialog(null, "Zaal met locatie " + txtLocatieZaalToevoegen.getText() +  " gewijzigd!");
            vulZalenTabel();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnZaalWijzigenActionPerformed

    private void btnZaalToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaalToevoegenActionPerformed
        // TODO add your handling code here:
        if(checkInputZalen.controleLocaties(txtLocatieZaalToevoegen.getText())==true){
             JOptionPane.showMessageDialog(null,"Zaal bestaat al in de lijst!","ok",JOptionPane.ERROR_MESSAGE);
             return;
        }
        IDOpvragen();
        try {
            conn = kinepolisswingapplicatie.Connectie.connect();
            String sql = "insert into zalen values (?,?,?,?)";
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.setString(2, txtLocatieZaalToevoegen.getText());
            ps.setInt(3, Integer.parseInt(cbxAantalZitplaatsenZaalToevoegen.getSelectedItem().toString()));
            if (chk3DCompatibelZaalToevoegen.isSelected() == true) {
                ps.setString(4, "true");
            } else {
                ps.setString(4, "false");
            }
            ps.execute();
            JOptionPane.showMessageDialog(null, "Zaal met locatie " + txtLocatieZaalToevoegen.getText() + " toegevoegd!");
            vulZalenTabel();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnZaalToevoegenActionPerformed

    private void ZaalTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZaalTabelMouseClicked
        // TODO add your handling code here:
        btnZaalWijzigen.setEnabled(true);
        btnZaalVerwijderen.setEnabled(true);
        int rij = ZaalTabel.getSelectedRow();
        
        lblZaalID.setText("" + ZaalTabel.getModel().getValueAt(rij, 0));
        txtLocatieZaalToevoegen.setText((String)ZaalTabel.getModel().getValueAt(rij, 1));
        cbxAantalZitplaatsenZaalToevoegen.setSelectedItem("" + ZaalTabel.getModel().getValueAt(rij, 2));
        String is3DZaal = ((String)ZaalTabel.getModel().getValueAt(rij, 3));
        if(is3DZaal.equals("true")){
            chk3DCompatibelZaalToevoegen.setSelected(true);
        }
        else {
            chk3DCompatibelZaalToevoegen.setSelected(false);
        }
    }//GEN-LAST:event_ZaalTabelMouseClicked

    private void btnTerugNaarBeheerdersSchermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerugNaarBeheerdersSchermActionPerformed
        // TODO add your handling code here:
        dispose();
        beheerderScherm.setVisible(true);
    }//GEN-LAST:event_btnTerugNaarBeheerdersSchermActionPerformed

    void IDOpvragen(){
        conn = Connectie.connect();
        String sql ="select ifnull(max(ZaalID)+1,1)from zalen";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               id=rs.getInt(1);
            }
        } catch (Exception e) {
        }
    }
    
    public void vulZalenTabel(){
    try {
            conn = Connectie.connect();
       
            Vector columnNames = new Vector(); 
            Vector data = new Vector();  
          
            String sql = "select * from zalen";
              Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(sql);  
             ResultSetMetaData metaData = rs.getMetaData();  
              int columns = metaData.getColumnCount(); 
               for (int i = 1; i <= columns; i++) {               
                 columnNames.addElement(metaData.getColumnName(i));    
               }
                while (rs.next()) {               
                    Vector row = new Vector(columns);   
                    for (int i = 1; i <= columns; i++) { 
                        row.addElement(rs.getObject(i));  
                }                
                data.addElement(row);
                 
                }
             dtm=new DefaultTableModel(data, columnNames);  
          ZaalTabel.setModel(dtm);  
    } 
    catch (Exception ex) {
       JOptionPane.showMessageDialog(null, ex.toString());
    }
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ZalenBeherenScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZalenBeherenScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZalenBeherenScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZalenBeherenScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZalenBeherenScherm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ZaalTabel;
    private javax.swing.JButton btnTerugNaarBeheerdersScherm;
    private javax.swing.JButton btnZaalToevoegen;
    private javax.swing.JButton btnZaalVerwijderen;
    private javax.swing.JButton btnZaalWijzigen;
    private javax.swing.JComboBox cbxAantalZitplaatsenZaalToevoegen;
    private javax.swing.JCheckBox chk3DCompatibelZaalToevoegen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblZaalID;
    private javax.swing.JTextField txtLocatieZaalToevoegen;
    // End of variables declaration//GEN-END:variables
}
