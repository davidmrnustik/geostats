package com.geo.geostats;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.geo.geostats.FragmentIndicatorsList.OnHeadlineSelectedListener;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;

public class BranchesFragmentManager extends SherlockFragmentActivity implements OnHeadlineSelectedListener {
	IndicatorsAbstractNewsView indicatorsAbstractNewsView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.branches_fragment_manager);
		
		indicatorsAbstractNewsView = new IndicatorsAbstractNewsViewProvider(this).get();
	    indicatorsAbstractNewsView.onCreate(savedInstanceState);
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        
        ActionBar actionbar = getSupportActionBar();
        
        Bundle bag = getIntent().getExtras();
        
        if(bag.getString("GEO").equals("G1")){
        	actionbar.setTitle(getString(R.string.PhysicalGeography));
        }else if(bag.getString("GEO").equals("G2")){
        	actionbar.setTitle(getString(R.string.PoliticalUrbanGeography));
        }else if(bag.getString("GEO").equals("G3")){
        	actionbar.setTitle(getString(R.string.EconomicGeography));
        }
        
	}
	
	@Override public void onArticleSelected(int position) {
		   indicatorsAbstractNewsView.onArticleSelected(position);
	}
	
	@Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item){
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
			
		case android.R.id.home:
			FragmentManager fm= getSupportFragmentManager();
			 if(fm.getBackStackEntryCount()>0){
			   fm.popBackStack();
			}else{
				NavUtils.navigateUpFromSameTask(this);
			}
		}	
		
		return true;
	}
	
}
