package UI;

import Interface.ACMListInterface;
import adt.ACMList;
import domain.Affiliate;
import domain.Menu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList; //aaaaaaaaaaaaaaaaa
import java.util.List;//aaaaaaaaaaaaaaaaa
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tan Eu Tim
 */
public class AffiliateLoginForm extends javax.swing.JFrame {

    //private List<Affiliate> AffiliateList = new ArrayList<>(); //aaaaaaaaaaaaaaaaa
    public ACMListInterface<Affiliate> AffiliateList = new ACMList<>();
    public ACMListInterface<Menu> MenuListLoginFrame = new ACMList<>();
    //Temp Value
    static String TUsrname;
    static String TUsrPass;
    static String TRestName;
    static String TRestOwner;
    static String TRestContact;
    static String TRestAddress;
    static String TRestTown;
    static String TRestStatus;
    static String TAccType;
    
    //PassValue
    public static void Pass(){
        Affiliate affiliate = new Affiliate(TUsrname,TUsrPass,TRestName,TRestOwner,TRestContact,TRestAddress,TRestTown,TRestStatus,TAccType);
    }
    
    
    public AffiliateLoginForm() {
        initComponents();
        //initializeList();
    }
    public AffiliateLoginForm(ACMListInterface<Affiliate> affiliateList,ACMListInterface<Menu> MenuListMainFrame) {
        initComponents();
        AffiliateList = affiliateList;
        MenuListLoginFrame = MenuListMainFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblUsrName = new javax.swing.JLabel();
        lblUsrPass = new javax.swing.JLabel();
        jtfUsrName = new javax.swing.JTextField();
        jpfUsrPass = new javax.swing.JPasswordField();
        jbtLogin = new javax.swing.JButton();
        jbtCancel = new javax.swing.JButton();
        jbtRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblUsrName.setText("Username :");

        lblUsrPass.setText("Password :");

        jbtLogin.setText("Login");
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });

        jbtCancel.setText("Cancel");
        jbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelActionPerformed(evt);
            }
        });

        jbtRegister.setText("Register");
        jbtRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegisterActionPerformed(evt);
            }
        });

        jLabel1.setText("Affiliate Login Page");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jbtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblUsrName)
                                    .addComponent(lblUsrPass))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfUsrName, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(jpfUsrPass))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jbtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblUsrName)
                            .addComponent(jtfUsrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsrPass)
                            .addComponent(jpfUsrPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtLogin)
                            .addComponent(jbtCancel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtRegister)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        // Cancel Button
        //MainPage mainpage = new MainPage(AffiliateList);
        new MainPage(AffiliateList,MenuListLoginFrame).setVisible(true);
        dispose();
        
        //jTextArea1.setText("\n"+AffiliateList);  new Temp2(runnerList).setVisible(true);
        
    }//GEN-LAST:event_jbtCancelActionPerformed

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        // Login
        
        String Id = jtfUsrName.getText();
        String Pass = jpfUsrPass.getText();
        boolean condi = true;
        try{
           for(int i = 1;i<=AffiliateList.getNumberOfEntries();i++){
            if(AffiliateList.getEntry(i).getUsrName().equals(Id) ){//&& AffiliateList.getEntry(i).getUsrPass().equals(Pass)
                JOptionPane.showMessageDialog(null, "Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                
                TUsrname = AffiliateList.getEntry(i).getUsrName();
                TUsrPass = AffiliateList.getEntry(i).getUsrPass();
                TRestName = AffiliateList.getEntry(i).getRestName();
                TRestOwner = AffiliateList.getEntry(i).getRestOwner();
                TRestContact = AffiliateList.getEntry(i).getRestContact();
                TRestAddress = AffiliateList.getEntry(i).getRestAddress();
                TRestTown = AffiliateList.getEntry(i).getRestTown();
                TRestStatus = AffiliateList.getEntry(i).getRestStatus();
                TAccType = AffiliateList.getEntry(i).getAccType();
                
                Pass();
                AffiliateMainFrame AffMainFrame = new AffiliateMainFrame(AffiliateList,MenuListLoginFrame);
                AffMainFrame.setVisible(true);
                dispose();
            }
                if(!AffiliateList.getEntry(i).getUsrName().equals(Id) && !AffiliateList.getEntry(i).getUsrPass().equals(Pass)){
                    //JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                    condi = false;
                }
            }
           if(condi == false){
               JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
           }
           }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage(), "Information", JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jbtRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegisterActionPerformed
        // Registration button
        AffiliateRegistrationPage regPage = new AffiliateRegistrationPage(AffiliateList,MenuListLoginFrame);
        regPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtRegisterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("\n"+AffiliateList);
    }//GEN-LAST:event_jButton1ActionPerformed

    /*public String formatList() {
        String outputStr = "";
        for (int i = 0; i < AffiliateList.size(); ++i) {
          outputStr += (i + 1) + ". " + AffiliateList.get(i);
        }
        return outputStr;
    }*/
    
    /*private void initializeList() {
    try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("Affiliate.dat"));
      AffiliateList = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
  }*/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AffiliateLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AffiliateLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AffiliateLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AffiliateLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AffiliateLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblUsrName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JButton jbtRegister;
    private javax.swing.JPasswordField jpfUsrPass;
    private javax.swing.JTextField jtfUsrName;
    private javax.swing.JLabel lblUsrPass;
    // End of variables declaration//GEN-END:variables
}
