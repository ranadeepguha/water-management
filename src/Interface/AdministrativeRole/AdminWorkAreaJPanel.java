/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 *
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem business;
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.business = business;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageUserJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Work Area -Adminstrative Role");

        manageUserJButton.setBackground(new java.awt.Color(0, 102, 153));
        manageUserJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageUserJButton.setText("Manage User");
        manageUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserJButtonActionPerformed(evt);
            }
        });

        manageEmployeeJButton.setBackground(new java.awt.Color(0, 102, 153));
        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setBackground(new java.awt.Color(0, 102, 153));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 51, 102));
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageUserJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel)
                    .addComponent(valueLabel))
                .addGap(38, 38, 38)
                .addComponent(manageOrganizationJButton)
                .addGap(28, 28, 28)
                .addComponent(manageEmployeeJButton)
                .addGap(30, 30, 30)
                .addComponent(manageUserJButton)
                .addContainerGap(360, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel",manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise, business);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
