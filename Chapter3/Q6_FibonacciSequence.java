/*
The Fibonacci numbers Fn are defined as follows: 
F0 is 1, F1 is 1, and Fi + 2 = Fi + Fi + 1i = 0, 1, 2, . . . . 
In other words, each number is the sum of the previous two numbers.
The first few Fibonacci numbers are 1, 1, 2, 3, 5, and 8. 
One place where these numbers occur is as certain population growth rates. 
If a population has no deaths, then the series shows the size of the 
population after each time period. It takes an organism two time periods to 
mature to reproducing age, and then the organism reproduces once every time 
period. The formula applies most straightforwardly to asexual reproduction 
at a rate of one offspring per time period. In any event, the green crud 
population grows at this rate and has a time period of five days. Hence, if
a green crud population starts out as 
10 pounds of crud, then in 5 days, there is still 10 pounds of crud; 
in 10 days, there is 20 pounds of crud; 
in 15 days, 30 pounds;
in 20 days, 50 pounds; 
and so forth. 
Write a program that takes both the initial size of a green crud population 
(in pounds) and a number of days as input and outputs the number of pounds 
of green crud after that many days. 
Assume that the population size is the same for four days and then increases 
every fifth day. Your program should allow the user to repeat this calculation
as often as desired.
*/

import java.util.Scanner;

public class Q6_FibonacciSequence
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int crudPopulation, days, fibonacciIterations, 
			x, y, i, f, g;
		char stars = '*';
		String title = "fibonacci sequence";
		
		//Title of program
		for(x=0; x<50; x++)
		{
			System.out.printf("%c", stars);
			if(x == 49)
			{
				System.out.println();
				System.out.printf("%-15c %S %15c", stars, title, stars);
				System.out.println();
				for(y=0; y<50; y++)
				{
					System.out.printf("%c", stars);
					if(y == 49)
						System.out.println();
				}
			}
		}
		
		System.out.println("To exit this program at any stage, just enter ctrl C");
		System.out.println();
		while (1 < 2)
		{
			System.out.println("Enter the crud starting population in pounds: ");
			crudPopulation = input.nextInt();
			System.out.println("Enter the number of days in the cycle: ");
			days = input.nextInt();
			
			fibonacciIterations = days / 5;
			f = crudPopulation;
			g = 0;
			
			System.out.println("Starting the fibonacci algorithm..");
			for(i=0; i<fibonacciIterations; i++)
			{
				f = f + g;
				g = f - g;
			}
			
			System.out.printf("In %d days there will be %d pounds of crud\n", days, f);
			System.out.println();
		}	
	}
}