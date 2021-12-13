/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.regex.Pattern;
import org.apache.log4j.Logger;


/**
 *
 * @author ChildWelfareServicesTeam
 */
public class Validator {

    private static Validator validator;
    //initializing the logger
    static Logger log = Logger.getLogger(Validator.class.getName());

    public static Validator getInstance() {
        if (validator == null) {
            validator = new Validator();
        }
        return validator;
    }

    private Validator() {

    }

    public boolean validateEmailAddr(String emailId) {
        String emailIdRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        if (Pattern.matches(emailIdRegex, emailId)) {
            return true;
        } else {
            log.error("invalid input - email address: "+ emailId);
            return false;
        }
    }

    public boolean validatePincode(String pincode) {
        String pinCodeRegex = "^[0-9]{5}(?:-[0-9]{4})?$";
        if (Pattern.matches(pinCodeRegex, pincode)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validateDob(String dob) {
        String dobRegex = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
        if (Pattern.matches(dobRegex, dob)) {
            return true;
        } else {
            log.error("invalid input - date of birth: "+ dob);
            return false;
        }
    }

    public boolean validateTelNum(String telPhone) {
        String telNumberRegex = "\\d{10}";
        if (Pattern.matches(telNumberRegex, telPhone)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateFaxNum(String faxNum) {
        String faxNumberRegex = "\\d{10}";
        if (Pattern.matches(faxNumberRegex, faxNum)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateSSN(String socialSecurityNum) {
        String ssnRegex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
        if (Pattern.matches(ssnRegex, socialSecurityNum)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateMedicalRecordNum(String medicalRecordNum) {
        String medicalRecordRegex = "^\\d{6}$";
        if (Pattern.matches(medicalRecordRegex, medicalRecordNum)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateIPAddress(String ipAddress) {
        String ipAddrRegex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        if (Pattern.matches(ipAddrRegex, ipAddress)) {
            return true;
        } else {
            return false;
        }
    }

    public LocalDateTime convertStringToDateTime(String strDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(strDate, formatter);
        return date;
    }

    public LocalDate convertStringToDate(String strDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(strDate, formatter);
        return date;

    }

    public String convertLocalDateToString(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return date.format(formatter);

    }
    
    public String convertLocalDateToString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return date.format(formatter);

    }

    public boolean validateAllDigits(String input) {
        String inputRegex = "^[0-9]*$";
        if (Pattern.matches(inputRegex, input)) {
            return true;
        } else {
            log.error("invalid input - inputted value : "+ input+ " - digits only value expected");
            return false;
        }

    }

}