package com.geo.geostats;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import com.actionbarsherlock.app.SherlockFragment;

public class FragmentIndicatorsList extends SherlockFragment{
	
	ListView list;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.fragment_indicators_list, container, false);
		
		list = (ListView) v.findViewById(R.id.lvList);
		
		String alist[] = {
				getString(R.string.LargestCountries),
				getString(R.string.MostPopulatedCountries),
				getString(R.string.CountriesByPopulationDensity),
				getString(R.string.HighestMountains),
				getString(R.string.LargestIslands),
				getString(R.string.LongestRivers),
				getString(R.string.LargestLakes),
				getString(R.string.LargestSeas),
				getString(R.string.LargestCities),
				getString(R.string.LargestUrbanAreas),
				getString(R.string.MajorOceanicTrenches)
		};
		
		
		
		ArrayAdapter<String> aa = new ArrayAdapter<String>(FragmentIndicatorsList.this.getActivity(), android.R.layout.simple_list_item_1, alist);
        list.setAdapter(aa);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				switch (position) {
                case 0:
                    //Log.i("ABOUT"," - About Selected");
                	Fragment fRecords = new FragmentArcticO();
            		FragmentTransaction ft  = getFragmentManager().beginTransaction();
            		if (v.findViewById(R.id.fList) != null) {
            			if (savedInstanceState != null) {
                            return;
                        }
            			ft.replace(R.id.fList, fRecords);
            		}else{
            			ft.replace(R.id.fRecords, fRecords);
            		}
            		
            		ft.addToBackStack(null);
            		ft.commit();
                    break;
                case 1:
                    
                    break;
                default:
                    // do nothing
                    
                    break;
                   }
			}
			
		});
		
		return v;
	}
}
