/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprises.EnterpriseDirectory;
import Business.Users.UserDirectory;
import Business.Validator.Validator;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ChildWelfareServicesTeam
 */
@Getter
@Setter
public class Entity {

    private static Entity entity;
    private EnterpriseDirectory enterpriseDirectory;
    private UserDirectory userDirectory;
    private Validator validator;

    public Entity(EnterpriseDirectory enterpriseDirectory, UserDirectory userDirectory, Validator validator) {

        this.enterpriseDirectory = enterpriseDirectory;
        this.userDirectory = userDirectory;
        this.validator = validator;
    }

    private Entity() {
        enterpriseDirectory = new EnterpriseDirectory();
        userDirectory = new UserDirectory();
        validator = new Validator();
    }

    public static Entity getInstance() {
        if (entity == null) {
            entity = new Entity();
        }
        return entity;
    }
}
