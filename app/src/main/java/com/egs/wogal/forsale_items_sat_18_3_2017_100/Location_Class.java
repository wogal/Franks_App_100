package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.media.Image;

/**
 * Created by wogal on 7/23/2017.
 *
 * Class to Hold Loaction Data
 *
 */

public class Location_Class {

    private Image _Image = null;
    private String _LocationName="default";
    private long _Location_Longitude =0;
    private long _Location_Latitude =0;

    public Image get_Image () {
        return _Image;
    }

    public void set_Image (Image _Image) {
        this._Image = _Image;
    }

    public String get_LocationName () {
        return _LocationName;
    }

    public void set_LocationName (String _LocationName) {
        this._LocationName = _LocationName;
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
}
