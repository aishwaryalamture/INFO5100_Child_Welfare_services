/*
 * To change this template, choose Tools | Templates
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
public class PoliceDeptAdmin extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Entity system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
