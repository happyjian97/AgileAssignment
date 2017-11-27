package UI;

import Interface.ACMListInterface;
import adt.ACMList;
import domain.Affiliate;
import domain.Menu;

/**
 *
 * @Tan Eu Tim
 */
public class MainPage extends javax.swing.JFrame {

    //Global Data
    //List Element
    public ACMListInterface<Affiliate> AffiliateListMainP = new ACMList<>();
    public ACMListInterface<Menu> MenuListMainPage = new ACMList<>();
    
    public MainPage() {
        initComponents();
    }
    public MainPage(ACMListInterface<Affiliate> AffiliateListLogin,ACMListInterface<Menu> MenuListLoginPage) {
        initComponents();
        AffiliateListMainP = AffiliateListLogin;
        MenuListMainPage = MenuListLoginPage;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbtTemp = new javax.swing.JButton();
        jbtRegCust = new javax.swing.JButton();
        Staff = new javax.swing.JButton();
        Staff1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JbtTemp.setText("Affiliates");
        JbtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtTempActionPerformed(evt);
            }
        });

        jbtRegCust.setText("Customer");
        jbtRegCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegCustActionPerformed(evt);
            }
        });

        Staff.setText("Staff");
        Staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffActionPerformed(evt);
            }
        });

        Staff1.setText("Admin Staff");
        Staff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Staff1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbtTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtRegCust, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(Staff1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Staff1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Staff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtRegCust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtTempActionPerformed
        // TODO add your handling code here:
        AffiliateLoginForm AffiliateLoginForm2 = new AffiliateLoginForm(AffiliateListMainP,MenuListMainPage);
        AffiliateLoginForm2.setVisible(true);
        dispose();
    }//GEN-LAST:event_JbtTempActionPerformed

    private void StaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffActionPerformed
        // Staff Button
    }//GEN-LAST:event_StaffActionPerformed

    private void Staff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Staff1ActionPerformed
        // Admin Staff Button
        AdminStaffLoginFrame AdminLog = new AdminStaffLoginFrame();
        AdminLog.setVisible(true);
        dispose();
    }//GEN-LAST:event_Staff1ActionPerformed

    private void jbtRegCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegCustActionPerformed
        // Customer Login Button
        /*CustomerLoginFrame CustLog = new CustomerLoginFrame();
        CustLog.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_jbtRegCustActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtTemp;
    private javax.swing.JButton Staff;
    private javax.swing.JButton Staff1;
    private javax.swing.JButton jbtRegCust;
    // End of variables declaration//GEN-END:variables
}
