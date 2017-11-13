
package UI;

import domain.ScheduleOrder;
import domain.Customer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class DailyScheduleOrder extends javax.swing.JInternalFrame {

    private List<ScheduleOrder> SummaryList = new ArrayList<>();
    private List<ScheduleOrder> OrderList = new ArrayList<>();
    Customer customer;  
    double TPrice = 0;
    double tempPrice = 0;
    double TotalPrice = 0 ;
    
       String Summary;
       
       
//       String CustomerTel,MenuItem,Session,Destination,status = "Pending";
//        int menuID = 1,Quantity;
//        double price;
    
    public DailyScheduleOrder() {
        
        initComponents();
        getCustomer();
        jtfPrice.setText(String.format("%.2f", 0.00));
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CbMenu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        OrderDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Rb1 = new javax.swing.JRadioButton();
        Rb2 = new javax.swing.JRadioButton();
        Rb3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SpQuantity = new javax.swing.JSpinner();
        btnOrder = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaSummary = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        CbDestination = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(723, 530));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(723, 530));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setText("Daily Schedule Order");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Menu");

        CbMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fried Rice", "Nasi Lemak", "Burger", "Pizza" }));
        CbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbMenuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Session");

        Rb1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Rb1);
        Rb1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Rb1.setSelected(true);
        Rb1.setText("Breakfast");

        Rb2.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Rb2);
        Rb2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Rb2.setText("Lunch");

        Rb3.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(Rb3);
        Rb3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Rb3.setText("Dinner");
        Rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Summary");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");

        SpQuantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SpQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.setMaximumSize(new java.awt.Dimension(57, 24));
        btnOrder.setMinimumSize(new java.awt.Dimension(57, 23));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setText("(8-11:00 am)");

        jLabel8.setText("(1-4:00 pm)");

        jLabel9.setText("(6-9:00 pm)");

        jtaSummary.setColumns(20);
        jtaSummary.setRows(5);
        jScrollPane2.setViewportView(jtaSummary);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Destination");

        CbDestination.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wangsa Maju", "KLCC", "Setapak", "KL Sentral", "Pasar Seni", " " }));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Total Price ( RM )");

        jtfPrice.setEditable(false);
        jtfPrice.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SpQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Rb1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Rb2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel9))
                                            .addComponent(Rb3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(161, 161, 161)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Rb1)
                            .addComponent(Rb2)
                            .addComponent(Rb3))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SpQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rb3ActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed

     
//        String CustomerTel,MenuItem,Session,Destination,status = "Pending";
//        int menuID = 1,Quantity;
//        double price;
       
//        CustomerTel = customer.getTelNo();          
//        MenuItem = CbMenu.getSelectedItem().toString();
//        Session = buttonGroup1.getSelection().getActionCommand();
//        Quantity = (int)SpQuantity.getValue();
//        Destination = CbDestination.getSelectedItem().toString();     
//        price = Double.parseDouble(jtfPrice.getText()) + addDeliveryFee();
      
//        ScheduleOrder Order = new ScheduleOrder(CustomerTel,menuID,MenuItem,Session,Quantity,Destination,price,sqlDate,status); 
//        OrderList.add(Order);
                
        saveOrderedRecord();
        JOptionPane.showMessageDialog(null," The Sub Total = RM" + jtfPrice.getText() +"\n The Delivery Fee = RM" +addDeliveryFee()+ "\n Total Amount = RM"+ CalculateTotalPrice(),"Total Amount",JOptionPane.INFORMATION_MESSAGE); 
        
    }//GEN-LAST:event_btnOrderActionPerformed

   
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        ScheduleOrder NewOrder = new ScheduleOrder();
       
        Rb1.setActionCommand("Breakfast");
        Rb2.setActionCommand("Lunch");
        Rb3.setActionCommand("Dinner");
        
        java.util.Date utilDate = OrderDate.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        
        NewOrder.setCustomerTel(customer.getTelNo());
        NewOrder.setMenuID(1);
        NewOrder.setMenuItem(CbMenu.getSelectedItem().toString());
        NewOrder.setSession(buttonGroup1.getSelection().getActionCommand());
        NewOrder.setQuantity((int)SpQuantity.getValue());
        NewOrder.setDestination(CbDestination.getSelectedItem().toString());
        NewOrder.setOrderDate(sqlDate);
        NewOrder.setStatus("Pending");
        OrderList.add(NewOrder);
        
        jtaSummary.setText("");
        int n = 1;
               
       for(int i=0; i<OrderList.size();i++){
           if(OrderList.get(i).getMenuItem().equals("Fried Rice")){
               TPrice = 5.00;
           }
           else if(OrderList.get(i).getMenuItem().equals("Nasi Lemak")){
               TPrice = 5.50;
           }
           else if(OrderList.get(i).getMenuItem().equals("Burger")){
               TPrice = 10.20;
           }
           else if(OrderList.get(i).getMenuItem().equals("Pizza")){
               TPrice = 13.30;
           }
           Summary = jtaSummary.getText();          
           jtaSummary.setText(Summary + n +". " + "  " + OrderList.get(i).getMenuItem() + "\t" + OrderList.get(i).getOrderDate() + "\t" + OrderList.get(i).getSession() + "      " + String.format("%d",OrderList.get(i).getQuantity()) + " set      "+  OrderList.get(i).getDestination()+ "   RM" + TPrice +"\n\n");
           n++;
          
           tempPrice = TPrice * OrderList.get(i).getQuantity();
           
       }            
           NewOrder.setTotalPrice(TPrice);

           TotalPrice += tempPrice;
           jtfPrice.setText(String.format("%.2f", TotalPrice));
           
           
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void CbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbMenuActionPerformed
      
    }//GEN-LAST:event_CbMenuActionPerformed

    private double CalculateTotalPrice(){
       double price = 0 ;
       
       price = Double.parseDouble(jtfPrice.getText())+ addDeliveryFee();
       return price;
    }           
     private void getCustomer(){
        customer = new Customer("0123456789","Pasar Seni");
    }
    
    private double addDeliveryFee(){
        
        double deliveryFee = 0;
        
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
    
    private void saveOrderedRecord() {
        try {
                ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("Order.dat"));
                ooStream.writeObject(OrderList);
                ooStream.close();
     
        } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbDestination;
    private javax.swing.JComboBox<String> CbMenu;
    private com.toedter.calendar.JDateChooser OrderDate;
    private javax.swing.JRadioButton Rb1;
    private javax.swing.JRadioButton Rb2;
    private javax.swing.JRadioButton Rb3;
    private javax.swing.JSpinner SpQuantity;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaSummary;
    private javax.swing.JTextField jtfPrice;
    // End of variables declaration//GEN-END:variables
}
