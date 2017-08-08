package com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by wogal on 8/7/2017.
 */

public class MySql_LocationHelper {
    //  MySQLConnection

    private static final String url = "jdbc:mysql:johnny.heliohost.org";
    private static final String user = "wogal";
    private static final String pass = "adv_51370_sql_server";
    private String str;

    public boolean testDb () {
        try{

            Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

            Connection myCon = DriverManager.getConnection( url,user,pass );

            myCon.close();


       //     Connection con = DriverManager.getConnection( url,user,pass );
       //     String result = "Data Base Connected ";
        //    Statement st = con.createStatement();
            //    ResultSet rs = st.executeQuery(  )




        }catch (Exception e){
            str = e.getMessage();

    return false;
        }


        return true;
    }

}
