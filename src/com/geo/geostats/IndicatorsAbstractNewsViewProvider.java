package com.geo.geostats;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class IndicatorsAbstractNewsViewProvider {
	   private final SherlockFragmentActivity fragmentActivity;
	   public IndicatorsAbstractNewsViewProvider(SherlockFragmentActivity activity) {
	      this.fragmentActivity = activity;
	   }
	   public IndicatorsAbstractNewsView get() {
	      if (fragmentActivity.findViewById(R.id.fragment_container) != null) {
	           return new IndicatorsSinglePaneNewsView(fragmentActivity);
	        } else {
	           return new IndicatorsDoublePaneNewsView(fragmentActivity);
	        }
	   }
	}
