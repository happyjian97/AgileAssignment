/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.AssignedJob;
import domain.DeliveryMen;
import domain.Order;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ManagerCheckStatus extends javax.swing.JInternalFrame {

    private List<DeliveryMen> DmListTxt = new ArrayList<>();
    public Queue<DeliveryMen> DmQueueTxt = new ArrayBlockingQueue<>(50);
    public Queue<DeliveryMen> DmQueue = new ArrayBlockingQueue<>(50);
    public List<Order> OdList = new ArrayList<>();
    public List<AssignedJob> jobList = new ArrayList<>();
    private String DmDetails = "";
    private String OdDetails = "";
    private int count = 1;
    private DeliveryMen DM;
    private String name = "";
    private DeliveryMen temp;
    private AssignedJob job;
    private int orderId;
    
    public ManagerCheckStatus() {
        initComponents();
    }
    
    public ManagerCheckStatus(String name) {
        initComponents();
        this.name = name;
        initializeList();
        getDeliverymanStatus();
        getOrder();
        check();
    }
    
    private void check(){
        if(txtAreaDmDetails.getText().equals("") || txtAreaOrderDetails.getText().equals("")){
            btnAssign.setEnabled(false);
        }
        else{
            btnAssign.setEnabled(true);
        }
    }
    
    private void initializeList() {        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("DeliveryMenQueue.dat"));
          DmQueueTxt = (ArrayBlockingQueue) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "DmQueue not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from queue file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("DeliveryMen.dat"));
          DmListTxt = (ArrayList) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "DmList not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from dm file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("OrderList.dat"));
          OdList = (ArrayList) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Order List not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from order file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("AssignedJob.dat"));
          jobList = (ArrayList) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Job not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from job file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void getDeliverymanStatus(){
        if(!DmQueueTxt.isEmpty()){
            for(int i=0;i <= DmQueueTxt.size();i++){
                DM = DmQueueTxt.remove();
                DmDetails +="No."+ count +"\tName:" + DM.getName() + "\tStatus:" + DM.getWorkingStatus() + "\n";
                count++;
                DmQueue.add(DM);
            }
            txtAreaDmDetails.setText(DmDetails);
        }
    }
    
    public void getOrder(){
        Order order1 = new Order(1001, "No delay", "KFC", 20.3, "0123456789", "Ordered", "12-12-2017", "12:00", null);
        Order order2 = new Order(1002, "No delay", "MCD", 11.3, "0145698742", "Ordered", "12-12-2017", "14:55", null);
        Order order3 = new Order(1003, "No delay", "Pizza", 15.5, "0167892563", "Ordered", "12-12-2017", "15:20", null);
        Order order4 = new Order(1004, "No delay", "Domino", 17.5, "0112359786", "Ordered", "12-12-2017", "15:50", null);
        Order order5 = new Order(1005, "No delay", "Burger", 21.0, "0194556332", "Ordered", "12-12-2017", "17:05", null);
        Order order6 = new Order(1006, "No delay", "Wendy", 11.0, "0165197703", "Ordered", "12-12-2017", "20:55", null);
        
        OdList.add(order1);
        OdList.add(order2);
        OdList.add(order3);
        OdList.add(order4);
        OdList.add(order5);
        OdList.add(order6);
        
        for(int i=0;i < OdList.size();i++){
            Order od = OdList.get(i);
            if(od.getStatus().equals("Ordered")){
                OdDetails +="Order ID: "+ od.getOrderId() +"\nCustomer Tel:" + od.getCustomerTel() + "\nPrice:" + od.getTotalPrice() + "\nStatus:" + od.getStatus()+ "\n\n";
            }
        }
        
        txtAreaOrderDetails.setText(OdDetails);
        
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("OrderList.dat"));
            ooStream.writeObject(OdList);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to Order file", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        btnAssign = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDmDetails = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOrderDetails = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deliverymans' Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnAssign.setText("Assign Delivery Order Job ");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        txtAreaDmDetails.setColumns(20);
        txtAreaDmDetails.setRows(5);
        txtAreaDmDetails.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaDmDetails);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAssign, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssign, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Order List"), "Order List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txtAreaOrderDetails.setColumns(20);
        txtAreaOrderDetails.setLineWrap(true);
        txtAreaOrderDetails.setRows(5);
        txtAreaOrderDetails.setEnabled(false);
        jScrollPane2.setViewportView(txtAreaOrderDetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        temp = DmQueue.remove();
        
        if(temp.getWorkingStatus().equals("available")){
            //assign order
            boolean get = true;
            
            for(int i= 0; i < OdList.size(); i++){
                if(get == true){
                    if(OdList.get(i).getStatus().equals("Ordered")){
                        orderId = OdList.get(i).getOrderId();
                        OdList.get(i).setStatus("Assigned");
                        get = false;
                    }
                }
            }
            //update status
           for(int i=0; i < DmListTxt.size(); i++){
               if(DmListTxt.get(i).getName().equals(temp.getName())){
                   DmListTxt.get(i).setWorkingStatus("delivering");
                   JOptionPane.showMessageDialog(null, "Order ID: " + orderId +"\nAssigned to " + temp.getName());
               }    
           } 
           job = new AssignedJob(temp.getName(),orderId);
           jobList.add(job);
           
        }

        try {
                ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMen.dat"));
                ooStream.writeObject(DmListTxt);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to DM file", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    

        try {
                ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMenQueue.dat"));
                ooStream.writeObject(DmQueue);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to Queue file", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        try {
                ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("OrderList.dat"));
                ooStream.writeObject(OdList);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to Order List file", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        try {
                ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("AssignedJob.dat"));
                ooStream.writeObject(jobList);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to Job file", "ERROR", JOptionPane.ERROR_MESSAGE);
            }   
                
        getDeliverymanStatus();
        
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaDmDetails;
    private javax.swing.JTextArea txtAreaOrderDetails;
    // End of variables declaration//GEN-END:variables
}
