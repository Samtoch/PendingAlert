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
public class Javapenalert {

    public static void main(String args[]) throws InterruptedException {

        Timer time = new Timer();
        ScheduledTask task = new ScheduledTask(); 
        time.schedule(task, 0, 30000); //(task, date, period)

        System.out.println("Execution in Main Thread....");
        Thread.sleep(2000);
        //System.out.println("Application Terminates");
        //System.exit(0);  
    }
}
