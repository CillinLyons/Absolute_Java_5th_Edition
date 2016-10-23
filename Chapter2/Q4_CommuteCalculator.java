/*
An automobile is used for commuting purposes. Write a program that takes as
input the distance of the commute in miles, the automobile’s fuel 
consumption rate in miles per gallon, and the price of a gallon of gas. 
The program should then output the cost of the commute.
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Q4_CommuteCalculator
{
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring a NumberFormat object for the money output
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		//Entering and storing the data
		System.out.println("Enter the commute distance in miles: ");
		double commuteDistance = input.nextDouble();
		System.out.println("Enter the automobiles fuel consumption rate in miles per gallon: ");
		double fuelConsumptionRate = input.nextDouble();
		System.out.println("Enter the price of gas per gallon: ");
		double gasPrice = input.nextDouble();
		
		//Calculating the cost of the commute
		double commuteCost = commuteDistance * fuelConsumptionRate * gasPrice;
		
		//Printing the results in a money format.
		System.out.print("Cost of commute: ");
		System.out.println(moneyFormatter.format(commuteCost));
	}
}