package cliWeather;

import tk.plogitech.darksky.api.jackson.DarkSkyJacksonClient;
import tk.plogitech.darksky.forecast.APIKey;

import tk.plogitech.darksky.forecast.ForecastException;
import tk.plogitech.darksky.forecast.ForecastRequest;
import tk.plogitech.darksky.forecast.ForecastRequestBuilder;
import tk.plogitech.darksky.forecast.GeoCoordinates;
import tk.plogitech.darksky.forecast.Latitude;
import tk.plogitech.darksky.forecast.Longitude;
import tk.plogitech.darksky.forecast.model.Forecast;

public class Weather {

	protected static void getWeather(double longitude, double latitude){				
		
		ForecastRequest request = new ForecastRequestBuilder()
				.key(new APIKey("8cb14b9c71e9fa59c12bc52c438e8bd7"))
				.location(new GeoCoordinates(new Longitude(longitude), new Latitude(latitude))).build();
		
		DarkSkyJacksonClient client = new DarkSkyJacksonClient();
		Forecast forecast = null;
		try {
			forecast = client.forecast(request);
		} catch (ForecastException e) {			
			e.printStackTrace();
		}
		
		if(forecast != null){
			View.printWeather(forecast);
		}
		
	}
}
