package com.geo.geostats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends Activity implements android.view.View.OnClickListener {
	
	Button btWorld, btContinents, btOceans, btBranches, btExit;
	ImageButton btInfoRef;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btWorld = (Button) findViewById(R.id.btIndicators);
		btContinents = (Button) findViewById(R.id.btContinents);
		btOceans = (Button) findViewById(R.id.btOceans);
		btBranches = (Button) findViewById(R.id.btBranches);
		btExit = (Button) findViewById(R.id.btExit);
		btInfoRef = (ImageButton) findViewById(R.id.btInfoRef);
		
		btWorld.setOnClickListener(this);
		btContinents.setOnClickListener(this);
		btOceans.setOnClickListener(this);
		btBranches.setOnClickListener(this);
		btExit.setOnClickListener(this);
		btInfoRef.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btIndicators:
			Intent in = new Intent("com.geo.geostats.INDICATORS");
			
			String name0 = "G0";
			Bundle bag = new Bundle();
			bag.putString("GEO", name0);
			in.putExtras(bag);
			
			startActivity(in);
		break;
		
		case R.id.btBranches:
			Intent b = new Intent("com.geo.geostats.BRANCHES");
			startActivity(b);
		break;
		
		case R.id.btContinents:
			Intent c = new Intent("com.geo.geostats.CONTINENTS");
			startActivity(c);
		break;
		
		case R.id.btOceans:
			Intent o = new Intent("com.geo.geostats.OCEANS");
			startActivity(o);
		break;
		
		case R.id.btInfoRef:
			Intent i = new Intent("com.geo.geostats.ABOUT");
			startActivity(i);
		break;
		
		case R.id.btExit:
			finish();
		break;
		

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.iAbout:
			Intent a = new Intent("com.geo.geostats.ABOUT");
			startActivity(a);
			break;
		
		case R.id.iRefs:
			Intent b = new Intent("com.geo.geostats.INFO_REFERENCES");
			startActivity(b);
			break;
		
		case R.id.iExit:
			finish();
			break;
		}
		return false;
	}
	
	
	
	
    
}
