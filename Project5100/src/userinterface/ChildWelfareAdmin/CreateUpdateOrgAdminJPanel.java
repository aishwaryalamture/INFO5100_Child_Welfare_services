/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ChildWelfareAdmin;

import userinterface.SystemAdminWorkArea.*;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Organizations.Organization;
import Business.Role.ChildWelfareAdmin;
import Business.Role.HealthcareHeadRole;
import Business.Role.PoliceDeptAdmin;
import Business.Role.Role;
import Business.Role.SafetyHeadRole;
import Business.Role.SystemAdminRole;
import Business.Users.User;
import Business.Validator.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.UtilityClass;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class CreateUpdateOrgAdminJPanel extends javax.swing.JPanel {

    private JPanel childWelfareOrgAdminPanel;
    private Entity entity;
    private User user;
    private static final int CREATE_OPERATION = 0;
    private static final int UPDATE_OPERATION = 1;
    private int operationId;
    private Enterprise enterprise;
    private Role role;
    private Organization organization;

    /**
     * Creates new form CreateUpdateAdminRolesJPanel
     */
    public CreateUpdateOrgAdminJPanel(JPanel enterprisePanel, User user, Entity entity, int operationId, Enterprise enterprise,Organization organization) {
        initComponents();
        this.childWelfareOrgAdminPanel = enterprisePanel;
        this.entity = entity;
        this.user = user;
        this.operationId = operationId;
        this.enterprise = enterprise;
        this.organization = organization;
        loadData();
    }

    private void loadData() {
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboEnterprise.addItem(org.getOrganizationName());
            if (operationId == UPDATE_OPERATION && org.getOrganizationName().equals(organization.getOrganizationName())) {
                comboEnterprise.setSelectedItem(org.getOrganizationName());
            }
        }
        if (operationId == UPDATE_OPERATION) {
            btnCreate.setText("Update");
            lblTitle.setText("Update Admin");
            txtFirstName.setText(user.getFirstName());
            txtLastName.setText(user.getLastName());
            txtLocation.setText(user.getLocation());
            txtMobileNo.setText(user.getMobileNumber());
            txtUsername.setText(user.getUsername());
            txtPassword.setText(user.getPassword());
            txtEmail.setText(user.getEmailId());
            comboEnterprise.setEnabled(false);
            
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
        btnBack = new javax.swing.JButton();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblFirstName1 = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(172, 208, 192));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Admin");

        btnBack.setBackground(new java.awt.Color(217, 180, 74));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" <<Back");
        btnBack.setContentAreaFilled(false);
        btnBack.setOpaque(true);
        btnBack.setPreferredSize(new java.awt.Dimension(210, 34));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFirstName.setText("First Name:");

        txtFirstName.setSelectionColor(new java.awt.Color(117, 177, 169));

        lblLastName.setText("Last Name:");

        txtLastName.setSelectionColor(new java.awt.Color(117, 177, 169));

        txtLocation.setSelectionColor(new java.awt.Color(117, 177, 169));

        lblLocation.setText("Location:");

        lblMobileNo.setText("Mobile Number:");

        txtMobileNo.setSelectionColor(new java.awt.Color(117, 177, 169));

        lblUsername.setText("Username:");

        txtUsername.setSelectionColor(new java.awt.Color(117, 177, 169));

        lblPassword.setText("Password:");

        txtPassword.setSelectionColor(new java.awt.Color(117, 177, 169));

        lblEmail.setText("Email Id:");

        txtEmail.setSelectionColor(new java.awt.Color(117, 177, 169));

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

        lblFirstName1.setText("Select Organization:");

        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName1))
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(590, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmail, lblFirstName, lblFirstName1, lblLastName, lblLocation, lblMobileNo, lblPassword, lblUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        childWelfareOrgAdminPanel.remove(this);
        Component[] componentArray = childWelfareOrgAdminPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ChildWelfareOrgAdminRolesWorkArea workArea = (ChildWelfareOrgAdminRolesWorkArea) component;
        workArea.populateTable();
        CardLayout layout = (CardLayout) childWelfareOrgAdminPanel.getLayout();
        layout.previous(childWelfareOrgAdminPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        //Validate for emtpy fields
        if (txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtLocation.getText().isEmpty() || txtEmail.getText().isEmpty() || txtPassword.getText().isEmpty()
                || txtMobileNo.getText().isEmpty() || txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields ", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.getInstance().validateEmailAddr(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.getInstance().validateTelNum(txtMobileNo.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Tel No ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            return;
        }

        switch (operationId) {
            case CREATE_OPERATION:
                //validate for multiple entries with same username
                for (User ur : entity.getUserDirectory().getUserList()) {
                    if (ur.getUsername().equals(txtUsername.getText())) {
                        JOptionPane.showMessageDialog(null, "User Name Already Exists ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                Organization selectedOrg = enterprise.getOrganizationDirectory().getOrganizationList().get(comboEnterprise.getSelectedIndex());
                //admin already exists for this enterprise 
                if (selectedOrg.getOrganizationAdmin()!= null) {
                    JOptionPane.showMessageDialog(null, "Admin Already Exists For This Organization", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Role role = new ChildWelfareAdmin();
                if (selectedOrg.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.ChildMaltreatment.getValue())) {
                    role = new SafetyHeadRole();

                } else if (selectedOrg.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.ChildHealth.getValue())) {
                    role = new HealthcareHeadRole();
                }

                User user = entity.getUserDirectory().createUserAccount(txtFirstName.getText(), txtLastName.getText(), txtLocation.getText(),
                        txtMobileNo.getText(), txtUsername.getText(), txtPassword.getText(), txtEmail.getText(), role);
                selectedOrg.setOrganizationAdmin(user);

                JOptionPane.showMessageDialog(null, "New Admin Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnBack.doClick();
                break;
            case UPDATE_OPERATION:
                //validate if new username is updated to other entries with same username
                for (User ur : entity.getUserDirectory().getUserList()) {
                    if (ur.getUsername().equals(txtUsername.getText()) && !txtUsername.getText().equals(this.user.getUsername())) {
                        JOptionPane.showMessageDialog(null, "User Name Already Exists ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                for (User ur : entity.getUserDirectory().getUserList()) {
                    if (ur.getUserId() == this.user.getUserId()) {
                        ur.setEmailId(txtEmail.getText());
                        ur.setFirstName(txtFirstName.getText());
                        ur.setLastName(txtLastName.getText());
                        ur.setLocation(txtLocation.getText());
                        ur.setUsername(txtUsername.getText());
                        ur.setPassword(txtPassword.getText());
                        ur.setMobileNumber(txtMobileNo.getText());
                        
                    }
                }

                JOptionPane.showMessageDialog(null, "Organization Admin Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnBack.doClick();

                break;
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comboEnterprise;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
