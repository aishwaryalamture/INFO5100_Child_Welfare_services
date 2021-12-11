/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Users.User;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class WorkRequest {
    
    private String message;
    private LocalDate resolveDate;
    private User sender;
    private User receiver;
    private String status;
    private LocalDate requestDate;
    private int organizationId;
    private int enterpriseId;
    
}
