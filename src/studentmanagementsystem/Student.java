package studentmanagementsystem;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jennifer I
 */
public class Student {
    
    
    private Integer id;
    private String firstName;
    private String lastName;
    private String sex;
    private String phone;
    private String address;
    
    public Student(){
    }
    
    public Student(Integer id, String firstName, String lastName, String sex, String phone, String address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.phone = phone;
        this.address = address;  
    }
//    
//    
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    
    public void operation(char operation, Integer id, String firstName, String lastName, String sex, String phone, String address){
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
           
            try {
                ps = con.prepareStatement("INSERT INTO student(firstName, lastName, sex, phone, address) VALUES (?,?,?,?,?)");
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, sex);
                ps.setString(4, phone);
                ps.setString(5, address);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Student Added!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
        
        if(operation == 'u'){
           
            try {
                ps = con.prepareStatement("UPDATE student SET firstName = ?,lastName = ?, sex = ?, phone = ?, address = ? WHERE id = ? ");
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, sex);
                ps.setString(4, phone);
                ps.setString(5, address);
                ps.setInt(6, id);
                
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Student Updated!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
        
        if(operation == 'd'){
           
            try {
                ps = con.prepareStatement("DELETE FROM student WHERE id = ? ");
                ps.setInt(1, id);
               
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Student Deleted!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    public ArrayList<Student> StudentList(){
        ArrayList<Student> studentList = new ArrayList <Student>();
        
        try{
            Connection con = DbConnection.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
              Student student = new Student(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("sex"),rs.getString("phone"),rs.getString("address"));
              
              studentList.add(student);
            }
        } catch(SQLException ex){
            Logger.getLogger(Student.class).log(Level.SEVERE, null,ex);
            
        }
        return studentList;
        
    }
    
    public void fillStudentTable(JTable table){
       
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            
            for(int i = 0; i < StudentList().size(); i++){
                    row = new Object[6];
                    row[0] = StudentList().get(i).getId();
                    row[1] = StudentList().get(i).getFirstName();
                    row[2] = StudentList().get(i).getLastName();
                    row[3] = StudentList().get(i).getSex();
                    row[4] = StudentList().get(i).getPhone();
                    row[5] = StudentList().get(i).getAddress();
                    
                    model.addRow(row);
           
                
            }
            
        
        
    

}

    
    
    
}

