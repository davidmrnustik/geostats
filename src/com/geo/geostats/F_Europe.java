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

	Button btD1O, btD2O, btD3O, btD4O, btD5O, btD6O, btD7O, btD8O, btClose;
	ViewPager vp;
	private vpAdapter miAdapter;
	public final int limit = 0;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

		View v = inflater.inflate(R.layout.f_europe, container, false);
		
		vp = (ViewPager) v.findViewById(R.id.viewpager);
        miAdapter = new vpAdapter();
        vp.setAdapter(miAdapter);
        //vp.setOffscreenPageLimit(limit);
		
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
				Button btD2O = (Button) v.findViewById(R.id.btDialog2);
				
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
												
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_countries);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});
				
				btD2O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_eu_countries);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});		
				
				break;
			case 1:
				v = inflater.inflate(R.layout.vp_europe_population, null);
				Button btD3O = (Button) v.findViewById(R.id.btDialog3);
				Button btD4O = (Button) v.findViewById(R.id.btDialog4);
				
				btD3O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_population);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});
				
				btD4O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_eu_population);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});
				
				break;
			case 2:
				v = inflater.inflate(R.layout.vp_europe_cities, null);
				
				Button btD5O = (Button) v.findViewById(R.id.btDialog5);
				Button btD6O = (Button) v.findViewById(R.id.btDialog6);
				
				btD5O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_cities);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});	
				
				btD6O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_urban_areas);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});	
				
				break;
			case 3:
				v = inflater.inflate(R.layout.vp_europe_capitals, null);
				break;
			case 4:
				v = inflater.inflate(R.layout.vp_europe_mountains, null);
				
				Button btD7O = (Button) v.findViewById(R.id.btDialog7);
				Button btD8O = (Button) v.findViewById(R.id.btDialog8);
				
				btD7O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_mountains_kmd);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});	
				
				btD8O.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Dialog d = new Dialog(F_Europe.this.getActivity(), R.style.DialogContinents);
						d.setCancelable(true);
						d.setContentView(R.layout.d_europe_mountains_cc);
						d.setCanceledOnTouchOutside(true);
						Button btClose = (Button) d.findViewById(R.id.btClose);
						btClose.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								d.cancel();
							}
						});
						d.show();
					}
				});	
				
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

