package com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers;

import android.media.Image;

/**
 * Created by wogal on 7/23/2017.
 * <p>
 * Class to Hold Loaction Data
 */

public class Location_Class {

    private Image _Image = null;
    private String _Location_Name = "default";

    private String Location_Image = "";
    private long _Location_Longitude = 0;
    private long _Location_Latitude = 0;
    private String _Location_Ads = "";
    private String _Location_phone_no_1 = "";
    private String _Location_phone_no_2 = "";

    public Image get_Image () {
        return _Image;
    }

    public void set_Image (Image _Image) {
        this._Image = _Image;
    }

    public String get_Location_Name () {
        return _Location_Name;
    }

    public void set_Location_Name (String _Location_Name) {
        this._Location_Name = _Location_Name;
    }

    public String getLocation_Image () {
        return Location_Image;
    }

    public void setLocation_Image (String location_Image) {
        Location_Image = location_Image;
    }

    public long get_Location_Longitude () {
        return _Location_Longitude;
    }

    public void set_Location_Longitude (long _Location_Longitude) {
        this._Location_Longitude = _Location_Longitude;
    }

    public long get_Location_Latitude () {
        return _Location_Latitude;
    }

    public void set_Location_Latitude (long _Location_Latitude) {
        this._Location_Latitude = _Location_Latitude;
    }

    public String get_Location_Ads () {
        return _Location_Ads;
    }

    public void set_Location_Ads (String _Location_Ads) {
        this._Location_Ads = _Location_Ads;
    }

    public String get_Location_phone_no_1 () {
        return _Location_phone_no_1;
    }

    public void set_Location_phone_no_1 (String _Location_phone_no_1) {
        this._Location_phone_no_1 = _Location_phone_no_1;
    }

    public String get_Location_phone_no_2 () {
        return _Location_phone_no_2;
    }

    public void set_Location_phone_no_2 (String _Location_phone_no_2) {
        this._Location_phone_no_2 = _Location_phone_no_2;
    }
}
