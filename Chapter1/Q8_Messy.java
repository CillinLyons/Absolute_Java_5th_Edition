/*
The following program will compile and run, but it uses poor programming 
style.
Modify the program so that it uses the spelling conventions, constant 
naming conventions, and formatting style recommended in this book.
*/

public class Q8_Messy 
{
	public static final double DISTANCE = 6.21;
	
	public static void main(String[] args)
	{
		double time; 
		double pace;
		
		System.out.println("This program calculates your pace given a time and distance traveled.");
		
		time = 35.5; /* 35 minutes and 30 seconds */
		pace = time / DISTANCE;
		
		System.out.println("Your pace is " + pace + " miles per hour.");
	}
	
}