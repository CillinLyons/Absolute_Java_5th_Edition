/*
A simple rule to estimate your ideal body weight is to allow 110 pounds 
for the first 5 feet of height and 5 pounds for each additional inch. 
Write a program with a variable for the height of a person in feet and 
another variable for the additional inches. 
Assume the person is at least 5 feet tall. 
For example, a person that is 6 feet and 3 inches tall would be represented
with a variable that stores the number 6 and another variable that stores 
the number 3. Based on these values, calculate and output the ideal body 
weight.
*/

import java.util.Scanner;

public class Q9_IdealWeight
{
	public static final double FIVE_FOOT_WEIGHT = 110,
								ADDITIONAL_INCHE_WEIGHT = 5,
								FIVE_FOOT_IN_INCHES = 60;
	public static final int ONE_FOOT = 12;
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		int heightFeet;
		double heightInches;
		double feetToInches;
		double totalHeightInInches;
		double weightInFeet;
		double weightInInches;
		double personsWeight;
		
		System.out.println("Enter height in feet: ");
		heightFeet = userInput.nextInt();
		
		System.out.println("Enter remaining inches: ");
		heightInches = userInput.nextInt();
		
		feetToInches = convert_feet_to_inches(heightFeet);
		totalHeightInInches = calculate_total_height_inches(feetToInches, heightInches);
		personsWeight = calculate_weight(totalHeightInInches);
		
		System.out.println("Your ideal weight is: " + personsWeight + "pounds");
	}
	
	public static int convert_feet_to_inches(int feet)
	{
		return feet * ONE_FOOT;
	}
	
	public static double calculate_total_height_inches(double remainingInches, double feetInInches)
	{
		return remainingInches + feetInInches;
	}
	
	public static double calculate_weight(double totalInches)
	{
		
		double inches = totalInches - FIVE_FOOT_IN_INCHES;
		double inchesToPound = inches * ADDITIONAL_INCHE_WEIGHT;
		
		return inchesToPound + FIVE_FOOT_WEIGHT;
	}
}