package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Activity_Main_v0 extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "Init -";
    Button mBtn_startselling_vn;


    // rename to Franks_App_100

    // start sreen
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );
        setContentView( R.layout.layout_v0 );
        mBtn_startselling_vn = (Button) findViewById( R.id.butt_lets_start_eating_v0 );
        mBtn_startselling_vn.setOnClickListener( this );
        // invoke system initialize Actions


    }


    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.butt_lets_start_eating_v0: {
                Intent intent;
                intent = new Intent( this, location_v1.class );
                startActivity( intent );

            }
        }
    }

}
