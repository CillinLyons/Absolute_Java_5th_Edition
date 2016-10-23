/*
The straight-line method for computing the yearly depreciation in value D 
for  an item is given by the following formula:
											D = P - S
												  Y
where P is the purchase price, S is the salvage value, and Y is the number 
of years the item is used. Write a program that takes as input the purchase 
price of an item, the expected number of years of service, and the expected 
salvage value. The program should then output the yearly depreciation for 
the item.
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Q5_DepreciationCalculation
{
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring a NumberFormat object for the money output
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		//Entering and storing data
		System.out.println("Enter the purchase price: ");
		double purchasePrice = input.nextDouble();
		System.out.println("Enter the salvage value: ");
		double salvageValue = input.nextDouble();
		System.out.println("Enter the number of years the item is used: ");
		double years = input.nextDouble();
		
		//Calculating depreciation
		double depreciation = (purchasePrice - salvageValue) / years; 
		
		//Printing the results
		System.out.print("Total depreciation: ");
		System.out.println(moneyFormatter.format(depreciation));
	}
}