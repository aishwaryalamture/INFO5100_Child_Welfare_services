/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalUnit;

import Business.ChildHealth.ChildHealthAttributes;
import Business.ChildHealth.ChildMentalHealthAttributes;
import userinterface.PoliceWorkArea.*;
import userinterface.ChildWelfareAdmin.*;
import Business.ChildMaltreatment.ChildMaltreatmentAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
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

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class HospitalUnitRequestDetails extends javax.swing.JPanel {

    private JPanel displayPanel;
    private Entity entity;
    private User user;
    private Enterprise enterprise;
    private WorkRequest workRequest;

    /**
     * Creates new form HospitalUnitRequestDetails
     */
    public HospitalUnitRequestDetails(JPanel displayPanel, Entity entity, Enterprise enterprise, User user, WorkRequest workRequest) {
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

        //showing details of CHildHEalth Organization
        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.ChildHealth.getValue())) {
            ChildHealthAttributes childHealthAttributes = (ChildHealthAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(childHealthAttributes.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = childHealthAttributes.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = childHealthAttributes.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Name";
            row[1] = childHealthAttributes.getChildFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Location";
            row[1] = childHealthAttributes.getChildLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Age";
            row[1] = childHealthAttributes.getChildAge();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Gender";
            row[1] = childHealthAttributes.getChildGender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Parent Full Name";
            row[1] = childHealthAttributes.getParentFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Parent Contact No";
            row[1] = childHealthAttributes.getParentMobileNumber();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Insurance Number";
            row[1] = childHealthAttributes.getChildInsuranceNumber();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Type Of Disease";
            row[1] = childHealthAttributes.getTypeOfDisease();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Disease Duration";
            row[1] = childHealthAttributes.getDiseasePeriod();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Peferred Health Care Location";
            row[1] = childHealthAttributes.getPreferredHealthCareLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = childHealthAttributes.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Physician Name";
            row[1] = childHealthAttributes.getChildPhysicianName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Physician Location";
            row[1] = childHealthAttributes.getChildPhysicianLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Check up Date";
            row[1] = childHealthAttributes.getLastCheckUpDate().toString();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (childHealthAttributes.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(childHealthAttributes.getResolveDate());
            } else {
                row[1] = "Yet To Be Resolved";
            }

            delModel.addRow(row);

        }
        
        //showing details of Mentalhealth Organization

        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.MentalHealth.getValue())) {
            ChildMentalHealthAttributes childMentalHealthAttributes = (ChildMentalHealthAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(childMentalHealthAttributes.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = childMentalHealthAttributes.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = childMentalHealthAttributes.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Name";
            row[1] = childMentalHealthAttributes.getChildFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Location";
            row[1] = childMentalHealthAttributes.getChildLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Age";
            row[1] = childMentalHealthAttributes.getChildAge();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Gender";
            row[1] = childMentalHealthAttributes.getChildGender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Parent Full Name";
            row[1] = childMentalHealthAttributes.getParentFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Parent Contact No";
            row[1] = childMentalHealthAttributes.getParentMobileNumber();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Insurance Number";
            row[1] = childMentalHealthAttributes.getChildInsuranceNumber();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Type Of Disease";
            row[1] = childMentalHealthAttributes.getTypeOfDisease();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Disease Duration";
            row[1] = childMentalHealthAttributes.getDiseasePeriod();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Peferred Health Care Location";
            row[1] = childMentalHealthAttributes.getPreferredHealthCareLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = childMentalHealthAttributes.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Physician Name";
            row[1] = childMentalHealthAttributes.getChildPhysicianName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Physician Location";
            row[1] = childMentalHealthAttributes.getChildPhysicianLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Mental Health Diagnosis Type";
            row[1] = childMentalHealthAttributes.getChildPhysicianLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Check up Date";
            row[1] = childMentalHealthAttributes.getLastCheckUpDate().toString();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (childMentalHealthAttributes.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(childMentalHealthAttributes.getResolveDate());
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
}
