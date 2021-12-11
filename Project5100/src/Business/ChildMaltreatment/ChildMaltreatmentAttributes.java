/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChildMaltreatment;

import Business.WorkQueue.WorkRequest;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class ChildMaltreatmentAttributes extends WorkRequest {
   
    private String fullNameVictim;
    private String locationVictim;
    private String relationshipVictimOffender;
    private int ageVictim;
    private String remarks;
    private String genderVictim;
    private String typeOfAbuse;
      
}
