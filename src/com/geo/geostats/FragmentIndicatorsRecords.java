package com.geo.geostats;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentIndicatorsRecords extends SherlockFragment {
	
	Context context;
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;
    TextView
    	tvChart_countries,
    	tvChart_population,
    	tvChart_density,
    	tvChart_cities,
    	tvChart_urbanareas,
    	tvChart_mountains,
    	tvChart_islands,
    	tvChart_peninsulas,
    	tvChart_rivers,
    	tvChart_lakes,
    	tvChart_dlakes,
    	tvChart_seas,
    	tvChart_trenches,
    	tvChart_dearthquakes,
    	tvChart_learthquakes,
    	tvChart_eruptions,
    	tvChart_extremes,
    	tvChart_coal,
    	tvChart_oil,
    	tvChart_gas,
    	tvChart_electricity,
    	tvChart_steel,
    	tvChart_vehicle,
    	tvChart_wheat,
    	tvChart_rice,
    	tvChart_cattle,
    	tvChart_pork,
    	tvChart_sheep,
    	tvChart_milk,
    	tvChart_meat,
    	tvChart_fish,
    	tvChart_logging,
    	tvChart_gnp;

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
		
		Bundle bag = getSherlockActivity().getIntent().getExtras();
		
		View v_mountains = vi.inflate(R.layout.vp_world_highest_mountains, null);
		tvChart_mountains = (TextView)v_mountains.findViewById(R.id.chartNo);
		tvChart_mountains.append(" 100 - 2010");
		
		View v_islands = vi.inflate(R.layout.vp_world_largest_islands, null);
		tvChart_islands = (TextView)v_islands.findViewById(R.id.chartNo);
		tvChart_islands.append(" 101 - 2010");
		
		View v_peninsulas = vi.inflate(R.layout.vp_world_largest_peninsulas, null);
		tvChart_peninsulas = (TextView)v_peninsulas.findViewById(R.id.chartNo);
		tvChart_peninsulas.append(" 102 - 2010");
		
		View v_rivers = vi.inflate(R.layout.vp_world_longest_rivers, null);
		tvChart_rivers = (TextView)v_rivers.findViewById(R.id.chartNo);
		tvChart_rivers.append(" 103 - 2010");
		
		View v_lakes = vi.inflate(R.layout.vp_world_largest_lakes, null);
		tvChart_lakes = (TextView)v_lakes.findViewById(R.id.chartNo);
		tvChart_lakes.append(" 104 - 2010");
		
		View v_dlakes = vi.inflate(R.layout.vp_world_deepest_lakes, null);
		tvChart_dlakes = (TextView)v_dlakes.findViewById(R.id.chartNo);
		tvChart_dlakes.append(" 105 - 2010");
		
		View v_seas = vi.inflate(R.layout.vp_world_largest_seas, null);
		tvChart_seas = (TextView)v_seas.findViewById(R.id.chartNo);
		tvChart_seas.append(" 106 - 2010");
		
		View v_trenches = vi.inflate(R.layout.vp_world_major_oceanic_trenches, null);
		tvChart_trenches = (TextView)v_trenches.findViewById(R.id.chartNo);
		tvChart_trenches.append(" 107 - 2010");
		
		View v_dearthquakes = vi.inflate(R.layout.vp_world_deadliest_earthquakes, null);
		tvChart_dearthquakes = (TextView)v_dearthquakes.findViewById(R.id.chartNo);
		tvChart_dearthquakes.append(" 108 - 2010");
		
		View v_learthquakes = vi.inflate(R.layout.vp_world_largest_earthquakes, null);
		tvChart_learthquakes = (TextView)v_learthquakes.findViewById(R.id.chartNo);
		tvChart_learthquakes.append(" 109 - 2010");
		
		View v_eruptions = vi.inflate(R.layout.vp_world_major_volcanic_eruptions, null);
		tvChart_eruptions = (TextView)v_eruptions.findViewById(R.id.chartNo);
		tvChart_eruptions.append(" 110 - 2010");
		
		View v_extremes = vi.inflate(R.layout.vp_weather_extremes, null);
		tvChart_extremes = (TextView)v_extremes.findViewById(R.id.chartNo);
		tvChart_extremes.append(" 111 - 2010");
		
		View v_countries = vi.inflate(R.layout.vp_world_largest_countries, null);
		tvChart_countries = (TextView)v_countries.findViewById(R.id.chartNo);
		tvChart_countries.append(" 95 - 2010");
		
		View v_population = vi.inflate(R.layout.vp_world_most_populated_countries, null);
		tvChart_population = (TextView)v_population.findViewById(R.id.chartNo);
		tvChart_population.append(" 96 - 2010");
		
		View v_density = vi.inflate(R.layout.vp_world_countries_by_population_density, null);
		tvChart_density = (TextView)v_density.findViewById(R.id.chartNo);
		tvChart_density.append("97 - 2010");
		
		View v_cities = vi.inflate(R.layout.vp_world_largest_cities, null);
		tvChart_cities = (TextView)v_cities.findViewById(R.id.chartNo);
		tvChart_cities.append(" 98 - 2010");
		
		View v_urbanareas = vi.inflate(R.layout.vp_world_largest_urban_areas, null);
		tvChart_urbanareas = (TextView)v_urbanareas.findViewById(R.id.chartNo);
		tvChart_urbanareas.append(" 99 - 2010");
		
		View v_coal = vi.inflate(R.layout.vp_world_coal_mining, null);
		tvChart_coal = (TextView)v_coal.findViewById(R.id.chartNo);
		tvChart_coal.append(" 112 - 2010");
		
		View v_oil = vi.inflate(R.layout.vp_world_oil_production, null);
		tvChart_oil = (TextView)v_oil.findViewById(R.id.chartNo);
		tvChart_oil.append(" 113 - 2010");
		
		View v_gas = vi.inflate(R.layout.vp_world_natural_gas_production, null);
		tvChart_gas = (TextView)v_gas.findViewById(R.id.chartNo);
		tvChart_gas.append(" 114 - 2010");
		
		View v_electricity = vi.inflate(R.layout.vp_world_electricity_production, null);
		tvChart_electricity = (TextView)v_electricity.findViewById(R.id.chartNo);
		tvChart_electricity.append(" 115 - 2010");
		
		View v_steel = vi.inflate(R.layout.vp_world_steel_production, null);
		tvChart_steel = (TextView)v_steel.findViewById(R.id.chartNo);
		tvChart_steel.append(" 116 - 2010");
		
		View v_vehicle = vi.inflate(R.layout.vp_world_motor_vehicle_production, null);
		tvChart_vehicle = (TextView)v_vehicle.findViewById(R.id.chartNo);
		tvChart_vehicle.append(" 117 - 2010");
		
		View v_wheat = vi.inflate(R.layout.vp_world_wheat_production, null);
		tvChart_wheat = (TextView)v_wheat.findViewById(R.id.chartNo);
		tvChart_wheat.append(" 118 - 2010");
		
		View v_rice= vi.inflate(R.layout.vp_world_rice_production, null);
		tvChart_rice = (TextView)v_rice.findViewById(R.id.chartNo);
		tvChart_rice.append(" 119 - 2010");
		
		View v_cattle = vi.inflate(R.layout.vp_world_beef_cattle_production, null);
		tvChart_cattle = (TextView)v_cattle.findViewById(R.id.chartNo);
		tvChart_cattle.append(" 120 - 2010");
		
		View v_pork = vi.inflate(R.layout.vp_world_pork_production, null);
		tvChart_pork = (TextView)v_pork.findViewById(R.id.chartNo);
		tvChart_pork.append(" 121 - 2010");
		
		View v_sheep = vi.inflate(R.layout.vp_world_sheep_production, null);
		tvChart_sheep = (TextView)v_sheep.findViewById(R.id.chartNo);
		tvChart_sheep.append(" 122 - 2010");
		
		View v_milk = vi.inflate(R.layout.vp_world_milk_production, null);
		tvChart_milk = (TextView)v_milk.findViewById(R.id.chartNo);
		tvChart_milk.append(" 123 - 2010");
		
		View v_meat = vi.inflate(R.layout.vp_world_meat_production, null);
		tvChart_meat = (TextView)v_meat.findViewById(R.id.chartNo);
		tvChart_meat.append(" 124 - 2010");
		
		View v_fish = vi.inflate(R.layout.vp_world_fish_production, null);
		tvChart_fish = (TextView)v_fish.findViewById(R.id.chartNo);
		tvChart_fish.append(" 125 - 2010");
		
		View v_logging = vi.inflate(R.layout.vp_world_logging, null);
		tvChart_logging = (TextView)v_logging.findViewById(R.id.chartNo);
		tvChart_logging.append(" 126 - 2010");
		
		View v_gnp = vi.inflate(R.layout.vp_world_gnp, null);
		tvChart_gnp = (TextView)v_gnp.findViewById(R.id.chartNo);
		tvChart_gnp.append(" 127 - 2010");
		
		if(bag.getString("GEO").equals("G1")){
	    	// called when Physical geography is chosen
			if(position == 0){
				article.removeAllViews();
				article.addView(v_mountains);
			}else if(position == 1){
				article.removeAllViews();
				article.addView(v_islands);
			}else if(position == 2){
				article.removeAllViews();
				article.addView(v_peninsulas);
			}else if(position == 3){
				article.removeAllViews();
				article.addView(v_rivers);
			}else if(position == 4){
				article.removeAllViews();
				article.addView(v_lakes);
			}else if(position == 5){
				article.removeAllViews();
				article.addView(v_dlakes);
			}else if(position == 6){
				article.removeAllViews();
				article.addView(v_seas);
			}else if(position == 7){
				article.removeAllViews();
				article.addView(v_trenches);
			}else if(position == 8){
				article.removeAllViews();
				article.addView(v_dearthquakes);
			}else if(position == 9){
				article.removeAllViews();
				article.addView(v_learthquakes);
			}else if(position == 10){
				article.removeAllViews();
				article.addView(v_eruptions);
			}else if(position == 11){
				article.removeAllViews();
				article.addView(v_extremes);
			}
			mCurrentPosition = position;
			
		}else if(bag.getString("GEO").equals("G2")){
	    	// called when Political and Urban geography is chosen
			if (position == 0) {
				article.removeAllViews();
				article.addView(v_countries);
			}else if(position == 1){
				article.removeAllViews();
				article.addView(v_population);
			}else if(position == 2){
				article.removeAllViews();
				article.addView(v_density);
			}else if(position == 3){
				article.removeAllViews();
				article.addView(v_cities);
			}else if(position == 4){
				article.removeAllViews();
				article.addView(v_urbanareas);
			}
			mCurrentPosition = position;
				
		}else if(bag.getString("GEO").equals("G3")){
			// called when Economic geography is chosen
			if (position == 0) {
				article.removeAllViews();
				article.addView(v_coal);
			}else if (position == 1) {
				article.removeAllViews();
				article.addView(v_oil);
			}else if (position == 2) {
				article.removeAllViews();
				article.addView(v_gas);
			}else if (position == 3) {
				article.removeAllViews();
				article.addView(v_electricity);
			}else if (position == 4) {
				article.removeAllViews();
				article.addView(v_steel);
			}else if (position == 5) {
				article.removeAllViews();
				article.addView(v_vehicle);
			}else if (position == 6) {
				article.removeAllViews();
				article.addView(v_wheat);
			}else if (position == 7) {
				article.removeAllViews();
				article.addView(v_rice);
			}else if (position == 8) {
				article.removeAllViews();
				article.addView(v_cattle);
			}else if (position == 9) {
				article.removeAllViews();
				article.addView(v_pork);
			}else if (position == 10) {
				article.removeAllViews();
				article.addView(v_sheep);
			}else if (position == 11) {
				article.removeAllViews();
				article.addView(v_milk);
			}else if (position == 12) {
				article.removeAllViews();
				article.addView(v_meat);
			}else if (position == 13) {
				article.removeAllViews();
				article.addView(v_fish);
			}else if (position == 14) {
				article.removeAllViews();
				article.addView(v_logging);
			}else if (position == 15) {
				article.removeAllViews();
				article.addView(v_gnp);
			}
			mCurrentPosition = position;
			
		}else{
	    	
	    	// called when Indicators is chosen, this is a default call, all indicators are called
			
			if (position == 0) {
				article.removeAllViews();
				article.addView(v_countries);
			}else if(position == 1){
				article.removeAllViews();
				article.addView(v_population);
			}else if(position == 2){
				article.removeAllViews();
				article.addView(v_density);
			}else if(position == 3){
				article.removeAllViews();
				article.addView(v_cities);
			}else if(position == 4){
				article.removeAllViews();
				article.addView(v_urbanareas);
			}else if(position == 5){
				article.removeAllViews();
				article.addView(v_mountains);
			}else if(position == 6){
				article.removeAllViews();
				article.addView(v_islands);
			}else if(position == 7){
				article.removeAllViews();
				article.addView(v_peninsulas);
			}else if(position == 8){
				article.removeAllViews();
				article.addView(v_rivers);
			}else if(position == 9){
				article.removeAllViews();
				article.addView(v_lakes);
			}else if(position == 10){
				article.removeAllViews();
				article.addView(v_dlakes);
			}else if(position == 11){
				article.removeAllViews();
				article.addView(v_seas);
			}else if(position == 12){
				article.removeAllViews();
				article.addView(v_trenches);
			}else if(position == 13){
				article.removeAllViews();
				article.addView(v_dearthquakes);
			}else if(position == 14){
				article.removeAllViews();
				article.addView(v_learthquakes);
			}else if(position == 15){
				article.removeAllViews();
				article.addView(v_eruptions);
			}else if(position == 16){
				article.removeAllViews();
				article.addView(v_extremes);
			}else if (position == 17) {
				article.removeAllViews();
				article.addView(v_coal);
			}else if (position == 18) {
				article.removeAllViews();
				article.addView(v_oil);
			}else if (position == 19) {
				article.removeAllViews();
				article.addView(v_gas);
			}else if (position == 20) {
				article.removeAllViews();
				article.addView(v_electricity);
			}else if (position == 21) {
				article.removeAllViews();
				article.addView(v_steel);
			}else if (position == 22) {
				article.removeAllViews();
				article.addView(v_vehicle);
			}else if (position == 23) {
				article.removeAllViews();
				article.addView(v_wheat);
			}else if (position == 24) {
				article.removeAllViews();
				article.addView(v_rice);
			}else if (position == 25) {
				article.removeAllViews();
				article.addView(v_cattle);
			}else if (position == 26) {
				article.removeAllViews();
				article.addView(v_pork);
			}else if (position == 27) {
				article.removeAllViews();
				article.addView(v_sheep);
			}else if (position == 28) {
				article.removeAllViews();
				article.addView(v_milk);
			}else if (position == 29) {
				article.removeAllViews();
				article.addView(v_meat);
			}else if (position == 30) {
				article.removeAllViews();
				article.addView(v_fish);
			}else if (position == 31) {
				article.removeAllViews();
				article.addView(v_logging);
			}else if (position == 32) {
				article.removeAllViews();
				article.addView(v_gnp);
			}
		}

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}
