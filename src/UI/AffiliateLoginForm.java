package UI;

import domain.Affiliate;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList; //aaaaaaaaaaaaaaaaa
import java.util.List;//aaaaaaaaaaaaaaaaa
import javax.swing.JOptionPane;

/**
 *
 * @author Tan Eu Tim
 */
public class AffiliateLoginForm extends javax.swing.JFrame {

    private List<Affiliate> AffiliateList = new ArrayList<>(); //aaaaaaaaaaaaaaaaa
  
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
        initializeList();
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
                                    .addComponent(jpfUsrPass)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jbtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                    .addComponent(jbtCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtRegister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        // Cancel Button
        MainPage mainpage = new MainPage();
        mainpage.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jbtCancelActionPerformed

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        // Login
        String Id = jtfUsrName.getText();
        String Pass = jpfUsrPass.getText();
        boolean condi = true;
        
           for(int i = 0;i<AffiliateList.size();++i){
            if(AffiliateList.get(i).getUsrName().equals(Id) && AffiliateList.get(i).getUsrPass().equals(Pass)){
                JOptionPane.showMessageDialog(null, "Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                
                TUsrname = AffiliateList.get(i).getUsrName();
                TUsrPass = AffiliateList.get(i).getUsrPass();
                TRestName = AffiliateList.get(i).getRestName();
                TRestOwner = AffiliateList.get(i).getRestOwner();
                TRestContact = AffiliateList.get(i).getRestContact();
                TRestAddress = AffiliateList.get(i).getRestAddress();
                TRestTown = AffiliateList.get(i).getRestTown();
                TRestStatus = AffiliateList.get(i).getRestStatus();
                TAccType = AffiliateList.get(i).getAccType();
                
                Pass();
                AffiliateMainFrame AffMainFrame = new AffiliateMainFrame();
                AffMainFrame.setVisible(true);
                dispose();
            }
                if(!AffiliateList.get(i).getUsrName().equals(Id) && !AffiliateList.get(i).getUsrPass().equals(Pass)){
                    //JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                    condi = false;
                }
            }
           if(condi == false){
               JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jbtRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegisterActionPerformed
        // Registration button
        AffiliateRegistrationPage regPage = new AffiliateRegistrationPage();
        regPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtRegisterActionPerformed

    /*public String formatList() {
        String outputStr = "";
        for (int i = 0; i < AffiliateList.size(); ++i) {
          outputStr += (i + 1) + ". " + AffiliateList.get(i);
        }
        return outputStr;
    }*/
    
    private void initializeList() {
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
  }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JButton jbtRegister;
    private javax.swing.JPasswordField jpfUsrPass;
    private javax.swing.JTextField jtfUsrName;
    private javax.swing.JLabel lblUsrPass;
    // End of variables declaration//GEN-END:variables
}
