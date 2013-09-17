package com.geo.geostats;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.Html;
import android.text.util.Linkify;
import android.widget.TextView;

public class InfoReferences extends SherlockActivity {

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_references);
		
		 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	     getSupportActionBar().setHomeButtonEnabled(true);
	        
	     ActionBar actionbar = getSupportActionBar();
	     actionbar.setTitle(getString(R.string.References));
	     actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
	     
	     tv = (TextView) findViewById(R.id.tvInfoRefs);
	     tv.setText(Html.fromHtml(ResourceHelper.readRawTextFile(this, R.raw.references)));
	     tv.setLinkTextColor(Color.BLACK);
	     Linkify.addLinks(tv, Linkify.ALL);
	}
	
	@Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item){
		super.onOptionsItemSelected(item);
		
		switch(item.getItemId()){
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
	        return true;
		}	

		return true;
	}

	
}
