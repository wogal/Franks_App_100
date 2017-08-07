package com.egs.wogal.forsale_items_sat_18_3_2017_100.Location_Helpers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.egs.wogal.forsale_items_sat_18_3_2017_100.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wogal on 7/23/2017.
 */

public class Location_Recycle_Adapter extends RecyclerView.Adapter<Location_Recycle_Adapter.LocationViewHolder> {

    private LayoutInflater inflater;
    private List<Location_Class> data = Collections.emptyList();

    public Location_Recycle_Adapter (Context context, Object o) {
        inflater = LayoutInflater.from( context );
        this.data = setdummyData( 10 );

    }

    private List<Location_Class> setdummyData (int cnt) {
        String mStr;
        data = new ArrayList<>();
        for (int a = 0; a != cnt; a++) {
            Location_Class locCls = new Location_Class();
            mStr = String.format( "Cnt %d ", a + 1 );
            locCls.set_Location_Name_COL_1( mStr );
            data.add( locCls );
        }
        return data;
    }

    @Override
    public LocationViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = inflater.inflate( R.layout.location_rec_view_v3, parent, false );
        LocationViewHolder holder = new LocationViewHolder( view );
        return holder;
    }

    @Override
    public void onBindViewHolder (LocationViewHolder holder, int position) {
        Location_Class current_loc_cls = data.get( position );
        holder.LocationTextView.setText( current_loc_cls.get_Location_Name_COL_1() );
    }

    @Override
    public int getItemCount () {
        return data.size();
    }

    class LocationViewHolder extends RecyclerView.ViewHolder {
        TextView LocationTextView;

        public LocationViewHolder (View itemView) {
            super( itemView );
            LocationTextView = (TextView) itemView.findViewById( R.id.text_v3 );
        }
    }
}
