//
//
// Ainsley Weaver
// CSCE 145 Section 021
//
//

import java.util.Scanner;

public class DateAndTimeTester {
	private static String month;
	private static String day;
	private static String time;
	private static String hour;
	private static String minute;
	private static String date;
	private static String exit = "";

	public void run() 
	{
		//will loop until the user types quit
		while (true) {
			//ends the program if the user types quit
			if (exit.equals("quit")) {
				System.out.println("Quitting...Thank you for using the Date And Time Tester!");
				break;
			}
			//main area where the program runs and validates the date/time
			else {
				System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid.");
				Scanner keyboard = new Scanner(System.in);
				String dateAndTime = keyboard.nextLine();				
				//prints out if date and time are valid
				if (isValid(dateAndTime) == true)
				{
					System.out.println("The date and time are valid!");
				}
				else {
					System.out.println("The date and time are not valid");
				}
				System.out.println("Would you like to exit? Type 'quit' to exit or press [ENTER] to continue");
				exit = keyboard.nextLine();
			}
		}
	}

	//returns true or false depending on if isValidDate and isValidTime return true
	public boolean isValid(String dateTime)
	{
		//creates a character array to separate everything in the date/time variable
		String[] placeholder = dateTime.split(" ");
		date = placeholder[0];
		time = placeholder[1];	
		//checks the date and time
		if (isValidDate(date) == true && isValidTime(time) == true) {
			return true;
		}
		else {
			return false;
		}
	}

	//returns true or false depending on if date is a valid input
	public boolean isValidDate(String date)
	{
		//creates a character array to separate the month and day
		String[] placeholder = date.split("/");
		month = placeholder[0];
		day = placeholder[1];
		int intMonth = getMonth();
		int intDay = getDay();
		//checks to see if month is equal to one that consists of 31 days
		if (intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10 || intMonth == 12) 
		{
			if (intDay <= 31 && intDay >= 1) {
				return true;
			}
			else {
				return false;
			}
		}
		//checks to see if month is equal to one that consists of 30 days
		else if (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) {
			if (intDay <= 30 && intDay >= 1) {
				return true;
			}
			else {
				return false;
			}
		}
		//checks to see if month is equal to one that consists of 28 days (so just february)
		else if (intMonth == 2) {
			if (intDay <= 28 && intDay >= 1) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	//returns true/false after checking to see if the time is correct
	public boolean isValidTime(String time)
	{
		//creates a character array to separate the hour and minute
		String[] placeholder = time.split(":");
		hour = placeholder[0];
		minute = placeholder[1];
		int intHour = getHour();
		int intMinute = getMinute();
		//checks to see if the hour is between 0 and 24, and if the minute is between 0 and 60
		if (intHour <= 24 && intHour >= 0 && intMinute <=60 && intMinute >=0) 
		{
			return true;
		}
		else {
			return false;
		}
	}

	//returns number representing month for string
	public int getMonth()
	{
		int monthInt = Integer.parseInt(month);
		return monthInt;
	}

	//return number representing day for string
	public int getDay()
	{
		int dayInt = Integer.parseInt(day);
		return dayInt;
	}

	//return number representing hour for string
	public int getHour()
	{
		int hourInt = Integer.parseInt(hour);
		return hourInt;

	}

	//return number representing minute for string
	public int getMinute()
	{
		int hourMinute = Integer.parseInt(minute);
		return hourMinute;
	}
}
