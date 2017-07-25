package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers.Sql_LocationHelper;

public class test_options_v2 extends AppCompatActivity implements View.OnClickListener {

    private Button mBut_MakeDbase;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.layout_test_options_v2 );
        this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );

        mBut_MakeDbase = (Button) findViewById( R.id.But_Make_loc_Dbase_v2 );
        mBut_MakeDbase.setOnClickListener( this );


    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.But_Make_loc_Dbase_v2: {
                Sql_LocationHelper Sql_Loc_Helper = new Sql_LocationHelper( this );
                break;
            }
        }
    }
}
