//
// Ainsley Weaver
// CSCE 145 Section 021
//
package aBelowAverageWinter;

import java.util.Scanner;
public class aBelowAverageWinter {

	public static void main(String[] args) {

		float[] array = new float[10];
		Scanner keyboard = new Scanner(System.in);
		//variable is used temporarily to hold values later on in the program, specifically lines 22, 25, and 28.
		float num = 0;
		System.out.println("Welcome to the below average temperature tester program.");
		//program asks for the temperatures from ten different days, the number of days specified by the array length
		for (int i=0; i<array.length; i++) {
			System.out.println("Please enter the temperature for Day " + (i+1));
			array[i] = keyboard.nextFloat();
			//creates a variable to hold the total temperature, which is num + the number inputted by user
			float totalTemp = num + array[i];
			//holds the value for the totalTemp since it changes once the program runs again.
			//num holds all the temperatures added together
			num = totalTemp;
		}
		//calculates the average temp by dividing num (totalTemp) by the length of the array (or 10)
		float averageTemp = num / array.length ;
		System.out.println("The average temperature was " + averageTemp);
		System.out.println("The days that were below average were");
		//runs through every number in the array
		for (int i=0; i<array.length; i++) {
			//checks to see if the number at that index is less than the averageTemp
			//will not run or print anything if none of the temperatures are less than the averageTemp
			if (array[i] < averageTemp) {
				System.out.println("Day " + (i+1) + " with " + array[i]);
			}
		}
	}

}
