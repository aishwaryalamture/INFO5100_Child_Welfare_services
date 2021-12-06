package Business;

import Business.Role.SystemAdminRole;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class ConfigureASystem {
    
    public static Entity configure(){
        
    Entity entity = Entity.getInstance();
    
    //create a system admin profile on start of the project
    entity.getUserDirectory().createUserAccount("system","admin","boston",
            "9875436787","sysadmin","sysadmin", new SystemAdminRole());
        
    return entity;
    
    }
    
}
