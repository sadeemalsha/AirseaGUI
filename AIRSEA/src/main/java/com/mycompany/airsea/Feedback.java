/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.airsea;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author sadeem
 */
public class Feedback extends javax.swing.JFrame {
      String fname=null;
    String lname=null;
    String email=null;
    String  emailad=null;
String   phoneN=null;
    String  feedback=null;
    /**
     * Creates new form Feedback
     */
    public Feedback() {
        initComponents();
       
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
        regestrationL1 = new javax.swing.JLabel();
        firstnameL1 = new javax.swing.JLabel();
        lastnameL1 = new javax.swing.JLabel();
        emailL1 = new javax.swing.JLabel();
        phoneNoL1 = new javax.swing.JLabel();
        usernameL1 = new javax.swing.JLabel();
        firstnameTx1 = new javax.swing.JTextField();
        lastnameTx = new javax.swing.JTextField();
        emailTypesCombo = new javax.swing.JComboBox<>();
        codeL = new javax.swing.JLabel();
        emailTx = new javax.swing.JTextField();
        atL = new javax.swing.JLabel();
        phoneTx = new javax.swing.JTextField();
        cancelBt = new javax.swing.JButton();
        registerlBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbacktxa = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regestrationL1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        regestrationL1.setForeground(new java.awt.Color(0, 0, 102));
        regestrationL1.setText("FEEDBACK");
        jPanel1.add(regestrationL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        firstnameL1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        firstnameL1.setForeground(new java.awt.Color(0, 0, 102));
        firstnameL1.setText("First Name :");
        jPanel1.add(firstnameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        lastnameL1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lastnameL1.setForeground(new java.awt.Color(0, 0, 102));
        lastnameL1.setText("Last Name :");
        jPanel1.add(lastnameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        emailL1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        emailL1.setForeground(new java.awt.Color(0, 0, 102));
        emailL1.setText("Email :");
        jPanel1.add(emailL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        phoneNoL1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phoneNoL1.setForeground(new java.awt.Color(0, 0, 102));
        phoneNoL1.setText("Phone No :");
        jPanel1.add(phoneNoL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        usernameL1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameL1.setForeground(new java.awt.Color(0, 0, 102));
        usernameL1.setText("FeedBack :");
        jPanel1.add(usernameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));

        firstnameTx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTx1ActionPerformed(evt);
            }
        });
        jPanel1.add(firstnameTx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 120, 20));

        lastnameTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTxActionPerformed(evt);
            }
        });
        jPanel1.add(lastnameTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, 20));

        emailTypesCombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailTypesCombo.setForeground(new java.awt.Color(0, 0, 102));
        emailTypesCombo.setMaximumRowCount(3);
        emailTypesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "gmail.com", "hotmail.com", "yahoo.com", "outlook.com" }));
        emailTypesCombo.setSelectedItem(-1);
        jPanel1.add(emailTypesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 110, 20));

        codeL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codeL.setForeground(new java.awt.Color(0, 0, 102));
        codeL.setText("+966");
        jPanel1.add(codeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        emailTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxActionPerformed(evt);
            }
        });
        jPanel1.add(emailTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 20));

        atL.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        atL.setForeground(new java.awt.Color(0, 0, 102));
        atL.setText("@");
        jPanel1.add(atL, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        phoneTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxActionPerformed(evt);
            }
        });
        jPanel1.add(phoneTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 120, 20));

        cancelBt.setBackground(new java.awt.Color(255, 255, 255));
        cancelBt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancelBt.setForeground(new java.awt.Color(0, 0, 102));
        cancelBt.setText("Cancel");
        cancelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        registerlBt.setBackground(new java.awt.Color(255, 255, 255));
        registerlBt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        registerlBt.setForeground(new java.awt.Color(0, 0, 102));
        registerlBt.setText("Send");
        registerlBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerlBtActionPerformed(evt);
            }
        });
        jPanel1.add(registerlBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 90, -1));

        feedbacktxa.setColumns(20);
        feedbacktxa.setRows(5);
        jScrollPane1.setViewportView(feedbacktxa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 260, 90));

        background.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/background1.jpg")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTx1ActionPerformed

    private void lastnameTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTxActionPerformed

    private void emailTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxActionPerformed

    private void phoneTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxActionPerformed

    private void cancelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtActionPerformed
        // TODO add your handling code here:
        Welcoming2 p=   new Welcoming2();
        p.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cancelBtActionPerformed

    private void registerlBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerlBtActionPerformed
        // TODO add your handling code here:
             try {
          fname = firstnameTx1.getText();
        lname= lastnameTx.getText();
         email=emailTx.getText();
        emailad=emailTx.getText()+"@"+emailTypesCombo.getSelectedItem();
        phoneN=phoneTx.getText();
        feedback=feedbacktxa.getText().toString();
       
   
               FileWriter writer = new FileWriter("feedBack.txt",true);
                         writer.write("First Name : " + fname + "\n");
                          writer.write("Last Name : " + lname + "\n");
                           writer.write("Email Address : " + emailad + "\n");
                            writer.write("Phone No : " + phoneN + "\n");
                            writer.write("FeedBack : " + feedback + "\n");
                            writer.close();
                           
             JOptionPane.showMessageDialog(null, "Thank You For Your FeedBack! ", "Send Successfully ",JOptionPane.INFORMATION_MESSAGE);
Welcoming2 w=new Welcoming2();
w.setVisible(true);
dispose();
                     
             }
             catch (IOException ex) {
                 
                JOptionPane.showMessageDialog(null, ex);
                
            }

    }//GEN-LAST:event_registerlBtActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atL;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelBt;
    private javax.swing.JLabel codeL;
    private javax.swing.JLabel emailL;
    private javax.swing.JLabel emailL1;
    private javax.swing.JTextField emailTx;
    private javax.swing.JComboBox<String> emailTypesCombo;
    private javax.swing.JTextArea feedbacktxa;
    private javax.swing.JLabel firstnameL;
    private javax.swing.JLabel firstnameL1;
    private javax.swing.JTextField firstnameTx;
    private javax.swing.JTextField firstnameTx1;
    private javax.swing.JLabel genderL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnameL;
    private javax.swing.JLabel lastnameL1;
    private javax.swing.JTextField lastnameTx;
    private javax.swing.JLabel passwordL;
    private javax.swing.JLabel phoneNoL;
    private javax.swing.JLabel phoneNoL1;
    private javax.swing.JTextField phoneTx;
    private javax.swing.JLabel regestrationL;
    private javax.swing.JLabel regestrationL1;
    private javax.swing.JButton registerlBt;
    private javax.swing.JLabel usernameL;
    private javax.swing.JLabel usernameL1;
    // End of variables declaration//GEN-END:variables
}