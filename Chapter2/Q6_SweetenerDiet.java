/*
(This is a better version of an exercise from Chapter 1 .) A government 
research lab has concluded that an artificial sweetener commonly used in
diet soda pop causes death in laboratory mice. A friend of yours is 
desperate to lose weight but cannot give up soda pop. Your friend wants to
know how much diet soda pop it is possible to drink without dying as a 
result. 
Write a program to supply the answer. The input to the program is the 
amount of artificial sweetener needed to kill a mouse,
the weight of the mouse, 
and the desired weight of the dieter. 
Assume that diet soda contains 1/10th of 1% artificial sweetener. 
Use a named constant for this fraction. You may want to express the 
percent as the double value 0.001.
*/
import java.util.Scanner;

class Q6_SweetenerDiet
{
	//Declaring constant variables
	//Weights are defined in kilograms(KG)
	public static final double CONCENTRATION_OF_ARTIFICIAL_SWEETENER_IN_DIET_SODA = 0.001;
	
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		//Entering and storing data
		System.out.println("Enter the value of the amount of artificial sweetener to kill a mouse in a litre: ");
		double amountOfArtificialSweetenerToKillAMouse = input.nextDouble();
		
		System.out.println("Enter the weight of the mouse in grams: ");
		double weightOfMouse = input.nextDouble();
		
		System.out.println("Enter the desired weight of the dieter in grams: ");
		double desiredWeightOfDieter = input.nextDouble();
		
		//Calculating sweetener limit for mouse and human
		double mouseLimit = amountOfArtificialSweetenerToKillAMouse / CONCENTRATION_OF_ARTIFICIAL_SWEETENER_IN_DIET_SODA;
		double dieterLimit = (mouseLimit * desiredWeightOfDieter) / weightOfMouse;
		
		//Printing the results
		System.out.println(dieterLimit + " litres.");// 2600.00 litres
    }
}