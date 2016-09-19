/*
The video game machines at your local arcade output coupons according to how
well you play the game. You can redeem 10 coupons for a candy bar or 3 coupons
for a gumball. You prefer candy bars to gumballs. Write a program that defines a
*/
import java.util.Scanner;

class Q2_Coupons
{
	//Declaring constant variables
	public static final int CANDY_BAR = 10,
				GUM_BALL = 3;
	
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner user_input = new Scanner(System.in);
		
		//Enter and store number of coupons
		System.out.print("Enter the amount of coupons you have won: ");
		int couponsWon = user_input.nextInt();
		
		//Send values to methods to calculate resutls
		int totalCandyBars = CalculateTotalCandyBars(couponsWon);
		int remainder = CalculateCouponRemainder(couponsWon);
		int totalGumBalls = CalculateTotalGumBalls(remainder);
		
		//Print results
		System.out.println("You can receive " + totalCandyBars + " candy bars.");
		System.out.println("&");
		System.out.println("You can receive " + totalGumBalls + " gum balls.");
	}
	
	//Method to calculate the total number of candy bars
	private static int CalculateTotalCandyBars(int coupon)
	{
		return coupon/CANDY_BAR;
	}
	
	//Method to calculate the remaining number of coupons
	private static int CalculateCouponRemainder(int coupon)
	{
		return coupon%CANDY_BAR;
	}
	
	//Method to calculate the total number of gum balls
	private static int CalculateTotalGumBalls(int coupon)
	{
		return coupon/GUM_BALL;
	}
}
