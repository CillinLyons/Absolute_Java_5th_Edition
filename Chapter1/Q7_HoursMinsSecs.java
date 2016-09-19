/*
Write a program that outputs the number of hours, minutes, and seconds 
that corresponds to 50,391 total seconds. 
The output should be 13 hours, 59 minutes, and 51 seconds. 
Test your program with a different number of total seconds to
ensure that it works for other cases.
*/
import java.util.Scanner;

class Q7_HoursMinsSecs
{
	//Declaring constant variables
	public static final double MINUTE = 60,
					HOUR = 3600;
	
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner userInput = new Scanner(System.in);
		
		//Declaring variables
		double hours,
			minutes,
			seconds;
		
		//Entering and storing data
		System.out.println("Enter seconds: ");
		seconds = userInput.nextInt();
		
		//Sending data to the methods for calculation
		hours = calculate_hours(seconds);
		minutes = calculate_minutes (seconds);
		seconds = calculate_seconds (seconds);
		
		//Printing the results
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
	}
	
	//Calculate the total number of hours
	public static double calculate_hours (double totalHours)
	{
		return totalHours / HOUR;
	}
	
	//Calculate the remaining number of minutes
	public static double calculate_minutes (double totalMinutes)
	{
		double remainingMinutes = totalMinutes % HOUR;
		
		return remainingMinutes / MINUTE;
	}
	
	//Calculate the remaining number of seconds
	public static double calculate_seconds (double totalSeconds)
	{
		double theMinutes = totalSeconds % HOUR;
		
		return theMinutes % MINUTE;
	}
}
