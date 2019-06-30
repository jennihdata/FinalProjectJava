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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jennifer I
 */
public class Score {
    
//    private int student_id;
//    private int course_id;
//    private String score;
//    private String grade;
//    
//    public Score(){
//    }
//    
//    public Score(Integer student_id, Integer course_id, String score, String grade){
//        this.student_id = student_id;
//        this.course_id = course_id;
//        this.score = score;
//        this.grade = grade;
//          
//    }
//
//    
//
//    /**
//     * @return the studentId
//     */
//    public int getStudent_id() {
//        return student_id;
//    }
//
//    /**
//     * @return the courseId
//     */
//    public int getCourse_id() {
//        return course_id;
//    }
//
//    /**
//     * @return the score
//     */
//    public String getScore() {
//        return score;
//    }
//
//    /**
//     * @return the grade
//     */
//    public String getGrade() {
//        return grade;
//    }
//
//    public ArrayList<Score> ScoreList(){
//        ArrayList<Score> scoreList = new ArrayList <Score>();
//
//        try{
//            Connection con = DbConnection.getConnection();
//            PreparedStatement ps;
//            ps = con.prepareStatement("SELECT score.student_id, std.firstName, std.lastName,  course.course_name, score.score, score.grade FROM score score JOIN course course ON score.course_id = course.id JOIN student std ON score.student_id = std.id");
//            ResultSet rs = ps.executeQuery();
//
//            while(rs.next()){
//              Score score = new Score(rs.getInt("student_id"), rs.getInt("course_id"), rs.getString("score"),rs.getString("grade"));
//
//              scoreList.add(score);
//            }
//        } catch(SQLException ex){
//            Logger.getLogger(Student.class).log(Level.SEVERE, null,ex);
//
//        }
//        return scoreList;
//
//    }

    public void operation(char operation, Integer studentId, Integer courseId, Double score, String grade){
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;

        if(operation == 'i'){

            try {
                ps = con.prepareStatement("INSERT INTO score (student_id, course_id, score, grade) VALUES (?,?,?,?)");
                ps.setInt(1, studentId);
                ps.setInt(2, courseId);
                ps.setDouble(3, score);
                ps.setString(4, grade);

                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Score Added!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
            }

           }

        if(operation == 'u'){

            try {
                ps = con.prepareStatement("UPDATE score SET score = ? , grade = ? WHERE student_id = ? AND course_id = ?");
                ps.setDouble(1, score);
                ps.setString(2, grade);
                ps.setInt(3, studentId);
                ps.setInt(4, courseId);




                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Score Updated!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

           }

        if(operation == 'd'){

            try {
                ps = con.prepareStatement("DELETE FROM score WHERE student_id = ? AND course_id = ?");
                ps.setInt(1, studentId);
                ps.setInt(2, courseId);


                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Score Deleted!");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

           }

    }

    public void fillScoreTable(JTable table){
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("SELECT score.student_id, std.firstName, std.lastName,  course.course_name, score.score, "
                    + "score.grade FROM score score JOIN course course ON score.course_id = course.id JOIN "
                    + "student std ON score.student_id = std.id") ;
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();

            Object[] row;

            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getDouble(5);
                row[5] = rs.getString(6);

                model.addRow(row);

            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
//        public void fillScoreTable1(JTable table){
//        
//            DefaultTableModel model = (DefaultTableModel)table.getModel();
//            Object[] row;
//
//            for(int i = 0; i < ScoreList().size(); i++){
//                    row = new Object[6];
//                    row[0] = ScoreList().get(i).getStudent_id();
//                    row[1] = ScoreList().get(i).getCourse_id();
//                    row[2] = ScoreList().get(i).getScore();
//                    row[3] = ScoreList().get(i).getGrade();
//                    
//                    model.addRow(row);
//
//            }
//        }
        
  
}
