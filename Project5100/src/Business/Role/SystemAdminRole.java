/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprises.Enterprise;
import Business.Entity;
import Business.Organizations.Organization;
import Business.Users.User;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class SystemAdminRole extends Role {

    RoleType roleType;

    public SystemAdminRole() {
        roleType = RoleType.SystemAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return new SystemAdminWorkAreaJPanel(userProcessContainer, entity, user);
    }

    @Override
    public RoleType getRoleType() {
        return roleType;
    }
}
