/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Role.Role;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class User {
    
    public User(int id) {
        this.userId = id+1;
    }
    
    private Role role;
    private String firstName;
    private String lastName;   
    private String location;
    private String mobileNumber;
    private String username;
    private String password;
    private int userId;
    private String fullName;
    private String emailId;
    //to-do Ketki
    
    public String getFullName() {
        return firstName+" "+lastName;
    }
}
