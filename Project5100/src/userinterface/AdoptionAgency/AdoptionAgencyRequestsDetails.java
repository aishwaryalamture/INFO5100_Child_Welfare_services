/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdoptionAgency;

import Business.ChildAdoption.ChildAdoptionAttributes;
import userinterface.HospitalUnit.*;
import Business.ChildHealth.ChildHealthAttributes;
import Business.ChildHealth.ChildMentalHealthAttributes;
import userinterface.PoliceWorkArea.*;
import userinterface.ChildWelfareAdmin.*;
import Business.ChildMaltreatment.ChildMaltreatmentAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.FosterCare.FosterCareAttributes;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.Users.User;
import Business.Validator.Validator;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.UtilityClass;
import Business.SendEmail.EmailUtility;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class AdoptionAgencyRequestsDetails extends javax.swing.JPanel {

    private JPanel displayPanel;
    private Entity entity;
    private User user;
    private Enterprise enterprise;
    private WorkRequest workRequest;

    /**
     * Creates new form ChildWelfareRequestDetails
     */
    public AdoptionAgencyRequestsDetails(JPanel displayPanel, Entity entity, Enterprise enterprise, User user, WorkRequest workRequest) {
        initComponents();
        this.displayPanel = displayPanel;
        this.entity = entity;
        this.user = user;
        this.enterprise = enterprise;
        this.workRequest = workRequest;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel delModel = (DefaultTableModel) tblRequestDetails.getModel();
        delModel.setRowCount(0);
        Organization organization = null;
        for (Enterprise enterprise : entity.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseId() == workRequest.getEnterpriseId()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org.getOrganizationId() == workRequest.getOrganizationId()) {
                        organization = org;
                    }
                }
            }
        }

        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.AdoptionServices.getValue())) {
            ChildAdoptionAttributes childAttributes = (ChildAdoptionAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = childAttributes.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = childAttributes.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Name";
            row[1] = childAttributes.getChildFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Location";
            row[1] = childAttributes.getChildLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Age";
            row[1] = childAttributes.getChildAge();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Gender";
            row[1] = childAttributes.getChildGender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Race";
            row[1] = childAttributes.getRace();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Ethnicity";
            row[1] = childAttributes.getEthnicity();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Contact No";
            row[1] = childAttributes.getContactNo();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Preferred Agency Location";
            row[1] = childAttributes.getPreferredAgencyLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = childAttributes.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (childAttributes.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getResolveDate());
            } else {
                row[1] = "Yet To Be Resolved";
            }

            delModel.addRow(row);

        }

        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.FosterCare.getValue())) {
            FosterCareAttributes childAttributes = (FosterCareAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = childAttributes.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = childAttributes.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Name";
            row[1] = childAttributes.getChildFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Location";
            row[1] = childAttributes.getChildLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Age";
            row[1] = childAttributes.getChildAge();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Gender";
            row[1] = childAttributes.getChildGender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Race";
            row[1] = childAttributes.getRace();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Ethnicity";
            row[1] = childAttributes.getEthnicity();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Name";
            row[1] = childAttributes.getLegalGuardianName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Contact No";
            row[1] = childAttributes.getLegalGuardianMobile();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Email";
            row[1] = childAttributes.getLegalGuardianMobile();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Location";
            row[1] = childAttributes.getLegalGuardianLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Open For Adoption";
            String openToAdoption = "No";
            if(childAttributes.isOpenToAdoption()) {
                openToAdoption = "Yes";
            }
            row[1] = openToAdoption;
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Preferred Agency Location";
            row[1] = childAttributes.getPreferredAgencyLocation();
            delModel.addRow(row);
            
            row = new Object[2];
            row[0] = "Temporary Stay Duration";
            row[1] = childAttributes.getTemporaryStayExpectedDays()+"";
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = childAttributes.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (childAttributes.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getResolveDate());
            } else {
                row[1] = "Yet To Be Resolved";
            }

            delModel.addRow(row);
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

        lblTitleAdminRoles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDetails = new javax.swing.JTable();
        btnInProgress = new javax.swing.JButton();
        btnResolved = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleAdminRoles.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitleAdminRoles.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleAdminRoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAdminRoles.setText("Request Details");
        lblTitleAdminRoles.setMaximumSize(new java.awt.Dimension(210, 34));
        lblTitleAdminRoles.setMinimumSize(new java.awt.Dimension(210, 34));
        lblTitleAdminRoles.setPreferredSize(new java.awt.Dimension(280, 34));
        add(lblTitleAdminRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 64, -1, 53));

        tblRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblRequestDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 720, 470));

        btnInProgress.setBackground(new java.awt.Color(217, 180, 74));
        btnInProgress.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnInProgress.setForeground(new java.awt.Color(255, 255, 255));
        btnInProgress.setText("MARK IN PROGRESS");
        btnInProgress.setContentAreaFilled(false);
        btnInProgress.setOpaque(true);
        btnInProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInProgressActionPerformed(evt);
            }
        });
        add(btnInProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 241, 49));

        btnResolved.setBackground(new java.awt.Color(217, 180, 74));
        btnResolved.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnResolved.setForeground(new java.awt.Color(255, 255, 255));
        btnResolved.setText("MARK RESOLVED");
        btnResolved.setContentAreaFilled(false);
        btnResolved.setOpaque(true);
        btnResolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolvedActionPerformed(evt);
            }
        });
        add(btnResolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 241, 49));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInProgressActionPerformed
        // TODO add your handling code here:
        workRequest.setStatus(Status.StatusType.INPROGRESS.getValue());
        JOptionPane.showMessageDialog(null, "Progress Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
         sendEmail(workRequest.getSender().getEmailId(), "in progress");
    }//GEN-LAST:event_btnInProgressActionPerformed

    private void btnResolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolvedActionPerformed
        // TODO add your handling code here:
        workRequest.setStatus(Status.StatusType.RESOLVED.getValue());
        for (User user : entity.getUserDirectory().getUserList()) {
            if (user.getRole().getRoleType() == Role.RoleType.ChildWelfareAdmin) {
                workRequest.setReceiver(user);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Marked Resolved", "Success", JOptionPane.INFORMATION_MESSAGE);
        sendEmail(workRequest.getSender().getEmailId(), "resolved");
        btnBack.doClick();


    }//GEN-LAST:event_btnResolvedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ChildWelfareHospitalRequestsJPanel workArea = (ChildWelfareHospitalRequestsJPanel) component;
        workArea.populateTable();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInProgress;
    private javax.swing.JButton btnResolved;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitleAdminRoles;
    private javax.swing.JTable tblRequestDetails;
    // End of variables declaration//GEN-END:variables
    private void sendEmail(String userEmail, String status) {
        String requestDate = Validator.getInstance().convertLocalDateToString(workRequest.getRequestDate());
        String emailmsg = "Hi " + workRequest.getSender().getFullName()  + "\n" 
                + "Your ticket raised on date: "+ requestDate + " is now marked as " + status.toUpperCase() + "\n"
                + "Please login in the portal to check details and contact us if you need any additional information.";
        String emailsubject = "Update on your ticket dated #" + requestDate;
        EmailUtility.SendMail(userEmail, emailmsg, emailsubject);
    }
}
