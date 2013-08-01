package com.geo.geostats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockFragment;

public class FragmentIndicatorsRecords extends SherlockFragment{
	
	final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }
		
		return inflater.inflate(R.layout.indicators_record_detail, container, false);

		/*list = (ListView) v.findViewById(R.id.lvList);
		
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
		
		return v;*/
	}
	
	@Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        if (args != null) {
            updateArticleView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {
            updateArticleView(mCurrentPosition);
        }
    }
	
	public void updateArticleView(int position) {
		TextView article = (TextView) getSherlockActivity().findViewById(R.id.tvRecordDetail);
		//ListView list = (ListView) getSherlockActivity().findViewById(R.id.lvList);
		//ArrayAdapter<String> aa = new ArrayAdapter<String>(FragmentIndicatorsList.this.getActivity(), android.R.layout.simple_list_item_1, alist);
        //list.setAdapter(aa);
        article.setText(Ipsum.Articles[position]);
        mCurrentPosition = position;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}
