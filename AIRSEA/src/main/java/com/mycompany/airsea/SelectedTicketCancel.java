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
import javax.swing.JOptionPane;

/**
 *
 * @author sadeem
 */
public class SelectedTicketCancel extends javax.swing.JFrame {
final String DATABASE_URL = "jdbc:derby://localhost:1527/AirSea";
    final String SELECT_QUERY = "SELECT * FROM PASSENGER";
    static Connection connection = null;
     PreparedStatement ps=null;
          PreparedStatement ps1=null;
      ResultSet  rs=null;
            ResultSet  rs1=null;
       double FlightPrice;
String Depdate=null;
String Arridate=null;
String Deptime=null;
String Arritime=null;
String Depcity=null;
String Arricity=null;
String classs=null;
String billInfo;
double totalP;
int noOfT;
    /**
     * Creates new form SelectedTicketCancel
     */
    public SelectedTicketCancel() {
        initComponents();
        viewTicket();
    }
        public void closeDB(){
        try{
        rs1.close();
        rs.close();
        ps.close();
        ps1.close();
        connection.close();}
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

     public void viewTicket(){
         try{  connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");

  ps = connection.prepareStatement("SELECT * FROM FLIGHT"
          + " INNER JOIN Ticket ON TICKET.FILGHT_NO = FLIGHT.FLIGHT_NO and ticket_no=?");
  

  ps.setString(1,Cancelinterface.selectedTicket);
           nameLL.setText(PassengerMenu.fname+ " "+PassengerMenu.lname);
      ps1= connection.prepareStatement("SELECT * FROM BILL WHERE TICKET_NO=?");
  
   ps1.setString(1,Cancelinterface.selectedTicket);
   
             rs1= ps1.executeQuery();
             
             if(rs1.next()){
             billInfo= rs1.getString("BILL");
            bilLL.setText(billInfo);
         }
                    rs = ps.executeQuery();
         
                  while(rs.next()){
                     FlightPrice=rs.getDouble("FLIGHT_PRICE");
      
           flightPL.setText(String.valueOf(FlightPrice));
           fnoL.setText(String.valueOf(rs.getInt("FLIGHT_NO")));
           Depdate=rs.getString("DEP_DATE");
           depDL.setText(Depdate);
           
           Deptime=rs.getString("DEP_TIME");
            depTL.setText(Deptime);
           Arridate=rs.getString("ARR_DATE");
           arriDL.setText(Arridate);
           Arritime=rs.getString("ARR_TIME");
            arriTL.setText(Arritime);
            
             Depcity=rs.getString("DEPARTURE_CITY");
             fromLL.setText(Depcity);
              Arricity= rs.getString("ARRIVAL_CITY");   
                toLL.setText(Arricity);
                
           classs=rs.getString("CLASS"); 
           classL.setText(classs);
          noOfT= rs.getInt("NO_OF_TICKETS");
           nooftL.setText(String.valueOf(noOfT));
            totalP=FlightPrice*noOfT;
           totalLL.setText(String.valueOf(totalP));
           ticketLL.setText(String.valueOf(rs.getInt("TICKET_NO")));
           
           
                  }
                  closeDB();
            


    }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
 
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
        depdate = new javax.swing.JLabel();
        arridate = new javax.swing.JLabel();
        arritime = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        flighno = new javax.swing.JLabel();
        classt = new javax.swing.JLabel();
        deptime1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        nameL2 = new javax.swing.JLabel();
        flighPrice1 = new javax.swing.JLabel();
        fnoL = new javax.swing.JLabel();
        totalLL = new javax.swing.JLabel();
        classL = new javax.swing.JLabel();
        depDL = new javax.swing.JLabel();
        arriDL = new javax.swing.JLabel();
        depTL = new javax.swing.JLabel();
        arriTL = new javax.swing.JLabel();
        nameLL = new javax.swing.JLabel();
        nooftL = new javax.swing.JLabel();
        flightPL = new javax.swing.JLabel();
        fromL = new javax.swing.JLabel();
        toL = new javax.swing.JLabel();
        toLL = new javax.swing.JLabel();
        fromLL = new javax.swing.JLabel();
        ticketNoL = new javax.swing.JLabel();
        ticketLL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        nameL1 = new javax.swing.JLabel();
        bilLL = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depdate.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        depdate.setForeground(new java.awt.Color(102, 102, 102));
        depdate.setText("Departure Date ");
        jPanel1.add(depdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        arridate.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        arridate.setForeground(new java.awt.Color(102, 102, 102));
        arridate.setText("Arrival Date ");
        jPanel1.add(arridate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        arritime.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        arritime.setForeground(new java.awt.Color(102, 102, 102));
        arritime.setText("Arrival Time ");
        jPanel1.add(arritime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        nameL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        nameL.setForeground(new java.awt.Color(102, 102, 102));
        nameL.setText("No Of Ticket/s ");
        jPanel1.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        flighno.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        flighno.setForeground(new java.awt.Color(51, 51, 51));
        flighno.setText("Flight No ");
        jPanel1.add(flighno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, 20));

        classt.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        classt.setForeground(new java.awt.Color(51, 51, 51));
        classt.setText("Class ");
        jPanel1.add(classt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        deptime1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        deptime1.setForeground(new java.awt.Color(102, 102, 102));
        deptime1.setText("Departure Time ");
        jPanel1.add(deptime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 20));

        total.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setText("Total ");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 20));

        nameL2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        nameL2.setForeground(new java.awt.Color(102, 102, 102));
        nameL2.setText("Passenger Name ");
        jPanel1.add(nameL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        flighPrice1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        flighPrice1.setForeground(new java.awt.Color(102, 102, 102));
        flighPrice1.setText("Flight Price ");
        jPanel1.add(flighPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, 20));

        fnoL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        fnoL.setText("---");
        jPanel1.add(fnoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, 20));

        totalLL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        totalLL.setText("jLabel1");
        jPanel1.add(totalLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        classL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        classL.setText("---");
        jPanel1.add(classL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        depDL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        depDL.setText("jLabel1");
        jPanel1.add(depDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        arriDL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        arriDL.setText("jLabel1");
        jPanel1.add(arriDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        depTL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        depTL.setText("jLabel1");
        jPanel1.add(depTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        arriTL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        arriTL.setText("jLabel1");
        jPanel1.add(arriTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        nameLL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        nameLL.setText("jLabel1");
        jPanel1.add(nameLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        nooftL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        nooftL.setText("jLabel1");
        jPanel1.add(nooftL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        flightPL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        flightPL.setText("jLabel1");
        jPanel1.add(flightPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        fromL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        fromL.setForeground(new java.awt.Color(51, 51, 51));
        fromL.setText("From :");
        jPanel1.add(fromL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        toL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        toL.setForeground(new java.awt.Color(51, 51, 51));
        toL.setText("To  ");
        jPanel1.add(toL, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        toLL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        toLL.setText("---");
        jPanel1.add(toLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        fromLL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        fromLL.setText("--");
        jPanel1.add(fromLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        ticketNoL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        ticketNoL.setForeground(new java.awt.Color(51, 51, 51));
        ticketNoL.setText("Ticket No ");
        jPanel1.add(ticketNoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        ticketLL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        ticketLL.setText("jLabel1");
        jPanel1.add(ticketLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        backB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        backB.setText("Cancel Ticket");
        backB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });
        jPanel1.add(backB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 110, -1));

        nameL1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        nameL1.setForeground(new java.awt.Color(102, 102, 102));
        nameL1.setText("Bill Info");
        jPanel1.add(nameL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        bilLL.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        bilLL.setText("jLabel1");
        jPanel1.add(bilLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/ticketB.png")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 250));

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

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
   try{
             String mess="Are You Sure You Want To Cancel Your Ticket NO  "+Cancelinterface.selectedTicket;
       int ch= JOptionPane.showConfirmDialog(this, mess ,"Cancel Ticket ",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
      
       connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");
  ps1= connection.prepareStatement("DELETE FROM BILL WHERE TICKET_NO=?");
  
   ps1.setString(1,Cancelinterface.selectedTicket);
                 ps = connection.prepareStatement(" DELETE FROM TICKET WHERE TICKET_NO=?");
                 ps.setString(1,Cancelinterface.selectedTicket);
                 
                     //yes
                     if(ch==0){
                    if(ps.executeUpdate()>0&&ps1.executeUpdate()>0){
                         JOptionPane.showMessageDialog(null, "You Have Successfully Deleted Your Ticket !");
                           PassengerMenu p=new PassengerMenu();
                              p.setVisible(true);
                              dispose();
                         
                    }
                  
                      } 
                     //no
                     else
                          if(ch==1){
                              PassengerMenu p=new PassengerMenu();
                              p.setVisible(true);
                              dispose();
                            
                              
                          }
                     ps.close();
                        ps1.close();
                        connection.close();
      
                     
   }
   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

  
   
        
    }//GEN-LAST:event_backBActionPerformed

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
            java.util.logging.Logger.getLogger(SelectedTicketCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectedTicketCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectedTicketCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectedTicketCancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectedTicketCancel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arriDL;
    private javax.swing.JLabel arriTL;
    private javax.swing.JLabel arridate;
    private javax.swing.JLabel arritime;
    private javax.swing.JButton backB;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bilLL;
    private javax.swing.JLabel classL;
    private javax.swing.JLabel classt;
    private javax.swing.JLabel depDL;
    private javax.swing.JLabel depTL;
    private javax.swing.JLabel depdate;
    private javax.swing.JLabel deptime1;
    private javax.swing.JLabel flighPrice1;
    private javax.swing.JLabel flighno;
    private javax.swing.JLabel flightPL;
    private javax.swing.JLabel fnoL;
    private javax.swing.JLabel fromL;
    private javax.swing.JLabel fromLL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL1;
    private javax.swing.JLabel nameL2;
    private javax.swing.JLabel nameLL;
    private javax.swing.JLabel nooftL;
    private javax.swing.JLabel ticketLL;
    private javax.swing.JLabel ticketNoL;
    private javax.swing.JLabel toL;
    private javax.swing.JLabel toLL;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalLL;
    // End of variables declaration//GEN-END:variables
}
