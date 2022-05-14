/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan.smk.pgri.pkg1.jakarta;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Atthoriq
 */
public class Katalog extends javax.swing.JFrame {

    /**
     * Creates new form Katalog
     */
    ResultSet rs = null;
    Connection CC = new koneksi().connect();
    PreparedStatement pst = null;
    public Katalog() {
        initComponents();
         PanelLog.setVisible(false);
         PanelUmum.setVisible(false);
         tampilNavbar();
        SubUser.setVisible(false);
        SubSirk.setVisible(false);
        initial();
        
    }
    int UserId = UserSession.GetUserId();
    String UserLogin = UserSession.getUserLogin();
    public void tampilNavbar(){
            
        if( UserId == 0){
            System.out.println(UserId);
             PanelUmum.setVisible(true);
        }else{
            PanelUmum.setVisible(false);
            PanelLog.setVisible(true);
            toUser.setText(UserLogin);
        }
    }
    public String sql,img;
    int rows,col,limit;
    
    private void initial(){
        try{
         JPanel[]buku = {buku1,buku2,buku3,buku4,buku5,buku6,buku7,buku8,buku9,buku10,buku11,buku12};
         JLabel[]Judul = {judul1,judul2,judul3,judul4,judul5,judul6,judul7,judul8,judul9,judul10,judul11,judul12};
         JLabel[]Author = {penulis1,penulis2,penulis3,penulis4,penulis5,penulis6,penulis7,penulis8,penulis9,penulis10,penulis11,penulis12};
         JToggleButton[]img = {toggle1,toggle2,toggle3,toggle4,toggle5,toggle6,toggle7,toggle8,toggle9,toggle10,toggle11,toggle12};
         PreparedStatement stmt = CC.prepareStatement("SELECT Judul,image,mst_author.author_name FROM new_bliblio INNER JOIN mst_author ON mst_author.author_id = new_bliblio.author_id LIMIT 0, 12",
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
                 int panel;
                   for (panel=0;panel<12;panel++){
                       buku[panel].setVisible(false);
                   }
             //end of iterate panel     
            Object array2D[][] = new Object[rowcount][];
            do {
                 array2D[rowindex] = new Object[numberOfColumns];
                  for (int i = 0; i < numberOfColumns; i++) {
                    array2D[rowindex][i] = rs.getObject(i + 1);
                    }
                  buku[rowindex].setVisible(true);
                  Judul[rowindex].setText(rs.getString("Judul"));
                  Author[rowindex].setText(rs.getString("mst_author.author_name"));
//                 Image getAbsolutePath = null;
                 ImageIcon icon = new ImageIcon(rs.getString("image"));
                 Image image = icon.getImage().getScaledInstance(img[rowindex].getWidth(),img[rowindex].getHeight(),Image.SCALE_SMOOTH);
                 img[rowindex].setIcon(icon);
                  
                //System.out.println("array2D[" + rowindex + "] = " + Arrays.toString(array2D[rowindex])); 
             rowindex++;
                } while (rs.next());              
        
        }catch(Exception e){
             e.printStackTrace();
        }
    }
    private void onceclick(){
         try{
         JPanel[]buku = {buku1,buku2,buku3,buku4,buku5,buku6,buku7,buku8,buku9,buku10,buku11,buku12};
         JLabel[]Judul = {judul1,judul2,judul3,judul4,judul5,judul6,judul7,judul8,judul9,judul10,judul11,judul12};
         JLabel[]Author = {penulis1,penulis2,penulis3,penulis4,penulis5,penulis6,penulis7,penulis8,penulis9,penulis10,penulis11,penulis12};
         JToggleButton[]img = {toggle1,toggle2,toggle3,toggle4,toggle5,toggle6,toggle7,toggle8,toggle9,toggle10,toggle11,toggle12};
         int offset = 12;
         PreparedStatement stmt = CC.prepareStatement("SELECT Judul,image,mst_author.author_name FROM new_bliblio INNER JOIN mst_author ON mst_author.author_id = new_bliblio.author_id LIMIT 12",
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
                 int panel;
                   for (panel=0;panel<12;panel++){
                       buku[panel].setVisible(false);
                   }
             //end of iterate panel     
            Object array2D[][] = new Object[rowcount][];
            do {
                 array2D[rowindex] = new Object[numberOfColumns];
                  for (int i = 0; i < numberOfColumns; i++) {
                    array2D[rowindex][i] = rs.getObject(i + 1);
                    }
                  buku[rowindex].setVisible(true);
                  Judul[rowindex].setText(rs.getString("Judul"));
                  Author[rowindex].setText(rs.getString("mst_author.author_name"));
//                 Image getAbsolutePath = null;
                 ImageIcon icon = new ImageIcon(rs.getString("image"));
                 Image image = icon.getImage().getScaledInstance(img[rowindex].getWidth(),img[rowindex].getHeight(),Image.SCALE_SMOOTH);
                 img[rowindex].setIcon(icon);
                  
                //System.out.println("array2D[" + rowindex + "] = " + Arrays.toString(array2D[rowindex])); 
             rowindex++;
                } while (rs.next());              
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
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
        PanelUmum = new javax.swing.JPanel();
        toLogin = new javax.swing.JLabel();
        toKunjungan = new javax.swing.JLabel();
        toTentang = new javax.swing.JLabel();
        toLandingPage = new javax.swing.JLabel();
        PanelLog = new javax.swing.JPanel();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        buku1 = new javax.swing.JPanel();
        toggle1 = new javax.swing.JToggleButton();
        judul1 = new javax.swing.JLabel();
        penulis1 = new javax.swing.JLabel();
        buku2 = new javax.swing.JPanel();
        toggle2 = new javax.swing.JToggleButton();
        judul2 = new javax.swing.JLabel();
        penulis2 = new javax.swing.JLabel();
        buku4 = new javax.swing.JPanel();
        toggle4 = new javax.swing.JToggleButton();
        judul4 = new javax.swing.JLabel();
        penulis4 = new javax.swing.JLabel();
        buku3 = new javax.swing.JPanel();
        toggle3 = new javax.swing.JToggleButton();
        judul3 = new javax.swing.JLabel();
        penulis3 = new javax.swing.JLabel();
        buku5 = new javax.swing.JPanel();
        toggle5 = new javax.swing.JToggleButton();
        judul5 = new javax.swing.JLabel();
        penulis5 = new javax.swing.JLabel();
        buku6 = new javax.swing.JPanel();
        toggle6 = new javax.swing.JToggleButton();
        judul6 = new javax.swing.JLabel();
        penulis6 = new javax.swing.JLabel();
        buku7 = new javax.swing.JPanel();
        toggle7 = new javax.swing.JToggleButton();
        judul7 = new javax.swing.JLabel();
        penulis7 = new javax.swing.JLabel();
        buku8 = new javax.swing.JPanel();
        toggle8 = new javax.swing.JToggleButton();
        judul8 = new javax.swing.JLabel();
        penulis8 = new javax.swing.JLabel();
        buku9 = new javax.swing.JPanel();
        toggle9 = new javax.swing.JToggleButton();
        judul9 = new javax.swing.JLabel();
        penulis9 = new javax.swing.JLabel();
        buku10 = new javax.swing.JPanel();
        toggle10 = new javax.swing.JToggleButton();
        judul10 = new javax.swing.JLabel();
        penulis10 = new javax.swing.JLabel();
        buku11 = new javax.swing.JPanel();
        toggle11 = new javax.swing.JToggleButton();
        judul11 = new javax.swing.JLabel();
        penulis11 = new javax.swing.JLabel();
        buku12 = new javax.swing.JPanel();
        toggle12 = new javax.swing.JToggleButton();
        judul12 = new javax.swing.JLabel();
        penulis12 = new javax.swing.JLabel();
        previous = new javax.swing.JToggleButton();
        next = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        PanelUmum.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout PanelUmumLayout = new javax.swing.GroupLayout(PanelUmum);
        PanelUmum.setLayout(PanelUmumLayout);
        PanelUmumLayout.setHorizontalGroup(
            PanelUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUmumLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(toLandingPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 659, Short.MAX_VALUE)
                .addComponent(toTentang)
                .addGap(59, 59, 59)
                .addComponent(toKunjungan)
                .addGap(71, 71, 71)
                .addComponent(toLogin)
                .addGap(52, 52, 52))
        );
        PanelUmumLayout.setVerticalGroup(
            PanelUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(toLogin)
                .addComponent(toKunjungan)
                .addComponent(toTentang)
                .addComponent(toLandingPage))
        );

        jPanel1.add(PanelUmum);
        PanelUmum.setBounds(0, 10, 1280, 20);

        PanelLog.setBackground(new java.awt.Color(255, 255, 255));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toBebpusMouseClicked(evt);
            }
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

        javax.swing.GroupLayout PanelLogLayout = new javax.swing.GroupLayout(PanelLog);
        PanelLog.setLayout(PanelLogLayout);
        PanelLogLayout.setHorizontalGroup(
            PanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogLayout.createSequentialGroup()
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
        PanelLogLayout.setVerticalGroup(
            PanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogLayout.createSequentialGroup()
                .addGroup(PanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PGRI)
                    .addComponent(toSirkulasi)
                    .addComponent(toUsulan)
                    .addComponent(toBebpus)
                    .addComponent(toUser))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(PanelLog);
        PanelLog.setBounds(0, 11, 1278, 20);

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
                .addContainerGap(31, Short.MAX_VALUE))
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

        jPanel1.add(SubSirk);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toNotifMouseClicked(evt);
            }
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

