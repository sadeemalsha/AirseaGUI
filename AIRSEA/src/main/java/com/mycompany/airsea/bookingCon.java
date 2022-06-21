/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.airsea;

import java.sql.Connection;


import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.swing.JOptionPane;


/**
 *
 * @author sadeem
 */
public class bookingCon extends javax.swing.JFrame {
static String payementMethod=null;
  final String DATABASE_URL = "jdbc:derby://localhost:1527/AirSea";
   PreparedStatement ps=null;
      PreparedStatement ps1=null;

      ResultSet rs=null;
    static Connection connection = null;
    Statement st=null;
 String FlightNo=availableFlights.FlightNo;
 double FlightPrice;
String Depdate=null;
String Arridate=null;
String Deptime=null;
String Arritime=null;
String Depcity=null;
String Arricity=null;
String classs=null;

String name=PassengerMenu.fname+" "+PassengerMenu.lname;
double totalP=0;
int id=PassengerMenu.ID;
int numofT=availableFlights.noOfTickets;
static int TicketNo;
    /**
     * Creates new form bookingCon
     */
    public bookingCon() {
        initComponents();setData();
    }
     public void closeDB(){
        try{
            st.close();
        rs.close();
        ps.close();
        connection.close();}
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public void setData(){
        try{
                    connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");

                     ps = connection.prepareStatement("SELECT * FROM FLIGHT WHERE FLIGHT_NO=?");
                       ps.setString(1,FlightNo );
                       rs=ps.executeQuery();
                       
                        while(rs.next()){
               
  nameLL.setText(name);
           FlightPrice=rs.getDouble("FLIGHT_PRICE");
          
           flightPL.setText(String.valueOf(FlightPrice));
           fnoL.setText(FlightNo);
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
           nooftL.setText(String.valueOf(numofT));
           totalP=FlightPrice*availableFlights.noOfTickets;
           totalLL.setText(String.valueOf(totalP));
           
                        }

        }catch (SQLException ex) {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depdate.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        depdate.setForeground(new java.awt.Color(102, 102, 102));
        depdate.setText("Departure Date ");
        jPanel1.add(depdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        arridate.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        arridate.setForeground(new java.awt.Color(102, 102, 102));
        arridate.setText("Arrival Date");
        jPanel1.add(arridate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        arritime.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        arritime.setForeground(new java.awt.Color(102, 102, 102));
        arritime.setText("Arrival Time");
        jPanel1.add(arritime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        nameL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        nameL.setForeground(new java.awt.Color(102, 102, 102));
        nameL.setText("No Of Ticket/s :");
        jPanel1.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        flighno.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        flighno.setForeground(new java.awt.Color(102, 102, 102));
        flighno.setText("Flight No ");
        jPanel1.add(flighno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        classt.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        classt.setForeground(new java.awt.Color(102, 102, 102));
        classt.setText("Class ");
        jPanel1.add(classt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        deptime1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        deptime1.setForeground(new java.awt.Color(102, 102, 102));
        deptime1.setText("Departure Time");
        jPanel1.add(deptime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        total.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setText("Total ");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 20));

        nameL2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        nameL2.setForeground(new java.awt.Color(102, 102, 102));
        nameL2.setText("Passenger Name ");
        jPanel1.add(nameL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        flighPrice1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        flighPrice1.setForeground(new java.awt.Color(102, 102, 102));
        flighPrice1.setText("Flight Price ");
        jPanel1.add(flighPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 20));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, -1));

        fnoL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        fnoL.setForeground(new java.awt.Color(51, 51, 51));
        fnoL.setText("jLabel1");
        jPanel1.add(fnoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        totalLL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        totalLL.setForeground(new java.awt.Color(51, 51, 51));
        totalLL.setText("jLabel1");
        jPanel1.add(totalLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        classL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        classL.setForeground(new java.awt.Color(51, 51, 51));
        classL.setText("jLabel1");
        jPanel1.add(classL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        depDL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        depDL.setForeground(new java.awt.Color(51, 51, 51));
        depDL.setText("jLabel1");
        jPanel1.add(depDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        arriDL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        arriDL.setForeground(new java.awt.Color(51, 51, 51));
        arriDL.setText("jLabel1");
        jPanel1.add(arriDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        depTL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        depTL.setForeground(new java.awt.Color(51, 51, 51));
        depTL.setText("jLabel1");
        jPanel1.add(depTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        arriTL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        arriTL.setForeground(new java.awt.Color(51, 51, 51));
        arriTL.setText("jLabel1");
        jPanel1.add(arriTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        nameLL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        nameLL.setForeground(new java.awt.Color(51, 51, 51));
        nameLL.setText("jLabel1");
        jPanel1.add(nameLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        nooftL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        nooftL.setForeground(new java.awt.Color(51, 51, 51));
        nooftL.setText("jLabel1");
        jPanel1.add(nooftL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        flightPL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        flightPL.setForeground(new java.awt.Color(51, 51, 51));
        flightPL.setText("jLabel1");
        jPanel1.add(flightPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        fromL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        fromL.setForeground(new java.awt.Color(102, 102, 102));
        fromL.setText("From ");
        jPanel1.add(fromL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        toL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        toL.setForeground(new java.awt.Color(102, 102, 102));
        toL.setText("To ");
        jPanel1.add(toL, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        toLL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        toLL.setForeground(new java.awt.Color(51, 51, 51));
        toLL.setText("jLabel1");
        jPanel1.add(toLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        fromLL.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        fromLL.setForeground(new java.awt.Color(51, 51, 51));
        fromLL.setText("jLabel1");
        jPanel1.add(fromLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/Users/sadeem/NetBeansProjects/AIRSEA/src/pics/payement.png")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 530, 650));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        PassengerMenu p=new PassengerMenu();
        p.setVisible(true);
        dispose();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
      connection = DriverManager.getConnection(DATABASE_URL, "Sadeem", "123");

       ps = connection.prepareStatement("INSERT INTO TICKET (FILGHT_NO,PASSENGER_ID,NO_OF_TICKETS) VALUES(?,?,?) ");
     ps1 = connection.prepareStatement("INSERT INTO BILL (BILL,TICKET_NO) VALUES(?,?) ");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String date=dtf.format(now);
       
         String[] options = new String[] {"Visa", "MasterCard", "Mada", "Cash"};
         String per="Preferred Payement Method ";
         String mess="How Would You Like To Pay ?  ";
    int response = JOptionPane.showOptionDialog(null, mess, per,
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
    
    if(response==0){
        payementMethod="Visa";
      
       
    }
    else if(response==1){
        payementMethod="MasterCard";
      
    }
    else if(response==2){
        payementMethod="Mada";
       
        
    }
     else if(response==3){
        payementMethod="Cash";
       
    }
    
    ps.setInt(1,Integer.parseInt(FlightNo));
      ps.setInt(2,id);
      ps.setInt(3,numofT);
      String Bill="("+PassengerMenu.fname+" "+PassengerMenu.lname+","+date+","+payementMethod+")";
      
      
     int suc= ps.executeUpdate();
    st=connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
 rs=st.executeQuery("select * from TICKET");
if (rs.last()) {
    TicketNo = rs.getInt("TICKET_NO");
             

    
}
     
     
      if(suc>0){
    
           JOptionPane.showMessageDialog(null,"Thank You For Your Purchase ! " );
           ps1.setString(1,Bill);
            ps1.setInt(2,TicketNo);
           
            ps1.executeUpdate();
           confirmTicket tc=new confirmTicket();
           tc.setVisible(true);
           dispose();
           closeDB();
      }
    
}
catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    
     
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(bookingCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookingCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arriDL;
    private javax.swing.JLabel arriTL;
    private javax.swing.JLabel arridate;
    private javax.swing.JLabel arritime;
    private javax.swing.JLabel background;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL2;
    private javax.swing.JLabel nameLL;
    private javax.swing.JLabel nooftL;
    private javax.swing.JLabel toL;
    private javax.swing.JLabel toLL;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalLL;
    // End of variables declaration//GEN-END:variables
}