package com.geo.geostats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class Oceans extends SherlockFragmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oceans);
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        
        ActionBar actionbar = getSupportActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.setTitle(getString(R.string.Oceans));
                
        ActionBar.Tab Frag1Tab = actionbar.newTab().setText(getString(R.string.AtlanticOcean));
        ActionBar.Tab Frag2Tab = actionbar.newTab().setText(getString(R.string.PacificOcean));
        ActionBar.Tab Frag3Tab = actionbar.newTab().setText(getString(R.string.IndianOcean));
        ActionBar.Tab Frag4Tab = actionbar.newTab().setText(getString(R.string.ArcticOcean));
        ActionBar.Tab Frag5Tab = actionbar.newTab().setText(getString(R.string.SouthernOcean));
        
        Fragment Fragment1 = new FragmentAtlanticO();
        Fragment Fragment2 = new FragmentPacificO();
        Fragment Fragment3 = new FragmentIndianO();
        Fragment Fragment4 = new FragmentArcticO();
        Fragment Fragment5 = new FragmentSouthernO();

        
        Frag1Tab.setTabListener(new MyTabsListener(Fragment1));
        Frag2Tab.setTabListener(new MyTabsListener(Fragment2));
        Frag3Tab.setTabListener(new MyTabsListener(Fragment3));
        Frag4Tab.setTabListener(new MyTabsListener(Fragment4));
        Frag5Tab.setTabListener(new MyTabsListener(Fragment5));
        
        actionbar.addTab(Frag1Tab);
        actionbar.addTab(Frag2Tab);
        actionbar.addTab(Frag3Tab);
        actionbar.addTab(Frag4Tab);
        actionbar.addTab(Frag5Tab);
    }
    
    @Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu){
		getSupportMenuInflater().inflate(R.menu.menu_oceans, menu);
		return true;
	}
    
    @Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item){
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		case R.id.menu_continents:
			
			Intent i = new Intent("com.geo.geostats.CONTINENTS");
			startActivity(i);
			
			break;
			
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
	        return true;
		}	
		
		return true;
	}
    
    class MyTabsListener implements ActionBar.TabListener {
    	public Fragment fragment;
    	
    	public MyTabsListener(Fragment fragment){
    		this.fragment = fragment;
    	}
    	
    	@Override
    	public void onTabSelected(Tab tab, FragmentTransaction ft) { //associated with TabListener
    		ft.replace(R.id.tabs_container, fragment);
    	}
    	
    	@Override
    	public void onTabUnselected(Tab tab, FragmentTransaction ft) { //associated with TabListener
    		//TO-DO
    	}
    	
    	@Override
    	public void onTabReselected(Tab tab, FragmentTransaction ft) { //associated with TabListener
    		//TO-DO
    	}
    }
}
