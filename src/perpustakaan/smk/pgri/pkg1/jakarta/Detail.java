/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

/**
 *
 * @author Atthoriq
 */
public class Detail extends javax.swing.JFrame {

    /**
     * Creates new form Detail
     */
    public Detail() {
        initComponents();
        SubUser.setVisible(false);
        SubSirk.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

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

        jPanel10.add(jPanel14);
        jPanel14.setBounds(0, 11, 1282, 20);

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

        jPanel10.add(SubSirk);
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

        jPanel10.add(SubUser);
        SubUser.setBounds(1200, 40, 80, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel74.setText("No Panggil");

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel75.setText("Judul Buku");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel77.setText("Penerbit");

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel78.setText("Tahun Terbit");

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel79.setText("Penulis");

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel80.setText("Sisa Eksemplar");

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel83.setText("Penerbit");

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel84.setText("Tahun Terbit");

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel86.setText("Penulis");

        jButton3.setText("Pinjam");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reservasi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel84)
                        .addComponent(jLabel75)
                        .addComponent(jLabel74)
                        .addComponent(jLabel86)
                        .addComponent(jLabel83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(19, 19, 19)))
                .addContainerGap(720, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel80)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel83))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel84))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.add(jPanel2);
        jPanel2.setBounds(70, 116, 1054, 400);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PGRI;
    private javax.swing.JPanel SubSirk;
    private javax.swing.JPanel SubUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
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
