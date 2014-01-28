package com.geo.geostats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;


public class FragmentSouthernO extends SherlockFragment{
	
	TextView tvChart;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

		View v = inflater.inflate(R.layout.fragment_southern_o, container, false);
		
		tvChart = (TextView)v.findViewById(R.id.chartNo);
		tvChart.append(" 94");
		
		return v;
	}

}

