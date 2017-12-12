/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.DeliveryMen;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @Goh Zhen Jian
 */
public class DeliverymanAttendances extends javax.swing.JInternalFrame {

    private List<DeliveryMen> DmListTxt = new ArrayList<>();
    public Queue<DeliveryMen> DmQueueTxt = new ArrayBlockingQueue<>(50);
    public Queue<DeliveryMen> DmQueue = new ArrayBlockingQueue<>(50);
    public Queue<DeliveryMen> newQueue = new ArrayBlockingQueue<>(50);
    public String name;
    private String message;
    private boolean check=false;
    private int count = 0;
    private DeliveryMen temp;
    
    
    public DeliverymanAttendances() {
        initComponents();
    }
    
    public DeliverymanAttendances(String name) {
        initComponents();
        lblTotal.setVisible(false);
        this.name = name;
        message = "Welcome, " + name;
        lblInfo.setText(message);
        clock();    
        initializeList();
        checkStatus();
        jLabel1.setText("<html><div color=red>**</div> Choose to update your working status!</html>");  
    }
    
    public DeliverymanAttendances(String name,int count) {
        this.count = count;
        initComponents();
        lblTotal.setVisible(false);
        this.name = name;
        message = "Welcome, " + name;
        lblInfo.setText(message);
        clock();    
        initializeList();
        checkStatus();
        jLabel1.setText("<html><div color=red>**</div> Choose to update your working status!</html>");  
    }

