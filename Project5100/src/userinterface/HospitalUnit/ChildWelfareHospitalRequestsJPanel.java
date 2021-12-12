/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalUnit;

import userinterface.PoliceWorkArea.*;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.Users.User;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.UtilityClass;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class ChildWelfareHospitalRequestsJPanel extends javax.swing.JPanel {

    private JPanel displayPanel;
    private Entity entity;
    private User user;
    private Enterprise enterprise;

    /**
     * Creates new form ChildWelfarePoliceRequestsJPanel
     */
    public ChildWelfareHospitalRequestsJPanel(JPanel displayPanel, Entity entity, Enterprise enterprise, User user) {
        initComponents();
        this.displayPanel = displayPanel;
        this.entity = entity;
        this.user = user;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable() {
        //Organization selectedOrganization = enterprise.getOrganizationDirectory().getOrganizationList().get(comboOrganization.getSelectedIndex());

        DefaultTableModel delModel = (DefaultTableModel) tblRequest.getModel();
        delModel.setRowCount(0);
        ArrayList<WorkRequest> workRequestList = entity.getWorkQueue().getWorkRequestList();
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest.getReceiver().getRole().getRoleType() == Role.RoleType.HospitalAdmin) {
                Object[] row = new Object[2];
                row[0] = workRequest;
                row[1] = workRequest.getStatus();
                delModel.addRow(row);
            }
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Police Work Area");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 74, 310, 53));

        tblRequest.setBorder(new javax.swing.border.MatteBorder(null));
        tblRequest.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Request Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.setSelectionBackground(new java.awt.Color(117, 177, 169));
        jScrollPane5.setViewportView(tblRequest);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 1007, 208));

        btnDetails.setBackground(new java.awt.Color(217, 180, 74));
        btnDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDetails.setText("Details");
        btnDetails.setContentAreaFilled(false);
        btnDetails.setMaximumSize(new java.awt.Dimension(115, 49));
        btnDetails.setMinimumSize(new java.awt.Dimension(115, 49));
        btnDetails.setOpaque(true);
        btnDetails.setPreferredSize(new java.awt.Dimension(115, 49));
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest workRequest = (WorkRequest) tblRequest.getValueAt(selectedRow, 0);

        HospitalUnitRequestDetails requestDetails = new HospitalUnitRequestDetails(displayPanel, entity, enterprise, user, workRequest);
        displayPanel.add(requestDetails);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
}