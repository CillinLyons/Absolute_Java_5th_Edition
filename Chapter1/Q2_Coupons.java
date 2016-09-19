import java.util.Scanner;

class Coupons
{
	public static final int CANDY_BAR = 10;
	public static final int GUM_BALL = 3;
	
	public static void main(String[] args)
	{
		Scanner user_input = new Scanner(System.in);
		
		int couponsWon;
		
		System.out.print("Enter the amount of coupons you have won: ");
		couponsWon = user_input.nextInt();
		
		int totalCandyBars = CalculateTotalCandyBars(couponsWon);
		int remainder = CalculateCouponRemainder(couponsWon);
		int totalGumBalls = CalculateTotalGumBalls(remainder);
		
		System.out.println("You can receive " + totalCandyBars + " candy bars.");
		System.out.println("&");
		System.out.println("You can receive " + totalGumBalls + " gum balls.");
	}
	
	private static int CalculateTotalCandyBars(int coupon)
	{
		return coupon/CANDY_BAR;
	}
	
	private static int CalculateCouponRemainder(int coupon)
	{
		return coupon%CANDY_BAR;
	}
	
	private static int CalculateTotalGumBalls(int coupon)
	{
		return coupon/GUM_BALL;
	}
}