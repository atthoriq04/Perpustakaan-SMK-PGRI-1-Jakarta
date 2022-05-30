/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.TableModel;
import java.text.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Atthoriq
 */
public class Petugas_TambahDenda extends javax.swing.JFrame {
    public ResultSet rst;
    Connection CC = new koneksi().connect();
    public Statement stt;
    public static DefaultTableModel tmdl;
    public PreparedStatement prst;
    /**
     * Creates new form Petugas_TambahDenda
     */
    public Petugas_TambahDenda() {
        initComponents();
        denda.setEnabled(false);
    }
    int Tunai = 0;
    String barang = "-";
    String Jenis;
    int jumlah;
    public void rule(){
        try {
            
             stt = CC.createStatement();
            rst = stt.executeQuery("SELECT * From pengaturan");
            if(rst.next()){
                jumlah = rst.getInt("DendaHilang");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NIS = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Kelas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jdbk = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tunai = new javax.swing.JRadioButton();
        non = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        denda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        brcd = new javax.swing.JLabel();
        Jdbk2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nis");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kelas");

        NIS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NIS.setText("Nis");

        Nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nama.setText("Nama");

        Kelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Kelas.setText("Kelas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Melaporkan Bahwa Buku yang Dipinjam Rusak / Hilang");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Buku");

        Jdbk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jdbk.setText("Judul Buku");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pilih Denda");

        tunai.setBackground(new java.awt.Color(255, 255, 255));
        tunai.setText("Denda Tunai");
        tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunaiActionPerformed(evt);
            }
        });

        non.setBackground(new java.awt.Color(255, 255, 255));
        non.setText("Denda Barang");
        non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Masukan Denda");

        denda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dendaActionPerformed(evt);
            }
        });

        jButton1.setText("Konfirmasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Id Transaksi");

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setText("id");

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        brcd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brcd.setText("Judul Buku");

        Jdbk2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jdbk2.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NIS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(tunai)
                                .addGap(32, 32, 32)
                                .addComponent(non))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brcd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jdbk2)
                                .addGap(18, 18, 18)
                                .addComponent(Jdbk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NIS))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nama))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Kelas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Jdbk)
                    .addComponent(brcd)
                    .addComponent(Jdbk2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tunai)
                    .addComponent(non))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(denda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void process(){
        try {
            SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
            Date now = new Date();
             stt = CC.createStatement();
            stt.executeUpdate("INSERT INTO denda(IdTransaksi,jenis,Barang,Nominal,Status, ket) VALUES('"+ id.getText() +"','"+ Jenis +"','"+ barang +"','"+ Tunai +"','1','Menghilangkan Buku' )");
            stt.executeUpdate("UPDATE transaksi SET Status = '4', Keterangan = 'Buku Hilang' WHERE IdTransaksi = '"+ id.getText() +"' ");
            stt.executeUpdate("UPDATE item SET location_Id = '4' WHERE item_Code = '"+ brcd.getText() +"' ");
            stt.executeUpdate("INSERT INTO notifikasi(idJudul,Nis,Isi,Tanggal,Status) VALUES('4','"+ NIS.getText() +"','Anda Mendapat Denda Merusak/Menghilangkan Buku(Kode Transaksi = "+ id.getText() +" )','"+ sdformat.format(now) +"','1' )");
            String sql = "SELECT IdDenda FROM denda WHERE IdTransaksi = '"+ id.getText() +"'";
            rst = stt.executeQuery(sql);
            if(rst.next()){
                stt.executeUpdate("INSERT INTO bukuTidakTersedia(Barcode,IdDenda,Tanggal) VALUES('"+ brcd.getText() +"','"+ rst.getInt("IdDenda") +"','"+ sdformat.format(now) +"')");
                JOptionPane.showMessageDialog(null, "Denda Berhasil Ditambahkan");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Petugas_TambahDenda.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    
    
    }
    private void nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonActionPerformed
        tunai.setSelected(false);
        denda.setEnabled(true);
         Jenis = "NonTunai";
         //tunai.setEnabled(false);
    }//GEN-LAST:event_nonActionPerformed

    private void dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Jenis.equals("Tunai")){
            rule();
            Tunai = jumlah;
        }else{
            barang = denda.getText();
        }
        process();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunaiActionPerformed
        non.setSelected(false);
        Jenis = "Tunai";
        denda.setEnabled(false);
        //non.setEnabled(false);
    }//GEN-LAST:event_tunaiActionPerformed

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
            java.util.logging.Logger.getLogger(Petugas_TambahDenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petugas_TambahDenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petugas_TambahDenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petugas_TambahDenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petugas_TambahDenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel Jdbk;
    protected javax.swing.JLabel Jdbk2;
    protected javax.swing.JLabel Kelas;
    protected javax.swing.JLabel NIS;
    protected javax.swing.JLabel Nama;
    protected javax.swing.JLabel brcd;
    private javax.swing.JTextField denda;
    protected javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton non;
    private javax.swing.JRadioButton tunai;
    // End of variables declaration//GEN-END:variables
}
