/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthCareHead;

import Business.ChildHealth.ChildHealthAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Users.User;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class HealthCareHeadWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Entity entity;
    private Enterprise enterprise;
    private User user;
    private Organization organization;

    /**
     * Creates new form HealthCareHeadWorkArea
     *
     * @param userProcessContainer
     * @param entity
     * @param organization
     * @param enterprise
     * @param user
     */
    public HealthCareHeadWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.entity = entity;
        this.organization = organization;
        this.enterprise = enterprise;
        this.user = user;
        populateHealthCareHeadRequests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChildDetails = new javax.swing.JTable();
        btnAssignToChildWelfareOfficer1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHealthCareHeadWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChildHealthDetails = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnRequestMoreDetails1 = new javax.swing.JButton();

        tblChildDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Age", "Location", "Insurance Number", "Parent Name", "Parent Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblChildDetails);
        if (tblChildDetails.getColumnModel().getColumnCount() > 0) {
            tblChildDetails.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblChildDetails.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblChildDetails.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        btnAssignToChildWelfareOfficer1.setText("Assign to Child Welfare Officer");
        btnAssignToChildWelfareOfficer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToChildWelfareOfficer1ActionPerformed(evt);
            }
        });

        tblHealthCareHeadWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Date", "Status", "Type of Disease", "Remarks", "Preferred HealthCare Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblHealthCareHeadWorkRequest);

        jLabel1.setText("Child Details:");

        jLabel2.setText("Child Health Details:");

        tblChildHealthDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Disease", "Disease Period", "Physician Name", "Physician Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblChildHealthDetails);

        jLabel3.setText("Work Requests: ");

        btnRequestMoreDetails1.setText("Request More Details");
        btnRequestMoreDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMoreDetails1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnAssignToChildWelfareOfficer1)
                .addGap(127, 127, 127)
                .addComponent(btnRequestMoreDetails1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToChildWelfareOfficer1)
                    .addComponent(btnRequestMoreDetails1))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToChildWelfareOfficer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToChildWelfareOfficer1ActionPerformed
        //todo aish/ketki
    }//GEN-LAST:event_btnAssignToChildWelfareOfficer1ActionPerformed

    private void btnRequestMoreDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMoreDetails1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestMoreDetails1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToChildWelfareOfficer;
    private javax.swing.JButton btnAssignToChildWelfareOfficer1;
    private javax.swing.JButton btnRequestMoreDetails1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblChildDetails;
    private javax.swing.JTable tblChildHealthDetails;
    private javax.swing.JTable tblHealthCareHeadWorkRequest;
    private javax.swing.JTable tblVictimDetaiils;
    // End of variables declaration//GEN-END:variables

    private void populateHealthCareHeadRequests() {

        DefaultTableModel delModel = (DefaultTableModel) tblHealthCareHeadWorkRequest.getModel();
        delModel.setRowCount(0);
        ArrayList<WorkRequest> workRequestList = organization.getWorkQueue().getWorkRequestList();
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest.getStatus().equalsIgnoreCase(Status.StatusType.NEW.getValue())
                    || workRequest.getStatus().equalsIgnoreCase(Status.StatusType.INPROGRESS.getValue())) {

                ChildHealthAttributes cha = (ChildHealthAttributes) workRequest;
                Object[] row = new Object[6];
                row[0] = cha;
                row[1] = cha.getRequestDate();
                row[2] = cha.getStatus();
                row[3] = cha.getTypeOfDisease();
                row[4] = cha.getRemarks();
                row[5] = cha.getPreferredHealthCareLocation();
                delModel.addRow(row);
            }
        }

        tblHealthCareHeadWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                populateDetailsTable();
            }
        });
    }

    private void populateDetailsTable() {
        populateChildDetailsTable();
        populateHealthTable();
    }

    private void populateChildDetailsTable() {
        try {
            ChildHealthAttributes cha = (ChildHealthAttributes) tblHealthCareHeadWorkRequest.getValueAt(tblHealthCareHeadWorkRequest.getSelectedRow(), 0);
            DefaultTableModel model = (DefaultTableModel) tblChildDetails.getModel();
            model.setRowCount(0);
            Object[] row = new Object[7];
            row[0] = cha.getChildFullName();
            row[1] = cha.getChildGender();
            row[2] = cha.getChildAge();
            row[3] = cha.getChildLocation();
            row[4] = cha.getChildInsuranceNumber();
            row[5] = cha.getParentFullName();
            row[6] = cha.getParentMobileNumber();
            model.addRow(row);

        } catch (Exception e) {
            return;
        }
    }

    private void populateHealthTable() {
        try {
            ChildHealthAttributes cha = (ChildHealthAttributes) tblHealthCareHeadWorkRequest.getValueAt(tblHealthCareHeadWorkRequest.getSelectedRow(), 0);
            DefaultTableModel model = (DefaultTableModel) tblChildHealthDetails.getModel();
            model.setRowCount(0);
            Object[] row = new Object[4];
            row[0] = cha.getTypeOfDisease();
            row[1] = cha.getDiseasePeriod();
            row[2] = cha.getChildPhysicianName();
            row[3] = cha.getChildPhysicianLocation();
            model.addRow(row);
        } catch (Exception e) {
            return;
        }
    }
}