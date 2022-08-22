package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class First_Program {

	public static void main(String[] args) {
		int sum = 0;
		int prod = 1;
		ArrayList<Integer> inputArray = new ArrayList<Integer>(5);
		
		Scanner scanObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter 5 numbers: ");
	    
	    for (int i=0; i<5 ; i++) {
	    	int num = scanObj.nextInt();  // Read user input
	    	inputArray.add(num);
	    }
	    System.out.println("Your sorted numbers look like this: ");
	    Collections.sort(inputArray);
	    
	    for(int value : inputArray) {
	    	sum += value;
	    	prod *= value;
	    	System.out.println(value);
	    }
	    
	    System.out.println("The sum of all elements is: " + sum);
	    System.out.println("The product of all elements is: " + prod);
	    System.out.println("The smallest of all elements is: " + inputArray.get(0));
	    System.out.println("The largest of all elements is: " + inputArray.get(inputArray.size()-1));    
	}

}