/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.airsea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author sadeem
 */
public class passengerinterface extends javax.swing.JFrame {
 ResultSet rs=null;
    /**
     * Creates new form passengerinterface
     */
       final String DATABASE_URL = "jdbc:derby://localhost:1527/AirSea";
    final String SELECT_QUERY = "SELECT * FROM PASSENGER";
Connection connection=null;

    public passengerinterface() {
        initComponents();
    }
    
       private boolean checkUsername(String username) {
        Boolean check = false;
        try {
          
            
             connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM PASSENGER WHERE USERNAME =?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                check = true;
            }
      
            ps.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return check;
    }
       
       
        private boolean checkEmail(String Email) {
        Boolean check = false;
        try {
           
            
             connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM PASSENGER WHERE EMAIL=?");
            ps.setString(1, Email);
            rs = ps.executeQuery();
            if (rs.next()) {
                check = true;
            }
      
            ps.close();
            connection.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return check;
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroub = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        regestrationL = new javax.swing.JLabel();
        passwordL = new javax.swing.JLabel();
        firstnameL = new javax.swing.JLabel();
        lastnameL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        phoneNoL = new javax.swing.JLabel();
        genderL = new javax.swing.JLabel();
        usernameL = new javax.swing.JLabel();
        firstnameTx = new javax.swing.JTextField();
        lastnameTx = new javax.swing.JTextField();
        emailTypesCombo = new javax.swing.JComboBox<>();
        codeL = new javax.swing.JLabel();
        emailTx = new javax.swing.JTextField();
        atL = new javax.swing.JLabel();
        phoneTx = new javax.swing.JTextField();
        usernameTx = new javax.swing.JTextField();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        cancelBt = new javax.swing.JButton();
        registerlBt = new javax.swing.JButton();
        passwordTx = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Passenger Regestration");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regestrationL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        regestrationL.setForeground(new java.awt.Color(0, 0, 102));
        regestrationL.setText("REGISTRATION");
        jPanel1.add(regestrationL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        passwordL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordL.setForeground(new java.awt.Color(0, 0, 102));
        passwordL.setText("Password :");
        jPanel1.add(passwordL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, 30));

        firstnameL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        firstnameL.setForeground(new java.awt.Color(0, 0, 102));
        firstnameL.setText("First Name :");
        jPanel1.add(firstnameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lastnameL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lastnameL.setForeground(new java.awt.Color(0, 0, 102));
        lastnameL.setText("Last Name :");
        jPanel1.add(lastnameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        emailL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        emailL.setForeground(new java.awt.Color(0, 0, 102));
        emailL.setText("Email :");
        jPanel1.add(emailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        phoneNoL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phoneNoL.setForeground(new java.awt.Color(0, 0, 102));
        phoneNoL.setText("Phone No :");
        jPanel1.add(phoneNoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        genderL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        genderL.setForeground(new java.awt.Color(0, 0, 102));
        genderL.setText("Gender :");
        jPanel1.add(genderL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        usernameL.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameL.setForeground(new java.awt.Color(0, 0, 102));
        usernameL.setText("UserName :");
        jPanel1.add(usernameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 20));

        firstnameTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTxActionPerformed(evt);
            }
        });
        jPanel1.add(firstnameTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 120, 20));

        lastnameTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTxActionPerformed(evt);
            }
        });
        jPanel1.add(lastnameTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, 20));

        emailTypesCombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailTypesCombo.setForeground(new java.awt.Color(0, 0, 102));
        emailTypesCombo.setMaximumRowCount(3);
        emailTypesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "gmail.com", "hotmail.com", "yahoo.com", "outlook.com" }));
        emailTypesCombo.setSelectedItem(-1);
        jPanel1.add(emailTypesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 110, 20));

        codeL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codeL.setForeground(new java.awt.Color(0, 0, 102));
        codeL.setText("+966");
        jPanel1.add(codeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        emailTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxActionPerformed(evt);
            }
        });
        jPanel1.add(emailTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 120, 20));

        atL.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        atL.setForeground(new java.awt.Color(0, 0, 102));
        atL.setText("@");
        jPanel1.add(atL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        phoneTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxActionPerformed(evt);
            }
        });
        jPanel1.add(phoneTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, 20));

        usernameTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, 20));

        genderGroub.add(maleRB);
        maleRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        maleRB.setForeground(new java.awt.Color(0, 0, 102));
        maleRB.setText("Male");
        maleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRBActionPerformed(evt);
            }
        });
        jPanel1.add(maleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        genderGroub.add(femaleRB);
        femaleRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        femaleRB.setForeground(new java.awt.Color(0, 0, 102));
        femaleRB.setText("Female");
        femaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBActionPerformed(evt);
            }
        });
        jPanel1.add(femaleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        cancelBt.setBackground(new java.awt.Color(255, 255, 255));
        cancelBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelBt.setForeground(new java.awt.Color(0, 0, 102));
        cancelBt.setText("Cancel");
        cancelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        registerlBt.setBackground(new java.awt.Color(255, 255, 255));
        registerlBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        registerlBt.setForeground(new java.awt.Color(0, 0, 102));
        registerlBt.setText("Register");
        registerlBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerlBtActionPerformed(evt);
            }
        });
        jPanel1.add(registerlBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        passwordTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTxActionPerformed

    private void lastnameTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTxActionPerformed

    private void emailTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxActionPerformed

    private void phoneTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxActionPerformed

    private void usernameTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxActionPerformed

    private void maleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRBActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBActionPerformed

    private void cancelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtActionPerformed
        // TODO add your handling code here:
         PassengerLoginForm p=   new PassengerLoginForm();
     p.setVisible(true);
     dispose();
    }//GEN-LAST:event_cancelBtActionPerformed

    private void registerlBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerlBtActionPerformed
        // TODO add your handling code here:
        
        
          try (Connection connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");
         
            ) {
            String fname = firstnameTx.getText();
            String lname = lastnameTx.getText();
            String email=emailTx.getText();
          String emailad = emailTx.getText()+"@"+emailTypesCombo.getSelectedItem();
          String gender=null;
       
         
            String phone = phoneTx.getText();
              if(femaleRB.isSelected()){
             gender ="F";
         }
         if(maleRB.isSelected()){
             gender ="M";
         }
            String username = usernameTx.getText();
            String password = String.valueOf(passwordTx.getPassword());
         

            try {
                PreparedStatement addPassenger = connection.prepareStatement("INSERT INTO PASSENGER (USERNAME,PASSWORD,FNAME,LNAME,EMAIL,PHONE_NUM,GENDER) " + "VALUES (?,?,?,?,?,?,?)");
                if (email!=" ") {
                    if(checkEmail(emailad)!=true){
                    if (username != null) {
                        if (checkUsername(username) != true) {
                            if (fname != null&&lname!=null) {
                                if(gender!=null){
                                addPassenger.setString(1, username);
                                addPassenger.setString(2, password);
                                addPassenger.setString(3, fname);
                                addPassenger.setString(4, lname);
                                addPassenger.setString(5, emailad);
                                addPassenger.setInt(6, Integer.parseInt(phone));
                                addPassenger.setString(7, gender);
                                        
                                    
                  
                                if (addPassenger.executeUpdate() > 0) {
                                    JOptionPane.showMessageDialog(null, "You Have Successfully Registered ! Thank You ");
                                         PassengerMenu.username=username;
                                   PassengerMenu p=   new PassengerMenu();
     p.setVisible(true);
     dispose();
     addPassenger.close();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error ocured", "Error", ERROR_MESSAGE);
                                }

                            }else{
          JOptionPane.showMessageDialog(null, "Please Select Your Gender !", "Error", ERROR_MESSAGE);

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "First Name or Last Name Cannot Be Empty!", "Error", ERROR_MESSAGE);

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "This Username Already Exist", "Error", ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Fill Your UserName ", "Error", ERROR_MESSAGE);

                    }
                    }
                    else
                    {
          JOptionPane.showMessageDialog(null, "This Email is Already Registered ", "Error", ERROR_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please Fill Your Email ", "Error", ERROR_MESSAGE);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
                         
        
        

     
    }//GEN-LAST:event_registerlBtActionPerformed

    private void passwordTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxActionPerformed

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
            java.util.logging.Logger.getLogger(passengerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passengerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passengerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passengerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passengerinterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atL;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelBt;
    private javax.swing.JLabel codeL;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTx;
    private javax.swing.JComboBox<String> emailTypesCombo;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JLabel firstnameL;
    private javax.swing.JTextField firstnameTx;
    private javax.swing.ButtonGroup genderGroub;
    private javax.swing.JLabel genderL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnameL;
    private javax.swing.JTextField lastnameTx;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JLabel passwordL;
    private javax.swing.JPasswordField passwordTx;
    private javax.swing.JLabel phoneNoL;
    private javax.swing.JTextField phoneTx;
    private javax.swing.JLabel regestrationL;
    private javax.swing.JButton registerlBt;
    private javax.swing.JLabel usernameL;
    private javax.swing.JTextField usernameTx;
    // End of variables declaration//GEN-END:variables
}