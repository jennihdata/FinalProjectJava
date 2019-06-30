package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer I
 */

public class DbConnection {
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagementsystem","root","");
            
            return con;
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}




    

