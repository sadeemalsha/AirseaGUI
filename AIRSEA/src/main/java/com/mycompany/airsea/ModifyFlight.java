package com.mycompany.airsea;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModifyFlight extends javax.swing.JFrame {

    /**
     * Creates new form ModifyFlight
     */
    public ModifyFlight() {
        initComponents();

        Fillcombo();
    }

    final String DATABASE_URL = "jdbc:derby://localhost:1527/AirSea";
       static Connection con= null;
       ResultSet rs1,rs2; 
          PreparedStatement ps1=null;
         PreparedStatement ps2 =null;
          PreparedStatement ps3 =null;
          PreparedStatement ps4=null;
      
       
       static String Flight;
   private void Fillcombo(){
      
           try{
               con = DriverManager.getConnection(DATABASE_URL, "Sadeem","123");
             ps1 = con.prepareStatement("SELECT distinct FLIGHT_NO FROM FLIGHT");
    
            rs1= ps1.executeQuery();
         
          while (rs1.next()){
              
             combo1.addItem(String.valueOf(rs1.getInt("FLIGHT_NO")));
            }
   
       }
       
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
   }
       
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        modifyB = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Modify Flight");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Select Flight You'd Like To Modify Or Delete: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 300, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Flight No:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        combo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 90, 20));

        modifyB.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        modifyB.setForeground(new java.awt.Color(0, 0, 102));
        modifyB.setText("Modify");
        modifyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBActionPerformed(evt);
            }
        });
        jPanel1.add(modifyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, 30));

        Back.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 102));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 80, -1));

        DeleteB.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        DeleteB.setForeground(new java.awt.Color(0, 0, 102));
        DeleteB.setText("Delete");
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 230, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/logo.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/background1.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

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

    private void modifyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBActionPerformed
       Flight = combo1.getSelectedItem().toString();
        ModifyFlight2 md2 = new ModifyFlight2();
        md2.setVisible(true);
        dispose();
    }//GEN-LAST:event_modifyBActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         AdminFunctions f=new AdminFunctions();
        f.setVisible(true);
        dispose();
        
    
    }//GEN-LAST:event_BackActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
try {
    
    Flight = combo1.getSelectedItem().toString();
 con = DriverManager.getConnection(DATABASE_URL, "Sadeem","123");
     ps2 = con.prepareStatement("SELECT * FROM TICKET WHERE FILGHT_NO=?");
    ps2.setString(1, Flight);
       rs1=ps2.executeQuery();
       
       if(rs1.next()){
           
  ps3 = con.prepareStatement("DELETE FROM TICKET WHERE FILGHT_NO=?");
 
    ps3.setString(1, Flight);
        
        int x = ps3.executeUpdate();
 
       }
       
       ps4=con.prepareStatement("DELETE FROM FLIGHT WHERE FLIGHT_NO=?");
    ps4.setString(1,Flight);
    int y= ps4.executeUpdate();

    if(y>0){
        combo1.removeItemAt(combo1.getSelectedIndex());
            JOptionPane.showMessageDialog(null, "Deleted Successfully !");
        
    }
    
    else
        JOptionPane.showMessageDialog(null, "failed !");
 
  
   rs1.close();
     ps1.close();
   ps2.close();
   ps3.close();
   ps4.close();
  con.close();
   
   }
catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

       
                
    
        
    }//GEN-LAST:event_DeleteBActionPerformed


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
            java.util.logging.Logger.getLogger(ModifyFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton DeleteB;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyB;
    // End of variables declaration//GEN-END:variables
}
