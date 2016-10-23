/*
The Babylonian algorithm to compute the square root of a positive number n 
is as follows:
1. Make a guess at the answer (you can pick n /2 as your initial guess).
2. Compute r = n / guess
3. Set guess = (guess +r)/ 2
4. Go back to step 2 for as many iterations as necessary. 
The more you repeat steps 2 and 3, the closer guess will become to the square 
root of n.
Write a program that inputs a double for n , iterates through the Babylonian 
algorithm five times, and outputs the answer as a double
*/

import java.util.Scanner;

public class Q1_BabylonianAlgorithm
{
	public static void main(String[] args)
	{
		//Initializing scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n;
		double r, r1, r2, r3, r4, r5, 
				guess, guess1, guess2, guess3, guess4, guess5, guess6;
		
		//Entering and storing data
		System.out.println("Enter a number: ");
		n = input.nextInt();
		
		//Step 1
		guess = n / 2;
		//Step 2
		r = n / guess;
		//Step 3
		guess1 = (guess + r) / 2;
		
		//Iteration 1
		r1 = n / guess1;
		guess2 = (guess1 + r1) / 2;
		
		//Iteration 2
		r2 = n / guess2;
		guess3 = (guess2 + r2) / 2;
		
		//Iteration 3
		r3 = n / guess3;
		guess4 = (guess3 + r3) / 2;
		
		//Iteration 4
		r4 = n / guess4;
		guess5 = (guess4 + r4) / 2;
		
		//Iteration 5
		r5 = n / guess5;
		guess6 = (guess5 + r5) / 2;
		
		System.out.printf("The square root guess from the Babylonian Algorithm is: %.2f", guess6);
	}
}