        jPanel1.add(SubUser);
        SubUser.setBounds(1200, 40, 80, 80);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(923, 78, 267, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Buku Terakhir");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(25, 77, 148, 29);

        jButton1.setBackground(new java.awt.Color(2, 117, 216));
        jPanel1.add(jButton1);
        jButton1.setBounds(1200, 77, 48, 33);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Kategori");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(267, 77, 88, 29);

        buku1.setBackground(new java.awt.Color(255, 255, 255));
        buku1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));
        buku1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buku1MouseClicked(evt);
            }
        });

        toggle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul1.setText("Judul Buku");

        penulis1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis1.setText("Penulis");

        javax.swing.GroupLayout buku1Layout = new javax.swing.GroupLayout(buku1);
        buku1.setLayout(buku1Layout);
        buku1Layout.setHorizontalGroup(
            buku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul1)
                    .addComponent(penulis1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku1Layout.setVerticalGroup(
            buku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku1);
        buku1.setBounds(25, 138, 153, 230);

        buku2.setBackground(new java.awt.Color(255, 255, 255));
        buku2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul2.setText("Judul Buku");

        penulis2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis2.setText("Penulis");

        javax.swing.GroupLayout buku2Layout = new javax.swing.GroupLayout(buku2);
        buku2.setLayout(buku2Layout);
        buku2Layout.setHorizontalGroup(
            buku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul2)
                    .addComponent(penulis2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku2Layout.setVerticalGroup(
            buku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku2);
        buku2.setBounds(233, 138, 153, 230);

        buku4.setBackground(new java.awt.Color(255, 255, 255));
        buku4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul4.setText("Judul Buku");

        penulis4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis4.setText("Penulis");

        javax.swing.GroupLayout buku4Layout = new javax.swing.GroupLayout(buku4);
        buku4.setLayout(buku4Layout);
        buku4Layout.setHorizontalGroup(
            buku4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul4)
                    .addComponent(penulis4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku4Layout.setVerticalGroup(
            buku4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku4);
        buku4.setBounds(668, 138, 153, 230);

        buku3.setBackground(new java.awt.Color(255, 255, 255));
        buku3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul3.setText("Judul Buku");

        penulis3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis3.setText("Penulis");

        javax.swing.GroupLayout buku3Layout = new javax.swing.GroupLayout(buku3);
        buku3.setLayout(buku3Layout);
        buku3Layout.setHorizontalGroup(
            buku3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul3)
                    .addComponent(penulis3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku3Layout.setVerticalGroup(
            buku3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku3);
        buku3.setBounds(449, 138, 153, 230);

        buku5.setBackground(new java.awt.Color(255, 255, 255));
        buku5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul5.setText("Judul Buku");

        penulis5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis5.setText("Penulis");

        javax.swing.GroupLayout buku5Layout = new javax.swing.GroupLayout(buku5);
        buku5.setLayout(buku5Layout);
        buku5Layout.setHorizontalGroup(
            buku5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul5)
                    .addComponent(penulis5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku5Layout.setVerticalGroup(
            buku5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku5);
        buku5.setBounds(877, 138, 153, 230);

        buku6.setBackground(new java.awt.Color(255, 255, 255));
        buku6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul6.setText("Judul Buku");

        penulis6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis6.setText("Penulis");

        javax.swing.GroupLayout buku6Layout = new javax.swing.GroupLayout(buku6);
        buku6.setLayout(buku6Layout);
        buku6Layout.setHorizontalGroup(
            buku6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul6)
                    .addComponent(penulis6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku6Layout.setVerticalGroup(
            buku6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku6);
        buku6.setBounds(1087, 138, 153, 230);

        buku7.setBackground(new java.awt.Color(255, 255, 255));
        buku7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul7.setText("Judul Buku");

        penulis7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis7.setText("Penulis");

        javax.swing.GroupLayout buku7Layout = new javax.swing.GroupLayout(buku7);
        buku7.setLayout(buku7Layout);
        buku7Layout.setHorizontalGroup(
            buku7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul7)
                    .addComponent(penulis7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku7Layout.setVerticalGroup(
            buku7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku7);
        buku7.setBounds(25, 408, 153, 230);

        buku8.setBackground(new java.awt.Color(255, 255, 255));
        buku8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul8.setText("Judul Buku");

        penulis8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis8.setText("Penulis");

        javax.swing.GroupLayout buku8Layout = new javax.swing.GroupLayout(buku8);
        buku8.setLayout(buku8Layout);
        buku8Layout.setHorizontalGroup(
            buku8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul8)
                    .addComponent(penulis8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku8Layout.setVerticalGroup(
            buku8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku8);
        buku8.setBounds(233, 408, 153, 230);

        buku9.setBackground(new java.awt.Color(255, 255, 255));
        buku9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul9.setText("Judul Buku");

        penulis9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis9.setText("Penulis");

        javax.swing.GroupLayout buku9Layout = new javax.swing.GroupLayout(buku9);
        buku9.setLayout(buku9Layout);
        buku9Layout.setHorizontalGroup(
            buku9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul9)
                    .addComponent(penulis9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku9Layout.setVerticalGroup(
            buku9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku9);
        buku9.setBounds(449, 408, 153, 230);

        buku10.setBackground(new java.awt.Color(255, 255, 255));
        buku10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul10.setText("Judul Buku");

        penulis10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis10.setText("Penulis");

        javax.swing.GroupLayout buku10Layout = new javax.swing.GroupLayout(buku10);
        buku10.setLayout(buku10Layout);
        buku10Layout.setHorizontalGroup(
            buku10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul10)
                    .addComponent(penulis10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku10Layout.setVerticalGroup(
            buku10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku10);
        buku10.setBounds(668, 408, 153, 230);

        buku11.setBackground(new java.awt.Color(255, 255, 255));
        buku11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul11.setText("Judul Buku");

        penulis11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis11.setText("Penulis");

        javax.swing.GroupLayout buku11Layout = new javax.swing.GroupLayout(buku11);
        buku11.setLayout(buku11Layout);
        buku11Layout.setHorizontalGroup(
            buku11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul11)
                    .addComponent(penulis11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku11Layout.setVerticalGroup(
            buku11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku11);
        buku11.setBounds(877, 408, 153, 230);

        buku12.setBackground(new java.awt.Color(255, 255, 255));
        buku12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 231, 238), 1, true));

        toggle12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/smk/pgri/pkg1/jakarta/Button/Cover.png"))); // NOI18N

        judul12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul12.setText("Judul Buku");

        penulis12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        penulis12.setText("Penulis");

        javax.swing.GroupLayout buku12Layout = new javax.swing.GroupLayout(buku12);
        buku12.setLayout(buku12Layout);
        buku12Layout.setHorizontalGroup(
            buku12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buku12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toggle12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul12)
                    .addComponent(penulis12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buku12Layout.setVerticalGroup(
            buku12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buku12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggle12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penulis12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(buku12);
        buku12.setBounds(1087, 408, 153, 230);

        previous.setText("Previous");
        jPanel1.add(previous);
        previous.setBounds(520, 680, 80, 22);

        next.setText("Next");
        jPanel1.add(next);
        next.setBounds(690, 680, 55, 22);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buku1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buku1MouseClicked
        System.out.print(judul1.getText());
        System.out.print(penulis1.getText());
    }//GEN-LAST:event_buku1MouseClicked

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

    private void toBebpusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toBebpusMouseClicked
        Siswa_BebasPustaka obj = new Siswa_BebasPustaka();
        obj.setVisible(true);
    }//GEN-LAST:event_toBebpusMouseClicked

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
        Siswa_Denda obj = new Siswa_Denda();
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

    private void toNotifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toNotifMouseClicked
        Siswa_Notifikasi obj = new Siswa_Notifikasi();
        obj.setVisible(true);
    }//GEN-LAST:event_toNotifMouseClicked

    private void toNotifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toNotifMouseEntered
        toNotif.setForeground(new java.awt.Color(0,72,181));
    }//GEN-LAST:event_toNotifMouseEntered

    private void toNotifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toNotifMouseExited
        toNotif.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_toNotifMouseExited

    private void toOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toOutMouseClicked
        Login obj = new Login();
        UserSession.setUserLogin(null);
        UserSession.setUserId(0);
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
            java.util.logging.Logger.getLogger(Katalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Katalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Katalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Katalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Katalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PGRI;
    private javax.swing.JPanel PanelLog;
    private javax.swing.JPanel PanelUmum;
    private javax.swing.JPanel SubSirk;
    private javax.swing.JPanel SubUser;
    private javax.swing.JPanel buku1;
    private javax.swing.JPanel buku10;
    private javax.swing.JPanel buku11;
    private javax.swing.JPanel buku12;
    private javax.swing.JPanel buku2;
    private javax.swing.JPanel buku3;
    private javax.swing.JPanel buku4;
    private javax.swing.JPanel buku5;
    private javax.swing.JPanel buku6;
    private javax.swing.JPanel buku7;
    private javax.swing.JPanel buku8;
    private javax.swing.JPanel buku9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul10;
    private javax.swing.JLabel judul11;
    private javax.swing.JLabel judul12;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel judul5;
    private javax.swing.JLabel judul6;
    private javax.swing.JLabel judul7;
    private javax.swing.JLabel judul8;
    private javax.swing.JLabel judul9;
    private javax.swing.JToggleButton next;
    private javax.swing.JLabel penulis1;
    private javax.swing.JLabel penulis10;
    private javax.swing.JLabel penulis11;
    private javax.swing.JLabel penulis12;
    private javax.swing.JLabel penulis2;
    private javax.swing.JLabel penulis3;
    private javax.swing.JLabel penulis4;
    private javax.swing.JLabel penulis5;
    private javax.swing.JLabel penulis6;
    private javax.swing.JLabel penulis7;
    private javax.swing.JLabel penulis8;
    private javax.swing.JLabel penulis9;
    private javax.swing.JToggleButton previous;
    private javax.swing.JLabel toBebpus;
    private javax.swing.JLabel toDenda;
    private javax.swing.JLabel toHistori;
    private javax.swing.JLabel toKatalog;
    private javax.swing.JLabel toKunjungan;
    private javax.swing.JLabel toLandingPage;
    private javax.swing.JLabel toLogin;
    private javax.swing.JLabel toNotif;
    private javax.swing.JLabel toOut;
    private javax.swing.JLabel toPengembalian;
    private javax.swing.JLabel toProf;
    private javax.swing.JLabel toSirkulasi;
    private javax.swing.JLabel toTentang;
    private javax.swing.JLabel toUser;
    private javax.swing.JLabel toUsulan;
    private javax.swing.JToggleButton toggle1;
    private javax.swing.JToggleButton toggle10;
    private javax.swing.JToggleButton toggle11;
    private javax.swing.JToggleButton toggle12;
    private javax.swing.JToggleButton toggle2;
    private javax.swing.JToggleButton toggle3;
    private javax.swing.JToggleButton toggle4;
    private javax.swing.JToggleButton toggle5;
    private javax.swing.JToggleButton toggle6;
    private javax.swing.JToggleButton toggle7;
    private javax.swing.JToggleButton toggle8;
    private javax.swing.JToggleButton toggle9;
    // End of variables declaration//GEN-END:variables
}
