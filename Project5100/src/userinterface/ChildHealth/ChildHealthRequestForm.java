/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ChildHealth;

import Business.ChildHealth.ChildHealthAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Users.User;
import Business.Validator.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemUser.SystemUserWorkAreaJPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class ChildHealthRequestForm extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Entity entity;
    private Enterprise enterprise;
    private User user;
    private Organization organization;
    private ChildHealthAttributes childHealthAttributes;

    /**
     * Creates new form ChildHealthRequestForm
     *
     * @param userProcessContainer
     * @param entity
     * @param organization
     * @param enterprise
     * @param user
     */
    public ChildHealthRequestForm(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.entity = entity;
        this.organization = organization;
        this.enterprise = enterprise;
        this.user = user;
        this.childHealthAttributes = new ChildHealthAttributes();
        Date date = new Date();
        jDateChooser1.setMaxSelectableDate(date);
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
        jLabel1 = new javax.swing.JLabel();
        txtChildLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtChildFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtChildAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTypeOfDisease = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiseasePeriod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFullNameParent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMobileNumberParent = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtChildInsuranceNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPreferredHealthCareLocation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtChildPhysicianName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtChildPhysicianLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioButtonYes = new javax.swing.JRadioButton();
        radioButtonNo = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        btnSubmitRequest1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBoy = new javax.swing.JRadioButton();
        btnGirl = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Child Location");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 217, -1, -1));
        add(txtChildLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 214, 132, -1));

        jLabel2.setText("Child Full Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 180, -1, -1));
        add(txtChildFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 177, 132, -1));

        jLabel3.setText("Child Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 254, -1, -1));
        add(txtChildAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 251, 132, -1));

        jLabel4.setText("Child Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 288, -1, -1));

        jLabel10.setText("Remarks");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 329, -1, 21));
        add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 330, 132, -1));

        jLabel11.setText("Type Of Disease");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 368, -1, 21));
        add(txtTypeOfDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 369, 132, -1));

        jLabel12.setText("Disease Period (in months)");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 407, -1, 21));
        add(txtDiseasePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 408, 132, -1));

        jLabel6.setText("Full Name of Parent");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 449, -1, -1));
        add(txtFullNameParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 446, 132, -1));

        jLabel9.setText("Mobile Number of Parent");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 483, -1, 21));
        add(txtMobileNumberParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 484, 132, -1));

        jLabel13.setText("Child Insurance Number");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 522, -1, 21));
        add(txtChildInsuranceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 523, 132, -1));

        jLabel14.setText("Preferred HealthCare Location");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 561, -1, 21));
        add(txtPreferredHealthCareLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 562, 132, -1));

        jLabel15.setText("Child Physician Name");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 600, -1, 21));
        add(txtChildPhysicianName, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 601, 132, -1));

        jLabel16.setText("Child Physician Location");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 639, -1, 21));
        add(txtChildPhysicianLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 640, 132, -1));

        jLabel5.setText("Are you parent of the child?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 180, 24));

        radioButtonYes.setBackground(new java.awt.Color(172, 208, 192));
        buttonGroup1.add(radioButtonYes);
        radioButtonYes.setText("Yes");
        radioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonYesActionPerformed(evt);
            }
        });
        add(radioButtonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 145, -1, -1));

        radioButtonNo.setBackground(new java.awt.Color(172, 208, 192));
        buttonGroup1.add(radioButtonNo);
        radioButtonNo.setText("No");
        radioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNoActionPerformed(evt);
            }
        });
        add(radioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 145, -1, -1));

        jLabel17.setText("Last Checkup Date");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 678, -1, 21));

        btnSubmitRequest1.setBackground(new java.awt.Color(217, 180, 74));
        btnSubmitRequest1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnSubmitRequest1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitRequest1.setText("Submit Request");
        btnSubmitRequest1.setContentAreaFilled(false);
        btnSubmitRequest1.setOpaque(true);
        btnSubmitRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequest1ActionPerformed(evt);
            }
        });
        add(btnSubmitRequest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 717, 136, 49));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Child HealthCare Service Request Form");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 64, -1, -1));

        btnBack.setBackground(new java.awt.Color(217, 180, 74));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.setContentAreaFilled(false);
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 50));

        btnBoy.setBackground(new java.awt.Color(172, 208, 192));
        btnBoy.setText("Boy");
        add(btnBoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 288, -1, -1));

        btnGirl.setBackground(new java.awt.Color(172, 208, 192));
        btnGirl.setText("Girl");
        add(btnGirl, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 288, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 679, 134, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequest1ActionPerformed

        //validate input
        if ((!btnBoy.isEnabled() && !btnGirl.isEnabled()) || txtChildFullName.getText().isEmpty() || txtChildAge.getText().isEmpty()
                || txtChildLocation.getText().isEmpty() || txtTypeOfDisease.getText().isEmpty()
                || txtDiseasePeriod.getText().isEmpty()
                ){
            JOptionPane.showMessageDialog(null, "Child Name, Age, Location, Gender, Type of disease, Disease period cannot be empty ",
                    "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if ((!radioButtonYes.isEnabled() && !radioButtonNo.isEnabled()) || txtFullNameParent.getText().isEmpty() || txtMobileNumberParent.getText().isEmpty()
                || txtPreferredHealthCareLocation.getText().isEmpty() || jDateChooser1.getDate().toString().isEmpty()
                || txtChildPhysicianLocation.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty ",
                    "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean isValid = Validator.getInstance().validateEmailAddr(txtMobileNumberParent.getText());
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter email address in format - a@b.c", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //validate diseasePeriod
        isValid = Validator.getInstance().validateAllDigits(txtDiseasePeriod.getText());
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter valid disease period in number of months", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //save form
        saveChildHealthForm();
        saveWorkRequest();

        //add work request
        organization.getWorkQueue().addWorkRequest(childHealthAttributes);
        entity.getWorkQueue().addWorkRequest(childHealthAttributes);
        JOptionPane.showMessageDialog(null, "Your Request Has Been Submitted", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSubmitRequest1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemUserWorkAreaJPanel workArea = (SystemUserWorkAreaJPanel) component;
        workArea.setVisible(true);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void radioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonYesActionPerformed
        if (radioButtonYes.isSelected()) {
            txtFullNameParent.setEditable(true);
            txtMobileNumberParent.setEditable(true);
        }
    }//GEN-LAST:event_radioButtonYesActionPerformed

    private void radioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNoActionPerformed
        if (radioButtonNo.isSelected()) {
            txtFullNameParent.setEditable(false);
            txtMobileNumberParent.setEditable(false);
        }
    }//GEN-LAST:event_radioButtonNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnBoy;
    private javax.swing.JRadioButton btnGirl;
    private javax.swing.JButton btnSubmitRequest1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioButtonNo;
    private javax.swing.JRadioButton radioButtonYes;
    private javax.swing.JTextField txtChildAge;
    private javax.swing.JTextField txtChildFullName;
    private javax.swing.JTextField txtChildInsuranceNumber;
    private javax.swing.JTextField txtChildLocation;
    private javax.swing.JTextField txtChildPhysicianLocation;
    private javax.swing.JTextField txtChildPhysicianName;
    private javax.swing.JTextField txtDiseasePeriod;
    private javax.swing.JTextField txtFullNameParent;
    private javax.swing.JTextField txtMobileNumberParent;
    private javax.swing.JTextField txtPreferredHealthCareLocation;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtTypeOfDisease;
    // End of variables declaration//GEN-END:variables

    private void saveChildHealthForm() {
        childHealthAttributes.setChildFullName(txtChildFullName.getText());
        childHealthAttributes.setChildInsuranceNumber(txtChildInsuranceNumber.getText());
        childHealthAttributes.setChildLocation(txtChildLocation.getText());
        childHealthAttributes.setChildPhysicianName(txtChildPhysicianName.getText());
        childHealthAttributes.setChildPhysicianLocation(txtChildPhysicianName.getText());

        if (radioButtonYes.isEnabled()) {
            childHealthAttributes.setParentMobileNumber(user.getMobileNumber());
            childHealthAttributes.setParentFullName(user.getFirstName() + " " + user.getLastName());
        }

        childHealthAttributes.setParentMobileNumber(txtMobileNumberParent.getText());
        childHealthAttributes.setParentFullName(txtFullNameParent.getText());
        childHealthAttributes.setRemarks(txtRemarks.getText());
        childHealthAttributes.setPreferredHealthCareLocation(txtPreferredHealthCareLocation.getText());
        childHealthAttributes.setTypeOfDisease(txtTypeOfDisease.getText());
        childHealthAttributes.setDiseasePeriod(Integer.parseInt(txtDiseasePeriod.getText()));
        childHealthAttributes.setRemarks(txtRemarks.getText());
        childHealthAttributes.setLastCheckUpDate(Validator.getInstance().convertStringToDate(jDateChooser1.getDate().toString()));

        String age = txtChildAge.getText();
        if (age != null) {
            childHealthAttributes.setChildAge(Integer.parseInt(age));
        }
        if (btnBoy.isEnabled()) {
            childHealthAttributes.setChildGender("Male");
        } else {
            childHealthAttributes.setChildGender("Female");
        }
    }

    private void saveWorkRequest() {
        childHealthAttributes.setSender(user);
        childHealthAttributes.setReceiver(organization.getOrganizationAdmin());
        childHealthAttributes.setRequestDate(LocalDateTime.now());
        childHealthAttributes.setOrganizationId(organization.getOrganizationId());
        childHealthAttributes.setEnterpriseId(enterprise.getEnterpriseId());
        childHealthAttributes.setStatus(Status.StatusType.NEW.getValue());
    }
}
