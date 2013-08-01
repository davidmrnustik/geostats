package com.geo.geostats;

import android.os.Bundle;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.geo.geostats.FragmentIndicatorsList.OnHeadlineSelectedListener;

public class Indicators extends SherlockFragmentActivity implements OnHeadlineSelectedListener {
	IndicatorsAbstractNewsView indicatorsAbstractNewsView;
	
	@Override public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.indicators);
	      indicatorsAbstractNewsView = new IndicatorsAbstractNewsViewProvider(this).get();
	      indicatorsAbstractNewsView.onCreate(savedInstanceState);
	      
	      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	      getSupportActionBar().setHomeButtonEnabled(true);
	        
	      ActionBar actionbar = getSupportActionBar();
	      actionbar.setTitle(getString(R.string.Indicators));
	      
	   }

	   @Override public void onArticleSelected(int position) {
		   indicatorsAbstractNewsView.onArticleSelected(position);
	   }
	   
	   @Override
		public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu){
			getSupportMenuInflater().inflate(R.menu.menu_branches, menu);
			return true;
		}
	   
	   @Override
		public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item){
			super.onOptionsItemSelected(item);
			switch(item.getItemId()){
			case R.id.menu_branches:

				Intent i = new Intent("com.geo.geostats.BRANCHES");
				startActivity(i);

				break;

			case android.R.id.home:
				NavUtils.navigateUpFromSameTask(Indicators.this);
		        return true;
			}	

			return true;
		}
	}
