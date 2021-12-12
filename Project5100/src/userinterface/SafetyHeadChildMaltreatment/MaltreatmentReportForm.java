/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SafetyHeadChildMaltreatment;

import Business.ChildMaltreatment.ChildMaltreatmentAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Users.User;
import Business.Validator.Validator;
import java.time.LocalDateTime;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class MaltreatmentReportForm extends javax.swing.JPanel {

    private ChildMaltreatmentAttributes childMaltreatmentAttributes;
    private JPanel userProcessContainer;
    private Entity entity;
    private Enterprise enterprise;
    private User user;
    private Organization organization;

    /**
     * Creates new form MaltreatmentReportForm
     *
     * @param userProcessContainer
     * @param entity
     * @param organization
     * @param enterprise
     * @param user
     */
    public MaltreatmentReportForm(JPanel userProcessContainer, Entity entity, Organization organization, 
            Enterprise enterprise, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.entity = entity;
        this.organization = organization;
        this.enterprise = enterprise;
        this.user = user;
        this.childMaltreatmentAttributes = new ChildMaltreatmentAttributes();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFullNameReporter = new javax.swing.JTextField();
        txtLocationOffender = new javax.swing.JTextField();
        txtDescriptionOffender = new javax.swing.JTextField();
        txtFullNameVictim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLocationVictim = new javax.swing.JTextField();
        txtRelationshipVictimOffender = new javax.swing.JTextField();
        txtVictimAge = new javax.swing.JTextField();
        txtRemarks = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAbuseType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnMaleO = new javax.swing.JRadioButton();
        btnFemaleO = new javax.swing.JRadioButton();
        btnMaleV = new javax.swing.JRadioButton();
        btnFemaleV = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(178, 208, 192));

        jLabel1.setText("Full Name of Offender");

        jLabel2.setText("Location of Offender");

        jLabel3.setText("Gender of offender");

        jLabel4.setText("Description of Offender");

        jLabel6.setText("Full Name of Victim");

        jLabel7.setText("Approx age of Victim");

        jLabel8.setText("Relationship of victim to alleged offender");

        jLabel9.setText("Location of Victim");

        jLabel10.setText("Remarks");

        jLabel11.setText("Gender of Victim");

        jLabel12.setText("Type of abuse");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Maltreatment Report Form");

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

        btnReport.setBackground(new java.awt.Color(217, 180, 74));
        btnReport.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Report");
        btnReport.setContentAreaFilled(false);
        btnReport.setOpaque(true);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnMaleO);
        btnMaleO.setText("Male");

        buttonGroup1.add(btnFemaleO);
        btnFemaleO.setText("Female");

        buttonGroup2.add(btnMaleV);
        btnMaleV.setText("Male");

        buttonGroup2.add(btnFemaleV);
        btnFemaleV.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFullNameVictim)
                                    .addComponent(txtDescriptionOffender)
                                    .addComponent(txtLocationOffender)
                                    .addComponent(txtLocationVictim)
                                    .addComponent(txtRelationshipVictimOffender)
                                    .addComponent(txtFullNameReporter)
                                    .addComponent(txtRemarks)
                                    .addComponent(txtAbuseType)
                                    .addComponent(txtVictimAge)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnMaleO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFemaleO))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnMaleV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFemaleV)))))))
                .addGap(354, 354, 354))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFullNameReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLocationOffender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnMaleO)
                    .addComponent(btnFemaleO))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescriptionOffender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullNameVictim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocationVictim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRelationshipVictimOffender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVictimAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMaleV)
                        .addComponent(btnFemaleV)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbuseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        //Validate for emtpy fields
        if ((!btnFemaleO.isEnabled() && !btnMaleO.isEnabled())) {
            JOptionPane.showMessageDialog(null, "Gender of the Offender cannot be empty ",
                    "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!btnMaleV.isEnabled() && !btnFemaleV.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Gender of the victim cannot be empty ",
                    "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        boolean isValid = Validator.getInstance().validateEmailAddr(txtDescriptionOffender.getText());
        if(!isValid){
            JOptionPane.showMessageDialog(null, "Please enter email address in format - a@b.c", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //save form
        saveChildMaltreatmentForm();
        saveWorkRequest();

        //add work request
        organization.getWorkQueue().addWorkRequest(childMaltreatmentAttributes);
        entity.getWorkQueue().addWorkRequest(childMaltreatmentAttributes);
        JOptionPane.showMessageDialog(null, "Your Report Has Been Submitted", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnFemaleO;
    private javax.swing.JRadioButton btnFemaleV;
    private javax.swing.JRadioButton btnMaleO;
    private javax.swing.JRadioButton btnMaleV;
    private javax.swing.JButton btnReport;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAbuseType;
    private javax.swing.JTextField txtDescriptionOffender;
    private javax.swing.JTextField txtFullNameReporter;
    private javax.swing.JTextField txtFullNameVictim;
    private javax.swing.JTextField txtLocationOffender;
    private javax.swing.JTextField txtLocationVictim;
    private javax.swing.JTextField txtRelationshipVictimOffender;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtVictimAge;
    // End of variables declaration//GEN-END:variables

    private void saveChildMaltreatmentForm() {

        childMaltreatmentAttributes.setFullNameVictim(
        Optional.of(txtFullNameVictim.getText()).orElse(""));
        childMaltreatmentAttributes.setLocationVictim(
        Optional.of(txtLocationVictim.getText()).orElse(""));
        childMaltreatmentAttributes.setRelationshipVictimOffender(
        Optional.of(txtRelationshipVictimOffender.getText()).orElse(""));
        childMaltreatmentAttributes.setRemarks(
        Optional.of(txtRemarks.getText()).orElse(""));
        childMaltreatmentAttributes.setTypeOfAbuse(
        Optional.of(txtDescriptionOffender.getText()).orElse(""));
        
        if (btnMaleV.isEnabled()) {
            childMaltreatmentAttributes.setGenderVictim("Male");
        } else {
            childMaltreatmentAttributes.setGenderVictim("Female");
        }

        String age = txtVictimAge.getText();
        if (age != null) {
            childMaltreatmentAttributes.setAgeVictim(Integer.parseInt(age));
        }
        
        childMaltreatmentAttributes.setOffenderDescription(
        Optional.of(txtDescriptionOffender.getText()).orElse(""));
        childMaltreatmentAttributes.setOffenderLocation(
        Optional.of(txtLocationOffender.getText()).orElse(""));
        childMaltreatmentAttributes.setOffenderName(
        Optional.of(txtFullNameReporter.getText()).orElse(""));
        
        if (btnMaleO.isEnabled()) {
            childMaltreatmentAttributes.setOffenderGender("Male");
        } else {
            childMaltreatmentAttributes.setOffenderGender("Female");
        }

    }

    private void saveWorkRequest() {

        childMaltreatmentAttributes.setSender(user);
        childMaltreatmentAttributes.setReceiver(organization.getOrganizationAdmin());
        childMaltreatmentAttributes.setRequestDate(LocalDateTime.now());
        childMaltreatmentAttributes.setOrganizationId(organization.getOrganizationId());
        childMaltreatmentAttributes.setEnterpriseId(enterprise.getEnterpriseId());
        childMaltreatmentAttributes.setStatus(Status.StatusType.NEW.getValue());
    }

}
