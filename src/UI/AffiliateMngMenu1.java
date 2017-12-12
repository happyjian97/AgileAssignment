package UI;

import Interface.ACMListInterface;
//import Interface.ACMStackInterface;
import adt.ACMList;
//import adt.ACMStack;
import domain.Affiliate;
import domain.Menu;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Tan Eu Tim
 */
public class AffiliateMngMenu1 extends javax.swing.JInternalFrame {

    public ACMListInterface<Menu> MenuListMngMenu = new ACMList<>();
    public ACMListInterface<Affiliate> AffiliateListMngFrame = new ACMList<>();
    
    //public ACMStackInterface<Menu> menuStackMngFrame = new ACMStack<>();
    
    String MenuName3,MenuDesc3,PromotionType3,MenuStatus3,RestaurantName3; //Temp
    String tableSelect,SelectedCache = null;
    double MenuPrice3;
    int MenuRank3,number2;
    
    public AffiliateMngMenu1(ACMListInterface<Affiliate> AffiliateListMainFrame,ACMListInterface<Menu> MenuListMainFrame) {
        initComponents();
        
        //Field Deco
        jtfRestaurantName.setEditable(false);
        jtfRestaurantName.setForeground(Color.gray);
        
        jtfMenuID.setEditable(false);
        jtfMenuID.setForeground(Color.gray);
        
        //Table Layout
        //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        //TableColumn col = jTable1.getColumnModel().getColumn(0);
        //TableColumn col2 = jTable1.getColumnModel().getColumn(3);
        //col.setPreferredWidth(45);
        //col2.setPreferredWidth(60);
        
        MenuListMngMenu = MenuListMainFrame;
        AffiliateListMngFrame = AffiliateListMainFrame;
        //menuStackMngFrame = menuStackMainFrame;
        ViewNormalData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfMenuPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfPromoType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfMenuRank = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfRestaurantName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfMenuID = new javax.swing.JTextField();
        jtfMenuName = new javax.swing.JTextField();
        jtfMenuDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtAddMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JbtRemove = new javax.swing.JButton();
        jcbMenuStatus = new javax.swing.JComboBox<>();
        jbtViewAvailable = new javax.swing.JButton();
        jbtViewPending = new javax.swing.JButton();
        jbtViewNT = new javax.swing.JButton();
        jbtAll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add MEnu"));

        jtfMenuPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMenuPriceActionPerformed(evt);
            }
        });

        jLabel2.setText("MenuName");

        jLabel3.setText("Menu Description");

        jLabel4.setText("MenuPrice");

        jLabel5.setText("Promotion Type");

        jLabel6.setText("Menu Status");

        jLabel7.setText("Menu Rank");

        jLabel8.setText("Restaurant Name");

        jLabel1.setText("Menu ID");

        jbtAddMenu.setText("Update");
        jbtAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddMenuActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JbtRemove.setText("Remove");

        jcbMenuStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Pending", "Not Available" }));

        jbtViewAvailable.setText("View Available");
        jbtViewAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtViewAvailableActionPerformed(evt);
            }
        });

        jbtViewPending.setText("View Pending");
        jbtViewPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtViewPendingActionPerformed(evt);
            }
        });

        jbtViewNT.setText("View Not Available");
        jbtViewNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtViewNTActionPerformed(evt);
            }
        });

        jbtAll.setText("All");
        jbtAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAllActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfPromoType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jtfMenuID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuRank)
                            .addComponent(jcbMenuStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfRestaurantName)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtViewAvailable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtViewPending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtViewNT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jbtAll))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtAddMenu)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(JbtRemove)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtfMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtViewAvailable)
                        .addComponent(jbtViewPending)
                        .addComponent(jbtViewNT)
                        .addComponent(jbtAll)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfMenuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfMenuDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfMenuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfPromoType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcbMenuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMenuRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(18, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAddMenu)
                    .addComponent(jButton1)
                    .addComponent(JbtRemove))
                .addGap(42, 42, 42))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfMenuPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMenuPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMenuPriceActionPerformed

    private void jbtAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddMenuActionPerformed
        // Update Button
        //MenuListMngMenu.replace(1, MenuListMngMenu);
        int TempNumber = Integer.parseInt(tableSelect);
        int MenuRank = Integer.parseInt(jtfMenuRank.getText());
        double MenuPrice = Double.parseDouble(jtfMenuPrice.getText());
        
        for(int i = 1;i<=MenuListMngMenu.getNumberOfEntries();i++){
            if(MenuListMngMenu.getEntry(i).getNumber() == TempNumber){
                MenuListMngMenu.getEntry(i).setMenuName(jtfMenuName.getText());
                MenuListMngMenu.getEntry(i).setMenuDesc(jtfMenuDesc.getText());
                MenuListMngMenu.getEntry(i).setMenuPrice(MenuPrice);
                MenuListMngMenu.getEntry(i).setPromotionType(jtfPromoType.getText());
                MenuListMngMenu.getEntry(i).setMenuStatus(jcbMenuStatus.getSelectedItem().toString());
                MenuListMngMenu.getEntry(i).setMenuRank(MenuRank);
            }
        }
        JOptionPane.showMessageDialog(null, "Food ID : "+TempNumber+" Has been Updated Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        if(SelectedCache.equals(null) || SelectedCache.equals("All")){
            ViewNormalData();
        }else if(SelectedCache.equals("Available")){
            ViewNormalAvailableData();
        }else if(SelectedCache.equals("Pending")){
            ViewNormalAvailableData();
        }
        else if(SelectedCache.equals("Not Available")){
            ViewNormalAvailableData();
        }else{
            ViewNormalData();
        }
        
    }//GEN-LAST:event_jbtAddMenuActionPerformed

    private void jbtViewAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtViewAvailableActionPerformed
        // View Available Button
        SelectedCache = "Available";
        ViewNormalAvailableData();
    }//GEN-LAST:event_jbtViewAvailableActionPerformed

    private void jbtAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAllActionPerformed
        // View All Button
        SelectedCache = "All";
        ViewNormalData();
    }//GEN-LAST:event_jbtAllActionPerformed

    private void jbtViewPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtViewPendingActionPerformed
        // View Pending Button
        SelectedCache = "Pending";
        ViewNormalPendingData();
    }//GEN-LAST:event_jbtViewPendingActionPerformed

    private void jbtViewNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtViewNTActionPerformed
        // View Not Available Button
        SelectedCache = "Not Available";
        ViewNormalNTData();
    }//GEN-LAST:event_jbtViewNTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Confirm button
        new AffiliateMainFrame(AffiliateListMngFrame,MenuListMngMenu);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Own Method
    //View All
    void ViewNormalData(){
        /*DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0);
        for(int i = 1;i<=MenuListMngMenu.getNumberOfEntries();i++){
            if(MenuListMngMenu.getEntry(i).getRestaurantName().equals(AffiliateLoginForm.TRestName)){
            //number2 = menuList.getEntry(i).getNumber();
            MenuName3 = MenuListMngMenu.getEntry(i).getMenuName();
            MenuDesc3 = MenuListMngMenu.getEntry(i).getMenuDesc();
            PromotionType3 = MenuListMngMenu.getEntry(i).getPromotionType();
            MenuStatus3 = MenuListMngMenu.getEntry(i).getMenuStatus();
            RestaurantName3 = MenuListMngMenu.getEntry(i).getRestaurantName();
            MenuPrice3 = MenuListMngMenu.getEntry(i).getMenuPrice();
            MenuRank3 = MenuListMngMenu.getEntry(i).getMenuRank();
            tModel.addRow(new Object[]{MenuListMngMenu.getEntry(i).getNumber(),MenuName3,MenuDesc3,MenuPrice3,PromotionType3,MenuStatus3,MenuRank3,RestaurantName3});
            }     
        }*/
    }
    //View Available
    void ViewNormalAvailableData(){
        /*DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0);
        for(int i = 1;i<=MenuListMngMenu.getNumberOfEntries();i++){
            if((MenuListMngMenu.getEntry(i).getRestaurantName().equals(AffiliateLoginForm.TRestName) && (MenuListMngMenu.getEntry(i).getMenuStatus().equals("Available")))){
            //number2 = menuList.getEntry(i).getNumber();
            MenuName3 = MenuListMngMenu.getEntry(i).getMenuName();
            MenuDesc3 = MenuListMngMenu.getEntry(i).getMenuDesc();
            PromotionType3 = MenuListMngMenu.getEntry(i).getPromotionType();
            MenuStatus3 = MenuListMngMenu.getEntry(i).getMenuStatus();
            RestaurantName3 = MenuListMngMenu.getEntry(i).getRestaurantName();
            MenuPrice3 = MenuListMngMenu.getEntry(i).getMenuPrice();
            MenuRank3 = MenuListMngMenu.getEntry(i).getMenuRank();
            tModel.addRow(new Object[]{MenuListMngMenu.getEntry(i).getNumber(),MenuName3,MenuDesc3,MenuPrice3,PromotionType3,MenuStatus3,MenuRank3,RestaurantName3});
            }     
        }*/
    }
    //View Pending
    void ViewNormalPendingData(){
        /*DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0);
        for(int i = 1;i<=MenuListMngMenu.getNumberOfEntries();i++){
            if((MenuListMngMenu.getEntry(i).getRestaurantName().equals(AffiliateLoginForm.TRestName) && (MenuListMngMenu.getEntry(i).getMenuStatus().equals("Pending")))){
            //number2 = menuList.getEntry(i).getNumber();
            MenuName3 = MenuListMngMenu.getEntry(i).getMenuName();
            MenuDesc3 = MenuListMngMenu.getEntry(i).getMenuDesc();
            PromotionType3 = MenuListMngMenu.getEntry(i).getPromotionType();
            MenuStatus3 = MenuListMngMenu.getEntry(i).getMenuStatus();
            RestaurantName3 = MenuListMngMenu.getEntry(i).getRestaurantName();
            MenuPrice3 = MenuListMngMenu.getEntry(i).getMenuPrice();
            MenuRank3 = MenuListMngMenu.getEntry(i).getMenuRank();
            tModel.addRow(new Object[]{MenuListMngMenu.getEntry(i).getNumber(),MenuName3,MenuDesc3,MenuPrice3,PromotionType3,MenuStatus3,MenuRank3,RestaurantName3});
            }     
        }*/
    }
    //View NotAvailable
    void ViewNormalNTData(){
        /*DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0);
        for(int i = 1;i<=MenuListMngMenu.getNumberOfEntries();i++){
            if((MenuListMngMenu.getEntry(i).getRestaurantName().equals(AffiliateLoginForm.TRestName) && (MenuListMngMenu.getEntry(i).getMenuStatus().equals("Not Available")))){
            //number2 = menuList.getEntry(i).getNumber();
            MenuName3 = MenuListMngMenu.getEntry(i).getMenuName();
            MenuDesc3 = MenuListMngMenu.getEntry(i).getMenuDesc();
            PromotionType3 = MenuListMngMenu.getEntry(i).getPromotionType();
            MenuStatus3 = MenuListMngMenu.getEntry(i).getMenuStatus();
            RestaurantName3 = MenuListMngMenu.getEntry(i).getRestaurantName();
            MenuPrice3 = MenuListMngMenu.getEntry(i).getMenuPrice();
            MenuRank3 = MenuListMngMenu.getEntry(i).getMenuRank();
            tModel.addRow(new Object[]{MenuListMngMenu.getEntry(i).getNumber(),MenuName3,MenuDesc3,MenuPrice3,PromotionType3,MenuStatus3,MenuRank3,RestaurantName3});
            }     
        }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtAddMenu;
    private javax.swing.JButton jbtAll;
    private javax.swing.JButton jbtViewAvailable;
    private javax.swing.JButton jbtViewNT;
    private javax.swing.JButton jbtViewPending;
    private javax.swing.JComboBox<String> jcbMenuStatus;
    private javax.swing.JTextField jtfMenuDesc;
    private javax.swing.JTextField jtfMenuID;
    private javax.swing.JTextField jtfMenuName;
    private javax.swing.JTextField jtfMenuPrice;
    private javax.swing.JTextField jtfMenuRank;
    private javax.swing.JTextField jtfPromoType;
    private javax.swing.JTextField jtfRestaurantName;
    // End of variables declaration//GEN-END:variables
}
