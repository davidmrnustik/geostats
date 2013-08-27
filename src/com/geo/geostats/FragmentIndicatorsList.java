package com.geo.geostats;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockListFragment;

public class FragmentIndicatorsList extends SherlockListFragment {
	   OnHeadlineSelectedListener onHeadlineSelectedListener;

	   // The container Activity must implement this interface so the frag can
	   // deliver messages
	   public interface OnHeadlineSelectedListener {
	      /** Called by HeadlinesFragment when a list item is selected */
	      public void onArticleSelected(int position);
	   }

	   @Override public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      
	      Bundle bag = getSherlockActivity().getIntent().getExtras();
	      
	      // We need to use a different list item layout for devices older than
	      // Honeycomb
	      int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
	            android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
	      
	      if(bag.getString("GEO").equals("G1")){
	    	
	    	// called when Physical geography is chosen
	    	String[] alist = new String[12];
			alist[0] = getString(R.string.HighestMountains);
			alist[1] = getString(R.string.LargestIslands);
			alist[2] = getString(R.string.LargestPeninsulas);
			alist[3] = getString(R.string.LongestRivers);
			alist[4] = getString(R.string.LargestLakes);
			alist[5] = getString(R.string.DeepestLakes);
			alist[6] = getString(R.string.LargestSeas);
			alist[7] = getString(R.string.MajorOceanicTrenches);
			alist[8] = getString(R.string.DeadliestEarthquakes);
			alist[9] = getString(R.string.LargestEarthquakes);
			alist[10] = getString(R.string.MajorVolcanicEruptions);
			alist[11] = getString(R.string.WeatherExtremes);
        
			setListAdapter(new ArrayAdapter<String>(getSherlockActivity(), layout, alist));
			
	      }else if(bag.getString("GEO").equals("G2")){
	    	
	    	// called when Political and Urban geography is chosen
	    	String[] alist = new String[5];
			alist[0] = getString(R.string.LargestCountries);
			alist[1] = getString(R.string.MostPopulatedCountries);
			alist[2] = getString(R.string.CountriesByPopulationDensity);
			alist[3] = getString(R.string.LargestCities);
			alist[4] = getString(R.string.LargestUrbanAreas);
	        
			setListAdapter(new ArrayAdapter<String>(getSherlockActivity(), layout, alist));
			
	      }else if(bag.getString("GEO").equals("G3")){
	    	  
	    	// called when Economic geography is chosen
	    	String[] alist = new String[16];
			alist[0] = getString(R.string.ProductionCoal);
			alist[1] = getString(R.string.ProductionOil);
			alist[2] = getString(R.string.ProductionNaturalGas);
			alist[3] = getString(R.string.ProductionElectricity);
			alist[4] = getString(R.string.ProductionSteel);
			alist[5] = getString(R.string.ProductionCars);
			alist[6] = getString(R.string.ProductionWheat);
			alist[7] = getString(R.string.ProductionRice);
			alist[8] = getString(R.string.Livestock);
			alist[9] = getString(R.string.Pork);
			alist[10] = getString(R.string.Lamb);
			alist[11] = getString(R.string.ProductionMilk);
			alist[12] = getString(R.string.ProductionMeat);
			alist[13] = getString(R.string.Fishing);
			alist[14] = getString(R.string.ProductionTimber);
			alist[15] = getString(R.string.GNP);
			
			// add records for Zelezna ruda, zlato, diamanty, ...
	        
			setListAdapter(new ArrayAdapter<String>(getSherlockActivity(), layout, alist));
			
	      }else{
	    	
	    	// called when Indicators is chosen, this is a default call, all indicators are called
			String[] alist = new String[33];
			alist[0] = getString(R.string.LargestCountries);
			alist[1] = getString(R.string.MostPopulatedCountries);
			alist[2] = getString(R.string.CountriesByPopulationDensity);
			alist[3] = getString(R.string.LargestCities);
			alist[4] = getString(R.string.LargestUrbanAreas);			
			alist[5] = getString(R.string.HighestMountains);
			alist[6] = getString(R.string.LargestIslands);
			alist[7] = getString(R.string.LargestPeninsulas);
			alist[8] = getString(R.string.LongestRivers);
			alist[9] = getString(R.string.LargestLakes);
			alist[10] = getString(R.string.DeepestLakes);
			alist[11] = getString(R.string.LargestSeas);
			alist[12] = getString(R.string.MajorOceanicTrenches);
			alist[13] = getString(R.string.DeadliestEarthquakes);
			alist[14] = getString(R.string.LargestEarthquakes);
			alist[15] = getString(R.string.MajorVolcanicEruptions);
			alist[16] = getString(R.string.WeatherExtremes);
			alist[17] = getString(R.string.ProductionCoal);
			alist[18] = getString(R.string.ProductionOil);
			alist[19] = getString(R.string.ProductionNaturalGas);
			alist[20] = getString(R.string.ProductionElectricity);
			alist[21] = getString(R.string.ProductionSteel);
			alist[22] = getString(R.string.ProductionCars);
			alist[23] = getString(R.string.ProductionWheat);
			alist[24] = getString(R.string.ProductionRice);
			alist[25] = getString(R.string.Livestock);
			alist[26] = getString(R.string.Pork);
			alist[27] = getString(R.string.Lamb);
			alist[28] = getString(R.string.ProductionMilk);
			alist[29] = getString(R.string.ProductionMeat);
			alist[30] = getString(R.string.Fishing);
			alist[31] = getString(R.string.ProductionTimber);
			alist[32] = getString(R.string.GNP);			
        
			setListAdapter(new ArrayAdapter<String>(getSherlockActivity(), layout, alist));
	      }
	   }

	   @Override public void onStart() {
		      super.onStart();

		      // When in two-pane layout, set the listview to highlight the selected
		      // list item
		      // (We do this during onStart because at the point the listview is
		      // available.)
		      if (getFragmentManager().findFragmentById(R.id.fRecord) != null) {
		         getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		      }
		   }

		   @Override public void onListItemClick(ListView l, View v, int position, long id) {
		      // Notify the listener of selected item
		      onHeadlineSelectedListener.onArticleSelected(position);

		      // Set the item as checked to be highlighted when in two-pane layout
		      getListView().setItemChecked(position, true);
		   }

		   @Override public void onAttach(Activity activity) {
		      super.onAttach(activity);

		      // This makes sure that the container activity has implemented
		      // the callback interface. If not, it throws an exception.
		      try {
		         onHeadlineSelectedListener = (OnHeadlineSelectedListener) activity;
		      } catch (ClassCastException e) {
		         throw new ClassCastException(activity.toString()
		               + " must implement OnHeadlineSelectedListener");
		      }
		   }

		}