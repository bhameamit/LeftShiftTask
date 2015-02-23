package com.example.dataclass;

import java.util.ArrayList;

public class Weather {

	String cityname;

	ArrayList<WeatherParameters> weatherParameters;

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public ArrayList<WeatherParameters> getWeatherParameters() {
		return weatherParameters;
	}

	public void setWeatherParameters(
			ArrayList<WeatherParameters> weatherParameters) {
		this.weatherParameters = weatherParameters;
	}

}
