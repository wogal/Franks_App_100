package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;


// wogal
public class location_v1 extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_location_v1 );

        mRecyclerView = (RecyclerView) findViewById( R.id.RecView_Select_lcation_v1 );
        LinearLayoutManager manager = new LinearLayoutManager( this );
        mRecyclerView.setLayoutManager( manager );
       mRecyclerView.setAdapter( new Loca  Location_Recyclr_Adapter( this,null ) );
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView( mRecyclerView );


        Location_Recyclr_Adapt


    }
}
