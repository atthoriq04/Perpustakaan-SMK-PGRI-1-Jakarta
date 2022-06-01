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
    private String ipServer = JOptionPane.showInputDialog("Input Ip Server");
    private String database = JOptionPane.showInputDialog("Input Nama Database");;
    private String username = JOptionPane.showInputDialog("Input Username");
   //private String password = JOptionPane.showInputDialog("Input Password");
    
    public Connection connect(){
        System.out.println(ipServer);
        System.out.println(database);
        System.out.println(username);
        //System.out.println(password);
//        if (password.equals("")){
//            password="";
//        }
    try{
    CC = DriverManager.getConnection("jdbc:mysql://"+ipServer+"/"+database+","+username+",''");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return CC;
    }
}
