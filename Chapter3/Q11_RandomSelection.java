/*
You have three identical prizes to give away and a pool of 30 finalists. 
The finalists are assigned numbers from 1 to 30. 
Write a program to randomly select the numbers of three finalists to receive 
a prize. Make sure not to pick the same number twice. 
For example, picking finalists 3, 15, 29 would be valid but picking 3, 3, 31
would be invalid because finalist number 3 is listed twice and 31 is not a 
valid finalist number.
*/

import java.util.concurrent.ThreadLocalRandom;

public class Q11_RandomSelection
{
	//Declaring and initializing constant variables
	public static final int MAX = 30,
							MIN = 1;
							
	public static void main(String[] args)
	{
		int number1, number2, number3, i;
		number2 = 0;
		number3 = 0;
		
		number1 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
		System.out.println(number1);
		
		for(i=0; i<30; i++)
		{
			System.out.println("loop");
			number2 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			number3 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			if(number2 != number1)
				if(number3 != number1 && number3 != number2)
					break;
		}
		
		System.out.println("Winner 1 is number "+number1);
		System.out.println("Winner 2 is number "+number2);
		System.out.println("Winner 3 is number "+number3);
	}
}