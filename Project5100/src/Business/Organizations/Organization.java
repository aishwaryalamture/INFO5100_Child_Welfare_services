/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Users.User;
import Business.WorkQueue.WorkQueue;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class Organization {
    
    public Organization(int id) {
        this.organizationId = id++;
    }
    
    private String organizationName;
    private String organizationAdminName;
    private User organizationAdmin;
    private String organizationUsername;
    private String password;
    private int organizationId; 
    private WorkQueue workQueue;
}
