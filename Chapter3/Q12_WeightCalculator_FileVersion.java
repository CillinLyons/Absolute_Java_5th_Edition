/*
Redo or do for the first time Programming Project 2.13 from Chapter 2 but 
this time use a loop to read the names from the file. 
Your program should also handle an arbitrary number of entries in the file 
instead of handling only three entries.
To do this, your program must check to see if there is still data left to 
read (i.e., it has reached the end of the file). 
The appropriate methods to read from a file are described in Section 2.3.
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
		int tomHeightFeet, eatonHeightFeet, caryHeightFeet,
			tomHeightInches, eatonHeightInches, caryHeightInches;
		
		double feetToInches, totalHeightInInches, weightInFeet, 
				weightInInches, personsWeight;
				
		String names = "";
		
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