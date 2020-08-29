package javapenalert;

import dao.MailType;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author samuel
 */
public class ScheduledTask extends TimerTask{
    Date now;
    
    public void run(){
        now = new Date();
	System.out.println("Time is :" + now);  
        MailType.sendMail();
    }
    
}
