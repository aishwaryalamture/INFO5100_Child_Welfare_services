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
import userinterface.InternationalOrganizationCollaborationHead.InternationalOrganizationCollaborationHeadWorkArea;
import userinterface.SafetyHeadWorkArea.SafetyHeadAdminWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class IntDeptAdmin extends Role {

    RoleType roleType;

    public IntDeptAdmin() {
        roleType = RoleType.IntDeptAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return new InternationalOrganizationCollaborationHeadWorkArea(userProcessContainer, entity, organization,
                enterprise, user);
    }

    @Override
    public RoleType getRoleType() {
        return roleType;
    }
}
