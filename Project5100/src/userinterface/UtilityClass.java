/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

/**
 *
 * @author ChildWelfareServicesTeam
 */
public class UtilityClass {

    private static UtilityClass utiltyClass;

    public static UtilityClass getInstance() {
        if (utiltyClass == null) {
            utiltyClass = new UtilityClass();
        }
        return utiltyClass;
    }

    public enum ChildWelfareOrganizations {
        ChildMaltreatment("Child Maltreatment"),
        ChildHealth("Child Health");

        private String value;

        private ChildWelfareOrganizations(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Enterprises {
        ChildWelfare("Child Welfare Services"),
        PoliceDept("Police Department"),
        HospitalChildCareUnit("Hospital Child Care Unit"),
        AdoptionAgency("Adoption Agency");
        private String value;

        private Enterprises(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
