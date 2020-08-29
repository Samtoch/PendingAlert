/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbc;

import java.sql.*;

/**
 *
 * @author samuel
 */
public class dbConn {

    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
        PreparedStatement prepStatmt = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/penalert?useSSL=false";
        String user = "root";
        String pass = "password";

        Connection Conn = DriverManager.getConnection(url, user, pass);
        prepStatmt = Conn.prepareStatement(sql);

        return prepStatmt;
    }

    //Confirm Connection..
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //getPreparedStatement("SELECT * FROM USER_GROUP");
//        String SelectSql = "select * from gltb_gl_bal where period_code = 'M07' and gl_code = '120000000' and branch_code = '000' and ccy_code = 'EUR';";
//        //String SelectSql = "select itemseqid, selling_price from estore_daily_log where itemseqid = '001TOV102251002'";
//        //String SelectSql = "select id, version from ajax";
//        ResultSet resSet = getPreparedStatement(SelectSql).executeQuery();
//        while (resSet.next()) {
//            System.out.println(resSet.getString(1) + "  " + resSet.getDouble(9));
//            //System.out.println(" I love Jesus ");
//        }
//    }

}
//public class dbConn {
//    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
//        PreparedStatement prepStatmt = null;
//        
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//        String url = "jdbc:oracle:thin:@10.10.0.20:1521:CTSUAT";
//        String user = "ctsuat";
//        String pass = "ctsuat";
//        
//        Connection Conn = DriverManager.getConnection(url,user,pass);
//        prepStatmt = Conn.prepareStatement(sql);
//        
//        return prepStatmt;
//    }
//    
//    //Confirm Connection..
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //getPreparedStatement("SELECT * FROM USER_GROUP");
//        String SelectSql = "SELECT * FROM USER_GROUP";
//        ResultSet resSet = getPreparedStatement(SelectSql).executeQuery();
//            while (resSet.next()) {
//                System.out.println(resSet.getString(1) + "  " + resSet.getString(2));
//            }
//    }
//    
//}
