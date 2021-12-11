/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class UserDirectory {
    
    private int lastId = 0;
    
    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
     public User authenticateUser(String username, String password){
        for (User ua : userList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User createUserAccount(String firstName, String lastName,String location, String mobileNumber,
            String username, String password,String emailId, Role role){
        
        User user = new User(lastId);
        user.setRole(role);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setLocation(location);
        user.setMobileNumber(mobileNumber);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmailId(emailId);
        lastId = user.getUserId();
        userList.add(user);
        return user;
    }
}
