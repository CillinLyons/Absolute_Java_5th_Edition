/*
Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, 
in 5-cent increments (25, 30, 35, . . . 90, 95, or 100), and the machine 
accepts only a single dollar bill to pay for the item. For example, a 
possible sample dialog might be the following:
Enter price of item
(from 25 cents to a dollar, in 5-cent increments):
45
You bought an item for 45 cents and gave me a dollar,
so your change is
2 quarters,
0 dimes, and
1 nickels.
*/

import java.util.Scanner;

public class Q7_VendingMachine
{
	//Declaring coin values as constants
	public static final int NICKEL = 5,
								DIME = 10,
								QUARTER = 25,
								PAYMENT = 100;
	
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Entering and storing price data
		System.out.println("Enter the price of your item: ");
		int price = input.nextInt();
		
		//Calculating the change
		int totalChange = PAYMENT - price;
		int quarters = totalChange / QUARTER;
		int quarterChange = totalChange % QUARTER;
		int dimes = quarterChange / DIME;
		int dimeChange = quarterChange % DIME;
		int nickels = dimeChange / NICKEL;

		//Printing the change
		System.out.printf("You bought an item for %d cents and gave me a dollar, %n", price);
		System.out.println("So your change is:");
		System.out.printf("%d quarters, %n", quarters);
		System.out.printf("%d dimes, and %n", dimes);
		System.out.printf("%d nickels.", nickels);		
	}
}