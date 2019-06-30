/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jennifer I
 */
public class Course {
   
    private int course_id;
    private String course_name;
    
    public Course(){
    }
    
    public Course(Integer course_id, String course_name){
        this.course_id = course_id;
        this.course_name = course_name;
          
    }


    /**
     * @return the courseId
     */
    public int getCourse_id() {
        return course_id;
    }

   
    public String getCourse_Name() {
        return course_name;
    }

    

    public ArrayList<Course> CourseList(){
        ArrayList<Course> courseList = new ArrayList <Course>();

        try{
            Connection con = DbConnection.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM course");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
              Course course = new Course(rs.getInt("id"), rs.getString("course_name"));

              courseList.add(course);
            }
        } catch(SQLException ex){
            Logger.getLogger(Student.class).log(Level.SEVERE, null,ex);

        }
        return courseList;

    }
    
    
    
    public void operation(char operation, Integer id, String cname){
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
           
            try {
                ps = con.prepareStatement("INSERT INTO course (course_name) VALUES (?)");
                ps.setString(1, cname);
               
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Course Added!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
        
        if(operation == 'u'){
           
            try {
                ps = con.prepareStatement("UPDATE course SET course_name = ? WHERE id = ? ");
                ps.setString(1, cname);
                ps.setInt(2, id);
                
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Course Updated!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
        
        if(operation == 'd'){
           
            try {
                ps = con.prepareStatement("DELETE FROM course WHERE id = ? ");
                ps.setInt(1, id);
               
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Course Deleted!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           }
        
    }
    
//    public void fillCourseTable(JTable table){
//        Connection con = DbConnection.getConnection();
//        PreparedStatement ps;
//        
//        try {
//            ps = con.prepareStatement("SELECT * FROM course");
//            ResultSet rs = ps.executeQuery();
//            DefaultTableModel model = (DefaultTableModel)table.getModel();
//            
//            Object[] row;
//            
//            while(rs.next()){
//                row = new Object[2];
//                row[0] = rs.getInt(1);
//                row[1] = rs.getString(2);
//               
//                model.addRow(row);
//                
//            }
//            
//        } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

            public void fillCourseTable(JTable table){
        
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;

            for(int i = 0; i < CourseList().size(); i++){
                    row = new Object[6];
                    row[0] = CourseList().get(i).getCourse_id();
                    row[1] = CourseList().get(i).getCourse_Name();
                    
                    model.addRow(row);

            }
        }
            
    
    public boolean isCourseExist(String cname){
      Connection con = DbConnection.getConnection();
      PreparedStatement ps;
      boolean isExist = false;
       
        
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `course_name` = ?");
            ps.setString(1, cname);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 isExist = true;
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return isExist;
    }
    
    public int getCourseId(String courseName){
        int courseId = 0;
        
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;       
        
        try {
            ps = con.prepareStatement("SELECT id FROM course WHERE course_name = ?");
            ps.setString(1, courseName);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                courseId = rs.getInt("id");
                
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return courseId;
    }
    
    public void fillCourseCombo(JComboBox combo){
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM course");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
              
                combo.addItem(rs.getString(2));
                
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
