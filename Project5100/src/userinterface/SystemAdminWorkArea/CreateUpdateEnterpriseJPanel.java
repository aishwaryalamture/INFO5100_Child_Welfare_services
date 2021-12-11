/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Role.Role;
import Business.Users.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class CreateUpdateEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel enterprisePanel;
    private Entity entity;
    private User user;
    private static final int CREATE_OPERATION = 0;
    private static final int UPDATE_OPERATION = 1;
    private int operationId;
    private Enterprise enterprise;

    /**
     * Creates new form CreateUpdateEnterpriseJPanel
     */
    public CreateUpdateEnterpriseJPanel(JPanel enterprisePanel, User user, Entity entity, int operationId, Enterprise enterprise) {
        initComponents();
        this.enterprisePanel = enterprisePanel;
        this.entity = entity;
        this.user = user;
        this.operationId = operationId;
        this.enterprise = enterprise;
        loadData();
    }

    private void loadData() {
        if (operationId == UPDATE_OPERATION) {
            btnCreate.setText("Update");
            lblTitle.setText("Update Enterprise");
            txtEnterpriseName.setText(enterprise.getEnterpriseName());
            txtRegistrationNo.setText(enterprise.getEnterpriseRegistrationNo());
            txtEnterpriseDesc.setText(enterprise.getEnterpriseDesciption());
            txtRegistrationNo.setEnabled(false);
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

        lblTitle = new javax.swing.JLabel();
        lblEnterpriseName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        lblEnterpriseeDesc = new javax.swing.JLabel();
        txtEnterpriseDesc = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblEnterpriseNo = new javax.swing.JLabel();
        txtRegistrationNo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(172, 208, 192));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Enterprises");

        lblEnterpriseName.setText("Enterprise Name:");

        txtEnterpriseName.setSelectionColor(new java.awt.Color(117, 177, 169));

        lblEnterpriseeDesc.setText("Enterprise Description");

        btnCreate.setBackground(new java.awt.Color(217, 180, 74));
        btnCreate.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setContentAreaFilled(false);
        btnCreate.setOpaque(true);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(217, 180, 74));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" <<Back");
        btnBack.setContentAreaFilled(false);
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblEnterpriseNo.setText("Enterprise Registration No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnterpriseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(txtRegistrationNo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnterpriseeDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnterpriseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(568, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(626, 626, 626)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(758, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEnterpriseName, lblEnterpriseNo, lblEnterpriseeDesc});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEnterpriseDesc, txtEnterpriseName, txtRegistrationNo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseeDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrationNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(630, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEnterpriseName, lblEnterpriseeDesc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, lblTitle});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        //Validate for emtpy fields
        if (txtEnterpriseName.getText().isEmpty() || txtEnterpriseDesc.getText().isEmpty() || txtRegistrationNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields ", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        switch (operationId) {
            case CREATE_OPERATION:
                //validate for registration number
                for (Enterprise er : entity.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseRegistrationNo().equals(txtEnterpriseName.getText())) {
                        JOptionPane.showMessageDialog(null, "Registration Number Already Exists ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                entity.getEnterpriseDirectory().createEnterprise(txtEnterpriseName.getText(), txtEnterpriseDesc.getText(), txtRegistrationNo.getText());
                JOptionPane.showMessageDialog(null, "New Enterprise Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnBack.doClick();
                break;
            case UPDATE_OPERATION:
                for (Enterprise er : entity.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseRegistrationNo().equals(enterprise.getEnterpriseRegistrationNo())) {
                        enterprise.setEnterpriseName(txtEnterpriseName.getText());
                        enterprise.setEnterpriseDesciption(txtEnterpriseDesc.getText());
                        enterprise.setEnterpriseRegistrationNo(txtRegistrationNo.getText());
                    }
                }
                JOptionPane.showMessageDialog(null, "Enterprise Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnBack.doClick();

                break;
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        enterprisePanel.remove(this);
        Component[] componentArray = enterprisePanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminEnterprisesWorkArea workArea = (SysAdminEnterprisesWorkArea) component;
        workArea.populateTable();
        CardLayout layout = (CardLayout) enterprisePanel.getLayout();
        layout.previous(enterprisePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterpriseNo;
    private javax.swing.JLabel lblEnterpriseeDesc;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEnterpriseDesc;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtRegistrationNo;
    // End of variables declaration//GEN-END:variables
}
