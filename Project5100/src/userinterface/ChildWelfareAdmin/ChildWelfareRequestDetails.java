/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ChildWelfareAdmin;

import Business.ChildAdoption.ChildAdoptionAttributes;
import Business.ChildHealth.ChildHealthAttributes;
import Business.ChildHealth.ChildMentalHealthAttributes;
import Business.ChildMaltreatment.ChildMaltreatmentAttributes;
import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Enums.Status;
import Business.FosterCare.FosterCareAttributes;
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
            btnAssignToAdoptionAgency.setVisible(false);
            btnAssignToHospital.setVisible(false);
            btnAssignToPolice.setVisible(true);
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
        
        //showing details of CHildHEalth Organization
        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.ChildHealth.getValue())) {
            btnAssignToAdoptionAgency.setVisible(false);
            btnAssignToHospital.setVisible(true);
            btnAssignToPolice.setVisible(false);
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
            btnAssignToAdoptionAgency.setVisible(false);
            btnAssignToHospital.setVisible(true);
            btnAssignToPolice.setVisible(false);
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
        
        //showing details of Mental Health Organization

        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.MentalHealth.getValue())) {
            btnAssignToAdoptionAgency.setVisible(false);
            btnAssignToHospital.setVisible(true);
            btnAssignToPolice.setVisible(false);
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
        
         if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.AdoptionServices.getValue())) {
            ChildAdoptionAttributes childAttributes = (ChildAdoptionAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = childAttributes.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = childAttributes.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Name";
            row[1] = childAttributes.getChildFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Location";
            row[1] = childAttributes.getChildLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Age";
            row[1] = childAttributes.getChildAge();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Gender";
            row[1] = childAttributes.getChildGender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Race";
            row[1] = childAttributes.getRace();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Ethnicity";
            row[1] = childAttributes.getEthnicity();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Contact No";
            row[1] = childAttributes.getContactNo();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Preferred Agency Location";
            row[1] = childAttributes.getPreferredAgencyLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = childAttributes.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (childAttributes.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getResolveDate());
            } else {
                row[1] = "Yet To Be Resolved";
            }

            delModel.addRow(row);

        }

        if (organization.getOrganizationName().equals(UtilityClass.ChildWelfareOrganizations.FosterCare.getValue())) {
            FosterCareAttributes childAttributes = (FosterCareAttributes) workRequest;
            Object[] row = new Object[2];
            row[0] = "Request Date";
            row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getRequestDate());

            row = new Object[2];
            row[0] = "Status";
            row[1] = childAttributes.getStatus();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Message";
            row[1] = childAttributes.getMessage();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Name";
            row[1] = childAttributes.getChildFullName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Location";
            row[1] = childAttributes.getChildLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Age";
            row[1] = childAttributes.getChildAge();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Gender";
            row[1] = childAttributes.getChildGender();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Race";
            row[1] = childAttributes.getRace();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Child Ethnicity";
            row[1] = childAttributes.getEthnicity();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Name";
            row[1] = childAttributes.getLegalGuardianName();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Contact No";
            row[1] = childAttributes.getLegalGuardianMobile();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Email";
            row[1] = childAttributes.getLegalGuardianMobile();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Legal Guardian Location";
            row[1] = childAttributes.getLegalGuardianLocation();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Open For Adoption";
            String openToAdoption = "No";
            if(childAttributes.isOpenToAdoption()) {
                openToAdoption = "Yes";
            }
            row[1] = openToAdoption;
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Preferred Agency Location";
            row[1] = childAttributes.getPreferredAgencyLocation();
            delModel.addRow(row);
            
            row = new Object[2];
            row[0] = "Temporary Stay Duration";
            row[1] = childAttributes.getTemporaryStayExpectedDays()+"";
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Remarks (Reporting Person)";
            row[1] = childAttributes.getRemarks();
            delModel.addRow(row);

            row = new Object[2];
            row[0] = "Resolve Date";
            if (childAttributes.getResolveDate() != null) {
                row[1] = Validator.getInstance().convertLocalDateToString(childAttributes.getResolveDate());
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
        for (User user : entity.getUserDirectory().getUserList()) {
            if (user.getRole().getRoleType() == Role.RoleType.AdoptionAgencyAdmin) {
                workRequest.setReceiver(user);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Assigned To Adoption Agency", "Success", JOptionPane.INFORMATION_MESSAGE);
        btnBack.doClick();
    }//GEN-LAST:event_btnAssignToAdoptionAgencyActionPerformed

    private void btnAssignToHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToHospitalActionPerformed
        // TODO add your handling code here:
        for (User user : entity.getUserDirectory().getUserList()) {
            if (user.getRole().getRoleType() == Role.RoleType.HospitalAdmin) {
                workRequest.setReceiver(user);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Assigned To Hospital", "Success", JOptionPane.INFORMATION_MESSAGE);
        btnBack.doClick();
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
