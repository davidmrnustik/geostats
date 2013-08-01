package com.geo.geostats;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;

abstract public class FragmentIndicatorsProvider {
	   public void onCreate(SherlockFragmentActivity activity, Bundle savedInstanceState) {
	      if (savedInstanceState != null && activity.findViewById(R.id.fragment_container) != null) {
	         addFirstFragment();
	      }
	   }

	   abstract public void addFirstFragment();
	}
