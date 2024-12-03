//
// Ainsley Weaver
// CSCE 145, Section 021
//

import java.util.Scanner;
public class triangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Triangle Maker! Enter the size of the triangle.");
		//asks the user to input a value for the triangle
		int triangle = keyboard.nextInt();
		//declares the starting number of stars for the triangle
		int i = 1;
		String star = "*";
		//asks if triangle is a number greater than zero
		if (triangle > 0) {
			//asks if i is equal to the number user input for the triangle, will run until the numbers are equal
			while (i!=triangle) {
				System.out.println(star);
				//adds one to i, clarifying that there are now i stars. used to show what the number has reached at this point
				i++;
				//adds another star to the string
				star = star + "*";
			}
			//if i equals the input number for triangle, it will now decrease the number of stars
			while (i > 0) {
				//prints the star
				System.out.println(star);
				//subtracts one from i, now there are i stars.
				i--;
				//the value of star is not changed, instead, the program just pulls out the necessary amount to complete the triangle
				star = star.substring(0,i);
			}
		}
		//if the number equals zero or less, the program does not run
		else {
			//just clarifies if the program does not work/if input does not equal correct thing
			System.out.println("error");
			System.exit(0);
		}

	}

}
