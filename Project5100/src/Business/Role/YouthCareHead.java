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
import userinterface.AdoptionServicesHead.AdoptionServicesHeadWorkArea;
import userinterface.YouthServicesHead.YouthServicesHeadWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class YouthCareHead extends Role {

    RoleType roleType;

    public YouthCareHead() {
        roleType = RoleType.YouthCareHead;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return new YouthServicesHeadWorkArea(userProcessContainer, entity, organization,
                enterprise, user);
    }

    @Override
    public RoleType getRoleType() {
        return roleType;
    }
}
