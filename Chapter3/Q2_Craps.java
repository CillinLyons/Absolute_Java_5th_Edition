/*
In the game of craps, a pass line bet proceeds as follows: 
Two six-sided dice are rolled; 
the first roll of the dice in a craps round is called the "come out roll."
A come out roll of 7 or 11 automatically wins, and a come out roll of 2, 3, 
or 12 automatically loses. 
If 4, 5, 6, 8, 9, or 10 is rolled on the come out roll, that number
becomes "the point." 
The player keeps rolling the dice until either 7 or the point is
rolled. If the point is rolled first, then the player wins the bet. 
If a 7 is rolled first, then the player loses.
Write a program that simulates a game of craps using these rules without 
human input. 
Instead of asking for a wager, the program should calculate whether the
player would win or lose. The program should simulate rolling the two dice 
and calculate the sum. 
Add a loop so that the program plays 10,000 games. 
Add counters that count how many times the player wins, and how many times 
the player loses. 
At the end of the 10,000 games, compute the probability of winning
[i.e., Wins / (Wins + Losses)] and output this value. 
Over the long run, who is going to win the most games, you or the house?
*/

import java.util.concurrent.ThreadLocalRandom;

public class Q2_Craps
{
	//Declaring and initializing constant variables
	public static final int MAX = 6,
							MIN = 1;
	
	public static void main(String[] args)
	{	
		//Declaring and initializing variables
		int i, die1, die2, diceRolled, diceRolled2, winCount, loseCount;
		
		winCount = 0;
		loseCount = 0;
		
		//First for-loop to start the game
		//This for-loop calculates how many wins and loses there are in 10,000 games
		for(i = 0; i < 10000; i++)
		{
			//Throw die one
			//Die one is given a random number between 1 and 6
			die1 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			
			//Throw die two
			//Die two is given a random number between 1 and 6
			die2 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			
			//Dice rolled is the value of the two die combined
			diceRolled = die1 + die2;
			
			//If the dice adds to 7 or 11 the computer wins and one is added to the win total
			if(diceRolled == 7 || diceRolled == 11)
			{
				winCount++;
			}
			//If the dice adds to 2 or 3 or 12 the computer loses and one is added to the lose total
			else if(diceRolled == 2 || diceRolled == 3 || diceRolled == 12)
			{
				loseCount++;
			}
			//If the dice adds to 4 or 5 or 6 or 8 or 9 or 10 the computer goes to the point
			else if(diceRolled == 4 || diceRolled == 5 || diceRolled == 6 || diceRolled == 8 || diceRolled == 9 || diceRolled == 10)
			{
				for(int j = 0; j < 10000; j ++)
				{	
					//Die one and two are given two random numbers between 1 and 6
					//In other words, the dice are rolled again
					die1 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
					die2 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
				
				    //The combined value of die one and two
					diceRolled2 = die1 + die2;
					
					//If the dice are equal to the point, the computer wins  
					//One is added to the win total
					//The loop breaks out to start the game again in the outer for-loop
					if(diceRolled2 == diceRolled)
					{
						winCount++;
						break;
					}
					//If the dice are equal to seven, the computer loses
					//One is added to the lose total
					//The loop breaks out to start the game again in the outer for-loop
					else if(diceRolled2 == 7)
					{
						loseCount++;
						break;
					}
				}
			}
			//If none of the numbers within the range are picked, an error message is displayed
			else
				System.out.println("Error");
		}
		
		//Print results
		System.out.println("Wins = " + winCount);
		System.out.println("Loses = " + loseCount);
		System.out.println("Out of 10,000 games.");
	}
}