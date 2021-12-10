/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Entity;
import Business.Users.User;
import javax.swing.JPanel;
import userinterface.SafetyHeadWorkArea.SafetyHeadAdminWorkArea;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class SafetyHeadRole extends Role {

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User userAccount, Entity entity) {
        
        return new SafetyHeadAdminWorkArea(userProcessContainer, userAccount, entity);
    }
}
