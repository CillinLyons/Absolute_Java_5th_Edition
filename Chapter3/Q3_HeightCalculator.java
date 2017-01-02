/*
One way to estimate the adult height of a child is to use the following 
formula, which uses the height of the parents:
Hmale_child = ((Hmother * 13/12) + Hfather)/2
Hfemale_child = ((Hfather * 12/13) + Hmother)/2
All heights are in inches. 
Write a program that takes as input the gender of the
child, the height of the mother in inches, and the height of the father in 
inches, and outputs the estimated adult height of the child in inches. 
The program should allow the user to enter a new set of values and output 
the predicted height until the user decides to exit. 
The user should be able to input the heights in feet and inches,
and the program should output the estimated height of the child in feet 
and inches.
Use the int data type to store the heights.
*/

import java.util.Scanner;

public class Q3_HeightCalculator
{
	public static final int ONE_FOOT = 12;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int mothersHeightFeet, mothersHeightInches, mothersFeetToInches, mothersTotalInches, mothersTotalHeight,
				fathersHeightFeet, fathersHeightInches, fathersFeetToInches, fathersTotalInches, fathersTotalHeight,
				estimatedHeightFeet, estimatedHeightInches,
				maleFormula, femaleFormula;
				
		maleFormula = 0;
		femaleFormula = 0;
		
		System.out.println("*****HEIGHT CALCULATOR*****");
		
		while(2 > 1)
		{
			System.out.println("Enter your gender or press enter exit to exit");
			String entry = input.nextLine();
			
			if(entry.equals("male"))
			{
				System.out.println("Ok sir, now enter your mothers height first by feet: ");
				mothersHeightFeet = input.nextInt();
				System.out.println("And now the remaining inches: ");
				mothersHeightInches = input.nextInt();
				
				System.out.println("Now enter your fathers height first by feet: ");
				fathersHeightFeet = input.nextInt();
				System.out.println("And now the remaining inches: ");
				fathersHeightInches = input.nextInt();
				
				mothersFeetToInches = mothersHeightFeet * ONE_FOOT;
				mothersTotalInches = mothersFeetToInches + mothersHeightInches;
				
				fathersFeetToInches = fathersHeightFeet * ONE_FOOT;
				fathersTotalInches = fathersFeetToInches + fathersHeightInches;
				
				//Male_child = ((Hmother * 13/12) + Hfather)/2
				maleFormula = ((mothersTotalInches * 13/12) + fathersTotalInches) / 2;
				
				estimatedHeightFeet = maleFormula / ONE_FOOT;
				estimatedHeightInches = maleFormula % ONE_FOOT;
				
				if(estimatedHeightInches < 1)
				{
					System.out.println("Your estimated adult height is: " + estimatedHeightFeet
									+ " foot even");
				}
				else
				{
					System.out.println("Your estimated adult height is: " + estimatedHeightFeet
									+ " foot " + estimatedHeightInches);
				}
				String junk = input.nextLine();
			}
			else if(entry.equals("female"))
			{
				System.out.println("Ok miss, now enter your mothers height first by feet: ");
				mothersHeightFeet = input.nextInt();
				System.out.println("And now the remaining inches: ");
				mothersHeightInches = input.nextInt();
				
				System.out.println("Now enter your fathers height first by feet: ");
				fathersHeightFeet = input.nextInt();
				System.out.println("And now the remaining inches: ");
				fathersHeightInches = input.nextInt();
				
				mothersFeetToInches = mothersHeightFeet * ONE_FOOT;
				mothersTotalInches = mothersFeetToInches + mothersHeightInches;
				
				fathersFeetToInches = fathersHeightFeet * ONE_FOOT;
				fathersTotalInches = fathersFeetToInches + fathersHeightInches;
				
				//Female_child = ((Hfather * 12/13) + Hmother)/2
				femaleFormula = ((fathersTotalInches * 12/13) + mothersTotalInches) / 2;
				
				estimatedHeightFeet = femaleFormula / ONE_FOOT;
				estimatedHeightInches = femaleFormula % ONE_FOOT;
				
				if(estimatedHeightInches < 1)
				{
					System.out.println("Your estimated adult height is: " + estimatedHeightFeet
									+ "foot even");
				}
				else
				{
					System.out.println("Your estimated adult height is: " + estimatedHeightFeet
									+ " foot " + estimatedHeightInches);
				}
			}
			else if(entry.equals("exit"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Please enter data correctly.");
			}
		}
	}
}