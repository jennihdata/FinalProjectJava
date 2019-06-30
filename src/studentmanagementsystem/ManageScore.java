/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static studentmanagementsystem.ManageStudentForm.jTable1;

/**
 *
 * @author Jennifer I
 */
public class ManageScore extends javax.swing.JFrame {

    /**
     * Creates new form ManageScore
     */
    
    Score score = new Score();
    Course course = new Course();
    public ManageScore() {
        initComponents();
        this.setLocationRelativeTo(null); // center the form
        score.fillScoreTable(jTableScore);
//        course.fillCourseCombo(jComboBox_courseId);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_delete = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jTextField_score = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableScore = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField_studentId = new javax.swing.JTextField();
        jLabel_studentId = new javax.swing.JLabel();
        jTextField_course = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Manage Score");

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jLabel2.setText("Course");

        jTableScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "First Name", "Last Name", "Course Name", "Score", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableScoreMouseClicked(evt);
            }
        });
        jTableScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableScoreKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableScore);

        jLabel3.setText("Score");

        jTextField_studentId.setEditable(false);
        jTextField_studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_studentIdActionPerformed(evt);
            }
        });

        jLabel_studentId.setText("Student ID");

        jTextField_course.setEditable(false);
        jTextField_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_courseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_studentId))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton_add)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_update)
                                .addGap(29, 29, 29)
                                .addComponent(jButton_delete))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_score, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_course, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(jTextField_studentId, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_studentId))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add)
                            .addComponent(jButton_update)
                            .addComponent(jButton_delete))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean verifyScore(){
       if(Double.valueOf(jTextField_score.getText())>100){
            JOptionPane.showMessageDialog(null,"Score too high!");
            return false;
        }else{
            return true;
        }
        
        
    }
    
    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        int studentId = Integer.valueOf(jTextField_studentId.getText());
        int courseId = course.getCourseId(jTextField_course.getText());
        
//        double scr = Double.valueOf(jTextField_score.getText());
//        String grade = "";        
        
        score.operation('d', studentId, courseId, null, null);
        jTableScore.setModel(new DefaultTableModel(null, new Object[]{"Student Id","First Name", "Last Name", "Course Name", "Score", "Grade"}));
        score.fillScoreTable(jTableScore);
        jTextField_studentId.setText("");
        jTextField_course.setText("");
        jTextField_score.setText("");
        
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
                
        int studentId = Integer.valueOf(jTextField_studentId.getText());
        int courseId = course.getCourseId(jTextField_course.getText());
        double scr = Double.valueOf(jTextField_score.getText());
        String grade = "";
        
        if(scr >= 80 && scr <= 100){
            grade = "A";
        }else if (scr >= 70 && scr <= 79) {
            grade = "B";
        }else if (scr >= 60 && scr <= 69) {
            grade = "C";
        }else if (scr >= 50 && scr <= 59) {
            grade = "D";
        }else if (scr >= 40 && scr <= 49) {
            grade = "E";
        }else if (scr >= 0 && scr <= 39) {
            grade = "F";
        }
        
        if(verifyScore()){
        score.operation('u',studentId, courseId, scr, grade);
       jTableScore.setModel(new DefaultTableModel(null, new Object[]{"Student Id","First Name", "Last Name", "Course Name", "Score", "Grade"}));
       score.fillScoreTable(jTableScore);
        }
       
//       update_table();
        
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jTableScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableScoreMouseClicked
        int index = jTableScore.getSelectedRow();
        jTextField_studentId.setText(jTableScore.getValueAt(index, 0).toString());
        jTextField_score.setText(jTableScore.getValueAt(index, 4).toString());
        jTextField_course.setText(jTableScore.getValueAt(index, 3).toString());
    }//GEN-LAST:event_jTableScoreMouseClicked

    private void jTableScoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableScoreKeyReleased

    }//GEN-LAST:event_jTableScoreKeyReleased

    private void jTextField_studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_studentIdActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        AddScore asf = new AddScore();
        asf.setVisible(true);
        asf.pack();
        asf.setLocationRelativeTo(null);
        asf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jTextField_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_courseActionPerformed

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
            java.util.logging.Logger.getLogger(ManageScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_studentId;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableScore;
    private javax.swing.JTextField jTextField_course;
    private javax.swing.JTextField jTextField_score;
    private javax.swing.JTextField jTextField_studentId;
    // End of variables declaration//GEN-END:variables
}
