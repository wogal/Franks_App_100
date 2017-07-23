package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wogal on 7/23/2017.
 */

public class Location_Recycle_Adapter extends RecyclerView.Adapter<Location_Recycle_Adapter.LocationviewHolder> {

    private LayoutInflater inflater;

    public Location_Recycle_Adapter (Context context, Object o) {

        inflater = LayoutInflater.from( context );
    }


    @Override
    public LocationviewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        inflater.inflate( R.layout.location_rec_view_v3, parent, false );


        return null;
    }

    @Override
    public void onBindViewHolder (LocationviewHolder holder, int position) {

    }

    @Override
    public int getItemCount () {
        return 0;
    }

    class LocationviewHolder extends RecyclerView.ViewHolder {

        public LocationviewHolder (View itemView) {
            super( itemView );
        }
    }
}
