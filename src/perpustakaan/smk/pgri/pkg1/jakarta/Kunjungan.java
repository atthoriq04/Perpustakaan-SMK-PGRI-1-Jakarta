/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
/**
 *
 * @author Atthoriq
 */
public class Kunjungan extends javax.swing.JFrame {

    /**
     * Creates new form Kunjungan
     */
    public ResultSet rst;
    Connection CC = new koneksi().connect();
    public Statement stt;
    public DefaultTableModel tmdl;
    public PreparedStatement prst;
    public Kunjungan() {
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

        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        Siswa = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Tamu = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        form1 = new javax.swing.JTextField();
        form2 = new javax.swing.JTextField();
        form3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        toLogin = new javax.swing.JLabel();
        toKunjungan = new javax.swing.JLabel();
        toTentang = new javax.swing.JLabel();
        toLandingPage = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(229, 231, 238));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        text1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text1.setText("Nama");

        text2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text2.setText("Email");

        text3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text3.setText("Instansi");

        Siswa.setBackground(new java.awt.Color(188, 190, 208));
        Siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SiswaMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Siswa");

        javax.swing.GroupLayout SiswaLayout = new javax.swing.GroupLayout(Siswa);
        Siswa.setLayout(SiswaLayout);
        SiswaLayout.setHorizontalGroup(
            SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiswaLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel9)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        SiswaLayout.setVerticalGroup(
            SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tamu.setBackground(new java.awt.Color(250, 250, 250));
        Tamu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TamuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TamuMouseEntered(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tamu");

        javax.swing.GroupLayout TamuLayout = new javax.swing.GroupLayout(Tamu);
        Tamu.setLayout(TamuLayout);
        TamuLayout.setHorizontalGroup(
            TamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TamuLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TamuLayout.setVerticalGroup(
            TamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TamuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(2, 117, 216));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Siswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tamu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(text3)
                            .addGap(325, 325, 325))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(text2)
                            .addGap(340, 340, 340))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text1)
                    .addComponent(form1)
                    .addComponent(form2)
                    .addComponent(form3))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tamu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Siswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(text3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel5.setBackground(new java.awt.Color(229, 231, 238));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
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
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(toLogin)
                .addComponent(toKunjungan)
                .addComponent(toTentang)
                .addComponent(toLandingPage))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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

    private void SiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiswaMouseClicked
        Tamu.setBackground(new java.awt.Color(188, 190, 208));
        Siswa.setBackground(new java.awt.Color(255, 255, 255));
        int status = 1;
        text2.setVisible(false);
        text3.setVisible(false);
        text1.setText("NIS");
        form2.setVisible(false);
        form3.setVisible(false);
        
    }//GEN-LAST:event_SiswaMouseClicked

    private void TamuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TamuMouseEntered

    private void TamuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamuMouseClicked
       Siswa.setBackground(new java.awt.Color(188, 190, 208));
        Tamu.setBackground(new java.awt.Color(255, 255, 255));
        text2.setVisible(true);
        text3.setVisible(true);
        text1.setText("Nama");
        form2.setVisible(true);
        form3.setVisible(true);
    }//GEN-LAST:event_TamuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        if(text1.getText()== "Nama"){
        try{
            stt = CC.createStatement();
            stt.executeUpdate("INSERT INTO pengunjung(Nama,Email,Instansi,TanggalKunjungan) VALUES('"+ form1.getText() + "','" 
                    + form2.getText() + "','"
                    + form3.getText() + "','"
                    + dtf.format(now)+ "')");
            JOptionPane.showMessageDialog(null, "Terima Kasih Telah Berkunjung");
        }catch(Exception e){
            e.printStackTrace();
        }
           
       }else if(text1.getText()== "NIS"){
           try{
            stt = CC.createStatement();
            String nama;
            String email;
            ResultSet rs = stt.executeQuery("SELECT * FROM anggota WHERE Nis ="+form1.getText());
                    if(rs.next()){
                    nama = rs.getString("Nama");
                    email = rs.getString("Email");
                    stt.executeUpdate("INSERT INTO pengunjung(Nama,Email,Instansi,TanggalKunjungan) VALUES('"+ nama + "','" 
                    + email + "','Siswa','"+dtf.format(now)+"')");
                    JOptionPane.showMessageDialog(null, "Terima Kasih Telah Berkunjung");
                    }else
            JOptionPane.showMessageDialog(this, "NIS Anda Tidak Terdaftar");
            
        }catch(Exception e){
            e.printStackTrace();
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kunjungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kunjungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kunjungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kunjungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kunjungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Siswa;
    private javax.swing.JPanel Tamu;
    private javax.swing.JTextField form1;
    private javax.swing.JTextField form2;
    private javax.swing.JTextField form3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel toKunjungan;
    private javax.swing.JLabel toLandingPage;
    private javax.swing.JLabel toLogin;
    private javax.swing.JLabel toTentang;
    // End of variables declaration//GEN-END:variables
}
