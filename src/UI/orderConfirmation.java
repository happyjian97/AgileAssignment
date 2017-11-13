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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Liew
 */
public class orderConfirmation extends javax.swing.JInternalFrame {
    private List<OrderedMenu> menuList = new ArrayList<>();
    private List<OrderedMenu> matchedMenuList = new ArrayList<>();
    private Queue<Order> orderList = new ArrayBlockingQueue<>(50);
    Customer customer;
    Order order = new Order();
    
    public orderConfirmation() {
        initComponents();
        // old constructor
    }
    
    
    public orderConfirmation(Order passedOrder) {
        initComponents();
        retrieveOrderRecord();
        initiateOrder(passedOrder);
        initiateMenuList();
        compareOrderId();
        initiateSelectedMenu();
        getCustomer();
        jtfTotalPrice.setText(String.format("%.2f", order.getTotalPrice()));
    }

    private void initiateMenuList(){
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("OrderedMenu.dat"));
            menuList = (ArrayList) (oiStream.readObject());
            oiStream.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
    }
    
    private void initiateSelectedMenu(){
        int no = 1;
        String previousText;
        for(int i=0; i<matchedMenuList.size(); i++){
            previousText = jtaSelectedMenu.getText();
            jtaSelectedMenu.setText(previousText + no +".  "+  matchedMenuList.get(i).getMenuName() + " " 
            + String.format("%d", matchedMenuList.get(i).getQuantity()) + "(s)" + "\n");
            no++;
        }
    }
    
    private void compareOrderId(){
        for(int i=0; i<menuList.size(); i++){
            if(order.getOrderId() == menuList.get(i).getOrderId())
                matchedMenuList.add(menuList.get(i));
        }
    }
    
    
    private void getCustomer(){
        customer = new Customer("0123456789","Setapak");
    }
    
    private void initiateOrder(Order passedOrder){
        order.setCustomerTel(passedOrder.getCustomerTel());
        order.setOrderedDate(passedOrder.getOrderedDate());
        order.setRemark(passedOrder.getRemark());
        order.setRestaurant(passedOrder.getRestaurant());
        order.setStatus(passedOrder.getStatus());
        order.setTotalPrice(passedOrder.getTotalPrice());
        order.setOrderId(passedOrder.getOrderId());
        order.resizeNum();
    }
    
    private int addDeliveryTime(){
        int deliveryTime=0;
        if(customer.getAddress().equals("Setapak"))
                deliveryTime = 10;
        else if(customer.getAddress().equals("Wangsa Maju"))
                deliveryTime = 15;
        else if(customer.getAddress().equals("Pasar Seni"))
                deliveryTime = 25;
        else if(customer.getAddress().equals("KL Sentra"))
                deliveryTime = 35;
        else if(customer.getAddress().equals("KLCC"))

                deliveryTime = 40;
        
        return deliveryTime;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSelectedOrder = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        jtfTotalPrice = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaSelectedMenu = new javax.swing.JTextArea();
        lblRM = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        lblTitle.setText("Order Confirmation");

        lblSelectedOrder.setText("Selected Menu :");

        lblTotalPrice.setText("Total Price(include delivery fee) :");

        jtfTotalPrice.setEnabled(false);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thumb.png"))); // NOI18N
        btnConfirm.setText("Confirm ");
        btnConfirm.setBorder(null);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jtaSelectedMenu.setColumns(20);
        jtaSelectedMenu.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaSelectedMenu.setRows(5);
        jtaSelectedMenu.setEnabled(false);
        jScrollPane2.setViewportView(jtaSelectedMenu);

        lblRM.setText("RM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblSelectedOrder)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelectedOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPrice)
                    .addComponent(jtfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRM))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        Date date2 = new Date();
        order.setOrderTime(dateFormat.format(date));
        
        Calendar now = Calendar.getInstance();
        now.add(Calendar.MINUTE, addDeliveryTime());
        date2 = now.getTime();
        
        order.setDeliveredTime(dateFormat.format(date2));
        
        orderList.add(order);
        addOrderRecord();
        JOptionPane.showMessageDialog(null, "Your Order will be deliverd at about " + order.getDeliveredTime() + " ");
        this.dispose();
    }//GEN-LAST:event_btnConfirmActionPerformed

    public void addOrderRecord(){
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("Order.dat"));
            ooStream.writeObject(orderList);
            ooStream.close();
            
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void retrieveOrderRecord(){
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("Order.dat"));
            orderList = (ArrayBlockingQueue) (oiStream.readObject());
            oiStream.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()/*"Cannot read from file"*/, "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaSelectedMenu;
    private javax.swing.JTextField jtfTotalPrice;
    private javax.swing.JLabel lblRM;
    private javax.swing.JLabel lblSelectedOrder;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalPrice;
    // End of variables declaration//GEN-END:variables
}
