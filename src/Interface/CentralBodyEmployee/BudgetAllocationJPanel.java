/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CentralBodyEmployee;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BankOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CentralBodyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 *
 */
public class BudgetAllocationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BudgetAllocationJPanel
     */
    public BudgetAllocationJPanel() {
        initComponents();
    }

    private JPanel userProcessContainer;
    private UserAccount account;
    private CentralBodyWorkRequest centralbodyRequest;
    private Enterprise enterprise;
    private EcoSystem business;
    double fundReleased;
    
    public BudgetAllocationJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, CentralBodyWorkRequest request, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.centralbodyRequest = request;
        this.enterprise = enterprise;
        this.business = business;
        disableButton();
        populateFields(request);
    }

    
    public void populateFields(CentralBodyWorkRequest request){
        
        fundsRequiredjTextField.setText(String.valueOf(request.getBudgetRequired()));
        
    }
    
    public void disableButton(){
        
        fundsRequiredjTextField.setEditable(false);
        
        
    }
    
    public String fundStatus(){
        for (Enumeration<AbstractButton> buttons = fundsbuttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
return null;
}
    public void generateBankWorkRequest(double fundReleased) {
        
//        BankBodyWorkRequest bankWorkRequest = new BankBodyWorkRequest();
//
//        bankWorkRequest.setCentralSender(account);
//        bankWorkRequest.setBudgetRequested(fundReleased);
//        bankWorkRequest.setBudgetStatus("Forwarded to Bank");
//        bankWorkRequest.setWaterStatus(centralbodyRequest.getWaterStatus());

          centralbodyRequest.setCentralSender(account);
          centralbodyRequest.setBudgetRequested(fundReleased);
          centralbodyRequest.setBudgetStatus("Forwarded to Bank");
        
        Organization org = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof BankOrganization) {                        
                        org = organization;
                        break;
                    }
                }
                
            }
            if (org != null) {                    
                    org.getWorkQueue().getWorkRequestList().add(centralbodyRequest);
                    account.getWorkQueue().getWorkRequestList().add(centralbodyRequest);
                }
        }
    }
    public boolean nullCheck() {
        if (fundsReleasedjTextField.getText().isEmpty()) {
            return true;
        } else {
            return false;
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

        fundsbuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bankForwardjButton = new javax.swing.JButton();
        fundsRequiredjTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fundsReleasedjTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Budget Dashboard");

        jLabel6.setText("Funds required");

        bankForwardjButton.setBackground(new java.awt.Color(0, 102, 153));
        bankForwardjButton.setForeground(new java.awt.Color(255, 255, 255));
        bankForwardjButton.setText("Forward to Bank ");
        bankForwardjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankForwardjButtonActionPerformed(evt);
            }
        });

        backjButton.setBackground(new java.awt.Color(0, 102, 153));
        backjButton.setForeground(new java.awt.Color(255, 255, 255));
        backjButton.setText("< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Funds to be Released :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(bankForwardjButton))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fundsRequiredjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fundsReleasedjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backjButton))))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fundsRequiredjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fundsReleasedjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankForwardjButton)
                    .addComponent(backjButton))
                .addContainerGap(417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bankForwardjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankForwardjButtonActionPerformed
        
        if (nullCheck()) {
            JOptionPane.showMessageDialog(null,"Funds Released field is empty", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (Integer.parseInt(fundsReleasedjTextField.getText()) > centralbodyRequest.getBudgetRequired())
        {
            JOptionPane.showMessageDialog(null,"Funds Released cannot be more than the Requested Budget", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        } else
        {
            try {
                fundReleased = Integer.parseInt(fundsReleasedjTextField.getText());
                double pricePerwater = centralbodyRequest.getBudgetRequired()/centralbodyRequest.getWaterRequired();
                double newWaterAllowance = fundReleased/pricePerwater;
                centralbodyRequest.setWaterAllowed(newWaterAllowance);
                generateBankWorkRequest(fundReleased);
                
                JOptionPane.showMessageDialog(null,"Request has been forwaded to the bank");
            }  catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null,"The Funds Released field should contain only Numbers ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
    }//GEN-LAST:event_bankForwardjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component [] containerArray = userProcessContainer.getComponents();
        Component component = containerArray[containerArray.length - 1];
        CentralEmployeeWorkAreaJPanel centralEmployee = (CentralEmployeeWorkAreaJPanel) component;
        centralEmployee.populateBankRequestTable();
        centralEmployee.populateStateRequestTable();
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        
    }//GEN-LAST:event_backjButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton bankForwardjButton;
    private javax.swing.JTextField fundsReleasedjTextField;
    private javax.swing.JTextField fundsRequiredjTextField;
    private javax.swing.ButtonGroup fundsbuttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
