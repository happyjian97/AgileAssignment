package UI;

import domain.Affiliate;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.List;
import javax.swing.JOptionPane;

import Interface.ACMListInterface;
import adt.ACMList;
import domain.Menu;

public class AffiliateRegistrationPage extends javax.swing.JFrame {

    //private List<Affiliate> affiliateList = new ArrayList<>();
    public ACMListInterface<Affiliate> affiliateList = new ACMList<>();
    public ACMListInterface<Menu> MenuListRegFrame = new ACMList<>();
    //private ZAffiliateInterface Input = new Affiliate();
    //private List<Affiliate> AffiliateList = new ArrayList<>();
    String Contact1,Contact2;
    String UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus = "Available",AccType="Affiliate";
    //AffiliateInterface result;
    public AffiliateRegistrationPage() {
        initComponents();
    }
    //Overload Constructor
    public AffiliateRegistrationPage(ACMListInterface<Affiliate> affiliateListLogin,ACMListInterface<Menu> MenuListLoginFrame) {
        initComponents();
        affiliateList = affiliateListLogin;
        MenuListRegFrame = MenuListLoginFrame;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfUsrName = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfOwner = new javax.swing.JTextField();
        jtfStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jcbTown = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtfContact2 = new javax.swing.JTextField();
        jtfContact1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfPass1 = new javax.swing.JPasswordField();
        jtfPass2 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbtRegDef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Affiliate Registration Form");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Restaurant Name");

        jLabel5.setText("Restaurant Owner");

        jLabel6.setText("Contact");

        jLabel7.setText("Restaurant Address");

        jLabel8.setText("Restaurant Status");

        jtfStatus.setEditable(false);
        jtfStatus.setText("Available");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jcbTown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setapak" }));

        jLabel9.setText("-");

