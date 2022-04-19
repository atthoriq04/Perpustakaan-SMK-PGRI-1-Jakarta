/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Atthoriq
 */
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public LandingPage() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        lihatKatalog = new javax.swing.JButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        toLogin = new javax.swing.JLabel();
        toKunjungan = new javax.swing.JLabel();
        toTentang = new javax.swing.JLabel();
        toLandingPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkTransparentControls(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel3.setText("Perpustakaan SMK PGRI 1 Jakarta ");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel2.setText("Literasi Mencerdaskan");

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        lihatKatalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Lihat Katalog 1.png"))); // NOI18N
        lihatKatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lihatKatalogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lihatKatalogMouseExited(evt);
            }
        });
        lihatKatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatKatalogActionPerformed(evt);
            }
        });

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(lihatKatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(473, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(lihatKatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        lihatKatalog.setBorderPainted(false);
        lihatKatalog.setContentAreaFilled(false);
        lihatKatalog.setFocusPainted(false);
        lihatKatalog.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void lihatKatalogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatKatalogMouseEntered
        lihatKatalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Lihat Katalog 2.png")));
    }//GEN-LAST:event_lihatKatalogMouseEntered

    private void lihatKatalogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatKatalogMouseExited
       lihatKatalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Lihat Katalog 1.png")));
    }//GEN-LAST:event_lihatKatalogMouseExited

    private void lihatKatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatKatalogActionPerformed
        Katalog obj = new Katalog();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lihatKatalogActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
       Detail obj = new Detail();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void toLandingPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLandingPageMouseEntered
        toLandingPage.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toLandingPageMouseEntered

    private void toLandingPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLandingPageMouseExited
        toLandingPage.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toLandingPageMouseExited

    private void toTentangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTentangMouseEntered
        toTentang.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toTentangMouseEntered

    private void toTentangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTentangMouseExited
        toTentang.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toTentangMouseExited

    private void toKunjunganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKunjunganMouseEntered
        toKunjungan.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toKunjunganMouseEntered

    private void toKunjunganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKunjunganMouseExited
        toKunjungan.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toKunjunganMouseExited

    private void toLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginMouseEntered
        toLogin.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toLoginMouseEntered

    private void toLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginMouseExited
        toLogin.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_toLoginMouseExited

    private void toLandingPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLandingPageMouseClicked
        LandingPage obj = new LandingPage();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toLandingPageMouseClicked

    private void toTentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toTentangMouseClicked
        TentangPerpus obj = new TentangPerpus();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toTentangMouseClicked

    private void toKunjunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKunjunganMouseClicked
       Kunjungan obj = new Kunjungan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toKunjunganMouseClicked

    private void toLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginMouseClicked
       Login obj = new Login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toLoginMouseClicked

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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton lihatKatalog;
    private javax.swing.JLabel toKunjungan;
    private javax.swing.JLabel toLandingPage;
    private javax.swing.JLabel toLogin;
    private javax.swing.JLabel toTentang;
    // End of variables declaration//GEN-END:variables

    private void setBorder(Border createEmptyBorder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
