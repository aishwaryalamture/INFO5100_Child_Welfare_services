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

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class VolunteerHead extends Role {

    RoleType roleType;

    public VolunteerHead() {
        roleType = RoleType.VolunteerHead;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization,
            Enterprise enterprise, User user) {

        return null;
    }

    @Override
    public RoleType getRoleType() {
        return roleType;
    }
}

