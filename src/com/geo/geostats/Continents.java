package com.geo.geostats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class Continents extends SherlockFragmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.continents);
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        
        ActionBar actionbar = getSupportActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.setTitle(getString(R.string.Continents));
                
        ActionBar.Tab Frag1Tab = actionbar.newTab().setText(getString(R.string.Europe));
        ActionBar.Tab Frag2Tab = actionbar.newTab().setText(getString(R.string.Asia));
        ActionBar.Tab Frag3Tab = actionbar.newTab().setText(getString(R.string.Africa));
        ActionBar.Tab Frag4Tab = actionbar.newTab().setText(getString(R.string.NAmerica));
        ActionBar.Tab Frag5Tab = actionbar.newTab().setText(getString(R.string.SAmerica));
        ActionBar.Tab Frag6Tab = actionbar.newTab().setText(getString(R.string.Oceania));
        ActionBar.Tab Frag7Tab = actionbar.newTab().setText(getString(R.string.Antarctica));
        
        Fragment Fragment1 = new FragmentEurope();
        Fragment Fragment2 = new FragmentAsia();
        Fragment Fragment3 = new FragmentAfrica();
        Fragment Fragment4 = new FragmentNAmerica();
        Fragment Fragment5 = new FragmentSAmerica();
        Fragment Fragment6 = new FragmentOceania();
        Fragment Fragment7 = new FragmentAntarctica();

        
        Frag1Tab.setTabListener(new MyTabsListener(Fragment1));
        Frag2Tab.setTabListener(new MyTabsListener(Fragment2));
        Frag3Tab.setTabListener(new MyTabsListener(Fragment3));
        Frag4Tab.setTabListener(new MyTabsListener(Fragment4));
        Frag5Tab.setTabListener(new MyTabsListener(Fragment5));
        Frag6Tab.setTabListener(new MyTabsListener(Fragment6));
        Frag7Tab.setTabListener(new MyTabsListener(Fragment7));
        
        actionbar.addTab(Frag1Tab);
        actionbar.addTab(Frag2Tab);
        actionbar.addTab(Frag3Tab);
        actionbar.addTab(Frag4Tab);
        actionbar.addTab(Frag5Tab);
        actionbar.addTab(Frag6Tab);
        actionbar.addTab(Frag7Tab);
    }
    
    @Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu){
		getSupportMenuInflater().inflate(R.menu.menu_continents, menu);
		return true;
	}
    
    @Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item){
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		case R.id.menu_oceans:
			
			Intent i = new Intent("com.geo.geostats.OCEANS");
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
