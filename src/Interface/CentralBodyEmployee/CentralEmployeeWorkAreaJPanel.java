/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CentralBodyEmployee;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CentralBodyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BankBodyWorkRequest;
import Business.WorkQueue.CentralBodyWorkRequest;
import Business.WorkQueue.StateBodyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CentralEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private CentralBodyOrganization centralBodyOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public CentralEmployeeWorkAreaJPanel() {
        initComponents();
    }

    public CentralEmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.centralBodyOrganization=(CentralBodyOrganization)organization;
        this.enterprise=enterprise;
        this.business = business;
        
        checkBudgetjButton.setEnabled(false);
        closeRequestJButton.setEnabled(false);
        populateStateRequestTable();
        populateBankRequestTable();
    }

    public void populateStateRequestTable(){
        DefaultTableModel model = (DefaultTableModel)stateRequestJTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request : centralBodyOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getCentralSender();
            row[2] = request.getCentralReceiver()== null ? null : request.getCentralReceiver().getEmployee().getName();
            row[3] = request.getBudgetStatus();
            row[4]=  request.getBudgetRequired();
            model.addRow(row);
        }
    }
    
    public void populateBankRequestTable() {
        DefaultTableModel model = (DefaultTableModel) bankRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = ((CentralBodyWorkRequest)request).getBudgetRequested();
            row[2] = request.getCentralSender();
            row[3] = request.getBankReceiver();
            row[4] = request.getBudgetStatus();
            model.addRow(row);
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        stateRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        assignToMeButton = new javax.swing.JButton();
        closeRequestJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bankRequestJTable = new javax.swing.JTable();
        checkBudgetjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        stateRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Water Status", "Sender", "Receiver", "Status", "Requested Fund"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stateRequestJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Central Body Water Management Department");

        assignToMeButton.setBackground(new java.awt.Color(0, 102, 153));
        assignToMeButton.setForeground(new java.awt.Color(255, 255, 255));
        assignToMeButton.setText("Assign to me");
        assignToMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeButtonActionPerformed(evt);
            }
        });

        closeRequestJButton.setBackground(new java.awt.Color(0, 102, 153));
        closeRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        closeRequestJButton.setText("Close Request");
        closeRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeRequestJButtonActionPerformed(evt);
            }
        });

        bankRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Water Status", "Funds Requested", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(bankRequestJTable);

        checkBudgetjButton.setBackground(new java.awt.Color(0, 102, 153));
        checkBudgetjButton.setForeground(new java.awt.Color(255, 255, 255));
        checkBudgetjButton.setText("Check Budget");
        checkBudgetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBudgetjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Bank Request Status :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(433, 433, 433))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(assignToMeButton)
                                    .addGap(726, 726, 726))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(checkBudgetjButton)
                                    .addGap(200, 200, 200)
                                    .addComponent(closeRequestJButton)))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignToMeButton)
                    .addComponent(checkBudgetjButton)
                    .addComponent(closeRequestJButton))
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeRequestJButtonActionPerformed
        // TODO add your handling code here:
       int selectedRow = stateRequestJTable.getSelectedRow();
       if (selectedRow < 0) {
           JOptionPane.showMessageDialog(null, "Please select a row from the above table", "Warning", JOptionPane.WARNING_MESSAGE);
           return;
       }
       
       CentralBodyWorkRequest stateRequest = (CentralBodyWorkRequest) stateRequestJTable.getValueAt(selectedRow, 0);
       try {
           if (((CentralBodyWorkRequest) stateRequest).getCentralReceiver().getUsername() == null || !((CentralBodyWorkRequest) stateRequest).getCentralReceiver().getUsername().equals(account.getUsername())) {
               JOptionPane.showMessageDialog(null, "The request is not assigned to your name!!\nPlease assign it first", "Warning", JOptionPane.WARNING_MESSAGE);
               return;
           } else if (((CentralBodyWorkRequest) stateRequest).getCentralReceiver().getUsername().equals(account.getUsername())) {
               stateRequest.setStatus("Closed");
               populateStateRequestTable();
               JOptionPane.showMessageDialog(null, "Request has been closed", "Information", JOptionPane.INFORMATION_MESSAGE);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "The request is not assigned to your name!!\nPlease assign it first", "Warning", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_closeRequestJButtonActionPerformed

    private void checkBudgetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBudgetjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = stateRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the above table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        CentralBodyWorkRequest request = (CentralBodyWorkRequest) stateRequestJTable.getValueAt(selectedRow, 0);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CheckBudgetJPanel", new BudgetAllocationJPanel(userProcessContainer, account, enterprise, request, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkBudgetjButtonActionPerformed

    private void assignToMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = stateRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the above table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        CentralBodyWorkRequest request = (CentralBodyWorkRequest) stateRequestJTable.getValueAt(selectedRow, 0);
        if (request.getCentralMessage() == null) {
            request.setCentralReceiver(account);
            request.setBudgetStatus("Received by Central");
            populateStateRequestTable();
            checkBudgetjButton.setEnabled(true);
            closeRequestJButton.setEnabled(true);
        } else if (request.getCentralMessage().equalsIgnoreCase("closed")) {
            JOptionPane.showMessageDialog(null, "This Request is already closed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_assignToMeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JTable bankRequestJTable;
    private javax.swing.JButton checkBudgetjButton;
    private javax.swing.JButton closeRequestJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable stateRequestJTable;
    // End of variables declaration//GEN-END:variables
}
