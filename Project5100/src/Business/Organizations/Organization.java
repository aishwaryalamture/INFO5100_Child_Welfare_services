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
        this.organizationId = id+1;
    }

    private String organizationName;
    private String organizationAdminName;
    private String organizationDesciption;
    private User organizationAdmin;
    private String organizationUsername;
    private String password;
    private int organizationId;
    private String organizationRegistrationNo;

    private WorkQueue workQueue;
    
    @Override
    public String toString() {
        return organizationRegistrationNo;
    }
}
