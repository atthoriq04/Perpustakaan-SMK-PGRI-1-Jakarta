/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

/**
 *
 * @author Atthoriq
 */
public class Siswa_Denda extends javax.swing.JFrame {

    /**
     * Creates new form Siswa_Denda
     */
    public Siswa_Denda() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("User");
        jPanel12.add(jLabel17);
        jLabel17.setBounds(1286, 11, 32, 20);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Tanggungan Denda");
        jPanel12.add(jLabel21);
        jLabel21.setBounds(25, 86, 207, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        jPanel12.add(jLabel2);
        jLabel2.setBounds(25, 141, 64, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kelas ");
        jPanel12.add(jLabel9);
        jLabel9.setBounds(25, 176, 64, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nama");
        jPanel12.add(jLabel10);
        jLabel10.setBounds(133, 141, 242, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Kelas ");
        jPanel12.add(jLabel11);
        jLabel11.setBounds(133, 176, 242, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "ID Eksemplar", "Jenis Denda", "Nominal", "Barang", "Keterangan", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel12.add(jScrollPane1);
        jScrollPane1.setBounds(25, 212, 1223, 508);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel69.setText("SMK PGRI 1 Jakarta");
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel69MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel69MouseExited(evt);
            }
        });

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel70.setText("Sirkulasi");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel70MouseEntered(evt);
            }
        });

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel71.setText("Usulan");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel71MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel71MouseExited(evt);
            }
        });

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel72.setText("Bebas Pustaka");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel72MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel72MouseExited(evt);
            }
        });

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel73.setText("User");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel73MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 657, Short.MAX_VALUE)
                .addComponent(jLabel70)
                .addGap(75, 75, 75)
                .addComponent(jLabel71)
                .addGap(50, 50, 50)
                .addComponent(jLabel72)
                .addGap(45, 45, 45)
                .addComponent(jLabel73)
                .addGap(48, 48, 48))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel14);
        jPanel14.setBounds(0, 11, 1282, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel76.setText("Katalog");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel76MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel76MouseExited(evt);
            }
        });

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel81.setText("Pengembalian");
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel81MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel81MouseExited(evt);
            }
        });

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel82.setText("Denda");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel82MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel82MouseExited(evt);
            }
        });

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel83.setText("Histori");
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel83MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel83MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel2);
        jPanel2.setBounds(830, 40, 140, 130);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel84.setText("Profil");
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel84MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel84MouseExited(evt);
            }
        });

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel85.setText("Notifkasi");
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel85MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel85MouseExited(evt);
            }
        });

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel86.setText("Log Out");
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel86MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel1);
        jPanel1.setBounds(1200, 40, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        Siswa_Home obj = new Siswa_Home();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseEntered
        jLabel69.setForeground(new java.awt.Color(0,72,181));
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jLabel69MouseEntered

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel69MouseExited

    private void jLabel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseEntered
        jPanel2.setVisible(true);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jLabel70MouseEntered

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        Siswa_Usulan_Buku obj = new Siswa_Usulan_Buku();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel71MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseEntered
        jLabel71.setForeground(new java.awt.Color(0,72,181));
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jLabel71MouseEntered

    private void jLabel71MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseExited
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel71MouseExited

    private void jLabel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseEntered
        jLabel72.setForeground(new java.awt.Color(0,72,181));
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jLabel72MouseEntered

    private void jLabel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseExited
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel72MouseExited

    private void jLabel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseEntered
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jLabel73MouseEntered

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        Katalog obj = new Katalog();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseEntered
        jLabel76.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_jLabel76MouseEntered

    private void jLabel76MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseExited
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel76MouseExited

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        Siswa_PeminjamanBerjalan obj = new Siswa_PeminjamanBerjalan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel81MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseEntered
        jLabel81.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_jLabel81MouseEntered

    private void jLabel81MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseExited
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel81MouseExited

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        Siswa_PeminjamanBerjalan obj = new Siswa_PeminjamanBerjalan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseEntered
        jLabel82.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_jLabel82MouseEntered

    private void jLabel82MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseExited
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel82MouseExited

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        Siswa_HistoriPeminjaman obj = new Siswa_HistoriPeminjaman();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel83MouseClicked

    private void jLabel83MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseEntered
        jLabel83.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_jLabel83MouseEntered

    private void jLabel83MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseExited
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel83MouseExited

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
        Siswa_Profil obj = new Siswa_Profil();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel84MouseClicked

    private void jLabel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseEntered
        jLabel84.setForeground(new java.awt.Color(0,72,181));       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel84MouseEntered

    private void jLabel84MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseExited
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel84MouseExited

    private void jLabel85MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseEntered
        jLabel85.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_jLabel85MouseEntered

    private void jLabel85MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseExited
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel85MouseExited

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        Login obj = new Login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        jLabel86.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel86MouseExited

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseExited

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
            java.util.logging.Logger.getLogger(Siswa_Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siswa_Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siswa_Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siswa_Denda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siswa_Denda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
