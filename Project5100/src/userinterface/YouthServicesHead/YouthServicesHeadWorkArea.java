/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.YouthServicesHead;

import Business.ChildMaltreatment.ChildMaltreatmentAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.Users.User;
import Business.WorkQueue.WorkRequest;
import Business.YouthCare.YouthCareAttributes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class YouthServicesHeadWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Entity entity;
    private Enterprise enterprise;
    private User user;
    private Organization organization;

    /**
     * Creates new form YouthServicesHeadWorkArea
     */
    public YouthServicesHeadWorkArea(JPanel userProcessContainer, Entity entity, Organization organization, Enterprise enterprise,
            User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.entity = entity;
        this.organization = organization;
        this.enterprise = enterprise;
        this.user = user;
        populateYouthcareHeadRequests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tblChildDetails = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblYouthCareHeadWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRequestMoreDetails1 = new javax.swing.JButton();
        btnAssignToChildWelfareOfficer3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblChildDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Birthdate", "Age", "Location", "School Name", "School Grade", "Guardian Name", "Guardian Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblChildDetails);
        if (tblChildDetails.getColumnModel().getColumnCount() > 0) {
            tblChildDetails.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblChildDetails.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblChildDetails.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblChildDetails.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 747, 42));

        tblYouthCareHeadWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Date", "Status", "Remarks", "Preferred Agency Location", "Previous Youthcare Agency"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblYouthCareHeadWorkRequest);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 747, 91));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Child Details:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Work Requests: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        btnRequestMoreDetails1.setBackground(new java.awt.Color(217, 180, 74));
        btnRequestMoreDetails1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnRequestMoreDetails1.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestMoreDetails1.setText("Request More Details");
        btnRequestMoreDetails1.setContentAreaFilled(false);
        btnRequestMoreDetails1.setOpaque(true);
        btnRequestMoreDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMoreDetails1ActionPerformed(evt);
            }
        });
        add(btnRequestMoreDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 220, 50));

        btnAssignToChildWelfareOfficer3.setBackground(new java.awt.Color(217, 180, 74));
        btnAssignToChildWelfareOfficer3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnAssignToChildWelfareOfficer3.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToChildWelfareOfficer3.setText("Assign To Child Welfare Officer");
        btnAssignToChildWelfareOfficer3.setContentAreaFilled(false);
        btnAssignToChildWelfareOfficer3.setOpaque(true);
        btnAssignToChildWelfareOfficer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToChildWelfareOfficer3ActionPerformed(evt);
            }
        });
        add(btnAssignToChildWelfareOfficer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 250, 50));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Youth Service Head WorkArea");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 370, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestMoreDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMoreDetails1ActionPerformed

    }//GEN-LAST:event_btnRequestMoreDetails1ActionPerformed

    private void btnAssignToChildWelfareOfficer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToChildWelfareOfficer3ActionPerformed
        ChildMaltreatmentAttributes cma = (ChildMaltreatmentAttributes) tblYouthCareHeadWorkRequest.getValueAt(tblYouthCareHeadWorkRequest.getSelectedRow(), 0);

        for (User user : entity.getUserDirectory().getUserList()) {
            if (user.getRole().getRoleType() == Role.RoleType.ChildWelfareAdmin) {
                cma.setReceiver(user);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Assigned To ChildWelfare Admin", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAssignToChildWelfareOfficer3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToChildWelfareOfficer3;
    private javax.swing.JButton btnRequestMoreDetails1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblChildDetails;
    private javax.swing.JTable tblYouthCareHeadWorkRequest;
    // End of variables declaration//GEN-END:variables

    private void populateYouthcareHeadRequests() {
        DefaultTableModel delModel = (DefaultTableModel) tblYouthCareHeadWorkRequest.getModel();
        delModel.setRowCount(0);
        ArrayList<WorkRequest> workRequestList = organization.getWorkQueue().getWorkRequestList();
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest.getStatus().equalsIgnoreCase(Status.StatusType.NEW.getValue())
                    || workRequest.getStatus().equalsIgnoreCase(Status.StatusType.INPROGRESS.getValue())) {

                YouthCareAttributes cha = (YouthCareAttributes) workRequest;
                Object[] row = new Object[6];
                row[0] = cha;
                row[1] = cha.getRequestDate();
                row[2] = cha.getStatus();
                row[3] = cha.getRemarks();
                row[4] = cha.getPreferredAgencyLocation();
                row[5] = cha.getPreviousYouthCareAgency();
                delModel.addRow(row);
            }
        }

        tblYouthCareHeadWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                populateDetailsTable();
            }
        });
    }

    private void populateDetailsTable() {
        try {
            YouthCareAttributes cha = (YouthCareAttributes) tblYouthCareHeadWorkRequest.getValueAt(tblYouthCareHeadWorkRequest.getSelectedRow(), 0);
            DefaultTableModel model = (DefaultTableModel) tblChildDetails.getModel();
            model.setRowCount(0);
            Object[] row = new Object[9];
            row[0] = cha.getFullName();
            row[1] = cha.getGender();
            row[2] = cha.getDateOfBirth();
            row[3] = cha.getAge();
            row[4] = cha.getLocation();
            row[5] = cha.getSchoolName();
            row[6] = cha.getGrade();
            row[7] = cha.getLegalGuardianName();
            row[8] = cha.getLegalGuardianMobile();
            model.addRow(row);

        } catch (Exception e) {
            return;
        }
    }
}
