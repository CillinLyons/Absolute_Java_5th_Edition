/*
It is difficult to make a budget that spans several years, because prices 
are not stable.
If your company needs 200 pencils per year, you cannot simply use this 
year’s price as the cost of pencils two years from now. Because of inflation, 
the cost is likely to be higher than it is today. 
Write a program to gauge the expected cost of an item in
a specified number of years. 
The program asks for the cost of the item, the number
of years from now that the item will be purchased, 
and the rate of inflation. 
The program then outputs the estimated cost of the item after the specified 
period.
Have the user enter the inflation rate as a percentage, such as 5.6(percent).
Your program should then convert the percent to a fraction, such as 0.056, 
and should use a loop to estimate the price adjusted for inflation.
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Q4_InflationCalculator
{
	public static void main(String[] args)
	{
		//Declaring the scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring the number format object
		NumberFormat moneyFormatter =
		NumberFormat.getCurrencyInstance(Locale.US);
		
		//Declaring variables
		String item, text;
		char stars = '*';
		String title = "inflation calculator";
		int i, x, y, years, integerPlaces,decimalPlaces;
		double price, rateOfInflation, inflationFraction, inflatedPrice, fraction;
		
		//Title of program
		for(x=0; x<52; x++)
		{
			System.out.printf("%c", stars);
			if(x == 51)
			{
				System.out.println();
				System.out.printf("%-15c %S %15c", stars, title, stars);
				System.out.println();
				for(y=0; y<52; y++)
				{
					System.out.printf("%c", stars);
					if(y == 51)
						System.out.println();
				}
			}
		}
		
		//Entering and storing data
		System.out.println("Enter the name of the item: ");
		item = input.next();
		System.out.println();
		
		System.out.println("Enter the item price(example 10.00, 5): ");
		price = input.nextDouble();
		System.out.println();
		
		System.out.println("Enter the inflation percentage(example 10.00, 5): ");
		rateOfInflation = input.nextDouble();
		System.out.println();
		
		System.out.println("Enter the number of years from now that the item" + 
							"will be purchased (example 2.5, 3): ");
		years = input.nextInt();
		System.out.println();
		
		text = Double.toString(Math.abs(rateOfInflation));
		integerPlaces = text.indexOf('.');
		decimalPlaces = text.length() - integerPlaces - 1;
		
		if(decimalPlaces == 1)
		{
			fraction = rateOfInflation * 10;
			inflationFraction = fraction / 1000;
			inflatedPrice = inflationFraction * price;
			for(i=0; i<years; i++)
				price = price + inflatedPrice;
		}
		else if(decimalPlaces == 2)
		{
			fraction = rateOfInflation * 100;
			inflationFraction = fraction / 10000;
			inflatedPrice = inflationFraction * price;
			for(i=0; i<years; i++)
				price = price + inflatedPrice;
		}
		else
		{	
			System.out.println("The inflation percentage was entered" +
								"incorrectly, please try again");
			System.exit(0);
		}	
		
		System.out.printf("The estimated price of a %s over %d years " +
							"is: ", item, years);
		System.out.println(moneyFormatter.format(price));					
	}
}