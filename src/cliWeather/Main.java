package cliWeather;

import java.util.Scanner;

public class Main {

	public static void main(String[]args){
		
		View.printWelcomeMessage();
		
		Scanner keyboard = new Scanner(System.in);
		
		View.printMenu();
		int choice = keyboard.nextInt();
		
		switch(choice) {
		//kamppi
		case 1: Weather.getWeather(24.93107, 60.16746);			
			break;
		//haukilahti	
		case 2: Weather.getWeather(24.77064, 60.15969);
			break;
		//vaasa	
		case 3: Weather.getWeather(21.61646, 63.09509);			
			break;
		//haag	
		case 4: Weather.getWeather(4.30070, 52.07050);
			break;
			
		default: break;	
		
		}
		
		View.printGoodbyeMessage();
		
		keyboard.close();
		
	}

}
