/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Customer;
import domain.Order;
import domain.OrderedMenu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author Liew
 */
public class ViewOrder extends javax.swing.JInternalFrame {
    
    Customer customer;
    private Queue<Order> orderList = new ArrayBlockingQueue<>(50);
    /**
     * Creates new form ViewOrder
     */
    public ViewOrder() {
        initComponents();
        getCustomer();
        initiateOrderList();
        compareOrder();
    }
    
    private void getCustomer(){
        customer = new Customer("0123456789","Setapak");
    }
    
    private void initiateOrderList(){
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("Order.dat"));
            orderList = (ArrayBlockingQueue) (oiStream.readObject());
            oiStream.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
    }

    private void compareOrder(){
        
        
        for(int i=0; i<orderList.size(); i++){
            String previousText=jtaShowOrder.getText();
            Order getOrder = orderList.remove();
            if(customer.getTelNo().equals(getOrder.getCustomerTel()))
                jtaShowOrder.setText(previousText+"\n"+getOrder.getOrderId() + "    " + getOrder.getOrderedDate() 
                                     + "    " + getOrder.getOrderTime());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaShowOrder = new javax.swing.JTextArea();
        lblOrder = new javax.swing.JLabel();
        lblLegend = new javax.swing.JLabel();

        setClosable(true);

        jtaShowOrder.setColumns(20);
        jtaShowOrder.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaShowOrder.setRows(5);
        jtaShowOrder.setEnabled(false);
        jScrollPane1.setViewportView(jtaShowOrder);

        lblOrder.setText("Your Order :");

        lblLegend.setText("Order ID                Order Date                             Order Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrder)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLegend)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblOrder)
                .addGap(18, 18, 18)
                .addComponent(lblLegend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaShowOrder;
    private javax.swing.JLabel lblLegend;
    private javax.swing.JLabel lblOrder;
    // End of variables declaration//GEN-END:variables
}
