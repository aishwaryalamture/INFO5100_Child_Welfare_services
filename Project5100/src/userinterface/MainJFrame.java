/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Entity;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprises.Enterprise;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Users.User;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import userinterface.ChildWelfareAdmin.ChildWelfareHomePage;
import userinterface.SystemUser.CreateSystemUserJPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Entity system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    //initializing the logger
    static Logger log = Logger.getLogger(MainJFrame.class.getName());

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        JLabel picLabel = new JLabel(new ImageIcon(getClass().getResource("/res/cw_front_page.png")));
        picLabel.setPreferredSize(new Dimension(50, 50));
        displayPanel.add(picLabel);
        jSplitPane1.setDividerLocation(300);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lbluserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogout = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        controlPanel.setBackground(new java.awt.Color(117, 177, 169));
        controlPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 195, 170), 4, true));
        controlPanel.setForeground(new java.awt.Color(217, 180, 74));
        controlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(217, 180, 74));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogin.setContentAreaFilled(false);
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        controlPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 220, 55));

        btnRegister.setBackground(new java.awt.Color(217, 180, 74));
        btnRegister.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Home Page");
        btnRegister.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 0), null));
        btnRegister.setContentAreaFilled(false);
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.setMinimumSize(new java.awt.Dimension(53, 27));
        btnRegister.setOpaque(true);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        controlPanel.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 54));

        lbluserName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbluserName.setForeground(new java.awt.Color(255, 255, 255));
        lbluserName.setText("UserName");
        controlPanel.add(lbluserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 40));

        txtUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtUserName.setMinimumSize(new java.awt.Dimension(53, 27));
        txtUserName.setPreferredSize(new java.awt.Dimension(0, 40));
        controlPanel.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 50));

        lblPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        controlPanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 40));

        txtPassword.setMinimumSize(new java.awt.Dimension(6, 27));
        txtPassword.setPreferredSize(new java.awt.Dimension(0, 40));
        controlPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 220, 50));

        btnLogout.setBackground(new java.awt.Color(217, 180, 74));
        btnLogout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogout.setContentAreaFilled(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setMinimumSize(new java.awt.Dimension(53, 27));
        btnLogout.setOpaque(true);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        controlPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 220, 54));

        btnRegister1.setBackground(new java.awt.Color(217, 180, 74));
        btnRegister1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Register");
        btnRegister1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegister1.setContentAreaFilled(false);
        btnRegister1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister1.setMinimumSize(new java.awt.Dimension(53, 27));
        btnRegister1.setOpaque(true);
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        controlPanel.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 220, 54));

        jSplitPane1.setLeftComponent(controlPanel);

        displayPanel.setBackground(new java.awt.Color(172, 208, 192));
        displayPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 195, 170), 4, true));
        displayPanel.setForeground(new java.awt.Color(217, 180, 74));
        displayPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(displayPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = txtUserName.getText();
        char[] passwordCharArr = txtPassword.getPassword();
        String passwordStr = String.valueOf(passwordCharArr);

        User loggedInUser = system.getUserDirectory().authenticateUser(userName, passwordStr);

        if (loggedInUser != null) {
            log.info("logged In username & role - " + userName + "/" + loggedInUser.getRole().getRoleType());
            Enterprise enterprise = null;
            Organization organization = null;
            if (loggedInUser.getRole().getRoleType() == Role.RoleType.SystemAdmin) {
                enterprise = null;
                organization = null;
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.SystemUserRole || loggedInUser.getRole().getRoleType() == Role.RoleType.ChildWelfareAdmin) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        organization = null;
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.SafetyHead) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.SafetyHead) {
                                organization = org;
                            }
                        }
                    }
                }

            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.PoliceDeptAdmin) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.PoliceDept.getValue())) {
                        enterprise = er;
                        organization = null;
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.HospitalAdmin) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.HospitalChildCareUnit.getValue())) {
                        enterprise = er;
                        organization = null;
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.HealthcareHeadRole) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.HealthcareHeadRole) {
                                organization = org;
                            }
                        }
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.VolunteerHead) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.VolunteerHead) {
                                organization = org;
                            }
                        }
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.AdoptionServicesHead) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.AdoptionServicesHead) {
                                organization = org;
                            }
                        }
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.YouthCareHead) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.YouthCareHead) {
                                organization = org;
                            }
                        }
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.FosterCareHead) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.FosterCareHead) {
                                organization = org;
                            }
                        }
                    }
                }
            } else if (loggedInUser.getRole().getRoleType() == Role.RoleType.IntDeptAdmin) {
                for (Enterprise er : system.getEnterpriseDirectory().getEnterpriseList()) {
                    if (er.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                        enterprise = er;
                        for (Organization org : er.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getOrganizationAdmin().getRole().getRoleType() == Role.RoleType.IntDeptAdmin) {
                                organization = org;
                            }
                        }
                    }
                }
            }
            CardLayout cardLayout = (CardLayout) displayPanel.getLayout();
            displayPanel.add("workPanel", loggedInUser.getRole().createWorkArea(displayPanel, system, organization, enterprise, loggedInUser));
            cardLayout.next(displayPanel);
            btnLogout.setEnabled(true);
            btnRegister.setEnabled(false);
            txtUserName.setEnabled(false);
            txtPassword.setEnabled(false);
            btnLogin.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Login Credentials ", "Invalid Credentials", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        ChildWelfareHomePage ChildWelfareHomePage = new ChildWelfareHomePage(displayPanel);
        displayPanel.add(ChildWelfareHomePage);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        btnLogout.setEnabled(false);
        btnRegister.setEnabled(true);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUserName.setText("");
        txtPassword.setText("");

        displayPanel.removeAll();
        JPanel blankJP = new JPanel();
        //displayPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) displayPanel.getLayout();
        crdLyt.next(displayPanel);
        dB4OUtil.storeSystem(system);
        JLabel picLabel = new JLabel(new ImageIcon(getClass().getResource("/res/cw_front_page.png")));
        picLabel.setPreferredSize(new Dimension(50, 50));
        displayPanel.add(picLabel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lbluserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
