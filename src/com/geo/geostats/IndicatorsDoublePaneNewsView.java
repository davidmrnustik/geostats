package com.geo.geostats;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class IndicatorsDoublePaneNewsView implements IndicatorsAbstractNewsView{

	   private final SherlockFragmentActivity fragmentActivity;

	   public IndicatorsDoublePaneNewsView(SherlockFragmentActivity fragmentActivity) {
	      this.fragmentActivity = fragmentActivity;
	   }

	   @Override public void onCreate(Bundle savedInstanceState) {
	   }

	   @Override public void onArticleSelected(int position) {
	      ((FragmentIndicatorsRecords) fragmentActivity.getSupportFragmentManager().findFragmentById(
	         R.id.fRecord)).updateArticleView(position);
	   }

	}