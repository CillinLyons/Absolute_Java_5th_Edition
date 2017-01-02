/*
(This is a version of Programming Project 2.1 from Chapter 2.) 
The Babylonian algorithm to compute the square root of a positive number 
n is as follows:
1. Make a guess at the answer (you can pick n/2 as your initial guess).
2. Compute r = n / guess .
3. Set guess = (guess +r) / 2 .
4. Go back to step 2 until the last two guess values are within 1% of 
each other.
Write a program that inputs a double for n , iterates through the 
Babylonian algorithm until the guess is within 1% of the previous guess, 
and outputs the answer as a double to two decimal places. Your answer should 
be accurate even for large values of n .
*/

import java.util.Scanner;

public class Q1_BabylonianAlgorithmWithLoop
{
	public static void main(String[] args)
	{
		//Declaring and initializing scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring and initializing variables
		int i = 0;
		double n, guess, guess1, r, loopR, loopGuess;
		loopGuess = 0
		
		//Entering and storing data
		System.out.println("Enter a number and I will guess the square root of that number: ");
		n = input.nextDouble();
		
		//Step 1
		guess = n / 2;
		//Step 2
		r = n / guess;
		//Step 3
		guess1 = (guess + r) / 2;
		
		//Iteration of step 2 and 3
		for(i = 0; i < 5; i++)
		{
			loopR = n / guess1;
			loopGuess = (guess1 + loopR) / 2;
			guess1 = loopGuess;
			System.out.println(loopGuess);
		}
		
		//Printing the results
		System.out.printf("The guessed square root is: %.2f", loopGuess);
	}
}