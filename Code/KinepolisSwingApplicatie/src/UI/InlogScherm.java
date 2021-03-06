/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.BeheerderScherm;
import UI.BalieMedewerkerScherm;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import kinepolisswingapplicatie.Connectie;

/**
 *
 * @author Mohamed
 */
public class InlogScherm extends javax.swing.JFrame {
        Connection conn;
    BalieMedewerkerScherm balie = new BalieMedewerkerScherm();
    BeheerderScherm beheerder = new BeheerderScherm();
    VerantwoordelijkeScherm verantwoordelijke = new VerantwoordelijkeScherm();

    /**
     * Creates new form InlogScherm
     */
    public InlogScherm() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        txtAccountInloggen = new javax.swing.JTextField();
        lblPaswoord = new javax.swing.JLabel();
        btnInloggen = new javax.swing.JButton();
        btnAfsluiten = new javax.swing.JButton();
        txtPaswoordInloggen = new javax.swing.JPasswordField();
        lblDBConnectiviteit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(135, 206, 235));

        lblAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount.setText("Account");

        txtAccountInloggen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPaswoord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPaswoord.setForeground(new java.awt.Color(255, 255, 255));
        lblPaswoord.setText("Paswoord");

        btnInloggen.setText("Login");
        btnInloggen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInloggenActionPerformed(evt);
            }
        });

        btnAfsluiten.setText("Afsluiten");
        btnAfsluiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfsluitenActionPerformed(evt);
            }
        });

        txtPaswoordInloggen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblDBConnectiviteit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDBConnectiviteit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kinepolisHoofding.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblPaswoord))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblAccount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnInloggen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAfsluiten, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPaswoordInloggen, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(txtAccountInloggen, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(lblDBConnectiviteit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccountInloggen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblPaswoord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaswoordInloggen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInloggen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAfsluiten, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDBConnectiviteit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(423, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInloggenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInloggenActionPerformed
        // TODO add your handling code here:
        conn = Connectie.connect();
        String sql = "select * from personeel";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if(rs.getString("Account").equals(txtAccountInloggen.getText()) && rs.getString("Paswoord").equals((String)txtPaswoordInloggen.getText())
                    && rs.getString("Functie").equals("Balie"))
                {
                    balie.setVisible(true);
                    break;
                }
                else if(rs.getString("Account").equals(txtAccountInloggen.getText()) && rs.getString("Paswoord").equals((String)txtPaswoordInloggen.getText())
                    && rs.getString("Functie").equals("Beheerder"))
                {
                    beheerder.setVisible(true);
                    break;
                }
                else if(rs.getString("Account").equals(txtAccountInloggen.getText()) && rs.getString("Paswoord").equals((String)txtPaswoordInloggen.getText())
                    && rs.getString("Functie").equals("Verantwoordelijke"))
                {
                    verantwoordelijke.setVisible(true);
                    break;
                }
                lblDBConnectiviteit.setOpaque(true);
                lblDBConnectiviteit.setBackground(Color.GREEN);
                lblDBConnectiviteit.setText("DATABASE ONLINE");

            }
        if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Foutieve inloggegevens!");
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            

        }

    }//GEN-LAST:event_btnInloggenActionPerformed

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnAfsluitenActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(InlogScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InlogScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InlogScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InlogScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InlogScherm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfsluiten;
    private javax.swing.JButton btnInloggen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblDBConnectiviteit;
    private javax.swing.JLabel lblPaswoord;
    private javax.swing.JTextField txtAccountInloggen;
    private javax.swing.JPasswordField txtPaswoordInloggen;
    // End of variables declaration//GEN-END:variables
}
