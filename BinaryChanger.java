//
// Ainsley Weaver
// CSCE 145 Section 021
//

import java.util.Scanner;

public class BinaryChanger {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//asks for the first 4-bit number
		System.out.println("Please enter a 4-bit binary number:");
		String binaryNum1 = keyboard.nextLine();
		
		//asks for the second 4-bit number
		System.out.println("Please enter another 4-bit binary number:");
		String binaryNum2 = keyboard.nextLine();
		
		//separates both 4-bit numbers into 4 digits each so the program can go through and read each individually
		char[] nums1 = new char[binaryNum1.length()];
		char[] nums2 = new char[binaryNum2.length()];
		for (int i=0; i<binaryNum1.length(); i++) {
			nums1[i] = binaryNum1.charAt(i);
			nums2[i] = binaryNum2.charAt(i);
		}
		
		//checks each digit in the first 4-bit number to see what equals 1 and what equals 0
		int total1 = 0;
		for (int i=0; i<binaryNum1.length(); i++) {
			int binaryValue = 0;
			if (nums1[i]=='1') {
				if (i==0) {
					binaryValue = 8;
				}
				else if (i==1) {
					binaryValue = 4;
				}
				else if (i==2) {
					binaryValue = 2;
				}
				else {
					binaryValue = 1;
				}
			}
			total1 = total1 + binaryValue;
		}
		
		//checks each digit in the second 4-bit number to see what equals 1 and what equals 0
		int total2 = 0;
		for (int i=0; i<binaryNum2.length(); i++) {
			int binaryValue = 0;
			if (nums2[i]=='1') {
				if (i==0) {
					binaryValue = 8;
				}
				else if (i==1) {
					binaryValue = 4;
				}
				else if (i==2) {
					binaryValue = 2;
				}
				else {
					binaryValue = 1;
				}
			}
			total2 = total2 + binaryValue;
		}
		
		//adds up the total numbers that each 4-bit number was equal to
		int actualTotal = total1 + total2;
		
		//prints out the total of 4-bit one and 4-bit two, then the total of both added together
		System.out.println("The first number you entered is " + total1);
		System.out.println("The second number you entered is " + total2);
		System.out.println("Added together they equal " + actualTotal);
	}

}
