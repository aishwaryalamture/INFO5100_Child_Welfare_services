/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organizations.OrganizationDirectory;
import Business.Users.User;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Setter
@Getter
public class Enterprise {
    
    public Enterprise(int id) {
        this.enterpriseId = id+1;
    }

    private String enterpriseName;
    private String enterpriseDesciption;
    private String enterpriseAdminName;
    private String enterpriseRegistrationNo;
    private User admin;
    private String enterpriseUsername;
    private String password;
    private int enterpriseId;
    private OrganizationDirectory organizationDirectory;
    
    @Override
    public String toString() {
        return enterpriseRegistrationNo;
    }
}
