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

/**
 *
 * @author ChildWelfareServicesTeam
 */
public abstract class Role {
    
    public enum RoleType{
        
        ChildWelfareAdmin("ChildWelfareAdmin"),
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, Entity entity, Organization organization, 
            Enterprise enterprise, User user);


    @Override
    public String toString() {
        return this.getClass().getName();
    }
}