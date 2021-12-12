/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ChildHealth;

import Business.ChildHealth.ChildMentalHealthAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Users.User;
import Business.Validator.Validator;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class ChildMentalHealthRequestForm extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Entity entity;
    private Enterprise enterprise;
    private User user;
    private Organization organization;
    private ChildMentalHealthAttributes childMentalHealthAttributes;

    /**
     * Creates new form ChildMentalHealthRequestForm
     *
     * @param userProcessContainer
     * @param entity
     * @param organization
     * @param enterprise
     * @param user
     */
    public ChildMentalHealthRequestForm(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.entity = entity;
        this.organization = organization;
        this.enterprise = enterprise;
        this.user = user;
        this.childMentalHealthAttributes = new ChildMentalHealthAttributes();
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
        jLabel12 = new javax.swing.JLabel();
        txtDiseasePeriod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFullNameParent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMobileNumberParent = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtChildInsuranceNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPreferredMentalHealthCareLocation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtChildPhysicianName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtChildPhysicianLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioButtonYes = new javax.swing.JRadioButton();
        radioButtonNo = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMentalHealthDiagnosisType = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnCreate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(172, 208, 192));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Child Location");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Child Full Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Child Age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Child Gender");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Remarks");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Disease Period (in months)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Full Name of Parent");

        txtFullNameParent.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Mobile Number of Parent");

        txtMobileNumberParent.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Child Insurance Number");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Preferred Mental HealthCare Location");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Child Physician Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Child Physician Location");

        txtChildPhysicianLocation.setText("jTextField5");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Are you parent of the child?");

        radioButtonYes.setBackground(new java.awt.Color(172, 208, 192));
        buttonGroup1.add(radioButtonYes);
        radioButtonYes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioButtonYes.setText("Yes");
        radioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonYesActionPerformed(evt);
            }
        });

        radioButtonNo.setBackground(new java.awt.Color(172, 208, 192));
        buttonGroup1.add(radioButtonNo);
        radioButtonNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioButtonNo.setText("No");
        radioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Last Checkup Date");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Mental Health Diagnosis Type");

        txtMentalHealthDiagnosisType.setText("jTextField5");
        txtMentalHealthDiagnosisType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMentalHealthDiagnosisTypeActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(172, 208, 192));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(172, 208, 192));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(217, 180, 74));
        btnCreate.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Submit Request");
        btnCreate.setContentAreaFilled(false);
        btnCreate.setOpaque(true);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Child Mental Health Request Form");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Medical Condition");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depression", "Anxiety", "ADHD", "ODD", "ASD" }));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ChildHealth/Mental.png"))); // NOI18N

        jDateChooser1.setMaxSelectableDate(new java.util.Date(1639180800000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(946684800000L));

        btnBack2.setBackground(new java.awt.Color(217, 180, 74));
        btnBack2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("<< Back");
        btnBack2.setContentAreaFilled(false);
        btnBack2.setOpaque(true);
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 245, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(radioButtonYes)
                                .addGap(73, 73, 73)
                                .addComponent(radioButtonNo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtChildPhysicianLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMentalHealthDiagnosisType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFullNameParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMobileNumberParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChildInsuranceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPreferredMentalHealthCareLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChildPhysicianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChildAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChildLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChildFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton2))
                                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiseasePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jDateChooser1, txtChildAge, txtChildFullName, txtChildInsuranceNumber, txtChildLocation, txtChildPhysicianLocation, txtChildPhysicianName, txtDiseasePeriod, txtFullNameParent, txtMentalHealthDiagnosisType, txtMobileNumberParent, txtPreferredMentalHealthCareLocation, txtRemarks});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonNo)
                    .addComponent(radioButtonYes)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChildFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChildLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChildAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiseasePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullNameParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobileNumberParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChildInsuranceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreferredMentalHealthCareLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChildPhysicianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChildPhysicianLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMentalHealthDiagnosisType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jDateChooser1, txtChildAge, txtChildFullName, txtChildInsuranceNumber, txtChildLocation, txtChildPhysicianLocation, txtChildPhysicianName, txtDiseasePeriod, txtFullNameParent, txtMentalHealthDiagnosisType, txtMobileNumberParent, txtPreferredMentalHealthCareLocation, txtRemarks});

    }// </editor-fold>//GEN-END:initComponents

    private void txtMentalHealthDiagnosisTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMentalHealthDiagnosisTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMentalHealthDiagnosisTypeActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        //Validate for emtpy fields
        //validate input
        boolean isValid = Validator.getInstance().validateEmailAddr(txtMobileNumberParent.getText());
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter email address in format - a@b.c", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
        }
        //validate diseasePeriod
        isValid = Validator.getInstance().validateMonth(txtDiseasePeriod.getText());
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Please enter valid disease period in number of months", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
        }

        //save form
        saveChildMentalHealthForm();
        saveWorkRequest();

        //add work request
        organization.getWorkQueue().addWorkRequest(childMentalHealthAttributes);
        entity.getWorkQueue().addWorkRequest(childMentalHealthAttributes);
        JOptionPane.showMessageDialog(null, "Your Request Has Been Submitted", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
            if(jRadioButton2.isSelected() ){
            childMentalHealthAttributes.setChildGender(jRadioButton2.getText());
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void radioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonYesActionPerformed

        if(radioButtonYes.isSelected() ){
        txtFullNameParent.setEditable(true);
        txtMobileNumberParent.setEditable(true);
        }   
// TODO add your handling code here:
    }//GEN-LAST:event_radioButtonYesActionPerformed

    private void radioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNoActionPerformed
        // TODO add your handling code here:
        if(radioButtonNo.isSelected() ){
        txtFullNameParent.setEditable(false);
        txtMobileNumberParent.setEditable(false);
        }
    }//GEN-LAST:event_radioButtonNoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected() ){
            childMentalHealthAttributes.setChildGender(jRadioButton1.getText());
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
    private javax.swing.JTextField txtMentalHealthDiagnosisType;
    private javax.swing.JTextField txtMobileNumberParent;
    private javax.swing.JTextField txtPreferredMentalHealthCareLocation;
    private javax.swing.JTextField txtRemarks;
    // End of variables declaration//GEN-END:variables

    private void saveChildMentalHealthForm() {
        childMentalHealthAttributes.setChildFullName(txtChildFullName.getText());
        childMentalHealthAttributes.setChildInsuranceNumber(txtChildInsuranceNumber.getText());
        childMentalHealthAttributes.setChildLocation(txtChildLocation.getText());
        childMentalHealthAttributes.setChildPhysicianName(txtChildPhysicianName.getText());
        childMentalHealthAttributes.setChildPhysicianLocation(txtChildPhysicianName.getText());
        
        if (radioButtonYes.isEnabled()) {
            childMentalHealthAttributes.setParentMobileNumber(user.getMobileNumber());
            childMentalHealthAttributes.setParentFullName(user.getFirstName() + " " + user.getLastName());
        }
        
        childMentalHealthAttributes.setParentMobileNumber(txtMobileNumberParent.getText());
        childMentalHealthAttributes.setParentFullName(txtFullNameParent.getText());
        childMentalHealthAttributes.setRemarks(txtRemarks.getText());
        childMentalHealthAttributes.setPreferredHealthCareLocation(txtPreferredMentalHealthCareLocation.getText());
        childMentalHealthAttributes.setTypeOfDisease("Mental Health");
        childMentalHealthAttributes.setDiseasePeriod(Integer.parseInt(txtDiseasePeriod.getText()));
        childMentalHealthAttributes.setRemarks(txtRemarks.getText());
        childMentalHealthAttributes.setLastCheckUpDate(Validator.getInstance().convertStringToDate(txtLastCheckupDate.getText()));
        childMentalHealthAttributes.setMentalHealthDiagnosisType(txtMentalHealthDiagnosisType.getText());
        
        String age = txtChildAge.getText();
        if (age != null) {
            childMentalHealthAttributes.setChildAge(Integer.parseInt(age));
        }        
    }
    
    private void saveWorkRequest() {
        childMentalHealthAttributes.setSender(user);
        childMentalHealthAttributes.setReceiver(organization.getOrganizationAdmin());
        childMentalHealthAttributes.setRequestDate(LocalDateTime.now());
        childMentalHealthAttributes.setOrganizationId(organization.getOrganizationId());
        childMentalHealthAttributes.setEnterpriseId(enterprise.getEnterpriseId());
        childMentalHealthAttributes.setStatus(Status.StatusType.NEW.getValue());
    }
}
