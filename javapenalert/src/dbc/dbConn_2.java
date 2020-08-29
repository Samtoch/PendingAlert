/* * To change this template, choose Tools | Templates * and open the template in the editor. */
package dbc;

import java.sql.*;

/**
 * * * @author Samuel
 */
public class dbConn_2 {

    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
        PreparedStatement prepStatmt = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@10.10.0.129:1521:intbank";
        String user = "ebanking";
        String pass = "ebanking";
        //ebanking/ebanking@intbanking        

        Connection Conn = DriverManager.getConnection(url, user, pass);
        prepStatmt = Conn.prepareStatement(sql);
        return prepStatmt;
    }

    //Confirm Connection..   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //String SelectSql = "SELECT * FROM DUAL";
        String SelectSql = "select a.trn_ref_no as refno, a.ac_entry_sr_no, a.ac_no, a.ac_ccy, a.fcy_amount, a.lcy_amount, a.auth_stat, a.drcr_ind, a.trn_code, a.value_dt, a.trn_dt, (SELECT NVL(trxn_nrrxn(trn_ref_no,event_sr_no,module,ac_entry_sr_no,ac_no),'Energy Bank Transaction')  FROM dual) AS trn_desc, DECODE(ac_ccy, 'GHC', lcy_amount, fcy_amount) as trx_amount, (fn_acct_bal3(trn_dt,ac_no,ac_entry_sr_no, DECODE(ac_ccy, 'GHC', lcy_amount, fcy_amount),drcr_ind)) AS running_balance FROM ACVW_ALL_AC_ENTRIES a where to_char(a.ac_no) = to_char('0011000003411') AND to_date(value_dt) BETWEEN to_date('01-JUL-2017','dd-mon-yyyy') AND to_date('01-NOV-2017','dd-mon-yyyy') AND auth_stat='A' AND event != 'REVL' order by value_dt ASC";        
        ResultSet resSet = getPreparedStatement(SelectSql).executeQuery();
        while (resSet.next()) {
            //System.out.println(resSet.getString(1));
            System.out.println(resSet.getString(1) + "  " + resSet.getString(2) + "  " + resSet.getString(3) + "  " + resSet.getString(4) + "  " + resSet.getString(5) + "  " + resSet.getString(6) + "  " + resSet.getString(7) + "  " + resSet.getString(8) + "  " + resSet.getString(9) + "  " + resSet.getString(10) + "  " + resSet.getString(11) + "  " + resSet.getString(12) + "  " + resSet.getString(13) + "  " + resSet.getString(14));
        }
                    
    }
}