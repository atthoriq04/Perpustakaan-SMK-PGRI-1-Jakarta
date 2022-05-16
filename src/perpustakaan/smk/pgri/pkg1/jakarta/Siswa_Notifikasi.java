/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
/**
 *
 * @author Atthoriq
 */
public class Siswa_Notifikasi extends javax.swing.JFrame {

    /**
     * Creates new form Siswa_Notifikasi
     */
    ResultSet rs = null;
    Connection CC = new koneksi().connect();
    PreparedStatement pst = null;
    public Siswa_Notifikasi() {
        initComponents();
        initial();
        check(0);
    }
    int from = 0;
    int rows,col,limit;
    int UserId = UserSession.GetUserId();
    private void check(int fc){
       try {
            int Next = fc + 2;
            Statement stt = CC.createStatement();
            rs = stt.executeQuery("SELECT * FROM notifikasi INNER JOIN judulnotifikasi ON notifikasi.idJudul = judulnotifikasi.idJudul INNER JOIN anggota ON anggota.Nis = notifikasi.Nis WHERE notifikasi.Nis = '"+ UserId +"' ORDER BY notifikasi.idNotifikasi DESC  LIMIT "+ Next +", 2");
            if(rs.next()){
                next.setVisible(true);
            }else{
                next.setVisible(false);
            } 
            int Back = fc - 2;
            if(Back < 0){
                back.setVisible(false);
            }else{
                back.setVisible(true);
            }
            
            }catch(Exception e){
          e.printStackTrace();
        }
    }
    
    private void initial(){
        try{
         JPanel[]panel = {panel1,panel2};
         JPanel[]panelj = {pjudul1,pjudul2};
         JLabel[]Judul = {judul1,judul2};
         JLabel[]Isi = {isi1,isi2};
         JLabel[]tanggal = {tanggal1,tanggal2};
         PreparedStatement stmt = CC.prepareStatement("SELECT * FROM notifikasi INNER JOIN judulnotifikasi ON notifikasi.idJudul = judulnotifikasi.idJudul INNER JOIN anggota ON anggota.Nis = notifikasi.Nis WHERE notifikasi.Nis = '"+ UserId +"' ORDER BY notifikasi.idNotifikasi DESC  LIMIT "+ from +", 2",
        ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE
            );

        ResultSet rs = stmt.executeQuery();
        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();
        rs.first();
       int rowcount = 0;
            do {
                    rowcount++;
                } while (rs.next());
            rs.first();
           
            int rowindex = 0; // initial rowindex
            // iterate panel default false
                 int panelq;
                   for (panelq =0;panelq <2;panelq++){
                       panel[panelq].setVisible(false);
                   }
             //end of iterate panel     
            Object array2D[][] = new Object[rowcount][];
            do {
                 array2D[rowindex] = new Object[numberOfColumns];
                  for (int i = 0; i < numberOfColumns; i++) {
                    array2D[rowindex][i] = rs.getObject(i + 1);
                    }
                  panel[rowindex].setVisible(true);
                  Judul[rowindex].setText(rs.getString("JudulNotifikasi"));
                  Isi[rowindex].setText(rs.getString("Isi"));
                  tanggal[rowindex].setText(rs.getString("tanggal"));
                  
                //System.out.println("array2D[" + rowindex + "] = " + Arrays.toString(array2D[rowindex])); 
             rowindex++;
                } while (rs.next());              
        
        }catch(Exception e){
             e.printStackTrace();
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

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        pjudul1 = new javax.swing.JPanel();
        judul1 = new javax.swing.JLabel();
        tanggal1 = new javax.swing.JLabel();
        isi1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        pjudul2 = new javax.swing.JPanel();
        judul2 = new javax.swing.JLabel();
        tanggal2 = new javax.swing.JLabel();
        isi2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        next = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setText("Notifikasi");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(224, 11, 84, 26);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        pjudul1.setBackground(new java.awt.Color(255, 255, 255));
        pjudul1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        judul1.setText("Judul Notifikasi");

        tanggal1.setText("jLabel2");

        javax.swing.GroupLayout pjudul1Layout = new javax.swing.GroupLayout(pjudul1);
        pjudul1.setLayout(pjudul1Layout);
        pjudul1Layout.setHorizontalGroup(
            pjudul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pjudul1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(tanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pjudul1Layout.setVerticalGroup(
            pjudul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pjudul1Layout.createSequentialGroup()
                .addGroup(pjudul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judul1)
                    .addComponent(tanggal1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        isi1.setText("jLabel2");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pjudul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(pjudul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(isi1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(panel1);
        panel1.setBounds(10, 55, 510, 75);

        jButton1.setText("Tutup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 265, 61, 23);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        pjudul2.setBackground(new java.awt.Color(255, 255, 255));
        pjudul2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        judul2.setText("Judul Notifikasi");

        tanggal2.setText("jLabel2");

        javax.swing.GroupLayout pjudul2Layout = new javax.swing.GroupLayout(pjudul2);
        pjudul2.setLayout(pjudul2Layout);
        pjudul2Layout.setHorizontalGroup(
            pjudul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pjudul2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(tanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pjudul2Layout.setVerticalGroup(
            pjudul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pjudul2Layout.createSequentialGroup()
                .addGroup(pjudul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judul2)
                    .addComponent(tanggal2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        isi2.setText("jLabel2");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pjudul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(pjudul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(isi2)
                .addGap(17, 17, 17))
        );

        jPanel1.add(panel2);
        panel2.setBounds(10, 148, 510, 75);

        back.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        back.setText("<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(247, 241, 12, 17);

        next.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        next.setText(">");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextMouseExited(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(265, 241, 12, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Statement stt = CC.createStatement();
             stt.executeUpdate("UPDATE notifikasi SET status = '2' WHERE Nis = '"+ UserId +"'");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
         next.setForeground(new java.awt.Color(0, 112, 207));
    }//GEN-LAST:event_nextMouseEntered

    private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
        next.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_nextMouseExited

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        from = from + 2;
        initial();
        check(from);
    }//GEN-LAST:event_nextMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        from = from - 2;
        initial();
        check(from);
        
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(new java.awt.Color(0, 112, 207));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(Siswa_Notifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siswa_Notifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siswa_Notifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siswa_Notifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siswa_Notifikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel isi1;
    private javax.swing.JLabel isi2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel next;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel pjudul1;
    private javax.swing.JPanel pjudul2;
    private javax.swing.JLabel tanggal1;
    private javax.swing.JLabel tanggal2;
    // End of variables declaration//GEN-END:variables
}
