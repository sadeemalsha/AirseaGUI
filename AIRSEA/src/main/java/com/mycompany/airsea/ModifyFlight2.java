package com.mycompany.airsea;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HSAls
 */
public class ModifyFlight2 extends javax.swing.JFrame {

    /**
     * Creates new form ModifyFlight2
     */
    public ModifyFlight2() {
        initComponents();
    }

  final String DATABASE_URL = "jdbc:derby://localhost:1527/AirSea";
       static Connection con= null;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textF = new javax.swing.JTextField();
        saveB = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textF.setForeground(new java.awt.Color(0, 0, 102));
        textF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFActionPerformed(evt);
            }
        });
        jPanel1.add(textF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 20));

        saveB.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        saveB.setForeground(new java.awt.Color(0, 0, 102));
        saveB.setText("Save");
        saveB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveB.setPreferredSize(new java.awt.Dimension(75, 27));
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });
        jPanel1.add(saveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 270, -1, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Cancel");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 80, 30));

        combo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        combo.setForeground(new java.awt.Color(0, 0, 102));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arrival City", "Destination City", "Arrival Date", "Destination Date" }));
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 150, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Enter the new value :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Modify Flights");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Select What You'd Like To Modify");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/background1.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

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

    private void textFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminFunctions f=new AdminFunctions();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        try {
            con = DriverManager.getConnection(DATABASE_URL, "Sadeem","123");

            if ( combo.getSelectedItem().toString().equals("Arrival City")  ){

                PreparedStatement p1 = con.prepareStatement("UPDATE FLIGHT set ARRIVAL_CITY =? WHERE FLIGHT_NO=?");
                p1.setString(1, textF.getText());
                p1.setString(2, ModifyFlight.Flight);
                int updateRow = p1.executeUpdate();
                if (updateRow>0){
                    JOptionPane.showMessageDialog(null, "Arrival City Updated Successfully!");
                }
                p1.close();
                con.close();
            }

            else if (combo.getSelectedItem().toString().equals("Destination City") ){
                PreparedStatement p2 = con.prepareStatement("UPDATE FLIGHT set DEPARTURE_CITY =? WHERE FLIGHT_NO=?");
                p2.setString(1, textF.getText());
                p2.setString(2, ModifyFlight.Flight);
                int updateRow = p2.executeUpdate();
                if (updateRow>0){
                    JOptionPane.showMessageDialog(null, "Destination City Updated Successfully!");
                }
                p2.close();
                con.close();
            }
            else if (combo.getSelectedItem().toString().equals("Arrival Date") ){
                PreparedStatement p3 = con.prepareStatement("UPDATE FLIGHT set ARR_DATE =? WHERE FLIGHT_NO=?");
                p3.setString(1, textF.getText());
                p3.setString(2, ModifyFlight.Flight);
                int updateRow = p3.executeUpdate();
                if (updateRow>0){
                    JOptionPane.showMessageDialog(null, "Arrival Date Updated Successfully!");
                }
                p3.close();
                con.close();
            }

            else if (combo.getSelectedItem().toString().equals("Destination Date") ){
                PreparedStatement p4 = con.prepareStatement("UPDATE FLIGHT set DEP_DATE =? WHERE FLIGHT_NO=?");
                p4.setString(1, textF.getText());
                p4.setString(2, ModifyFlight.Flight);
                int updateRow = p4.executeUpdate();
                if (updateRow>0){
                    JOptionPane.showMessageDialog(null, "Destination Date Updated Successfully!");
                }
                p4.close();
                con.close();
            }

        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_saveBActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyFlight2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyFlight2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyFlight2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyFlight2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyFlight2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveB;
    private javax.swing.JTextField textF;
    // End of variables declaration//GEN-END:variables
}
