/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kinepolis;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed
 */
public class VerantwoordelijkeScherm extends javax.swing.JFrame {
    
    JFileChooser fileChooser;
    Connection conn;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    int id;
    String foto;
    File f;
    FileInputStream fins;
    java.util.Date uitgifteJaar;
    java.sql.Date uitgifteJaarConvertToDB;
    
    

    /**
     * Creates new form VerantwoordelijkeScherm
     */
    public VerantwoordelijkeScherm() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTitelToevoegen = new javax.swing.JTextField();
        cbxGenreToevoegen = new javax.swing.JComboBox();
        txtRegisseurToevoegen = new javax.swing.JTextField();
        txtScoreToevoegen = new javax.swing.JTextField();
        chk3DToevoegen = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtActeurToevoegen = new javax.swing.JTextField();
        btnFotoToevoegen = new javax.swing.JButton();
        lblFotoTonen = new javax.swing.JLabel();
        btnFilmOpslaan = new javax.swing.JButton();
        btnFilmWijzigen = new javax.swing.JButton();
        btnFilmVerwijderen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Titel");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Genre");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Regisseur");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Uitgiftejaar");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Score");

        cbxGenreToevoegen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Actie", "Actiekomedie", "Animatie", "Avontuur", "Biografische film", "Drama", "Fantasy", "Historisch", "Horror", "Jeugd", "Komedie", "Liefde/romantiek", "Musical", "Oorlog", "Romantische komedie", "Science fiction", "Thriller" }));

        chk3DToevoegen.setText("3D");
        chk3DToevoegen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Acteur");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        btnFotoToevoegen.setText("...");
        btnFotoToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoToevoegenActionPerformed(evt);
            }
        });

        btnFilmOpslaan.setText("Film opslagen");
        btnFilmOpslaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmOpslaanActionPerformed(evt);
            }
        });

        btnFilmWijzigen.setText("Film wijzigen");
        btnFilmWijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmWijzigenActionPerformed(evt);
            }
        });

        btnFilmVerwijderen.setText("Film verwijderen");
        btnFilmVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmVerwijderenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitelToevoegen)
                            .addComponent(cbxGenreToevoegen, 0, 325, Short.MAX_VALUE)
                            .addComponent(txtActeurToevoegen)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegisseurToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtScoreToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFilmVerwijderen)
                                .addGap(28, 28, 28)
                                .addComponent(btnFilmOpslaan)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk3DToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFilmWijzigen))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnFotoToevoegen)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFotoTonen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTitelToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbxGenreToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtActeurToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRegisseurToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblFotoTonen, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtScoreToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk3DToevoegen)))))
                    .addComponent(btnFotoToevoegen))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilmOpslaan)
                    .addComponent(btnFilmWijzigen)
                    .addComponent(btnFilmVerwijderen))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilmOpslaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmOpslaanActionPerformed
        // TODO add your handling code here:
        if(fileChooser==null){
            foto="noimageavailable.png";
            
        }
        else{
            foto=fileChooser.getSelectedFile().toString();
            
        }
        
        IDOpvragen();
        try {
            f=new File(foto);
            fins = new FileInputStream(f);
            conn = Connectie.connect();
            String sql = "insert into film values (?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, txtTitelToevoegen.getText());
            ps.setString(3, (String)cbxGenreToevoegen.getSelectedItem());
            ps.setString(4, txtActeurToevoegen.getText());
            ps.setString(5, txtRegisseurToevoegen.getText());
            uitgifteJaar = jDateChooser1.getDate();
            uitgifteJaarConvertToDB = new java.sql.Date(uitgifteJaar.getTime());
            ps.setDate(6, uitgifteJaarConvertToDB);
            ps.setDouble(7, Double.parseDouble(txtScoreToevoegen.getText()));
            ps.setBinaryStream(8, fins);
            if (chk3DToevoegen.isSelected() == true) {
                ps.setString(9, "true");
            }
            else{
                ps.setString(9, "false");
            }
            ps.execute();
            JOptionPane.showMessageDialog(null, "Film toegevoegd!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnFilmOpslaanActionPerformed

    private void btnFotoToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoToevoegenActionPerformed
        // TODO add your handling code here:
        fileChooser = new JFileChooser();
        try {
            lblFotoTonen.setIcon(null);
            fileChooser.showOpenDialog(null);
            File fc = new File(fileChooser.getSelectedFile().toString());
            Image foto = ImageIO.read(fc);
            
            Image foto1= foto.getScaledInstance(lblFotoTonen.getHeight(), lblFotoTonen.getWidth(), WIDTH);
            lblFotoTonen.setIcon(new ImageIcon(foto1));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFotoToevoegenActionPerformed

    private void btnFilmWijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmWijzigenActionPerformed
        // TODO add your handling code here:
        if(fileChooser==null){
            foto="noimageavailable.png";
            
        }
        else{
            foto=fileChooser.getSelectedFile().toString();
            
        }
        
        IDOpvragen();
        try {
            f=new File(foto);
            fins = new FileInputStream(f);
            conn = Connectie.connect();
            String sql = "update film set Titel=?,Genre=?,Acteur=?,Regisseur=?,Uitgiftejaar=?,"
                    + "Score=?, Foto=?, 3D=? where FilmID=?";
                            
            ps = conn.prepareStatement(sql);
            ps.setInt(9, 1);
            ps.setString(1, txtTitelToevoegen.getText());
            ps.setString(2, (String)cbxGenreToevoegen.getSelectedItem());
            ps.setString(3, txtActeurToevoegen.getText());
            ps.setString(4, txtRegisseurToevoegen.getText());
            uitgifteJaar = jDateChooser1.getDate();
            uitgifteJaarConvertToDB = new java.sql.Date(uitgifteJaar.getTime());
            ps.setDate(5, uitgifteJaarConvertToDB);
            ps.setDouble(6, Double.parseDouble(txtScoreToevoegen.getText()));
            ps.setBinaryStream(7, fins);
            if (chk3DToevoegen.isSelected() == true) {
                ps.setString(8, "true");
            }
            else{
                ps.setString(8, "false");
            }
            ps.execute();
            JOptionPane.showMessageDialog(null, "Film gewijzigd!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnFilmWijzigenActionPerformed

    private void btnFilmVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmVerwijderenActionPerformed
        // TODO add your handling code here:
        conn = Connectie.connect();
        String sql = "Delete from film where FilmID=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Film verwijderd!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnFilmVerwijderenActionPerformed

    void IDOpvragen(){
        conn = Connectie.connect();
        String sql ="select ifnull(max(FilmID)+1,1)from film";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               id=rs.getInt(1);
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(VerantwoordelijkeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerantwoordelijkeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerantwoordelijkeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerantwoordelijkeScherm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerantwoordelijkeScherm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilmOpslaan;
    private javax.swing.JButton btnFilmVerwijderen;
    private javax.swing.JButton btnFilmWijzigen;
    private javax.swing.JButton btnFotoToevoegen;
    private javax.swing.JComboBox cbxGenreToevoegen;
    private javax.swing.JCheckBox chk3DToevoegen;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFotoTonen;
    private javax.swing.JTextField txtActeurToevoegen;
    private javax.swing.JTextField txtRegisseurToevoegen;
    private javax.swing.JTextField txtScoreToevoegen;
    private javax.swing.JTextField txtTitelToevoegen;
    // End of variables declaration//GEN-END:variables
}
