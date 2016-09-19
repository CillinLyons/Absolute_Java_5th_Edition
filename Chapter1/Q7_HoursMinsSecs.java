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
	public static final double MINUTE = 60,
								HOUR = 3600;
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		double hours;
		double minutes;
		double seconds;
		
		System.out.println("Enter seconds: ");
		seconds = userInput.nextInt();
		
		hours = calculate_hours(seconds);
		minutes = calculate_minutes (seconds);
		seconds = calculate_seconds (seconds);
		
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
	}
	
	public static double calculate_hours (double totalHours)
	{
		return totalHours / HOUR;
	}
	
	public static double calculate_minutes (double totalMinutes)
	{
		double remainingMinutes = totalMinutes % HOUR;
		
		return remainingMinutes / MINUTE;
	}
	
	public static double calculate_seconds (double totalSeconds)
	{
		double theMinutes = totalSeconds % HOUR;
		
		return theMinutes % MINUTE;
	}
}