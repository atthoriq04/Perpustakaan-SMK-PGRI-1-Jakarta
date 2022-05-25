/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Atthoriq
 */
public class TentangPerpus extends javax.swing.JFrame {

    /**
     * Creates new form TentangPerpus
     */
    
         ResultSet rs = null;
    Connection CC = null;
    PreparedStatement pst = null;
    Statement stt;
    public TentangPerpus() {
        initComponents();
        CC = new koneksi().connect();
        getProfile();
    }
    public void getProfile(){
        try {
            
             stt = CC.createStatement();
            rs = stt.executeQuery("SELECT * From profile");
            if(rs.next()){
                toLandingPage.setText(rs.getString("Profil"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Katalog.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        toLogin = new javax.swing.JLabel();
        toKunjungan = new javax.swing.JLabel();
        toTentang = new javax.swing.JLabel();
        toLandingPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(229, 231, 238));
        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(229, 231, 238));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(229, 231, 238));
        jPanel12.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(229, 231, 238));
        jPanel13.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel69.setText("Heading");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel70.setText("Heading");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel71.setText("Heading");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        toLogin.setBackground(new java.awt.Color(255, 255, 255));
        toLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toLogin.setText("Login");
        toLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toLoginMouseExited(evt);
            }
        });

        toKunjungan.setBackground(new java.awt.Color(255, 255, 255));
        toKunjungan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toKunjungan.setText("Kunjungan");
        toKunjungan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toKunjunganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toKunjunganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toKunjunganMouseExited(evt);
            }
        });

        toTentang.setBackground(new java.awt.Color(255, 255, 255));
        toTentang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toTentang.setText("Tentang Perpustakaan");
        toTentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toTentangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toTentangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toTentangMouseExited(evt);
            }
        });

        toLandingPage.setBackground(new java.awt.Color(255, 255, 255));
        toLandingPage.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toLandingPage.setText("SMK PGRI 1 Jakarta");
        toLandingPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toLandingPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toLandingPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toLandingPageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(toLandingPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toTentang)
                .addGap(59, 59, 59)
                .addComponent(toKunjungan)
                .addGap(71, 71, 71)
                .addComponent(toLogin)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(toLogin)
                .addComponent(toKunjungan)
                .addComponent(toTentang)
                .addComponent(toLandingPage))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(766, 766, 766)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addContainerGap(434, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71))))
                .addGap(35, 35, 35)
                .addComponent(jLabel69)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void toLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginMouseClicked
        Login obj = new Login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toLoginMouseClicked

    private void toLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginMouseEntered
        toLogin.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toLoginMouseEntered

    private void toLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginMouseExited
        toLogin.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toLoginMouseExited

    private void toKunjunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKunjunganMouseClicked
        Kunjungan obj = new Kunjungan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toKunjunganMouseClicked

    private void toKunjunganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKunjunganMouseEntered
        toKunjungan.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toKunjunganMouseEntered

    private void toKunjunganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKunjunganMouseExited
        toKunjungan.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toKunjunganMouseExited

    private void toTentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTentangMouseClicked
        TentangPerpus obj = new TentangPerpus();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toTentangMouseClicked

    private void toTentangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTentangMouseEntered
        toTentang.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toTentangMouseEntered

    private void toTentangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTentangMouseExited
        toTentang.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toTentangMouseExited

    private void toLandingPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLandingPageMouseClicked
        LandingPage obj = new LandingPage();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toLandingPageMouseClicked

    private void toLandingPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLandingPageMouseEntered
        toLandingPage.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toLandingPageMouseEntered

    private void toLandingPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLandingPageMouseExited
        toLandingPage.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toLandingPageMouseExited

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
            java.util.logging.Logger.getLogger(TentangPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TentangPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TentangPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TentangPerpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TentangPerpus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel toKunjungan;
    private javax.swing.JLabel toLandingPage;
    private javax.swing.JLabel toLogin;
    private javax.swing.JLabel toTentang;
    // End of variables declaration//GEN-END:variables
}
