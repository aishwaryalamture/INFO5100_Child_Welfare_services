/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthCareHead;

import Business.ChildHealth.ChildHealthAttributes;
import Business.ChildMaltreatment.ChildMaltreatmentAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.Users.User;
import Business.WorkQueue.WorkRequest;
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

        btnAssignToChildWelfareOfficer3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChildDetails = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHealthCareHeadWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChildHealthDetails = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAssignToChildWelfareOfficer3.setBackground(new java.awt.Color(217, 180, 74));
        btnAssignToChildWelfareOfficer3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnAssignToChildWelfareOfficer3.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToChildWelfareOfficer3.setText("Assign to Child Welfare Officer");
        btnAssignToChildWelfareOfficer3.setContentAreaFilled(false);
        btnAssignToChildWelfareOfficer3.setOpaque(true);
        btnAssignToChildWelfareOfficer3.setPreferredSize(new java.awt.Dimension(210, 34));
        btnAssignToChildWelfareOfficer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToChildWelfareOfficer3ActionPerformed(evt);
            }
        });
        add(btnAssignToChildWelfareOfficer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 232, -1));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 747, 42));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 747, 91));

        jLabel1.setText("Child Details:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, -1, -1));

        jLabel2.setText("Child Health Details:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 382, -1, -1));

        tblChildHealthDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Disease", "Disease Period", "Physician Name", "Physician Location", "Last Checkup Date", "Mental Health Diagnosis Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblChildHealthDetails);
        if (tblChildHealthDetails.getColumnModel().getColumnCount() > 0) {
            tblChildHealthDetails.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 413, 747, 42));

        jLabel3.setText("Work Requests: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, -1, -1));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("HealthCare Head WorkArea");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 33, 408, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToChildWelfareOfficer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToChildWelfareOfficer3ActionPerformed
        ChildMaltreatmentAttributes cma = (ChildMaltreatmentAttributes) tblHealthCareHeadWorkRequest.getValueAt(tblHealthCareHeadWorkRequest.getSelectedRow(), 0);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblChildDetails;
    private javax.swing.JTable tblChildHealthDetails;
    private javax.swing.JTable tblHealthCareHeadWorkRequest;
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
            Object[] row = new Object[5];
            row[0] = cha.getTypeOfDisease();
            row[1] = cha.getDiseasePeriod();
            row[2] = cha.getChildPhysicianName();
            row[3] = cha.getChildPhysicianLocation();
            row[4] = cha.getLastCheckUpDate();
            model.addRow(row);
        } catch (Exception e) {
            return;
        }
    }
}
