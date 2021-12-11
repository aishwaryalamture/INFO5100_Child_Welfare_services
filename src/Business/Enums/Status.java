/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enums;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class Status {
    
    public enum StatusType {
    INPROGRESS("In Progress"),
    RESOLVED("Resolved"), 
    NEW("New"),
    USERACTIONPENDING("User Action Pending"); 
    
    private String value;
        
        private StatusType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
}
