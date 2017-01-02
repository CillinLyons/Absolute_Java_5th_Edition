/*
The game of Pig is a simple two-player dice game in which the first player 
to reach 100 or more points wins. Players take turns. On each turn, a player 
rolls a six-sided die:
• If the player rolls a 1, then the player gets no new points and it becomes 
the other player’s turn.
• If the player rolls 2 through 6, then he or she can either
• ROLL AGAIN or
• HOLD. At this point, the sum of all rolls is added to the player’s score 
and it becomes the other player’s turn.
Write a program that plays the game of Pig, where one player is a human and 
the other is the computer. 
When it is the human’s turn, the program should show the score of both 
players and the previous roll. 
Allow the human to input 'r' to roll again or 'h' to hold.
The computer program should play according to the following rule:
• Keep rolling when it is the computer’s turn until it has accumulated 20 or
more points, then hold. If the computer wins or rolls a 1, then the turn ends
immediately.
Allow the human to roll first.
*/

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Q10_PigGame
{
	//Declaring and initializing constant variables
	public static final int MAX = 6,
							MIN = 1;
							
	public static void main(String[] args)
	{
		//Declaring and initializing scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring and initializing variables
		int dieRolled, x, y;
		int humanScore = 0;
		int computerScore = 0;
		int humanGamesWon = 0;
		int computerGamesWon = 0;
		int round = 0;
		int previouslyRolled = 0;
		
		String currentUser = "human";
		String computerDecision = "roll";
		String userName;
		String scoreBoard = "scoreboard";
		String rounds = "round";
		
		char humanDecision;
		char stars = '*';
		
		//Retrieving and storing users name
		System.out.println("Enter your name");
		userName = input.nextLine();
		System.out.println();
		
		//Using while loop so infinite games can be played
		while(2 > 1)
		{
			round++;
			
			//Title of program
			for(x=0; x<15; x++)
			{
				System.out.printf("%c", stars);
				if(x == 14)
				{
					System.out.printf("%S", scoreBoard);
					for(y=0; y<15; y++)
					{
						System.out.printf("%c", stars);
					}
				}
			}
			System.out.println();
			System.out.printf("%21S %d", rounds, round);
			System.out.println();
			System.out.printf("%s's score: %d\n", userName, humanScore);
			System.out.printf("computers score: %d\n", computerScore);
			
			for(x=0; x<40; x++)
			{
				System.out.printf("%c", stars);
			}
			
			System.out.println();
			System.out.printf("%s's turn\n", userName);
			System.out.printf("Current score: %d", previouslyRolled);
			System.out.println();
			
			for(x=0; x<40; x++)
			{
				System.out.printf("%c", stars);
			}
			System.out.println();
			
			if(currentUser == "human")
			{
				System.out.println("Would you like to roll or hold? " +
									"Enter r to roll or h to hold or x to exit:");
				humanDecision = input.next().charAt(0);
				
				if(humanDecision == 'r')
				{
					dieRolled = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
					System.out.println("You rolled number " + dieRolled);
					
					if(dieRolled == 1)
					{
						System.out.println("Sorry, you did not score. Your turn is over.");
						System.out.println();
						dieRolled = 0;
						previouslyRolled = 0;
						currentUser = "computer";
						computerDecision = "roll";
					}
					else
					{
						previouslyRolled = previouslyRolled + dieRolled;
						
						if(previouslyRolled + humanScore >= 100)
						{
							System.out.println("Congrats! You won!");
							System.out.println("GAME OVER");
							humanGamesWon++;
							round = 0;
							dieRolled = 0;
							previouslyRolled = 0;
							humanScore = 0;
							computerScore = 0;
						}
						else
						{
							System.out.println("It is your turn again");
							System.out.println("Your current score: " + previouslyRolled);
							System.out.println();
						}
					}
				}
				else if(humanDecision == 'h')
				{
					humanScore = humanScore + previouslyRolled;
					currentUser = "computer";
					previouslyRolled = 0;
					dieRolled = 0;
					computerDecision = "roll";
					System.out.println();
				}
				else if(humanDecision == 'x')
				{
					System.exit(0);
				}
			}
			else if(currentUser == "computer")
			{
				if(computerDecision == "roll")
				{
					dieRolled = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
					System.out.println("The computer rolled number " + dieRolled);
					System.out.println();
					
					if(dieRolled == 1)
					{
						System.out.println("The computer lost. It is now your turn");
						System.out.println();
						System.out.println();
						currentUser = "human";
						dieRolled = 0;
						previouslyRolled = 0;
					}
					else
					{
						previouslyRolled = previouslyRolled + dieRolled;
						
						if(previouslyRolled + computerScore >= 100)
						{
							System.out.println("Computer wins");
							System.out.println("GAME OVER");
							System.out.println();
							round = 0;
							previouslyRolled = 0;
							dieRolled = 0;
							humanScore = 0;
							computerScore = 0;
							computerGamesWon++;
							currentUser = "human";
						}
						else if(previouslyRolled >= 20)
						{
							System.out.println("The computer has decided to hold");
							System.out.println();
							computerDecision = "hold";
							computerScore = computerScore + previouslyRolled;
							dieRolled = 0;
							previouslyRolled = 0;
							currentUser = "human";
						}
						else
						{
							System.out.println("The computer will go again");
							System.out.println();
						}
					}
				}
				else if(computerDecision == "hold")
				{
					System.out.println("The computer has decided to hold");
					System.out.println();
					computerDecision = "hold";
					computerScore = computerScore + previouslyRolled;
					dieRolled = 0;
					previouslyRolled = 0;
					currentUser = "human";
				}
			}
		}
	}	
}