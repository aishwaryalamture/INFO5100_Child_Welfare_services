/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Organizations.Organization;
import Business.Users.User;
import javax.swing.JPanel;
import userinterface.AdoptionAgency.AdoptionAgencyWorkArea;
import userinterface.HospitalUnit.HospitalUnitWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class AdoptionAgencyAdmin extends Role {

    Role.RoleType roleType;

    public AdoptionAgencyAdmin() {
        roleType = Role.RoleType.PoliceDeptAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return new AdoptionAgencyWorkArea(userProcessContainer, entity, enterprise, user);
    }

    @Override
    public Role.RoleType getRoleType() {
        return roleType;
    }
}
