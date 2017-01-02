/*
Write a program that calculates the total grade for N classroom exercises 
as a percentage.
Use the DecimalFormat class to output the value as a percent. 
The user should input the value for N followed by each of the N scores and 
totals. 
Calculate the overall percentage (sum of the total points earned divided by 
the total points possible) and output it using the DecimalFormat class. 
Sample input and output is shown below.
How many exercises to input?
3
Score received for exercise 1:
10
Total points possible for exercise 1:
10
Score received for exercise 2:
7
Total points possible for exercise 2:
12
Score received for exercise 3:
5
Total points possible for exercise 3:
8
Your total is 22 out of 30, or 73.33%.
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q9_GradeCalculator
{
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring decimalFormatter object
		DecimalFormat decimalFormatter = new DecimalFormat("#00.00");
		
		int exercises, i;
		double exerciseScore, pointsPossible, percentage;
		double totalPossiblePoints = 0;
		double pointsAchieved = 0;
		
		System.out.println("How many exercises to input? ");
		exercises = input.nextInt();
		
		for(i=1; i<=exercises; i++)
		{
			exerciseScore = 0;
			pointsPossible = 0;
			
			System.out.printf("Score received for exercise %d: ", i);
			exerciseScore = input.nextDouble();
			System.out.printf("Total points possible for exercise %d: ", i);
			pointsPossible = input.nextDouble();
			
			pointsAchieved = pointsAchieved + exerciseScore;
			totalPossiblePoints = totalPossiblePoints + pointsPossible;
		}

		percentage = pointsAchieved / totalPossiblePoints * 100;
		
		//Printing results
		System.out.printf("Your total is %2.1f out of %2.1f, or ", pointsAchieved, totalPossiblePoints);
		//Formatting the percentage using decimalFormatter
		System.out.println(decimalFormatter.format(percentage) + "%");
	}
}