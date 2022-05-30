/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.smk.pgri.pkg1.jakarta;
import static java.lang.Class.forName;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Atthoriq
 */
public class koneksi {
    private Connection CC;
    public Connection connect(){
    try{
    CC = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaanpgri", "root", "");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return CC;
    }
}
