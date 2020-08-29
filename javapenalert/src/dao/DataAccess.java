package dao;

import dbc.dbConn;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.PendMirror;
import model.Users;

/**
 * @author samuel
 */
public class DataAccess {

    public static void InserPendItem(PendMirror pend) throws IOException {
        String insertQuery = "INSERT INTO PENDING_MIRROR (USER_ID, EMAIL, BRANCH, REFNO, AUTH_STAT, TIME_CREATED) values (?,?,?,?,?,?);";
        boolean isItemInserted = false;
        try {
            int updateQuery = 0;
            PreparedStatement prepStat = dbConn.getPreparedStatement(insertQuery);
            prepStat.setString(1, pend.getMakeId());
            prepStat.setString(2, pend.getEmail());
            prepStat.setString(3, pend.getBrn());
            prepStat.setString(4, pend.getRefNo());
            prepStat.setString(5, pend.getAuthStat());
            prepStat.setString(6, pend.getTimeCreated());

            updateQuery = prepStat.executeUpdate();
            if (updateQuery != 0) {
                isItemInserted = true;
                System.out.println("Insertion Successfully, updateQuery: " + updateQuery);
            } else {
                isItemInserted = false;
                System.out.println("Insertion Failed, updateQuery: " + updateQuery);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Could not Insert Into PENDING_MIRROR Table:" + ex.getMessage());
        }
        //return isItemInserted;
    }

    public static String getPendingDetails(PendMirror pend) throws IOException {
        String userId = "";
        String module = "";        
        String mailId = "";        
        String brn = "";
        String refId = "";
        String SqlSelect = "SELECT USER_ID, EMAIL, REFNO, MODULE FROM PENDING_MIRROR WHERE AUTH_STAT = 'U';";
        try {
            int count = 0;
            ResultSet resSet = dbConn.getPreparedStatement(SqlSelect).executeQuery();
            while (resSet.next()) {
                count++;
                //System.out.println("Inside the resultset proper...");
                userId = resSet.getString(1);
                mailId = resSet.getString(2);
                module = resSet.getString(3);
                refId =  resSet.getString(4);
            }
            

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Unknown Error During Login: " + ex.getMessage());
        }
        System.out.println("Returned userId is: " + userId);
        System.out.println("Returned mailId is: " + mailId);
        System.out.println("Returned module is: " + module);
        System.out.println("Returned refId  is: " + refId);
        //return userId mailId module refId;
        return userId;
    }

}
