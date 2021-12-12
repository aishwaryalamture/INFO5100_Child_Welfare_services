/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InternationalOrganizationCollaboration;

import Business.WorkQueue.WorkRequest;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class InternationalOrganizationCollaborationAttributes extends WorkRequest {
    private String organizationName;
    private String organizationInternationalId;
    private String organizationCity;
    private String organizationCountry;
    private String organizationType;
    private String organizationEmail;
    private String remarks;
    private String preferredCollaborationCountry;
}
