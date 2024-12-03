//
// Ainsley Weaver
// CSCE 145 Sec 021
//

import java.util.Scanner;
public class DetermineZodiac {

	public static void main(String[] args) {
		System.out.println("What is your zodiac?");
		System.out.println("Enter your birthday. Month followed by the day in numbers:");
		Scanner keyboard = new Scanner(System.in);
		//declares the birth month of the user
		int month = keyboard.nextInt();
		//declares the birth day of the user
		int day = keyboard.nextInt(); 
		//checks to see if month is between 1 and 12
		if (month >=1 && month <=12) {
			if (month==2) {
				int correctDay = 29;
				//checks to see if day is between 1 and 29
				if (day<=correctDay && day>=1) {
					if (day<=18) {
						System.out.println("Your zodiac sign is Aquarius!");
					}
					else {
						System.out.println("Your zodiac sign is Pisces!");
					}
				}
				else {
					//lets user know the day they input is not between 1 and 29
					System.out.println("Invalid Day. The month entered only has days 1-29.");
				}
			}
			else if (month==4 || month==6 || month==9 || month==11) {
				//checks to see if day is between 1 and 30
				//apri jun, sep, and nov are grouped together because they all have 30 days
				if (day<=30 && day>=1) {
					if (month==4) {
						if (day<=19) {
							System.out.println("Your zodiac sign is Aries!");
						}
						else {
							System.out.println("Your zodiac sign is Taurus!");
						}
					}
					else if (month==6) {
						if (day<=20) {
							System.out.println("Your zodiac sign is Gemini!");
						}
						else {
							System.out.println("Your zodiac sign is Cancer!");
						}
					}
					else if (month==9) {
						if (day<=22) {
							System.out.println("Your zodiac sign is Virgo!");
						}
						else {
							System.out.println("Your zodiac sign is Libra!");
						}
					}
					else if (month==11) {
						if (day<=21) {
							System.out.println("Your zodic sign is Scorpio!");
						}
						else {
							System.out.println("Your zodiac sign is Sagittarius!");
						}
					}
				}
				else {
					//lets user know the day they input is not between 1 and 30
					System.out.println("Invalid Day: The month entered only has days 1-30.");
				}
			}
			else {
				//checks to see if day is between 1 and 31
				//jan, mar, may, jul, aug, oct, and dec are grouped together because they all have 31 days
				if (day<=31 && day>=1) {
					if (month==1) {
						if (day<=19) {
							System.out.println("Your zodiac sign is Capricorn!");
						}
						else {
							System.out.println("Your zodiac sign is Aquarius!");
						}
					}
					else if (month==3) {
						if (day<=20) {
							System.out.println("Your zodiac sign is Pisces!");
						}
						else {
							System.out.println("Your zodiac sign is Aries!");
						}
					}
					else if (month==5) {
						if (day<=20) {
							System.out.println("Your zodiac sign is Taurus!");
						}
						else {
							System.out.println("Your zodiac sign is Gemini!");
						}
					}
					else if (month==7) {
						if (day<=22) {
							System.out.println("Your zodiac sign is Cancer!");
						}
						else {
							System.out.println("Your zodiac sign is Leo!");
						}
					}
					else if (month==8) {
						if (day<=22) {
							System.out.println("Your zodiac sign is Leo!");
						}
						else {
							System.out.println("Your zodiac sign is Virgo!");
						}
					}
					else if (month==10) {
						if (day<=22) {
							System.out.println("Your zodiac sign is Libra!");
						}
						else {
							System.out.println("Your zodiac sign is Scorpio!");
						}
					}
					else if (month==12) {
						if (day<=21) {
							System.out.println("Your zodiac sign is Sagittarius!");
						}
						else {
							System.out.println("Your zodiac sign is Capricorn!");
						}
					}
				}
				else {
					//lets user know the day they input is not between 1 and 31
					System.out.println("Invalid Day. The month entered only has days 1-31.");
					}
				}
		}
		else {
			//lets user know month they input it not between 1 and 12
			System.out.println("Invalid month!");
		}
	}
}