    private void initializeList() {
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("DeliveryMen.dat"));
          DmListTxt = (ArrayList) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("DeliveryMenQueue.dat"));
          DmQueueTxt = (ArrayBlockingQueue) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    private void clock(){
        Thread clock = new Thread(){
            public void run(){
                try {
                    for(;;){
                        Calendar cal = new GregorianCalendar();
                        
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);
                        lblClock.setText("Time : " +hour+ ":" + minute + ":" + second);
                        lblDate.setText("Date : " + day + "/" + month + "/" + year);
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeliverymanAttendances.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
    }
    
    private void checkStatus(){
        
        for(int i=0;i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                switch (DmListTxt.get(i).getWorkingStatus()) {
                    case "unavailable":
                    case "":
                        if(count==0){
                            BtnClockIn.setEnabled(true);
                            BtnClockOut.setEnabled(false);
                            BtnBreak.setEnabled(false);
                            BtnWork.setEnabled(false);
                        }
                        else{
                            BtnClockIn.setEnabled(false);
                            BtnClockOut.setEnabled(false);
                            BtnBreak.setEnabled(false);
                            BtnWork.setEnabled(false);
                            //JOptionPane.showMessageDialog(null, "Come back again tomorrow.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case "available":
                        BtnClockIn.setEnabled(false);
                        BtnClockOut.setEnabled(true);
                        BtnBreak.setEnabled(true);
                        BtnWork.setEnabled(false);
                        break;
                    case "break":
                        BtnClockIn.setEnabled(false);
                        BtnClockOut.setEnabled(false);
                        BtnBreak.setEnabled(false);
                        BtnWork.setEnabled(true);
                        break;
                    case "delivering":
                        JOptionPane.showMessageDialog(null, "You are currently having a delivery. Please complete it before you could clock out.");
                        BtnClockIn.setEnabled(false);
                        BtnClockOut.setEnabled(false);
                        BtnBreak.setEnabled(false);
                        BtnWork.setEnabled(false);
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    private void calculateTotalTime(){
        int inHour = 0;
        int inMin = 0;
        int outHour = 0;
        int outMin = 0;
        int totalHour = 0;
        int totalMin = 0;
        
        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                String in = DmListTxt.get(i).getClockIn();
                String out = DmListTxt.get(i).getClockOut();
                
                inHour =Integer.parseInt(in.substring(0, 2));
                inMin = Integer.parseInt(in.substring(3,5));
                outHour = Integer.parseInt(out.substring(0, 2));
                outMin = Integer.parseInt(out.substring(3,5));
                
                if(outMin < inMin){
                    outHour--;
                    outMin = outMin+60;
                }
                totalHour = outHour-inHour;
                totalMin = outMin-inMin;

                lblTotal.setText("Total working time of the day is: " + totalHour + " hours and " + totalMin + " minutes");
                lblTotal.setVisible(true);
            }
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
        BtnClockIn = new javax.swing.JButton();
        BtnClockOut = new javax.swing.JButton();
        BtnBreak = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        BtnWork = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deliveryman Clock In & Clock Out", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        BtnClockIn.setText("Clock In");
        BtnClockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClockInActionPerformed(evt);
            }
        });

        BtnClockOut.setText("Clock Out");
        BtnClockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClockOutActionPerformed(evt);
            }
        });

        BtnBreak.setText("Break Time");
        BtnBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBreakActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInfo.setText("Information");

        lblClock.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setText("Time");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Current Time: ");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");

        lblTotal.setText("Total Time:");

        BtnWork.setText("Work");
        BtnWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnWorkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnWork)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BtnBreak)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnClockOut)
                                        .addGap(2, 2, 2)
                                        .addComponent(BtnClockIn))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnClockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnClockOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnBreak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnWork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClockInActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String time = dateFormat.format(date);

        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                DmListTxt.get(i).setClockIn(time);
                DmListTxt.get(i).setWorkingStatus("available");
                count++;

                try {
                    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMen.dat"));
                    ooStream.writeObject(DmListTxt);
                    JOptionPane.showMessageDialog(null, "Successfully Signed in for work!", "Info", JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                }             
                
                for(int j=1; j <= DmQueueTxt.size();j++){
                    if(!DmQueueTxt.isEmpty()){
                        temp = DmQueueTxt.remove();
                        if(!temp.getName().equals(DmListTxt.get(i).getName())){
                            newQueue.add(temp);
                        }
                    }
                }
                newQueue.add(DmListTxt.get(i));
                
                try {
                        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMenQueue.dat"));
                        ooStream.writeObject(newQueue);
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
            }
        }

        lblTotal.setVisible(false);
        checkStatus();
    }//GEN-LAST:event_BtnClockInActionPerformed

    private void BtnClockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClockOutActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String time = dateFormat.format(date);

        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Clock Out for Today's Work?","Warning",JOptionPane.YES_NO_OPTION);
                if(dialogResult == JOptionPane.YES_OPTION){
                    DmListTxt.get(i).setClockOut(time);
                    DmListTxt.get(i).setWorkingStatus("unavailable");

                    try {
                        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMen.dat"));
                        ooStream.writeObject(DmListTxt);
                        JOptionPane.showMessageDialog(null, "Successfully Signed out from work! \nHave a nice day!", "Info", JOptionPane.INFORMATION_MESSAGE);
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please come back later, when you like to clock out for the day.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
                
                for(int j=0; j <= DmQueueTxt.size();j++){
                    if(!DmQueueTxt.isEmpty()){
                        temp = DmQueueTxt.remove();
                        if(!temp.getName().equals(DmListTxt.get(i).getName())){
                            newQueue.add(temp);
                        }
                    }
                }
                try {
                            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMenQueue.dat"));
                            ooStream.writeObject(newQueue);
                        } catch (FileNotFoundException ex) {
                            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
            }
        }
        calculateTotalTime();
        checkStatus();
    }//GEN-LAST:event_BtnClockOutActionPerformed

    private void BtnBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBreakActionPerformed
        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                DmListTxt.get(i).setWorkingStatus("break");

                try {
                    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMen.dat"));
                    ooStream.writeObject(DmListTxt);
                    JOptionPane.showMessageDialog(null, "Please take a rest.", "Info", JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
                for(int j=1; j <= DmQueueTxt.size();j++){
                    if(!DmQueueTxt.isEmpty()){
                        temp = DmQueueTxt.remove();
                        if(!temp.getName().equals(DmListTxt.get(i).getName())){
                            newQueue.add(temp);
                        }
                        else{
                            temp.setWorkingStatus("break");
                            newQueue.add(temp);
                        }
                    }        
                }
                try {
                    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMenQueue.dat"));
                    ooStream.writeObject(newQueue);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        lblTotal.setText("Take a Rest!");
        lblTotal.setVisible(true);
        checkStatus();
    }//GEN-LAST:event_BtnBreakActionPerformed

    private void BtnWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnWorkActionPerformed
        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                DmListTxt.get(i).setWorkingStatus("available");

                try {
                    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMen.dat"));
                    ooStream.writeObject(DmListTxt);
                    JOptionPane.showMessageDialog(null, "Good luck for working.", "Info", JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
           
                for(int j=1; j <= DmQueueTxt.size();j++){
                    if(!DmQueueTxt.isEmpty()){
                        temp = DmQueueTxt.remove();
                        if(!temp.getName().equals(DmListTxt.get(i).getName())){
                            newQueue.add(temp);
                        }
                        else{
                            temp.setWorkingStatus("work");
                            newQueue.add(temp);
                        }
                    }
                }
                try {
                    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMenQueue.dat"));
                    ooStream.writeObject(newQueue);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        lblTotal.setText("Continue your work please.");
        lblTotal.setVisible(true);
        checkStatus();
    }//GEN-LAST:event_BtnWorkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBreak;
    private javax.swing.JButton BtnClockIn;
    private javax.swing.JButton BtnClockOut;
    private javax.swing.JButton BtnWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
