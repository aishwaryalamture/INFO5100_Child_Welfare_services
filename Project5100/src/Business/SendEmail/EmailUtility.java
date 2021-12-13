/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SendEmail;


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author ChildWelfareServicesTeam
 */

public class EmailUtility {

    
    
    
    private static javax.mail.Authenticator authenticator;
    
    public static void SendMail (String toAddress,String emailmsg,String emailsubject)
    {
        try {
            Properties properties =new Properties();
            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.starttls.enable","true");
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.put("mail.smtp.port","587");
            
            String myAccountEmail= "ashsawant3011@gmail.com";
            String password = "Parnika@1111";
            
            Session session;
            session = Session.getInstance(properties, new javax.mail.Authenticator() {
                
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(myAccountEmail, password);
                }
                
            });
            
            Message message= prepareMessage(session,myAccountEmail,toAddress,emailmsg,emailsubject);
            
            
            Transport.send(message);
            // System.out.println("Successful sent");
        } catch (MessagingException ex) {
            Logger.getLogger(EmailUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
  
    private  static Message prepareMessage(Session session, String myAccountEmail , String toAddress,String emailmsg, String emailsubject)
    {
        
            
        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message.setSubject(emailsubject);
            message.setText(emailmsg);
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(EmailUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
           return null;
    
    }
    
    
    
    
    
}
