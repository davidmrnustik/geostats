package com.geo.geostats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends Activity implements android.view.View.OnClickListener {
	
	Button btWorld, btContinents, btOceans, btBranches;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		
		btWorld = (Button) findViewById(R.id.btIndicators);
		btContinents = (Button) findViewById(R.id.btContinents);
		btOceans = (Button) findViewById(R.id.btOceans);
		btBranches = (Button) findViewById(R.id.btBranches);
		
		btWorld.setOnClickListener(this);
		btContinents.setOnClickListener(this);
		btOceans.setOnClickListener(this);
		btBranches.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btIndicators:
			Intent in = new Intent("com.geo.geostats.INDICATORS");
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
		}
	}
    
}
