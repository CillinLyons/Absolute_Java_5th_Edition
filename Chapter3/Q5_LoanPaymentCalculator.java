/*
You have just purchased a stereo system that cost $1,000 on the 
following credit plan: no down payment, an interest rate of 18% 
per year (and hence 1.5% per month), and monthly payments of $50. 
The monthly payment of $50 is used to pay the interest, and whatever 
is left is used to pay part of the remaining debt.
Hence, the first month you pay 1.5% of $1,000 in interest. That is 
$15 in interest.
So, the remaining $35 is deducted from your debt, which leaves you 
with a debt of $965.00. The next month, you pay interest of 1.5% of 
$965.00, which is $14.48.
Hence, you can deduct $35.52 (which is $50 – $14.48) from the amount 
you owe.
Write a program that tells you how many months it will take you to 
pay off the loan, as well as the total amount of interest paid over 
the life of the loan. 
Use a loop to calculate the amount of interest and the size of the 
debt after each month. 
(Your final program need not output the monthly amount of interest 
paid and remaining debt, but you may want to write a preliminary version 
of the program that does output these values.) 
Use a variable to count the number of loop iterations and hence,
the number of months until the debt is zero. You may want to use other 
variables as well. 
The last payment may be less than $50 if the debt is small, but do not 
forget the interest. If you owe $50, your monthly payment of $50 will 
not pay off your debt, although it will come close. One month’s interest 
on $50 is only 75 cents.
*/

import java.text.DecimalFormat;

public class Q5_LoanPaymentCalculator
{
	public static void main(String[] args)
	{
		//Declaring and initializing a decimal format object for the numbers printed
		DecimalFormat pattern00dot00 = new DecimalFormat ("###0.00") ;
		
		//Declaring and initializing variables
		double debt = 1000;
		double monthlyInterestPercentage = 1.5;
		double totalInterestPaid = 0;
		int monthlyPayment = 50;
		double payment, interest;
		int month = 0;
		
		//While loop with inner if-else statement to calculate th payments
		while(debt <= 1000)
		{
			//If it is the last month of payment
			if(debt < 50)
			{
				//Increase the month by 1
				month++;
				//Print the current month
				System.out.printf("Month %d \n", month);
				//Calculate the interest for this month
				interest = 0;
				interest = debt * monthlyInterestPercentage;
				interest /= 100;
				pattern00dot00.format(interest);
				//Calculate the total payment made this month
				totalInterestPaid = totalInterestPaid + interest;
				
				//Print the results
				debt = debt - debt;
				System.out.println("***************************");
				System.out.println("DEBT: " + debt);
				System.out.println("TOTAL INTEREST PAID: " + pattern00dot00.format(totalInterestPaid));
				System.out.println("***************************");
				break;
			}
			//Else if it is not the last months payment
			else
			{
				//Increase the month by 1
				month++;
				//Print the current month
				System.out.printf("Month %d \n", month);
				//Calculate the interest this month
				interest = 0;
				payment = 0;
				interest = debt * monthlyInterestPercentage;
				interest /= 100;
				pattern00dot00.format(interest);
				//Calculate the total payment
				totalInterestPaid = totalInterestPaid + interest;
				
				//Minus the payment from the debt
				payment = monthlyPayment - interest;
				debt = debt - payment;
				//Print the results
				System.out.println("***************************");
				System.out.println("PAYMENT: " + pattern00dot00.format(payment));
				System.out.println("INTEREST: " + pattern00dot00.format(interest));
				System.out.println("DEBT: " + pattern00dot00.format(debt));
				System.out.println("TOTAL INTEREST PAID: " + pattern00dot00.format(totalInterestPaid));
				System.out.println("***************************");
			}
		}
	}
}