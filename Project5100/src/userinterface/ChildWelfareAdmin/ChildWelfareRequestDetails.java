/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ChildWelfareAdmin;

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
public class ChildWelfareRequestDetails extends javax.swing.JPanel {

    private JPanel displayPanel;
    private Entity entity;
    private User user;
    private Enterprise enterprise;
    private Organization organization;
    private WorkRequest workRequest;

    /**
     * Creates new form ChildWelfareRequestDetails
     */
    public ChildWelfareRequestDetails(JPanel displayPanel, Entity entity, Enterprise enterprise, User user, Organization organization, WorkRequest workRequest) {
        initComponents();
        this.displayPanel = displayPanel;
        this.entity = entity;
        this.user = user;
        this.enterprise = enterprise;
        this.organization = organization;
        this.workRequest = workRequest;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel delModel = (DefaultTableModel) tblRequestDetails.getModel();
        delModel.setRowCount(0);

        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.ChildMaltreatment.getValue())) {
            ChildMaltreatmentAttributes maltreatmentWorkReq = (ChildMaltreatmentAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(maltreatmentWorkReq.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = maltreatmentWorkReq.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = maltreatmentWorkReq.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Victim Name";
            row[1] = maltreatmentWorkReq.getFullNameVictim();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Victim Location";
            row[1] = maltreatmentWorkReq.getLocationVictim();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Relationship";
            row[1] = maltreatmentWorkReq.getRelationshipVictimOffender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Victim Name";
            row[1] = maltreatmentWorkReq.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Victim Age";
            row[1] = maltreatmentWorkReq.getAgeVictim();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Victim Gender";
            row[1] = maltreatmentWorkReq.getGenderVictim();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Victim Name";
            row[1] = maltreatmentWorkReq.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = maltreatmentWorkReq.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Type Of Abuse";
            row[1] = maltreatmentWorkReq.getTypeOfAbuse();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Sender Contact No";
            row[1] = maltreatmentWorkReq.getSender().getMobileNumber();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (maltreatmentWorkReq.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(maltreatmentWorkReq.getResolveDate());
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
        btnAssignToAdoptionAgency = new javax.swing.JButton();
        btnAssignToHospital = new javax.swing.JButton();
        btnAssignToPolice = new javax.swing.JButton();
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

        btnAssignToAdoptionAgency.setBackground(new java.awt.Color(217, 180, 74));
        btnAssignToAdoptionAgency.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnAssignToAdoptionAgency.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToAdoptionAgency.setText("ASSIGN TO ADOPTION AGENCY");
        btnAssignToAdoptionAgency.setContentAreaFilled(false);
        btnAssignToAdoptionAgency.setOpaque(true);
        btnAssignToAdoptionAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToAdoptionAgencyActionPerformed(evt);
            }
        });
        add(btnAssignToAdoptionAgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, -1, 49));

        btnAssignToHospital.setBackground(new java.awt.Color(217, 180, 74));
        btnAssignToHospital.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnAssignToHospital.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToHospital.setText("ASSIGN TO HOSPITAL");
        btnAssignToHospital.setContentAreaFilled(false);
        btnAssignToHospital.setOpaque(true);
        btnAssignToHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToHospitalActionPerformed(evt);
            }
        });
        add(btnAssignToHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 241, 49));

        btnAssignToPolice.setBackground(new java.awt.Color(217, 180, 74));
        btnAssignToPolice.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnAssignToPolice.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToPolice.setText("ASSIGN TO POLICE DEPT");
        btnAssignToPolice.setContentAreaFilled(false);
        btnAssignToPolice.setOpaque(true);
        btnAssignToPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToPoliceActionPerformed(evt);
            }
        });
        add(btnAssignToPolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 241, 49));

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

    private void btnAssignToAdoptionAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToAdoptionAgencyActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAssignToAdoptionAgencyActionPerformed

    private void btnAssignToHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToHospitalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAssignToHospitalActionPerformed

    private void btnAssignToPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToPoliceActionPerformed
        // TODO add your handling code here:
        for (User user : entity.getUserDirectory().getUserList()) {
            if (user.getRole().getRoleType() == Role.RoleType.PoliceDeptAdmin) {
                workRequest.setReceiver(user);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Assigned To Police", "Success", JOptionPane.INFORMATION_MESSAGE);
        btnBack.doClick();


    }//GEN-LAST:event_btnAssignToPoliceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ResolveChildWelfareRequestsJPanel workArea = (ResolveChildWelfareRequestsJPanel) component;
        workArea.populateTable();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToAdoptionAgency;
    private javax.swing.JButton btnAssignToHospital;
    private javax.swing.JButton btnAssignToPolice;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitleAdminRoles;
    private javax.swing.JTable tblRequestDetails;
    // End of variables declaration//GEN-END:variables
}