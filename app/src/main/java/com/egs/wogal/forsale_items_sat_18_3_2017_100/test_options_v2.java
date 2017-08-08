package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers.MySql_LocationHelper;

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
                make_data_base();

                break;
            }
        }
    }

    private void make_data_base () {
        boolean ret_bol;

        MySql_LocationHelper mySqlHelper = new MySql_LocationHelper();
      ret_bol =   mySqlHelper.testDb();



     //   Sql_LocationHelper Sql_Loc_Helper = new Sql_LocationHelper( this );
     //   Location_Class locCls = new Location_Class( "Sarnia", "", 123, 456, "Exmouth St", "2182", "156.80", "", "", "" );
     //   ret_bol = Sql_Loc_Helper.addData( this, locCls );
        Toast.makeText( this, " Ret Value = " + ret_bol, Toast.LENGTH_LONG ).show();
    }
}
