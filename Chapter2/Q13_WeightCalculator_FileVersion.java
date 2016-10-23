/*
(This is an extension of an exercise from Chapter 1 .) A simple rule to 
estimate your ideal body weight is to allow 110 pounds for the first 5 feet 
of height and 5 pounds for each additional inch. Create the following text 
in a text file. It contains the names and heights in feet and inches of 
Tom Atto (6’3), Eaton Wright (5’5), and Cary Oki(5’11):
Tom Atto
6
3
Eaton Wright
5
5
Cary Oki
5
11
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q13_WeightCalculator_FileVersion
{
	//Declaring constant variables
	public static final double FIVE_FOOT_WEIGHT = 110,
								ADDITIONAL_INCHE_WEIGHT = 5,
								FIVE_FOOT_IN_INCHES = 60;
	public static final int ONE_FOOT = 12;
	
	public static void main(String[] args)
	{
		//Declaring variables
		int tomHeightFeet;
		int eatonHeightFeet;
		int caryHeightFeet;
		
		int tomHeightInches;
		int eatonHeightInches;
		int caryHeightInches;
		
		double feetToInches;
		double totalHeightInInches;
		double weightInFeet;
		double weightInInches;
		double personsWeight;
		
		//Declaring scanner object
		Scanner fileIn = null ; // Initializes fileIn to empty
		
		//Try catch statement to try and open file
		try
		{
		// Attempt to open the file
		fileIn = new Scanner(
		new FileInputStream("Profiles.txt"));
		}
		catch (FileNotFoundException e)
		{
			// This block executed if the file is not found
			// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		
		//Retrieve and store 'toms' details
		String tomsName = fileIn.nextLine();
		tomHeightFeet = fileIn.nextInt();
		tomHeightInches = fileIn.nextInt();
		
		//To get rid of '\n'
		String junk1 = fileIn.nextLine();
		
		//Retrieve and store 'eatons' details
		String eatonsName = fileIn.nextLine();
		eatonHeightFeet = fileIn.nextInt();
		eatonHeightInches = fileIn.nextInt();
		
		//To get rid of '\n'
		String junk2 = fileIn.nextLine();
		
		//Retrieve and store 'carys' details
		String carysName = fileIn.nextLine();
		caryHeightFeet = fileIn.nextInt();
		caryHeightInches = fileIn.nextInt();
		
		//Calculating toms ideal weight
		feetToInches = convert_feet_to_inches(tomHeightFeet);
		totalHeightInInches = calculate_total_height_inches(feetToInches, tomHeightInches);
		double tomsWeight = calculate_weight(totalHeightInInches);
		
		//Calculating eatons ideal weight
		feetToInches = convert_feet_to_inches(eatonHeightFeet);
		totalHeightInInches = calculate_total_height_inches(feetToInches, eatonHeightInches);
		double eatonsWeight = calculate_weight(totalHeightInInches);
		
		//Calculating carys ideal weight
		feetToInches = convert_feet_to_inches(caryHeightFeet);
		totalHeightInInches = calculate_total_height_inches(feetToInches, caryHeightInches);
		double carysWeight = calculate_weight(totalHeightInInches);
		
		//Printing the results
		System.out.println("Tom's ideal weight is: " + tomsWeight + "pounds");
		System.out.println("Eaton's ideal weight is: " + eatonsWeight + "pounds");
		System.out.println("Cary's ideal weight is: " + carysWeight + "pounds");
		fileIn.close();
	}
	
	//Calculating inches in feet
	public static int convert_feet_to_inches(int feet)
	{
		return feet * ONE_FOOT;
	}
	
	//Calculating total height
	public static double calculate_total_height_inches(double remainingInches, double feetInInches)
	{
		return remainingInches + feetInInches;
	}
	
	//Calculating ideal weight
	public static double calculate_weight(double totalInches)
	{
		double inches = totalInches - FIVE_FOOT_IN_INCHES;
		double inchesToPound = inches * ADDITIONAL_INCHE_WEIGHT;
		
		return inchesToPound + FIVE_FOOT_WEIGHT;
	}
}