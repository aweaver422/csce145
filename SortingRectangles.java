//
//
// Ainsley Weaver | CSCE 145 021
//
//

import java.util.Scanner;

public class SortingRectangles {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many rectangles would you like to sort?");
		int rectangles = keyboard.nextInt();

		int[] widths = new int[rectangles];
		int[] lengths = new int[rectangles];
		int[] areas = new int[rectangles];

		//Creating Triangles
		for (int i = 0; i < rectangles; i++) {
			System.out.println("Enter width for Triangle " +  (i+1));
			widths[i] = keyboard.nextInt();
			System.out.println("Enter length for Triangle " + (i+1));
			lengths[i] = keyboard.nextInt();
		}

		//Calculates Areas
		for (int j = 0; j < rectangles; j++) {
			areas[j] = widths[j] * lengths[j];
		}

		keyboard.nextLine();

		//Options
		while (true) {
			System.out.println("\nWould you like to sort the rectangles, find the average area, find the minimum area, or find the maximum area?");
			System.out.println("If so, please type one of the following options: \nSORT, AVERAGE, MIN, MAX, or QUIT to stop.");
			String choice = keyboard.nextLine();
			System.out.println(choice);			

			//SORTING
			if (choice.equals("sort")) {
				while (true) {
					System.out.println("\nWould you like to sort from smallest to largest or largest to smallest? Type sTl for option 1, and lTs for option 2.");
					String choice2 = keyboard.nextLine().toLowerCase();
					//SORTING SMALLEST TO LARGEST
					if (choice2.equals("stl")) {
						System.out.println("\nRectangles' Areas from Smallest to Largest:");
						for (int i = 0; i < rectangles; i++) {
							for (int j = i+1; j < rectangles; j++) {
								if (areas[i] > areas[j]) {
									//the following lines switch the placement of values in the array
									int temp = areas[i];
									areas[i] = areas[j];
									areas[j] = temp;
								}
							}
						}
						for (int e = 0; e < rectangles; e++) {
							System.out.print(areas[e] + " \n");
						}
						break;
					}
					//SORTING LARGEST TO SMALLEST
					if (choice2.equals("lts")) {
						System.out.println("\nRectangles' Areas from Largest to Smallest:");
						for (int i = 0; i < rectangles; i++) {
							for (int j = i+1; j < rectangles; j++) {
								if (areas[i] < areas[j]) {
									//the following lines switch the placement of values in the array
									int temp = areas[i];
									areas[i] = areas[j];
									areas[j] = temp;
								}
							}
						}
						for (int e = 0; e < rectangles; e++) {
							System.out.print(areas[e] + " \n");
						}
						break;
					}
					else {
						System.out.println("Invalid Input. Please choose one of the options above.");
					}
				}
			}

			//FINDING AVERAGE AREA
			else if (choice.equals("average")) {
				System.out.println("\nAverage Area of All Rectangles:");
				int holder = 0;
				for (int i = 0; i < rectangles; i++) {
					holder = areas[i] + holder;
				}
				holder = holder / rectangles;
				System.out.println(holder);
			}

			//FINDING MIN AREA
			else if (choice.equals("min")) {
				System.out.println("\nMinimum Area in Collection:");
				int holder = areas[0];
				for (int i = 0; i < rectangles; i++) {
					if (areas[i] < holder) {
						holder = areas[i];
					}
				}
				System.out.println(holder);
			}

			//FINDING MAX AREA
			else if (choice.equals("max")) {
				System.out.println("\nMaximum Area in Collection");
				int holder = areas[0];
				for (int i = 0; i < rectangles; i++) {
					if (areas[i] > holder) {
						holder = areas[i];
					}
				}
				System.out.println(holder);
			}

			//QUITTING PROGRAM
			else if (choice.equals("quit")) {
				System.out.println("\nQuitting...Thank you for using the Rectangle Sorter");
				break;
			}

			//INVALID INPUT
			else {
				System.out.println("\nPlease pick an option from the list above.");
			}
		}
	}
}
