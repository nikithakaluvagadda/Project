package com.training.services;

import java.util.*;
import javax.jws.WebService;
import com.training.ifaces.WeatherService;
@WebService
public class WeatherServiceImpl implements WeatherService {

	@Override
	public String getWeather(String city) {

		Map<String,String> defaValue= new HashMap<String,String>();
		defaValue.put("surise", "6.00am");
		defaValue.put("sunset", "6.20pm");
		defaValue.put("max-temp", "36c");
		defaValue.put("min-temp", "22c");
		if(city.equals("chennai")){
			defaValue.put("surise", "5.30am");
			defaValue.put("sunset", "6.10pm");
			defaValue.put("max-temp", "39c");
			defaValue.put("min-temp", "27c");
		}
		return defaValue.toString();
	}
	
}
