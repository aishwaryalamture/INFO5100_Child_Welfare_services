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
import userinterface.HealthCareHead.HealthCareHeadWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class HealthcareHeadRole extends Role {

    RoleType roleType;

    public HealthcareHeadRole() {
        roleType = RoleType.HealthcareHeadRole;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return new HealthCareHeadWorkArea(userProcessContainer, entity, organization, enterprise, user);
    }

    @Override
    public RoleType getRoleType() {
        return roleType;
    }
}
