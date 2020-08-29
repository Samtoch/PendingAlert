/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Mailer.EmailUtility;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author samuel
 */
public class MailType {

    public static void sendMail() {
        
        String user = "engineertbush@gmail.com";
        String host = "smtp.gmail.com";        
        String pass = "georgebush";
        String port = "587";        
        
        String recipient = "samueltochi1@gmail.com";
        String subject = "PENDING ALERT";
        String content = "Hi Please Quickly Work on Your Pending...";
        try {
            EmailUtility.sendEmail(host, port, user, pass, recipient, subject, content);
        } catch (MessagingException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(MailType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
