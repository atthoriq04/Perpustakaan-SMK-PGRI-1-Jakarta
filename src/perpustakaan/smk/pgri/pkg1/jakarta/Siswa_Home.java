/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Atthoriq
 */
public class Siswa_Home extends javax.swing.JFrame {
     ResultSet rs = null;
    Connection CC = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Siswa_Home
     */
    public Siswa_Home() {
        initComponents();
        SubUser.setVisible(false);
        SubSirk.setVisible(false);
         CC = new koneksi().connect();
        userLogin();
        hakakses();
    }
    private void userLogin(){
    toUser.setText(UserSession.getUserLogin());
    }
    
     private void hakakses() {
    String user=toUser.getText();
        if(user.equals(3) || user.equals(3)){
       //Master
        //DataBuku.setEnabled(true);
   
     
      
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

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        lihatKatalog2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        PGRI = new javax.swing.JLabel();
        toSirkulasi = new javax.swing.JLabel();
        toUsulan = new javax.swing.JLabel();
        toBebpus = new javax.swing.JLabel();
        toUser = new javax.swing.JLabel();
        SubSirk = new javax.swing.JPanel();
        toKatalog = new javax.swing.JLabel();
        toPengembalian = new javax.swing.JLabel();
        toDenda = new javax.swing.JLabel();
        toHistori = new javax.swing.JLabel();
        SubUser = new javax.swing.JPanel();
        toProf = new javax.swing.JLabel();
        toNotif = new javax.swing.JLabel();
        toOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkGradientFocus(300);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkTransparentControls(false);
        kGradientPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel11.setText("Perpustakaan SMK PGRI 1 Jakarta ");
        kGradientPanel2.add(jLabel11);
        jLabel11.setBounds(35, 163, 633, 47);

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel12.setText("Literasi Mencerdaskan");
        kGradientPanel2.add(jLabel12);
        jLabel12.setBounds(35, 228, 223, 26);

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        kGradientPanel2.add(jToggleButton10);
        jToggleButton10.setBounds(193, 442, 140, 220);

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        kGradientPanel2.add(jToggleButton11);
        jToggleButton11.setBounds(351, 442, 140, 220);

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        kGradientPanel2.add(jToggleButton12);
        jToggleButton12.setBounds(509, 442, 140, 220);

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jToggleButton13);
        jToggleButton13.setBounds(667, 442, 140, 220);

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N
        kGradientPanel2.add(jToggleButton14);
        jToggleButton14.setBounds(35, 442, 140, 220);

        lihatKatalog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Lihat Katalog 1.png"))); // NOI18N
        lihatKatalog2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lihatKatalog2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lihatKatalog2MouseExited(evt);
            }
        });
        lihatKatalog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatKatalog2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(lihatKatalog2);
        lihatKatalog2.setBounds(30, 290, 240, 60);
        lihatKatalog2.setBorderPainted(false);
        lihatKatalog2.setContentAreaFilled(false);
        lihatKatalog2.setFocusPainted(false);
        lihatKatalog2.setOpaque(false);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        PGRI.setBackground(new java.awt.Color(255, 255, 255));
        PGRI.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PGRI.setText("SMK PGRI 1 Jakarta");
        PGRI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PGRIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PGRIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PGRIMouseExited(evt);
            }
        });

        toSirkulasi.setBackground(new java.awt.Color(255, 255, 255));
        toSirkulasi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toSirkulasi.setText("Sirkulasi");
        toSirkulasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toSirkulasiMouseEntered(evt);
            }
        });

        toUsulan.setBackground(new java.awt.Color(255, 255, 255));
        toUsulan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toUsulan.setText("Usulan");
        toUsulan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toUsulanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toUsulanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toUsulanMouseExited(evt);
            }
        });

        toBebpus.setBackground(new java.awt.Color(255, 255, 255));
        toBebpus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toBebpus.setText("Bebas Pustaka");
        toBebpus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toBebpusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toBebpusMouseExited(evt);
            }
        });

        toUser.setBackground(new java.awt.Color(255, 255, 255));
        toUser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toUser.setText("User");
        toUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toUserMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PGRI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 653, Short.MAX_VALUE)
                .addComponent(toSirkulasi)
                .addGap(75, 75, 75)
                .addComponent(toUsulan)
                .addGap(50, 50, 50)
                .addComponent(toBebpus)
                .addGap(45, 45, 45)
                .addComponent(toUser)
                .addGap(48, 48, 48))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PGRI)
                    .addComponent(toSirkulasi)
                    .addComponent(toUsulan)
                    .addComponent(toBebpus)
                    .addComponent(toUser))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel2.add(jPanel14);
        jPanel14.setBounds(0, 11, 1278, 20);

        SubSirk.setBackground(new java.awt.Color(255, 255, 255));
        SubSirk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubSirkMouseExited(evt);
            }
        });

        toKatalog.setBackground(new java.awt.Color(255, 255, 255));
        toKatalog.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toKatalog.setText("Katalog");
        toKatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toKatalogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toKatalogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toKatalogMouseExited(evt);
            }
        });

        toPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        toPengembalian.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toPengembalian.setText("Pengembalian");
        toPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toPengembalianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toPengembalianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toPengembalianMouseExited(evt);
            }
        });

        toDenda.setBackground(new java.awt.Color(255, 255, 255));
        toDenda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toDenda.setText("Denda");
        toDenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toDendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toDendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toDendaMouseExited(evt);
            }
        });

        toHistori.setBackground(new java.awt.Color(255, 255, 255));
        toHistori.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toHistori.setText("Histori");
        toHistori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toHistoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toHistoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toHistoriMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SubSirkLayout = new javax.swing.GroupLayout(SubSirk);
        SubSirk.setLayout(SubSirkLayout);
        SubSirkLayout.setHorizontalGroup(
            SubSirkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubSirkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SubSirkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toKatalog)
                    .addComponent(toPengembalian)
                    .addComponent(toDenda)
                    .addComponent(toHistori))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        SubSirkLayout.setVerticalGroup(
            SubSirkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubSirkLayout.createSequentialGroup()
                .addComponent(toKatalog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toPengembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toDenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toHistori)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        kGradientPanel2.add(SubSirk);
        SubSirk.setBounds(830, 40, 140, 130);

        SubUser.setBackground(new java.awt.Color(255, 255, 255));
        SubUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubUserMouseExited(evt);
            }
        });

        toProf.setBackground(new java.awt.Color(255, 255, 255));
        toProf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toProf.setText("Profil");
        toProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toProfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toProfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toProfMouseExited(evt);
            }
        });

        toNotif.setBackground(new java.awt.Color(255, 255, 255));
        toNotif.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toNotif.setText("Notifkasi");
        toNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toNotifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toNotifMouseExited(evt);
            }
        });

        toOut.setBackground(new java.awt.Color(255, 255, 255));
        toOut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toOut.setText("Log Out");
        toOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SubUserLayout = new javax.swing.GroupLayout(SubUser);
        SubUser.setLayout(SubUserLayout);
        SubUserLayout.setHorizontalGroup(
            SubUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SubUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toProf)
                    .addComponent(toNotif)
                    .addComponent(toOut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubUserLayout.setVerticalGroup(
            SubUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubUserLayout.createSequentialGroup()
                .addComponent(toProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toNotif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toOut)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        kGradientPanel2.add(SubUser);
        SubUser.setBounds(1200, 40, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void lihatKatalog2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatKatalog2MouseEntered
        lihatKatalog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Lihat Katalog 2.png")));
    }//GEN-LAST:event_lihatKatalog2MouseEntered

    private void lihatKatalog2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatKatalog2MouseExited
        lihatKatalog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Lihat Katalog 1.png")));
    }//GEN-LAST:event_lihatKatalog2MouseExited

    private void PGRIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PGRIMouseClicked
        Siswa_Home obj = new Siswa_Home();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PGRIMouseClicked

    private void PGRIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PGRIMouseEntered
        PGRI.setForeground(new java.awt.Color(0,72,181));
        SubUser.setVisible(false);
        SubSirk.setVisible(false);
    }//GEN-LAST:event_PGRIMouseEntered

    private void PGRIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PGRIMouseExited
        toBebpus.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_PGRIMouseExited

    private void toSirkulasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toSirkulasiMouseEntered
        SubSirk.setVisible(true);
        SubUser.setVisible(false);
    }//GEN-LAST:event_toSirkulasiMouseEntered

    private void toUsulanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toUsulanMouseClicked
        Siswa_Usulan_Buku obj = new Siswa_Usulan_Buku();
        obj.setVisible(true);
    }//GEN-LAST:event_toUsulanMouseClicked

    private void toUsulanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toUsulanMouseEntered
        toUsulan.setForeground(new java.awt.Color(0,72,181));
        SubUser.setVisible(false);
        SubSirk.setVisible(false);
    }//GEN-LAST:event_toUsulanMouseEntered

    private void toUsulanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toUsulanMouseExited
        toUsulan.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toUsulanMouseExited

    private void toBebpusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toBebpusMouseEntered
        toBebpus.setForeground(new java.awt.Color(0,72,181));
        SubUser.setVisible(false);
        SubSirk.setVisible(false);
    }//GEN-LAST:event_toBebpusMouseEntered

    private void toBebpusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toBebpusMouseExited
        toBebpus.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toBebpusMouseExited

    private void toUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toUserMouseEntered
        SubUser.setVisible(true);
        SubSirk.setVisible(false);
    }//GEN-LAST:event_toUserMouseEntered

    private void toKatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKatalogMouseClicked
        Katalog obj = new Katalog();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toKatalogMouseClicked

    private void toKatalogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKatalogMouseEntered
        toKatalog.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toKatalogMouseEntered

    private void toKatalogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKatalogMouseExited
        toKatalog.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toKatalogMouseExited

    private void toPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toPengembalianMouseClicked
        Siswa_PeminjamanBerjalan obj = new Siswa_PeminjamanBerjalan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toPengembalianMouseClicked

    private void toPengembalianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toPengembalianMouseEntered
        toPengembalian.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toPengembalianMouseEntered

    private void toPengembalianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toPengembalianMouseExited
        toPengembalian.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toPengembalianMouseExited

    private void toDendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDendaMouseClicked
        Siswa_PeminjamanBerjalan obj = new Siswa_PeminjamanBerjalan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toDendaMouseClicked

    private void toDendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDendaMouseEntered
        toDenda.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toDendaMouseEntered

    private void toDendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDendaMouseExited
        toDenda.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toDendaMouseExited

    private void toHistoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toHistoriMouseClicked
        Siswa_HistoriPeminjaman obj = new Siswa_HistoriPeminjaman();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toHistoriMouseClicked

    private void toHistoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toHistoriMouseEntered
        toHistori.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toHistoriMouseEntered

    private void toHistoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toHistoriMouseExited
        toHistori.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toHistoriMouseExited

    private void SubSirkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubSirkMouseExited

    }//GEN-LAST:event_SubSirkMouseExited

    private void toProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toProfMouseClicked
        Siswa_Profil obj = new Siswa_Profil();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toProfMouseClicked

    private void toProfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toProfMouseEntered
        toProf.setForeground(new java.awt.Color(0,72,181));       // TODO add your handling code here:
    }//GEN-LAST:event_toProfMouseEntered

    private void toProfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toProfMouseExited
        toProf.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toProfMouseExited

    private void toNotifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toNotifMouseEntered
        toNotif.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toNotifMouseEntered

    private void toNotifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toNotifMouseExited
        toNotif.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toNotifMouseExited

    private void toOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toOutMouseClicked
        Login obj = new Login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toOutMouseClicked

    private void toOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toOutMouseEntered
        toOut.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toOutMouseEntered

    private void toOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toOutMouseExited
        toOut.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toOutMouseExited

    private void SubUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubUserMouseExited

    }//GEN-LAST:event_SubUserMouseExited

    private void lihatKatalog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatKatalog2ActionPerformed
         Katalog obj = new Katalog();
       obj.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_lihatKatalog2ActionPerformed

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
            java.util.logging.Logger.getLogger(Siswa_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siswa_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siswa_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siswa_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siswa_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PGRI;
    private javax.swing.JPanel SubSirk;
    private javax.swing.JPanel SubUser;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JButton lihatKatalog2;
    private javax.swing.JLabel toBebpus;
    private javax.swing.JLabel toDenda;
    private javax.swing.JLabel toHistori;
    private javax.swing.JLabel toKatalog;
    private javax.swing.JLabel toNotif;
    private javax.swing.JLabel toOut;
    private javax.swing.JLabel toPengembalian;
    private javax.swing.JLabel toProf;
    private javax.swing.JLabel toSirkulasi;
    private javax.swing.JLabel toUser;
    private javax.swing.JLabel toUsulan;
    // End of variables declaration//GEN-END:variables
}
