package com.geo.geostats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class Indicators extends SherlockFragmentActivity implements FragmentIndicatorsList.OnHeadlineSelectedListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.indicators);
		
		if (findViewById(R.id.fragment_container) != null) {
			if (savedInstanceState != null) {
                return;
            }
			FragmentIndicatorsList firstFragment = new FragmentIndicatorsList();
			firstFragment.setArguments(getIntent().getExtras());
			
			getSupportFragmentManager().beginTransaction()
            .add(R.id.fragment_container, firstFragment).commit();
			
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	        getSupportActionBar().setHomeButtonEnabled(true);
	        
	        ActionBar actionbar = getSupportActionBar();
	        actionbar.setTitle(getString(R.string.Indicators));
			
		}

        
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
	
	public void onArticleSelected(int position) {

        FragmentIndicatorsRecords articleFrag = (FragmentIndicatorsRecords)
                getSupportFragmentManager().findFragmentById(R.id.fRecord);

        if (articleFrag != null) {

            articleFrag.updateArticleView(position);

        } else {

        	FragmentIndicatorsRecords newFragment = new FragmentIndicatorsRecords();
            Bundle args = new Bundle();
            args.putInt(FragmentIndicatorsRecords.ARG_POSITION, position);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            transaction.commit();
        }
    }

}
