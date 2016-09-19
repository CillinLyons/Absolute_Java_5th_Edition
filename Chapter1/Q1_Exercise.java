/* One way to measure the amount of energy that is expended during exercise is to
use metabolic equivalents (MET). 

Here are some METS for various activities:
Running 6 MPH: 10 METS
Basketball: 8 METS
Sleeping: 1 MET

The number of calories burned per minute may be estimated using the following
formula:
Calories/Minute = 0.0175 * MET * Weight in kilograms

Write a program that calculates and outputs the total number of calories burned
for a 150-pound person who runs 6 MPH for 30 minutes, plays basketball for
30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds. */

class Q1_Exercise
{
		//Initializing constant variables
		public static final int RUNNING_MET = 10;
		public static final int BASKETBALL_MET = 8;
		public static final int SLEEP_MET = 1;
		
		public static final int RUNNING_MINUTES = 30;
		public static final int BASKETBALL_MINUTES = 30;
		public static final int SLEEP_MINUTES = 360;
		
		public static final double NUMBER = 0.0175;
		public static final double WEIGHT = 150/2.2;
	
	public static void main(String[] args)
	{	
		//Sending various values to the calculateMet method
		double calculateRun = calculateMet(NUMBER, RUNNING_MET, WEIGHT, RUNNING_MINUTES);
		double calculateBasketball = calculateMet(NUMBER, BASKETBALL_MET, WEIGHT, BASKETBALL_MINUTES);
		double calculateSleep = calculateMet(NUMBER, SLEEP_MET, WEIGHT, SLEEP_MINUTES);
		
		//Printing the resutls
		System.out.println("**************************************");
		System.out.println("Activity: Running");
		System.out.println("Minutes: " + RUNNING_MINUTES);
		System.out.println("Calories burnt: " + calculateRun);
		System.out.println("***************************************");
		System.out.println("Activity: Basketball");
		System.out.println("Minutes: " + BASKETBALL_MINUTES);
		System.out.println("Calories burnt: " + calculateBasketball);
		System.out.println("***************************************");
		System.out.println("Activity: Sleep");
		System.out.println("Minutes: " + SLEEP_MINUTES);
		System.out.println("Calories burnt: " + calculateSleep);
		System.out.println("***************************************");
		
	}
	
	//Method to calculate total number of calories burned
	private static double calculateMet(double number, int met, double weight, int time)
	{
		return number * met * weight * time;
	}
}
