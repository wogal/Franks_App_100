package com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers;

/**
 * Created by wogal on 7/23/2017.
 * <p>
 * Class to Hold Loaction Data
 */

public class Location_Class {


    private String _Location_Name_COL_1 = "default";       // col_1
    private String Location_Image_COL_2 = "";              // col_2
    private long _Location_Longitude_COL_3 = 0;            // col_3
    private long _Location_Latitude_COL_4 = 0;             // col_4
    private String _Location_Ads_COL_5 = "";               // col_5
    private String _Location_phone_no_1_COL_6 = "";        // col_6
    private String _Location_phone_no_2_COL_7 = "";        // col_7

    private String _Location_City_COL_8 = "";              // col_8
    private String _Location_post_zip_code_COL_9 = "";     // col_9
    private String _Location_Guid_10 = "";                 // col_10

    public Location_Class (String _Location_Name_COL_1, String location_Image_COL_2, long _Location_Longitude_COL_3, long _Location_Latitude_COL_4, String _Location_Ads_COL_5, String _Location_phone_no_1_COL_6, String _Location_phone_no_2_COL_7, String _Location_City_COL_8, String _Location_post_zip_code_COL_9, String _Location_Guid_10) {
        this._Location_Name_COL_1 = _Location_Name_COL_1;
        Location_Image_COL_2 = location_Image_COL_2;
        this._Location_Longitude_COL_3 = _Location_Longitude_COL_3;
        this._Location_Latitude_COL_4 = _Location_Latitude_COL_4;
        this._Location_Ads_COL_5 = _Location_Ads_COL_5;
        this._Location_phone_no_1_COL_6 = _Location_phone_no_1_COL_6;
        this._Location_phone_no_2_COL_7 = _Location_phone_no_2_COL_7;
        this._Location_City_COL_8 = _Location_City_COL_8;
        this._Location_post_zip_code_COL_9 = _Location_post_zip_code_COL_9;
        this._Location_Guid_10 = _Location_Guid_10;
    }

    public Location_Class () {
    }

    public String get_Location_City_COL_8 () {
        return _Location_City_COL_8;
    }

    public void set_Location_City_COL_8 (String _Location_City_COL_8) {
        this._Location_City_COL_8 = _Location_City_COL_8;
    }

    public String get_Location_post_zip_code_COL_9 () {
        return _Location_post_zip_code_COL_9;
    }

    public void set_Location_post_zip_code_COL_9 (String _Location_post_zip_code_COL_9) {
        this._Location_post_zip_code_COL_9 = _Location_post_zip_code_COL_9;
    }

    public String get_Location_Guid_10 () {
        return _Location_Guid_10;
    }

    public void set_Location_Guid_10 (String _Location_Guid_10) {
        this._Location_Guid_10 = _Location_Guid_10;
    }

    public String get_Location_Name_COL_1 () {
        return _Location_Name_COL_1;
    }

    public void set_Location_Name_COL_1 (String _Location_Name_COL_1) {
        this._Location_Name_COL_1 = _Location_Name_COL_1;
    }

    public String getLocation_Image_COL_2 () {
        return Location_Image_COL_2;
    }

    public void setLocation_Image_COL_2 (String location_Image_COL_2) {
        Location_Image_COL_2 = location_Image_COL_2;
    }

    public long get_Location_Longitude_COL_3 () {
        return _Location_Longitude_COL_3;
    }

    public void set_Location_Longitude_COL_3 (long _Location_Longitude_COL_3) {
        this._Location_Longitude_COL_3 = _Location_Longitude_COL_3;
    }

    public long get_Location_Latitude_COL_4 () {
        return _Location_Latitude_COL_4;
    }

    public void set_Location_Latitude_COL_4 (long _Location_Latitude_COL_4) {
        this._Location_Latitude_COL_4 = _Location_Latitude_COL_4;
    }

    public String get_Location_Ads_COL_5 () {
        return _Location_Ads_COL_5;
    }

    public void set_Location_Ads_COL_5 (String _Location_Ads_COL_5) {
        this._Location_Ads_COL_5 = _Location_Ads_COL_5;
    }

    public String get_Location_phone_no_1_COL_6 () {
        return _Location_phone_no_1_COL_6;
    }

    public void set_Location_phone_no_1_COL_6 (String _Location_phone_no_1_COL_6) {
        this._Location_phone_no_1_COL_6 = _Location_phone_no_1_COL_6;
    }

    public String get_Location_phone_no_2_COL_7 () {
        return _Location_phone_no_2_COL_7;
    }

    public void set_Location_phone_no_2_COL_7 (String _Location_phone_no_2_COL_7) {
        this._Location_phone_no_2_COL_7 = _Location_phone_no_2_COL_7;
    }


}
