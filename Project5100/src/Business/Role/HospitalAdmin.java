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
import userinterface.HospitalUnit.HospitalUnitWorkArea;
import userinterface.PoliceWorkArea.PoliceWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class HospitalAdmin extends Role {

    Role.RoleType roleType;

    public HospitalAdmin() {
        roleType = Role.RoleType.HospitalAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return new HospitalUnitWorkArea(userProcessContainer, entity, enterprise, user);
    }

    @Override
    public Role.RoleType getRoleType() {
        return roleType;
    }
}
