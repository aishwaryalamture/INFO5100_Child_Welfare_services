/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Entity;
import Business.Users.User;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class AgencyAdmin extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Entity system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
