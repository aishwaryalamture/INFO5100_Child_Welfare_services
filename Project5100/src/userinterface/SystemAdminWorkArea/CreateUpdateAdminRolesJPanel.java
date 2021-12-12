/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Role.ChildWelfareAdmin;
import Business.Role.PoliceDeptAdmin;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Users.User;
import Business.Validator.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.UtilityClass;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class CreateUpdateAdminRolesJPanel extends javax.swing.JPanel {

    private JPanel enterprisePanel;
    private Entity entity;
    private User user;
    private static final int CREATE_OPERATION = 0;
    private static final int UPDATE_OPERATION = 1;
    private int operationId;
    private Enterprise enterprise;
    private Role role;

    /**
     * Creates new form CreateUpdateAdminRolesJPanel
     */
    public CreateUpdateAdminRolesJPanel(JPanel enterprisePanel, User user, Entity entity, int operationId, Enterprise enterprise, Role role) {
        initComponents();
        this.enterprisePanel = enterprisePanel;
        this.entity = entity;
        this.user = user;
        this.operationId = operationId;
        this.enterprise = enterprise;
        loadData();
    }

    private void loadData() {
        for (Enterprise p : entity.getEnterpriseDirectory().getEnterpriseList()) {
            comboEnterprise.addItem(p.getEnterpriseName());
            if (operationId == UPDATE_OPERATION && p.getEnterpriseName().equals(enterprise.getEnterpriseName())) {
                comboEnterprise.setSelectedItem(p.getEnterpriseName());
            }
        }
        if (operationId == UPDATE_OPERATION) {
            btnCreate.setText("Update");
            lblTitle.setText("Update Admin");
            txtFirstName.setText(user.getFirstName());
            txtLastName.setText(user.getLastName());
            txtLocation.setText(user.getLocation());
            txtMobileNo.setText(user.getMobileNumber());
            txtUsername.setText(user.getUsername());
            txtPassword.setText(user.getPassword());
            txtEmail.setText(user.getEmailId());
            comboEnterprise.setEnabled(false);
            
        }

        //loadMapData();
    }

    private void loadMapData() {
        JFrame test = new JFrame("Google Maps");

        try {
            String latitude = "40.714728";
            String longitude = "-73.998672";

            String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
                    + latitude
                    + ","
                    + longitude
                    + "&zoom=11&size=612x612&scale=2&maptype=roadmap";
            String destinationFile = "image.jpg";

            // read the map image from Google
            // then save it to a local file: image.jpg
            //
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // create a GUI component that loads the image: image.jpg
        //
        ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
                .getImage().getScaledInstance(630, 600,
                        java.awt.Image.SCALE_SMOOTH));
        test.add(new JLabel(imageIcon));

        // show the GUI window
        test.setVisible(true);
        test.pack();
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
        btnBack = new javax.swing.JButton();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblFirstName1 = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(172, 208, 192));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Admin");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 74, 280, 49));

        btnBack.setBackground(new java.awt.Color(217, 180, 74));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" <<Back");
        btnBack.setContentAreaFilled(false);
        btnBack.setOpaque(true);
        btnBack.setPreferredSize(new java.awt.Dimension(210, 34));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 74, 115, 49));

        lblFirstName.setText("First Name:");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 234, 111, 34));

        txtFirstName.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 232, 155, 38));

        lblLastName.setText("Last Name:");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 283, 111, 34));

        txtLastName.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 281, 155, 38));

        txtLocation.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 330, 155, 38));

        lblLocation.setText("Location:");
        add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 332, 111, 34));

        lblMobileNo.setText("Mobile Number:");
        add(lblMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 381, 111, 34));

        txtMobileNo.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 379, 155, 38));

        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 430, 111, 34));

        txtUsername.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 428, 155, 38));

        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 479, 111, 34));

        txtPassword.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 477, 155, 38));

        lblEmail.setText("Email Id:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 528, 111, 34));

        txtEmail.setSelectionColor(new java.awt.Color(117, 177, 169));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 526, 155, 38));

        btnCreate.setBackground(new java.awt.Color(217, 180, 74));
        btnCreate.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setContentAreaFilled(false);
        btnCreate.setOpaque(true);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 616, 115, 49));

        lblFirstName1.setText("Select Enterprise:");
        add(lblFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 185, 111, 34));

        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 183, 155, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        enterprisePanel.remove(this);
        Component[] componentArray = enterprisePanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminRolesWorkArea workArea = (SysAdminRolesWorkArea) component;
        workArea.populateTable();
        CardLayout layout = (CardLayout) enterprisePanel.getLayout();
        layout.previous(enterprisePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        //Validate for emtpy fields
        if (txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtLocation.getText().isEmpty() || txtEmail.getText().isEmpty() || txtPassword.getText().isEmpty()
                || txtMobileNo.getText().isEmpty() || txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields ", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.getInstance().validateEmailAddr(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.getInstance().validateTelNum(txtMobileNo.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Tel No ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
            return;
        }

        switch (operationId) {
            case CREATE_OPERATION:
                //validate for multiple entries with same username
                for (User ur : entity.getUserDirectory().getUserList()) {
                    if (ur.getUsername().equals(txtUsername.getText())) {
                        JOptionPane.showMessageDialog(null, "User Name Already Exists ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                Enterprise selectedEnterprise = entity.getEnterpriseDirectory().getEnterpriseList().get(comboEnterprise.getSelectedIndex());
                //admin already exists for this enterprise 
                if (selectedEnterprise.getAdmin() != null) {
                    JOptionPane.showMessageDialog(null, "Admin Already Exists For This Enterprise", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Role role = new ChildWelfareAdmin();
                if (selectedEnterprise.getEnterpriseName().equals(UtilityClass.Enterprises.ChildWelfare.getValue())) {
                    role = new ChildWelfareAdmin();

                } else if (selectedEnterprise.getEnterpriseName().equals(UtilityClass.Enterprises.PoliceDept.getValue())) {
                    role = new PoliceDeptAdmin();
                }

                User user = entity.getUserDirectory().createUserAccount(txtFirstName.getText(), txtLastName.getText(), txtLocation.getText(),
                        txtMobileNo.getText(), txtUsername.getText(), txtPassword.getText(), txtEmail.getText(), role);
                selectedEnterprise.setAdmin(user);

                JOptionPane.showMessageDialog(null, "New Admin Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnBack.doClick();
                break;
            case UPDATE_OPERATION:
                //validate if new username is updated to other entries with same username
                for (User ur : entity.getUserDirectory().getUserList()) {
                    if (ur.getUsername().equals(txtUsername.getText()) && !txtUsername.getText().equals(this.user.getUsername())) {
                        JOptionPane.showMessageDialog(null, "User Name Already Exists ", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                for (User ur : entity.getUserDirectory().getUserList()) {
                    if (ur.getUserId() == this.user.getUserId()) {
                        ur.setEmailId(txtEmail.getText());
                        ur.setFirstName(txtFirstName.getText());
                        ur.setLastName(txtLastName.getText());
                        ur.setLocation(txtLocation.getText());
                        ur.setUsername(txtUsername.getText());
                        ur.setPassword(txtPassword.getText());
                        ur.setMobileNumber(txtMobileNo.getText());
                        
                    }
                }

                JOptionPane.showMessageDialog(null, "Admin Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnBack.doClick();

                break;
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comboEnterprise;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
