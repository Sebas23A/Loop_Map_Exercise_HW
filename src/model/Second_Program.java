package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second_Program {

	public static void main(String[] args) {
		boolean validCar = false;
		
		Map<String, String> carsMap = new HashMap<>();
		
		carsMap.put("Gt86", "Toyota");
		carsMap.put("Corvette", "Chevrolet");
		carsMap.put("Mustang", "Ford");
		carsMap.put("Wrangler", "Jeep");
		carsMap.put("Challenger", "Dodge");
		carsMap.put("Camry", "Toyota");
		carsMap.put("Camaro", "Chevrolet");
		carsMap.put("Raptor", "Ford");
		carsMap.put("Grand Wagoneer", "Jeep");
		carsMap.put("Caravan", "Dodge");
		carsMap.put("4Runner", "Toyota");
		carsMap.put("Trailblazer", "Chevrolet");
		carsMap.put("Bronco", "Ford");
		carsMap.put("Compass", "Jeep");
		carsMap.put("Charger", "Dodge");
	
		
	    while (!validCar) {
	    	Scanner scanObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("What car model are you looking for?");
		    String carModel = scanObj.nextLine();  // Read user input
		    
	    	if (carsMap.containsValue(carModel)) {
	    		validCar = true;
	    		System.out.println("Give me a second to pull a list of " + carModel + "'s you might like...");
	    		
	    		for(Map.Entry<String, String> entry: carsMap.entrySet()) {
	    			if (entry.getValue().equals(carModel)) {
	    				String key = entry.getKey();
	        			String value = entry.getValue();
	        			System.out.println(value + ": " + key);
	    			}
	    			
	    		}
	    		
	    		break;
	    	} else {
	    		System.out.println("Unfortunately, we don't have that model at this time, may I ask you: "); 
	    	}
	    }
	  
	}
}