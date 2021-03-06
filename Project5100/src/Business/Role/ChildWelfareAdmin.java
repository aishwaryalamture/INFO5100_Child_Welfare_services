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
import userinterface.ChildWelfareAdmin.ChildWelfareAdminWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */

public class ChildWelfareAdmin extends Role {
    
    RoleType roleType;
    public ChildWelfareAdmin() {
        roleType = RoleType.ChildWelfareAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization, 
            Enterprise enterprise, User user) {

        return new ChildWelfareAdminWorkArea(userProcessContainer,entity,enterprise,user);
    }
    
     @Override
    public RoleType getRoleType(){
        return roleType;
    }
}
