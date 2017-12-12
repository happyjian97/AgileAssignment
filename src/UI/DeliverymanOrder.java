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
public class DeliverymanOrder extends javax.swing.JInternalFrame {

    private List<DeliveryMen> DmListTxt = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();
    private List<AssignedJob> jobList = new ArrayList<>();
    public Queue<DeliveryMen> DmQueueTxt = new ArrayBlockingQueue<>(50);
    public Queue<DeliveryMen> newQueue = new ArrayBlockingQueue<>(50);
    private String name ="";
    private DeliveryMen temp;
    private int orderID = 0;
    
    public DeliverymanOrder() {
        initComponents();
    }

    public DeliverymanOrder(String name) {
        initComponents();
        initializeList();
        this.name = name;
        getOrder(name);
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
          JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("OrderList.dat"));
          orderList = (ArrayList) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
          ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("AssignedJob.dat"));
          jobList = (ArrayList) (oiStream.readObject());
          oiStream.close();
        } catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Order List not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Cannot read from order file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        // one more try for order details
    }
    
    private void getOrder(String name){
        
        for(int i=0; i < jobList.size();i++){
            if(jobList.get(i).getDmName().equals(name)){
                for(int j = 0; j < orderList.size(); j++){
                    if( jobList.get(i).getOrderID() == orderList.get(j).getOrderId() && orderList.get(j).getStatus().equals("Assigned")){
                        orderID = orderList.get(j).getOrderId();
                        txtAreaOrderDetails.setText("Current Delivery Order Details" + "\n\nOrder ID: " + orderList.get(j).getOrderId() + "\nRemark: " + orderList.get(j).getRemark() + "\nTotal Price: " + orderList.get(j).getTotalPrice() + "\nCustomer Phone No: " + orderList.get(j).getCustomerTel() + "\n" + orderList.get(j).getStatus());
                    }
                    else if(jobList.get(i).getOrderID() == orderList.get(j).getOrderId() && orderList.get(j).getStatus().equals("Done")){
                        txtAreaOrderDetails.setText("Please wait for manager to assign new job");
                    }
                }
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
        btnDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOrderDetails = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(454, 318));
        setMinimumSize(new java.awt.Dimension(454, 318));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Delivery Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        txtAreaOrderDetails.setColumns(20);
        txtAreaOrderDetails.setRows(5);
        txtAreaOrderDetails.setText("Order Details");
        txtAreaOrderDetails.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaOrderDetails);

        jButton1.setText("Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                DmListTxt.get(i).setWorkingStatus("available");
                
                try {
                    ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("DeliveryMen.dat"));
                    ooStream.writeObject(DmListTxt);
                    JOptionPane.showMessageDialog(null, "You have completed your delivery!", "Info", JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                }   
                
                txtAreaOrderDetails.setText("Please wait for manager to assign new job");
                newQueue.add(DmListTxt.get(i));
                
                for(int j=0; j<orderList.size();j++){
                    if( orderID == orderList.get(j).getOrderId()){
                        orderList.get(j).setStatus("Done");

                    try {
                        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("OrderList.dat"));
                        ooStream.writeObject(orderList);
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
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
    }//GEN-LAST:event_btnDoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(int i=0; i<DmListTxt.size();i++){
            if(DmListTxt.get(i).getName().equals(name)){
                JOptionPane.showMessageDialog(null, "Current Status: " + DmListTxt.get(i).getWorkingStatus());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaOrderDetails;
    // End of variables declaration//GEN-END:variables
}
