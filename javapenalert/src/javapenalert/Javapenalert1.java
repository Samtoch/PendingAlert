/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package javapenalert;


import dao.DataAccess;
import dao.MailType;
import dbc.dbConn;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PendMirror;

/**
 * @author samuel
 */
public class Javapenalert1 {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        SCANTimer smsTimer = new SCANTimer();

        date.set(Calendar.HOUR, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        smsTimer.scheduleDbScan(date, 30);
    }
}

class SCANTimer {

    Timer timer = new Timer();

    public void scheduleDbScan(Calendar date, int period) {
        timer.scheduleAtFixedRate(new ScanDbTask(), date.getTime(), 1000 * 1 * 1 * period);
    }
}

class ScanDbTask extends TimerTask {

    private static String username;
    private static String brn;    
    private static String logTime;
    private static String makerId;
    private static String refNo;
    private static String module;


    public void run() {
        System.out.println("It's just 10 Seconds... ");

        String SqlSelect = "SELECT MAKER_ID,REFNO,MODULE,BRANCH,TIME_CREATED FROM MAIN_TRANSACTION "
                + "WHERE AUTH_STAT = 'A'";

        try {
            int count = 0;

            ResultSet resSet = dbConn.getPreparedStatement(SqlSelect).executeQuery();
            while (resSet.next()) {
                count++;
                //System.out.println("Inside the resultset proper..."); 
                makerId =   resSet.getString(1);
                refNo   =   resSet.getString(2);
                module  =   resSet.getString(3);
                brn     =   resSet.getString(4);
                String time = resSet.getString(5);
                String email = "samuel.offiah@energy.com";
                
                PendMirror pend = new PendMirror();
                pend.setMakeId(makerId);
                pend.setEmail(email);
                pend.setRefNo(refNo);
                pend.setBrn(brn);
                pend.setModule(module);
                pend.setTimeCreated(time);
                
                try {
                    MailType.sendMail();
                                        
                    //DataAccess.InserPendItem(pend);
                } catch (Exception ex) {
                    //Logger.getLogger(ScanDbTask.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex.getMessage());
                }
                System.out.println("Records, makerId: "+makerId+" refNo: "+refNo+" module: "+module);
                System.out.println("What happens in between...");
            }
            if (count == 1) {
                System.out.println("We have just one record; name: " + username + " time: " + logTime);
            } else if (count > 1) {
                //System.out.println("Records, makerId: "+makerId+" refNo: "+refNo+" module: "+module);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error During Select on MAIN_TRANSACTION table: " + ex.getMessage());
        }

    }
}
