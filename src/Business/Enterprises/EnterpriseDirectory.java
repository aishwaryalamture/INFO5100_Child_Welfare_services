/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organizations.OrganizationDirectory;
import Business.Role.Role;
import Business.Users.User;
import java.util.ArrayList;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class EnterpriseDirectory {

    private int lastId = 0;

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createEnterprise(String enterpriseName, String enterpriseDesc, String registrationNo) {

        Enterprise enterprise = new Enterprise(lastId);
        enterprise.setEnterpriseName(enterpriseName);
        enterprise.setEnterpriseDesciption(enterpriseDesc);
        enterprise.setEnterpriseRegistrationNo(registrationNo);

        OrganizationDirectory orgDirectory = new OrganizationDirectory();
        enterprise.setOrganizationDirectory(orgDirectory);

        lastId = enterprise.getEnterpriseId();
        enterpriseList.add(enterprise);
        return enterprise;
    }

}
