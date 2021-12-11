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
public class SystemAdminRole extends Role{

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User userAccount, Entity entity) {
                return new SystemAdminWorkAreaJPanel(userProcessContainer,userAccount,entity);

    }
}
