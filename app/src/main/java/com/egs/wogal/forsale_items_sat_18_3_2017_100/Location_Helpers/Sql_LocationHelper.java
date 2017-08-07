package com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by wogal on 7/24/2017.
 * private Image _Image = null;
 * private String _LocationName="default";
 * private long _Location_Longitude =0;
 * private long _Location_Latitude =0;
 */

public class Sql_LocationHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Location.db";


    public static final String TABLE_NAME = "location_details";
    public static final String COL_1 = "Location_Name";

    public static final String COL_2 = "Location_Image";
    public static final String COL_3 = "Location_Longitude";
    public static final String COL_4 = "Location_Latitude";
    public static final String COL_5 = "Location_Ads";

    public static final String COL_6 = "Location_phone_no_1";
    public static final String COL_7 = "Location_phone_no_2";
    public static final String COL_8 = "Location_END";
    public static final String COL_9 = "";
    public static final String COL_10 = "";
    public static final String COL_11 = "";


    public Sql_LocationHelper (Context context) {
        super( context, DATABASE_NAME, null, 1 );

    }


    @Override
    public void onCreate (SQLiteDatabase db) {
        db.execSQL( "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +  // col_0
                "Location_Name_col_1 TEXT , " +           // col_1
                "Location_Image_col_2 TEXT ," +           // col_2
                "Location_Longitude_col_3 INTEGER , " +   // col_3
                "Location_Latitude_col_4 INTEGER , " +    // col_4
                "Location_Ads_col_5 TEXT , " +             // col_5
                "Location_phone_no_1_col_6 TEXT , " +     // col_6
                "Location_phone_no_2_col_7 TEXT , " +     // col_7
                "Location_City_COL_8 TEXT , " +           // col_8
                "Location_post_zip_code_COL_9 TEXT , " +  // col_9
                "Location_Guid_10 TEXT  " +             // col_10

                " ) " );
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME );
        onCreate( db );
    }


    public Cursor getAllData () {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery( "select * from " + TABLE_NAME, null );
        return res;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete( TABLE_NAME, "ID = ?", new String[]{id} );
    }

    public boolean addData (Context _context, Location_Class _loc) {
        long result = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put( "Location_Name_col_1", _loc.get_Location_Name_COL_1() );
        contentValues.put( "Location_Image_col_2", _loc.getLocation_Image_COL_2() );
        contentValues.put( "Location_Longitude_col_3", _loc.get_Location_Longitude_COL_3() );
        contentValues.put( "Location_Latitude_col_4", _loc.get_Location_Latitude_COL_4() );
        contentValues.put( "Location_Ads_col_5", _loc.get_Location_Ads_COL_5() );
        contentValues.put( "Location_phone_no_1_col_6", _loc.get_Location_phone_no_1_COL_6() );
        contentValues.put( "Location_phone_no_2_col_7", _loc.get_Location_phone_no_2_COL_7() );
        if (true) {
            contentValues.put( "Location_City_COL_8", _loc.get_Location_City_COL_8() );
            contentValues.put( "Location_post_zip_code_COL_9", _loc.get_Location_post_zip_code_COL_9() );
            contentValues.put( "Location_Guid_10", _loc.get_Location_Guid_10() );
        }



        result = db.insert( TABLE_NAME, null, contentValues );

        if (result == -1)
            return false;
        else
            return true;
    }

}













