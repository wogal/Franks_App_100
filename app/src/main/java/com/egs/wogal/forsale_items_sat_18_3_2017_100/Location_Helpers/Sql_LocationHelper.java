package com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers;

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
    public static final String COL_8 = "";
    public static final String COL_9 = "";
    public static final String COL_10 = "";
    public static final String COL_11 = "";


    public Sql_LocationHelper (Context context) {
        super( context, DATABASE_NAME,null,1 );
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate (SQLiteDatabase db) {
        db.execSQL( "create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "Location_Name TEXT," +
                "Location_Image TEXT" +
                "Location_Longitude INTEGER" +
                "Location_Latitude INTEGER" +
                "Location_Ads TEXT" +
                "Location_phone_no_1 TEXT" +
                "Location_phone_no_2 TEXT" +
                ")" );
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME );
        onCreate( db );
    }


    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }

}
