/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InternationalOrganizationCollaboration;

import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.InternationalOrganizationCollaboration.InternationalOrganizationCollaborationAttributes;
import Business.Organizations.Organization;
import Business.Users.User;
import Business.Validator.Validator;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class IntlOrgCollabRequestForm extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Entity entity;
    private Enterprise enterprise;
    private User user;
    private Organization organization;
    private InternationalOrganizationCollaborationAttributes attributes;

    /**
     * Creates new form IntlOrgCollabRequestForm
     *
     * @param userProcessContainer
     * @param entity
     * @param organization
     * @param enterprise
     * @param user
     */
    public IntlOrgCollabRequestForm(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.entity = entity;
        this.organization = organization;
        this.enterprise = enterprise;
        this.user = user;
        this.attributes = new InternationalOrganizationCollaborationAttributes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSubmitRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtOrgIntlID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOrgEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOrgCity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtOrgCountry = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOrgType = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRemaks = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPreferredCollabCountry = new javax.swing.JTextField();

        btnSubmitRequest.setText("Submit Request");
        btnSubmitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequestActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization International ID");

        jLabel2.setText("Organization Name");

        jLabel3.setText("Organization Email");

        jLabel4.setText("Organization City");

        txtOrgCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgCityActionPerformed(evt);
            }
        });

        jLabel10.setText("Organization Country");

        jLabel11.setText("Organization Type");

        jLabel14.setText("Remarks");

        jLabel15.setText("Preferred Collaboration Country");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOrgEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOrgIntlID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtOrgType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                .addComponent(txtOrgCountry, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtOrgCity, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(73, 73, 73)
                                .addComponent(txtRemaks))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(73, 73, 73)
                                .addComponent(txtPreferredCollabCountry))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnSubmitRequest)))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOrgIntlID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOrgEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrgCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrgCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrgType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreferredCollabCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemaks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnSubmitRequest)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequestActionPerformed

        //validations for emtpy fields
        if (txtOrgName.getText().isEmpty() || txtOrgCity.getText().isEmpty()
                || txtOrgCountry.getText().isEmpty() || txtOrgEmail.getText().isEmpty()
                || txtOrgIntlID.getText().isEmpty() || txtOrgType.getText().isEmpty() || txtPreferredCollabCountry.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name, City, Country, Email, Internation ID, Type and Preferred Collaboration Country cannot be empty ",
                    "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //validate input
        boolean isValid = Validator.getInstance().validateEmailAddr(txtOrgEmail.getText());
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter email address in format - a@b.c", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //save form
        saveCollabForm();
        saveWorkRequest();

        //add work request
        organization.getWorkQueue().addWorkRequest(attributes);
        entity.getWorkQueue().addWorkRequest(attributes);
        JOptionPane.showMessageDialog(null, "Your Request Has Been Submitted", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSubmitRequestActionPerformed

    private void txtOrgCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitRequest;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtOrgCity;
    private javax.swing.JTextField txtOrgCountry;
    private javax.swing.JTextField txtOrgEmail;
    private javax.swing.JTextField txtOrgIntlID;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextField txtOrgType;
    private javax.swing.JTextField txtPreferredCollabCountry;
    private javax.swing.JTextField txtRemaks;
    // End of variables declaration//GEN-END:variables

    private void saveCollabForm() {
        attributes.setOrganizationName(txtOrgName.getText());
        attributes.setOrganizationCity(txtOrgCity.getText());
        attributes.setOrganizationInternationalId(txtOrgIntlID.getText());
        attributes.setOrganizationCountry(txtOrgCountry.getText());
        attributes.setOrganizationEmail(txtOrgEmail.getText());
        attributes.setRemarks(txtRemaks.getText());
        attributes.setOrganizationType(txtOrgType.getText());
        attributes.setPreferredCollaborationCountry(txtPreferredCollabCountry.getText());
    }

    private void saveWorkRequest() {
        attributes.setSender(user);
        attributes.setReceiver(organization.getOrganizationAdmin());
        attributes.setRequestDate(LocalDateTime.now());
        attributes.setOrganizationId(organization.getOrganizationId());
        attributes.setEnterpriseId(enterprise.getEnterpriseId());
        attributes.setStatus(Status.StatusType.NEW.getValue());
    }
}