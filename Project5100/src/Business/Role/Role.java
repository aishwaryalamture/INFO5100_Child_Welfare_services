/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprises.EnterpriseDirectory;
import Business.Entity;
import Business.Users.User;
import javax.swing.JPanel;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public abstract class Role {
    
    public enum RoleType{
        
        SafetyHead("SafetyHead"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User userAccount,  
            Entity entity);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}