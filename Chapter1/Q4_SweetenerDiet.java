/*
A government research lab has concluded that an artificial sweetener commonly
used in diet soda pop will cause death in laboratory mice. 
A friend of yours is desperate to lose weight but cannot give up soda pop. 
Your friend wants to know how much diet soda pop it is possible to drink 
without dying as a result. 
Write a program to supply the answer. 
The program has no input but does have defined constants for the following items: 
the amount of artificial sweetener needed to kill a mouse, 
the weight of the mouse, 
the starting weight of the dieter, 
and the desired weight of the dieter. 
To ensure the safety of your friend, be sure the program uses
the weight at which the dieter will stop dieting, rather than the dieter’s current
weight, to calculate how much soda pop the dieter can safely drink. 
You may use any reasonable values for these defined constants. 
Assume that diet soda contains 1/10th of 1% artificial sweetener. 
Use another named constant for this fraction.
You may want to express the percent as the double value 0.001. (If your program
turns out not to use a defined constant, you may remove that defined constant
from your program.)
*/

class Q4_SweetenerDiet
{
	//Weights are defined in kilograms(KG)
	public static final double MOUSE_WEIGHT = 1.0;
	public static final double MOUSE_SWEETENER_DEATH_AMOUNT = 0.1;
	public static final double DIETER_WEIGHT = 60;
	public static final double DIETER_DESIRED_WEIGHT = 55;
	public static final double SODA_SWEETENER = 0.001;
	
	public static void main(String[] args)
	{
		
	}
}