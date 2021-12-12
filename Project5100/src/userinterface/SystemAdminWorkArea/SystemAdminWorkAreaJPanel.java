/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Entity;

import Business.Organizations.Organization;
import Business.Users.User;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel displayPanel;
    private Entity entity;
    private User user;

    public SystemAdminWorkAreaJPanel(JPanel displayPanel, Entity entity, User user) {
        initComponents();
        this.displayPanel = displayPanel;
        this.entity = entity;
        this.user = user;
        loadView();

    }

    private void loadView() {
        int selectedIndex = jTabbedSystemAdmin.getSelectedIndex();
        if (selectedIndex == 0 || selectedIndex == -1) {
            SysAdminEnterprisesWorkArea adminEnterpriseWorkArea = new SysAdminEnterprisesWorkArea(jPanelEnterprise, user, entity);
            jPanelEnterprise.add(adminEnterpriseWorkArea);
            CardLayout cardLayout = (CardLayout) jPanelEnterprise.getLayout();
            cardLayout.next(jPanelEnterprise);
        } else {
            SysAdminRolesWorkArea adminRolesWorkArea = new SysAdminRolesWorkArea(jPanelAdminRoles, user, entity);
            jPanelAdminRoles.add(adminRolesWorkArea);
            CardLayout cardLayout = (CardLayout) jPanelAdminRoles.getLayout();
            cardLayout.next(jPanelAdminRoles);
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

        jTabbedSystemAdmin = new javax.swing.JTabbedPane();
        jPanelEnterprise = new javax.swing.JPanel();
        jPanelAdminRoles = new javax.swing.JPanel();

        setBackground(new java.awt.Color(172, 208, 192));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 180, 74), 4));
        setLayout(new java.awt.BorderLayout());

        jTabbedSystemAdmin.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedSystemAdmin.setToolTipText("Manage Enterprises");
        jTabbedSystemAdmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedSystemAdminStateChanged(evt);
            }
        });

        jPanelEnterprise.setBackground(new java.awt.Color(172, 208, 192));
        jPanelEnterprise.setPreferredSize(new java.awt.Dimension(1030, 700));
        jPanelEnterprise.setLayout(new java.awt.CardLayout());
        jTabbedSystemAdmin.addTab("Enterprise ", new javax.swing.ImageIcon(getClass().getResource("/res/enterprise_logo.png")), jPanelEnterprise); // NOI18N

        jPanelAdminRoles.setBackground(new java.awt.Color(172, 208, 192));
        jPanelAdminRoles.setLayout(new java.awt.CardLayout());
        jTabbedSystemAdmin.addTab("Admin Roles", new javax.swing.ImageIcon(getClass().getResource("/res/admin_logo.png")), jPanelAdminRoles); // NOI18N

        add(jTabbedSystemAdmin, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedSystemAdminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedSystemAdminStateChanged
        // TODO add your handling code here:
        if (entity != null) {
            loadView();
        }
    }//GEN-LAST:event_jTabbedSystemAdminStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAdminRoles;
    private javax.swing.JPanel jPanelEnterprise;
    private javax.swing.JTabbedPane jTabbedSystemAdmin;
    // End of variables declaration//GEN-END:variables
}
