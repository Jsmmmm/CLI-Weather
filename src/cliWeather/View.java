package cliWeather;

import tk.plogitech.darksky.forecast.model.Forecast;

public final class View {
	
	private View(){
		
	}
	
	protected static void printMenu() {
		
		System.out.println("Which city's weather should i check?");
		System.out.println("1. Kamppi");
		System.out.println("2. Haukilahti");
		System.out.println("3. Vaasa");
		System.out.println("4. Haag");
		System.out.println(">");
	}
	
	//there's more properties about weather in the forecast object than what is used now
	//https://darksky.net/dev/docs/forecast
	protected static void printWeather(Forecast forecast){
		
		System.out.println("Summary: "+forecast.getCurrently().getIcon());
		System.out.println("Degrees: " + forecast.getCurrently().getTemperature());
		System.out.println("Humidity: "+forecast.getCurrently().getHumidity());
		System.out.println("Wind Speed: "+forecast.getCurrently().getWindSpeed());
	}
	
	protected static void printWelcomeMessage(){
		
		System.out.println("Hello, Sir!");
	}
	
	protected static void printGoodbyeMessage(){
		
		System.out.println("Good Bye, Sir!");
	}
	
}
