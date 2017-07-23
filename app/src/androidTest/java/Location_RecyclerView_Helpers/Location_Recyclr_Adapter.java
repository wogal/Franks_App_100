package Location_RecyclerView_Helpers;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wogal on 7/23/2017.
 */

public class Location_Recyclr_Adapter extends RecyclerView.Adapter<Location_Recyclr_Adapter.LocationviewHolder> {


    @Override
    public LocationviewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder (LocationviewHolder holder, int position) {

    }

    @Override
    public int getItemCount () {
        return 0;
    }

    class LocationviewHolder extends RecyclerView.ViewHolder{

        public LocationviewHolder (View itemView) {
            super( itemView );
        }
    }
}
