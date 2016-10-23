/*
Write a program that reads in two integers typed on the keyboard and outputs 
their sum, difference, and product.
*/

import java.util.Scanner;

class Q3_MiniCalculator
{
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Entering and storing numbers
		System.out.println("Enter two numbers, the first being larger than the second: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		//Calculating results
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		
		//Using both printf and println for practice purposes to print resutlts
		System.out.println("The sum of the numbers is: " + sum);
		System.out.printf("The difference between the numbers is: %d %n", difference);
		System.out.printf("The product of the two numbers is: %d", product);
	}
}