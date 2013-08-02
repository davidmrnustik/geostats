package com.geo.geostats;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentIndicatorsRecords extends SherlockFragment {
	
	Context context;
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {

        // If activity recreated (such as from screen rotate), restore
        // the previous article selection set by onSaveInstanceState().
        // This is primarily necessary when in the two-pane layout.
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.indicators_record_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        // During startup, check if there are arguments passed to the fragment.
        // onStart is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method
        // below that sets the article text.
        Bundle args = getArguments();
        if (args != null) {
            // Set article based on argument passed in
            updateArticleView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {
            // Set article based on saved instance state defined during onCreateView
            updateArticleView(mCurrentPosition);
        }
    }

    public void updateArticleView(int position) {
		
		context = getSherlockActivity().getApplicationContext();
		LinearLayout article = (LinearLayout) getSherlockActivity().findViewById(R.id.tvRecordDetail);
		LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if (position == 0) {
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_largest_countries, null);
			article.addView(vv);
		}else if(position == 1){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_most_populated_countries, null);
			article.addView(vv);
		}else if(position == 2){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_countries_by_population_density, null);
			article.addView(vv);
		}else if(position == 3){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_highest_mountains, null);
			article.addView(vv);
		}else if(position == 4){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_largest_islands, null);
			article.addView(vv);
		}else if(position == 5){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_longest_rivers, null);
			article.addView(vv);
		}else if(position == 6){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_largest_lakes, null);
			article.addView(vv);
		}else if(position == 7){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_largest_seas, null);
			article.addView(vv);
		}else if(position == 8){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_largest_cities, null);
			article.addView(vv);
		}else if(position == 9){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_largest_urban_areas, null);
			article.addView(vv);
		}else if(position == 10){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_major_oceanic_trenches, null);
			article.addView(vv);
		}else if(position == 11){
			article.removeAllViews();
			View vv = vi.inflate(R.layout.vp_world_deadliest_earthquakes, null);
			article.addView(vv);
		}

        mCurrentPosition = position;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}
