package com.geo.geostats;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockListFragment;

public class FragmentIndicatorsList extends SherlockListFragment {
	
    OnHeadlineSelectedListener mCallback;

    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(int position);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;
        
    	String[] alist = new String[11];
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
        
        setListAdapter(new ArrayAdapter<String>(getSherlockActivity(), layout, alist));
    }

    @Override
    public void onStart() {
        super.onStart();

        if (getFragmentManager().findFragmentById(R.id.fRecord) != null) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mCallback = (OnHeadlineSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        mCallback.onArticleSelected(position);
        
        getListView().setItemChecked(position, true);
    }
}
