/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Users.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class SysAdminRolesWorkArea extends javax.swing.JPanel {

    private JPanel enterprisePanel;
    private Entity entity;
    private User user;
    private static final int CREATE_OPERATION = 0;
    private static final int UPDATE_OPERATION = 1;

    /**
     * Creates new form SysAdminRolesWorkArea
     */
    public SysAdminRolesWorkArea(JPanel displayPanel, User user, Entity entity) {
        initComponents();
        this.enterprisePanel = displayPanel;
        this.entity = entity;
        this.user = user;
        populateTable();
    }

    public void populateTable() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");

        DefaultTableModel model = (DefaultTableModel) tblAdminRoles.getModel();
        model.setRowCount(0);
        ArrayList<Enterprise> enterprises = new ArrayList<>();
        for (Enterprise enterprise : entity.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getAdmin() != null) {
                Object[] row = new Object[3];

                row[0] = enterprise;
                row[1] = enterprise.getEnterpriseName();
                row[2] = enterprise.getAdmin().getFullName();
                model.addRow(row);
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

        jScrollPane5 = new javax.swing.JScrollPane();
        tblAdminRoles = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitleAdminRoles = new javax.swing.JLabel();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAdminRoles.setBorder(new javax.swing.border.MatteBorder(null));
        tblAdminRoles.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        tblAdminRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Registration No", " Enterprise Name", "Admin Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdminRoles.setSelectionBackground(new java.awt.Color(117, 177, 169));
        jScrollPane5.setViewportView(tblAdminRoles);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 1007, 208));

        btnCreate.setBackground(new java.awt.Color(217, 180, 74));
        btnCreate.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("CREATE");
        btnCreate.setContentAreaFilled(false);
        btnCreate.setOpaque(true);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 454, 115, 49));

        btnUpdate.setBackground(new java.awt.Color(217, 180, 74));
        btnUpdate.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setOpaque(true);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 454, 115, 49));

        btnDelete.setBackground(new java.awt.Color(217, 180, 74));
        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setOpaque(true);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 454, 115, 49));

        lblTitleAdminRoles.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitleAdminRoles.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleAdminRoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAdminRoles.setText("Admin Roles");
        lblTitleAdminRoles.setMaximumSize(new java.awt.Dimension(210, 34));
        lblTitleAdminRoles.setMinimumSize(new java.awt.Dimension(210, 34));
        lblTitleAdminRoles.setPreferredSize(new java.awt.Dimension(280, 34));
        add(lblTitleAdminRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, 53));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateUpdateAdminRolesJPanel createUpdateAdminRoles = new CreateUpdateAdminRolesJPanel(enterprisePanel, user, entity, CREATE_OPERATION, null, null);
        enterprisePanel.add(createUpdateAdminRoles);
        CardLayout layout = (CardLayout) enterprisePanel.getLayout();
        layout.next(enterprisePanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdminRoles.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Enterprise enterprise = (Enterprise) tblAdminRoles.getValueAt(selectedRow, 0);
        User adminUser = enterprise.getAdmin();
        enterprise.setAdmin(null);
        entity.getUserDirectory().getUserList().remove(adminUser);
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAdminRoles.getSelectedRow();
        Enterprise enterprise = (Enterprise) tblAdminRoles.getValueAt(selectedRow, 0);

        CreateUpdateAdminRolesJPanel createUpdateAdminRoles = new CreateUpdateAdminRolesJPanel(enterprisePanel, enterprise.getAdmin(), entity, UPDATE_OPERATION, enterprise, enterprise.getAdmin().getRole());
        enterprisePanel.add(createUpdateAdminRoles);
        CardLayout layout = (CardLayout) enterprisePanel.getLayout();
        layout.next(enterprisePanel);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitleAdminRoles;
    private javax.swing.JTable tblAdminRoles;
    // End of variables declaration//GEN-END:variables
}