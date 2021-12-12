/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.YouthCare;

import Business.WorkQueue.WorkRequest;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class YouthCareAttributes extends WorkRequest {
    
    private String fullName;
    private String location;
    private int age;
    private LocalDate dateOfBirth;
    private String gender;
    private String remarks;
    private String preferredAgencyLocation;
    private String legalGuardianName;
    private String legalGuardianMobile;
    private String previousYouthCareAgency;
    private String schoolName;
    private String grade;
    
}
