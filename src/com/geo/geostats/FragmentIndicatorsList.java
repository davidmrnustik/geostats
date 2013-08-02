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

	      // We need to use a different list item layout for devices older than
	      // Honeycomb
	      int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
	            android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
        
			String[] alist = new String[14];
			alist[0] = getString(R.string.LargestCountries);
			alist[1] = getString(R.string.MostPopulatedCountries);
			alist[2] = getString(R.string.CountriesByPopulationDensity);
			alist[3] = getString(R.string.HighestMountains);
			alist[4] = getString(R.string.LargestIslands);
			alist[5] = getString(R.string.LongestRivers);
			alist[6] = getString(R.string.LargestLakes);
			alist[7] = getString(R.string.LargestSeas);
			alist[8] = getString(R.string.LargestCities);
			alist[9] = getString(R.string.LargestUrbanAreas);
			alist[10] = getString(R.string.MajorOceanicTrenches);
			alist[11] = getString(R.string.DeadliestEarthquakes);
			alist[12] = getString(R.string.MajorVolcanicEruptions);
			alist[13] = getString(R.string.WeatherExtremes);
        
        setListAdapter(new ArrayAdapter<String>(getSherlockActivity(), layout, alist));
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