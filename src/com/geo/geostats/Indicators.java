package com.geo.geostats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class Indicators extends SherlockFragmentActivity{
	
	boolean mIsDualPane;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.indicators);
		
		View articleView = findViewById(R.id.fRecords);
        mIsDualPane = articleView != null && 
                        articleView.getVisibility() == View.VISIBLE;
        
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        
        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle(getString(R.string.Indicators));
        
        /*if (findViewById(R.id.fragment_container) != null) {
        	if (savedInstanceState != null) {
                return;
            }
        	
	        FragmentIndicatorsList firstFragment = new FragmentIndicatorsList();
	        
	        firstFragment.setArguments(getIntent().getExtras());
	        
	        getSupportFragmentManager().beginTransaction()
	        .add(R.id.fragment_container, firstFragment).commit();
        
        }*/
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
			NavUtils.navigateUpFromSameTask(this);
	        return true;
		}	
		
		return true;
	}

}
