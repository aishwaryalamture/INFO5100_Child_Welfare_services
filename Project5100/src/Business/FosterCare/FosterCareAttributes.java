/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FosterCare;

import Business.WorkQueue.WorkRequest;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class FosterCareAttributes extends WorkRequest {
    
    private String childFullName;
    private String childLocation;
    private int childAge;
    private String childGender;
    private String remarks;
    private String race;
    private String ethnicity;
    private String preferredAgencyLocation;
    private String legalGuardianName;
    private String legalGuardianMobile;
    private String legalGuardianEmail;
    private String legalGuardianLocation;
    private boolean isOpenToAdoption;
    private int temporaryStayExpectedDays;
    
}