        jLabel10.setText("Town");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        jLabel12.setText("Re-enter Password");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jbtRegDef.setText("RegDefault");
        jbtRegDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegDefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtRegDef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel1))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfPass2)
                                    .addComponent(jtfUsrName, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jtfPass1)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(65, 65, 65)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtfAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jtfContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(66, 66, 66)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtfContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jtfStatus)
                                                    .addComponent(jtfOwner)
                                                    .addComponent(jtfName)
                                                    .addComponent(jcbTown, 0, 220, Short.MAX_VALUE))))))
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfUsrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtfPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jtfContact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jcbTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jbtRegDef))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Confirm Button
        
        
        
        //Validation 
        if(jtfUsrName.getText().equals("") || jtfPass1.getText().equals("") || jtfName.getText().equals("") || jtfOwner.getText().equals("") || jtfAddress.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Must fill up all the field!" ,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(!jtfPass1.getText().equals(jtfPass2.getText())){
            JOptionPane.showMessageDialog(null,"Password did not match!" ,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(jtfContact1.getText().length() !=3 || jtfContact2.getText().length()!=7){
            JOptionPane.showMessageDialog(null,"Invalid Phone No." ,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Store Data
            //fraction1.setNumerator(Integer.parseInt(jtfNumerator1.getText()));
                 
            Contact1 = jtfContact1.getText();
            Contact2 = jtfContact2.getText();
            
            //Temp Try
            /*Input.setUsrName(jtfUsrName.getText());
            Input.setUsrPass(jtfPass1.getText());
            Input.setRestName(jtfName.getText());
            Input.setRestOwner(jtfOwner.getText());
            Input.setRestContact(Contact1+"-"+Contact2);
            Input.setRestAddress(jtfAddress.getText());
            Input.setRestTown(jcbTown.getSelectedItem().toString());
            Input.setRestStatus(RestStatus);
            Input.setAccType(AccType);
            ZAffiliateInterface result = Input.Store(Input);*/
            //Temp Try----------------------------------------------
            
            UsrName = jtfUsrName.getText();
            UsrPass = jtfPass1.getText();
            RestName = jtfName.getText();
            RestOwner = jtfOwner.getText();
            RestContact  = Contact1+"-"+Contact2;
            RestAddress = jtfAddress.getText();
            RestTown = jcbTown.getSelectedItem().toString();
            
            /*if(affiliateList.get(0).equals("tan")){
                JOptionPane.showMessageDialog(null, "The Username already exits.", "RECORD ALREADY EXISTS", JOptionPane.ERROR_MESSAGE);
            }
            else{*/
                Affiliate affiliate = new Affiliate(UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
                affiliateList.add(affiliate);
                JOptionPane.showMessageDialog(null, "Added Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                jTextArea1.setText("List : \n" + affiliateList);
                Reset();
        
            //}
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Cancel Button
        
        new AffiliateLoginForm(affiliateList,MenuListRegFrame).setVisible(true);
        dispose();
        
        /*
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("Affiliate.dat"));
            ooStream.writeObject(affiliateList);
            //ooStream.close();  //xxxxxxxxxxxxxxx
            AffiliateLoginForm AffLogIn = new AffiliateLoginForm();
            AffLogIn.setVisible(true);
            dispose();
        } 
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        catch (IOException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage().toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }   
        */
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Reset Button
        //Temp Data
        if(affiliateList.isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty", "Error", JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, formatList());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtRegDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegDefActionPerformed
        // RegDefault Button
        for(int i= 0;i<5;i++){
            if(i==0){
                UsrName = "Jim001";UsrPass = "123";RestName = "Jim Cafe";RestOwner = "Mr.Ong";RestContact  = "010-6800430";RestAddress = "Kuala Lumpur";RestTown = "Setapak";
                Affiliate affiliate = new Affiliate(UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
                affiliateList.add(affiliate);
            }else if(i ==1){
                UsrName = "Tom002";UsrPass = "123";RestName = "Tom Cafe";RestOwner = "Mr.Tommy";RestContact  = "014-5487963";RestAddress = "Kuala Lumpur";RestTown = "Setapak";
                Affiliate affiliate = new Affiliate(UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
                affiliateList.add(affiliate);
            }else if(i ==2){
                UsrName = "Heng003";UsrPass = "123";RestName = "Heng Cafe";RestOwner = "Mr.Chia Heng";RestContact  = "017-5454963";RestAddress = "Kuala Lumpur";RestTown = "Setapak";
                Affiliate affiliate = new Affiliate(UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
                affiliateList.add(affiliate);
            }
            else if(i ==3){
                UsrName = "Meng004";UsrPass = "123";RestName = "Meng Seafood";RestOwner = "Mr.Meng Kit";RestContact  = "017-1234963";RestAddress = "Kuala Lumpur";RestTown = "Setapak";
                Affiliate affiliate = new Affiliate(UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
                affiliateList.add(affiliate);
            }else if(i ==4){
                UsrName = "Jimmy005";UsrPass = "123";RestName = "QQ Restaurant";RestOwner = "Mr.Jimmy Teow";RestContact  = "012-1564963";RestAddress = "Kuala Lumpur";RestTown = "Setapak";
                Affiliate affiliate = new Affiliate(UsrName,UsrPass,RestName,RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
                affiliateList.add(affiliate);
            }
            
        }           
            JOptionPane.showMessageDialog(null, "Added Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);   
            jTextArea1.setText("List : \n" + affiliateList);
    }//GEN-LAST:event_jbtRegDefActionPerformed
    
    void Reset(){
        jtfUsrName.setText("");
        jtfPass1.setText("");
        jtfPass2.setText("");
        jtfAddress.setText("");
        jtfName.setText("");
        jtfOwner.setText("");
        jtfContact1.setText("");
        jtfContact2.setText("");
        //jtfContact.setText("");
        //jtfAddress.setText("");
    }
    public String formatList() {
    String outputStr = "";
    for (int i = 1; i < affiliateList.getNumberOfEntries(); ++i) {
      outputStr += (i + 1) + ". " + affiliateList.getEntry(i);
    }
    return outputStr;
  }
    
    public static void main(String args[]) {    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AffiliateRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AffiliateRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AffiliateRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AffiliateRegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AffiliateRegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtRegDef;
    private javax.swing.JComboBox<String> jcbTown;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfContact1;
    private javax.swing.JTextField jtfContact2;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfOwner;
    private javax.swing.JPasswordField jtfPass1;
    private javax.swing.JPasswordField jtfPass2;
    private javax.swing.JTextField jtfStatus;
    private javax.swing.JTextField jtfUsrName;
    // End of variables declaration//GEN-END:variables
}
