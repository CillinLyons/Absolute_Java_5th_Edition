/*
Write a program that calculates the total grade for three classroom 
exercises as a percentage. Use the DecimalFormat class to output the value 
as a percent. The scores should be summarized in a table. Input the 
assignment information in this order: 
name of assignment (may include spaces), 
points earned (integer), 
and total points possible (integer). 
The percentage is the sum of the total points earned divided by the total 
points possible. Sample input and output is shown as follows:
Name of exercise 1:
Group Project
Score received for exercise 1:
10
Total points possible for exercise 1:
10
Name of exercise 2:
Homework
Score received for exercise 2:
7
Total points possible for exercise 2:
12
Name of exercise 3:
Presentation
Score received for exercise 3:
5
Total points possible for exercise 3:
8
Exercise Score Total Possible
Group Project 10 10
Homework 7 12
Presentation 5 8
Total 22 30
Your total is 22 out of 30, or 73.33%.
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q11_AssignmentCalculator
{
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring decimalFormatter object
		DecimalFormat decimalFormatter = new DecimalFormat("#00.00");
		
		//Declaring string variables
		String exercise = "Exercise",
				score = "Score",
				totalPossible = "Total Possible";
		
		//Entering and storing the data
		System.out.println("Name of exercise 1: ");
		String exerciseName1 = input.nextLine();
		System.out.println("Score received for exercise 1: ");
		double exerciseScore1 = input.nextDouble();
		System.out.println("Total points possible for exercise 1: ");
		double pointsPossible1 = input.nextDouble();
		
		//To get rid of '\n'
		String junk = input.nextLine();
		
		//Entering and storing the data
		System.out.println("Name of exercise 2: ");
		String exerciseName2 = input.nextLine();
		System.out.println("Score received for exercise 2: ");
		double exerciseScore2 = input.nextDouble();
		System.out.println("Total points possible for exercise 2: ");
		double pointsPossible2 = input.nextDouble();
		
		//To get rid of '\n'
		String junk2 = input.nextLine();
		
		//Entering and storing the data
		System.out.println("Name of exercise 3: ");
		String exerciseName3 = input.nextLine();
		System.out.println("Score received for exercise 3: ");
		double exerciseScore3 = input.nextDouble();
		System.out.println("Total points possible for exercise 3: ");
		double pointsPossible3 = input.nextDouble();
		
		//Calculating total points earned, total possible points and percentage
		double pointsAchieved = exerciseScore1 + exerciseScore2 + exerciseScore3;
		double totalPossiblePoints = pointsPossible1 + pointsPossible2 + pointsPossible3;
		double percentage = pointsAchieved / totalPossiblePoints * 100;
		
		//Printing results
		System.out.printf("%-20s%-20s%-20s %n", exercise, score, totalPossible);
		
		System.out.printf("%-20s%-20.1f%-20.1f %n", exerciseName1, exerciseScore1, pointsPossible1);
		System.out.printf("%-20s%-20.1f%-20.1f %n", exerciseName2, exerciseScore2, pointsPossible2);
		System.out.printf("%-20s%-20.1f%-20.1f %n", exerciseName3, exerciseScore3, pointsPossible3);
		
		System.out.printf("Your total is %2.1f out of %2.1f, or ", pointsAchieved, totalPossiblePoints);
		//Formatting the percentage using decimalFormatter
		System.out.println(decimalFormatter.format(percentage) + "%");
	}
}