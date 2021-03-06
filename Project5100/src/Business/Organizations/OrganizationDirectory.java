/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Users.User;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class OrganizationDirectory {
    
    private int lastId = 0;
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String orgName,String organizationDesc, String registrationNo){
        
        Organization org = new Organization(lastId);
        org.setOrganizationName(orgName);
        org.setOrganizationDesciption(organizationDesc);
        org.setOrganizationRegistrationNo(registrationNo);
        org.setWorkQueue(new WorkQueue());
        lastId = org.getOrganizationId();
        organizationList.add(org);
        return org;
    }
    
}