/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Customer;
import domain.Menu;
import domain.Order;
import domain.OrderedMenu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.SpinnerNumberModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
/**
 *
 * @author Liew
 */
public class addOrder extends javax.swing.JInternalFrame {
    
    private List<OrderedMenu> getMenuListFromTxt = new ArrayList<>();
    private List<OrderedMenu> menuList = new ArrayList<>();
    private List<Menu> getMenuList = new ArrayList<>();
    Order order = new Order();
    Customer customer;

    
    
    
    public addOrder() {
        initComponents();
    }
    
    public addOrder(String passRestaurant){
        initComponents();
        Restaurant.setVisible(false);
        Restaurant.setText(passRestaurant);
        initializeMenuList();
        initiateMenuList();
        getCustomer();
        jtfTotalPrice.setText(String.format("%.2f", 0.00));
        // this is the overloaded new constructor
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        ddlMenu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jsQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        lblSelectedMenu = new javax.swing.JLabel();
        lblRemark = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaRemark = new javax.swing.JTextArea();
        btnOrder = new javax.swing.JButton();
        lblTotalPrice = new javax.swing.JLabel();
        jtfTotalPrice = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaSelectedMenu = new javax.swing.JTextArea();
        Restaurant = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        lblTitle.setText("Customer Order");

        lblMenu.setText("Menu :");

        jLabel2.setText("Quantity :");

        jsQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblSelectedMenu.setText("Selected Menu :");

        lblRemark.setText("Remark :");

        jtaRemark.setColumns(20);
        jtaRemark.setLineWrap(true);
        jtaRemark.setRows(5);
        jScrollPane2.setViewportView(jtaRemark);

        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thumb.png"))); // NOI18N
        btnOrder.setText("Order !");
        btnOrder.setBorder(null);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        lblTotalPrice.setText("Total Price(RM) :");

        jtfTotalPrice.setEnabled(false);

        jtaSelectedMenu.setColumns(20);
        jtaSelectedMenu.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaSelectedMenu.setRows(5);
        jtaSelectedMenu.setEnabled(false);
        jScrollPane3.setViewportView(jtaSelectedMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ddlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRemark)
                            .addComponent(lblSelectedMenu)
                            .addComponent(lblTitle))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfTotalPrice))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Restaurant)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(Restaurant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenu)
                    .addComponent(ddlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelectedMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblRemark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        updateMenuList();
        
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("OrderedMenu.dat"));
            ooStream.writeObject(getMenuListFromTxt);
            ooStream.close();
            
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        order.setCustomerTel(customer.getTelNo());
        order.setRemark(jtaRemark.getText());
        order.setRestaurant(Restaurant.getText());
        order.setStatus("Pending");
        order.setTotalPrice(Double.parseDouble(jtfTotalPrice.getText()) + addDeliveryFee());
        order.setOrderedDate(dateFormat.format(date));
        
        
        orderConfirmation newOrderConfirmation = new orderConfirmation(order);
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(newOrderConfirmation);
        newOrderConfirmation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        OrderedMenu newMenu = new OrderedMenu();
        newMenu.setOrderId(order.getOrderId());
        
        int retrievedMenuId;
        for(int i=0; i<getMenuList.size(); i++){
            if(getMenuList.get(i).getMenuName().equals(ddlMenu.getSelectedItem().toString())
                    && getMenuList.get(i).getRestaurantName().equals(Restaurant.getText())){
                retrievedMenuId = getMenuList.get(i).getMenuId();
                newMenu.setMenuId(retrievedMenuId);
                newMenu.setMenuName(getMenuList.get(i).getMenuName());
            }
        }
        newMenu.setQuantity((int)jsQuantity.getValue());
        menuList.add(newMenu);
        
        jtaSelectedMenu.setText("");
        
        int no = 1;
        String previousText;
        String getMenuName="";
        for(int i=0; i<menuList.size(); i++){
            previousText = jtaSelectedMenu.getText();
            
            for(int j=0; j<getMenuList.size(); j++){
                if(getMenuList.get(j).getMenuId()==menuList.get(i).getMenuId())
                    getMenuName = getMenuList.get(j).getMenuName();
            }
            
            jtaSelectedMenu.setText(previousText + no +".  "+ getMenuName + " " 
            + String.format("%d", menuList.get(i).getQuantity()) + "(s)" + "\n");
            no++;
        }
        
        double tempPrice = Double.parseDouble(jtfTotalPrice.getText());
        double totalPrice = tempPrice + calculateTotalPrice();
        jtfTotalPrice.setText(String.format("%.2f", totalPrice));
        jsQuantity.setValue(((SpinnerNumberModel) jsQuantity.getModel()).getMinimum());
    }//GEN-LAST:event_btnAddActionPerformed

    
    
    private double calculateTotalPrice(){
        double TotalPrice = 0.00;
        
        for(int i=0; i<menuList.size(); i++){
            for(int j=0; j<getMenuList.size(); j++){
                if(menuList.get(i).getMenuId() == getMenuList.get(j).getMenuId())
                    TotalPrice = getMenuList.get(j).getPrice() * menuList.get(i).getQuantity();
            }
        }
        return TotalPrice;
    }
    
    private void initializeMenuList(){
        Menu menu = new Menu("KFC","Fried Chicken",10.00);
        Menu menu2 = new Menu("McD","potato",5.00);
        Menu menu3 = new Menu("KFC","Coca-cola",3.00);
        Menu menu4 = new Menu("Domino","Pizza",10.00);
        getMenuList.add(menu);
        getMenuList.add(menu2);
        getMenuList.add(menu3);
        getMenuList.add(menu4);
        
        
        String previousPageRestaurantName = Restaurant.getText();
        for(int i=0; i<getMenuList.size(); i++){
            if(previousPageRestaurantName.equals(getMenuList.get(i).getRestaurantName().toString()))
            ddlMenu.addItem(getMenuList.get(i).getMenuName().toString());
        }
    }
    
    private void initiateMenuList(){
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("OrderedMenu.dat"));
            getMenuListFromTxt = (ArrayList) (oiStream.readObject());
            oiStream.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
    }
    
    private void updateMenuList(){
        for(int i=0; i<menuList.size(); i++){
            getMenuListFromTxt.add(menuList.get(i));
        }
    }
    
    private void getCustomer(){
        customer = new Customer("0123456789","Setapak");
    }
    
    private double addDeliveryFee(){
        double deliveryFee=0;
        if(customer.getAddress().equals("Setapak"))
                deliveryFee += 1.00;
        else if(customer.getAddress().equals("Wangsa Maju"))
                deliveryFee += 1.50;
        else if(customer.getAddress().equals("Pasar Seni"))
                deliveryFee += 4.00;
        else if(customer.getAddress().equals("KL Sentra"))
                deliveryFee += 5.00;
        else if(customer.getAddress().equals("KLCC"))
                deliveryFee += 6.50;
        
        return deliveryFee;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Restaurant;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<String> ddlMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JTextArea jtaRemark;
    private javax.swing.JTextArea jtaSelectedMenu;
    private javax.swing.JTextField jtfTotalPrice;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblRemark;
    private javax.swing.JLabel lblSelectedMenu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalPrice;
    // End of variables declaration//GEN-END:variables
}
