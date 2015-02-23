package com.example.adapter;

import java.util.ArrayList;

import com.example.dataclass.Weather;
import com.example.leftshifttak.R;

import android.app.ListActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherAdapter extends BaseAdapter{
	
	Context ctx;
    LayoutInflater lInflater;
    ArrayList<Weather> weathers;   
   
    
    public WeatherAdapter(Context context,ArrayList<Weather> weathers) {
        ctx = context;        
        this.weathers= weathers; 
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
        
    }

   
	@Override
    public int getCount() {
        return weathers.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        if (convertView == null) {
            convertView = (View) lInflater.inflate(R.layout.rwo_weather, parent, false);            
        }
        
        TextView city_name = (TextView)convertView.findViewById(R.id.city_name);
        TextView date = (TextView)convertView.findViewById(R.id.date);
        TextView city_pressure = (TextView)convertView.findViewById(R.id.city_pressure);
        TextView city_humidity = (TextView)convertView.findViewById(R.id.city_humidity);
        TextView city_tempmin = (TextView)convertView.findViewById(R.id.city_tempmin);
        TextView city_tempmax = (TextView)convertView.findViewById(R.id.city_tempmax);
        
        city_name.setText("City: "+weathers.get(position).getCityname());
        date.setText("Date: "+weathers.get(position).getWeatherParameters().get(position).getDate());
        /*city_pressure.setText("Pressure: "+weathers.get(position).getPressure());
        city_humidity.setText("Humidity: "+weathers.get(position).getHumidity());
        city_tempmin.setText("Min. Temp: "+weathers.get(position).getTemp_min());
        city_tempmax.setText("Maz. Temp: "+weathers.get(position).getTemp_max());*/
        
        
        return convertView;
    }

    
    



}

