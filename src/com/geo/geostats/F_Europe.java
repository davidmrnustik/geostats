package com.geo.geostats;

import java.util.Locale;

import com.geo.geostats.Constants;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.actionbarsherlock.app.SherlockFragment;
import com.viewpagerindicator.TabPageIndicator;

public class F_Europe extends SherlockFragment {

	Button btD1O, btD1C;
	ViewPager vp;
	private vpAdapter miAdapter;
	public final int limit = 0;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

		View v = inflater.inflate(R.layout.f_europe, container, false);
		
		vp = (ViewPager) v.findViewById(R.id.viewpager);
        miAdapter = new vpAdapter();
        vp.setAdapter(miAdapter);
        vp.setOffscreenPageLimit(limit);
		
        TabPageIndicator indicator = (TabPageIndicator)v.findViewById(R.id.indicator);
        indicator.setViewPager(vp);
        
		return v;
	}
	private class vpAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 9;
		}
		
		public CharSequence getPageTitle(int position) {
            return Constants.CONTENT[position % Constants.CONTENT.length].toUpperCase(Locale.getDefault());
        }

		@Override
		public boolean isViewFromObject(View view, Object object) {
			// TODO Auto-generated method stub
			return view == ((LinearLayout)object);
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			// TODO Auto-generated method stub
			((ViewPager)container).removeView((LinearLayout)object);
		}

		@Override
		public void finishUpdate(ViewGroup container) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object instantiateItem(View container, int position) {
			// TODO Auto-generated method stub
			
			LayoutInflater inflater = (LayoutInflater)container.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View v = null;
			switch(position){
			case 0:
				v = inflater.inflate(R.layout.vp_europe_countries, null);
				
				Button btD1O = (Button) v.findViewById(R.id.btDialog);
				
				
				btD1O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						
						// OK version with AlertDialog 
						
						/*AlertDialog.Builder d = new AlertDialog.Builder(F_Europe.this.getActivity());
						LayoutInflater inflater = F_Europe.this.getActivity().getLayoutInflater();
						d.setView(inflater.inflate(R.layout.vp_africa_countries, null))
						.setIcon(R.drawable.content_remove)
						.setMessage(R.string.MostPopulatedCountries)
							.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int id) {
									// TODO Auto-generated method stub
									
								}
							}).create();
						d.show();*/
						
						
						
						final Dialog d = new Dialog(F_Europe.this.getActivity());
						d.setTitle("Nadpis");
						//d.setCancelable(true);
						d.setContentView(R.layout.d_europe_countries);
						Button btD1C = (Button) d.findViewById(R.id.btClose);
						btD1C.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.dismiss();
							}
						});
						
						/*d.setOnCancelListener(new OnCancelListener() {
							public void onCancel(final DialogInterface arg0) {
					            d.cancel();
							}
				        });*/
						
						d.show();
					}
				});				
				
				break;
			case 1:
				v = inflater.inflate(R.layout.vp_europe_population, null);
				break;
			case 2:
				v = inflater.inflate(R.layout.vp_europe_cities, null);
				break;
			case 3:
				v = inflater.inflate(R.layout.vp_europe_capitals, null);
				break;
			case 4:
				v = inflater.inflate(R.layout.vp_europe_mountains, null);
				break;
			case 5:
				v = inflater.inflate(R.layout.vp_europe_islands, null);
				break;
			case 6:
				v = inflater.inflate(R.layout.vp_europe_rivers, null);
				break;
			case 7:
				v = inflater.inflate(R.layout.vp_europe_lakes, null);
				break;
			case 8:
				v = inflater.inflate(R.layout.vp_europe_weather, null);
				break;
			}
			((ViewPager)container).addView(v, 0);
			return v;
		}

		@Override
		public Parcelable saveState() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void startUpdate(ViewGroup container) {
			// TODO Auto-generated method stub
			
		}
	}
}

