package UI;

import Interface.ACMListInterface;
import adt.ACMList;
import domain.Menu;
import javax.swing.JOptionPane;

//import da.CustomModelMenu;
import domain.Affiliate;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Tan Eu Tim
 */
public class AffiliateAddMenu extends javax.swing.JInternalFrame {

    public ACMListInterface<Menu> menuList = new ACMList<>();
    public ACMListInterface<Affiliate> AffiliateListMngMenu = new ACMList<>();
    
    String MenuName,MenuDesc,PromotionType,MenuStatus,RestaurantName;
    String MenuName2,MenuDesc2,PromotionType2,MenuStatus2,RestaurantName2;
    String MenuName3,MenuDesc3,PromotionType3,MenuStatus3,RestaurantName3; //Temp
    String tableSelect;
    double MenuPrice,MenuPrice2,MenuPrice3;
    int MenuRank,MenuRank2,MenuRank3,number,number2;
    
    public AffiliateAddMenu(ACMListInterface<Affiliate> AffiliateListMainFrame,ACMListInterface<Menu> MenuListMainFrame) {
        initComponents();
        jtfMenuID.setText("" + Menu.getNextNumber());
        jtfMenuID.setEditable(false);
        jtfMenuID.setForeground(Color.gray);
        //Adjust Table Size
        
        //Data for current User
        jtfRestaurantName.setText(AffiliateLoginForm.TRestName);
        jtfRestaurantName.setEditable(false);
        jtfRestaurantName.setForeground(Color.gray);
        
        AffiliateListMngMenu = AffiliateListMainFrame;
        menuList = MenuListMainFrame;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customModel1 = new da.CustomModel();
        jPanel1 = new javax.swing.JPanel();
        jtfMenuPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfPromoType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfMenuStatus = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add MEnu"));

        jtfMenuPrice.setText("12");
        jtfMenuPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMenuPriceActionPerformed(evt);
            }
        });

        jLabel2.setText("MenuName");

        jtfPromoType.setText("a");

        jLabel3.setText("Menu Description");

        jtfMenuStatus.setText("Available");

        jLabel4.setText("MenuPrice");

        jtfMenuRank.setText("1");

        jLabel5.setText("Promotion Type");

        jtfRestaurantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRestaurantNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Menu Status");

        jLabel7.setText("Menu Rank");

        jLabel8.setText("Restaurant Name");

        jtfMenuName.setText("Fish");

        jtfMenuDesc.setText("Fish And Chip");

        jLabel1.setText("Menu ID");

        jbtAddMenu.setText("Add");
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
        JbtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtRemoveActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jtfMenuStatus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPromoType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jtfMenuID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMenuRank))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(157, 157, 157)
                        .addComponent(jbtAddMenu)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(JbtRemove)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                            .addComponent(jtfMenuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMenuRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtAddMenu)
                            .addComponent(jButton1)
                            .addComponent(JbtRemove))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(72, Short.MAX_VALUE))))
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

    private void jtfMenuPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMenuPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMenuPriceActionPerformed

    private void jtfRestaurantNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRestaurantNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRestaurantNameActionPerformed

    private void jbtAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddMenuActionPerformed
        // Add Menu Button
        try{
            jtfMenuID.setText("" + Menu.getNextNumber());
            int rank = Integer.parseInt(jtfMenuRank.getText());
            double price = Double.parseDouble(jtfMenuPrice.getText());

            int input = JOptionPane.showOptionDialog(null, "Confirm To Add Food Name : "+ jtfMenuName.getText() +" ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(input == JOptionPane.OK_OPTION){
                MenuName = jtfMenuName.getText();
                MenuDesc = jtfMenuDesc.getText();
                PromotionType = jtfPromoType.getText();
                MenuStatus = jtfMenuStatus.getText();
                RestaurantName = jtfRestaurantName.getText();
                MenuPrice = price;
                MenuRank = rank;
                Menu menu = new Menu(MenuName,MenuDesc,MenuPrice,MenuRank,MenuStatus,PromotionType,RestaurantName);
                menuList.add(menu);
                //jTextArea1.setText("Menu List: \n" + menuList);
                //View Content
                ViewNormalData();
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage(), "Information", JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jbtAddMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Confirm Button
        //ViewNormalData();
        new AffiliateMainFrame(AffiliateListMngMenu,menuList);
        //AffiliateMainFrame AffMainFrame = new AffiliateMainFrame(AffiliateListMngMenu,menuList);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JbtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtRemoveActionPerformed
        //Remove Button
        int TempNumber = 0;
        TempNumber = Integer.parseInt(tableSelect);
        
        /*if(TempNumber == 0){
            
        }*/
        
        int input = JOptionPane.showOptionDialog(null, "Are you sure to Remove Food ID :"+ TempNumber +" ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        if(input == JOptionPane.OK_OPTION){
            for(int i = 1;i<=menuList.getNumberOfEntries();i++){
                if(menuList.getEntry(i).getNumber() == TempNumber){
                    menuList.remove(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Food ID : "+TempNumber+" Has been Removed Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            TempNumber = 0;
            ViewNormalData();
        }
          
        
        
        
    }//GEN-LAST:event_JbtRemoveActionPerformed

    //Own Method
    void ViewNormalData(){
        jTextArea1.setText(""+menuList);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtRemove;
    private da.CustomModel customModel1;
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
    private javax.swing.JTextField jtfMenuDesc;
    private javax.swing.JTextField jtfMenuID;
    private javax.swing.JTextField jtfMenuName;
    private javax.swing.JTextField jtfMenuPrice;
    private javax.swing.JTextField jtfMenuRank;
    private javax.swing.JTextField jtfMenuStatus;
    private javax.swing.JTextField jtfPromoType;
    private javax.swing.JTextField jtfRestaurantName;
    // End of variables declaration//GEN-END:variables
}
