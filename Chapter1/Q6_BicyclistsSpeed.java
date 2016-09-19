/*
Bicyclists can calculate their speed if the gear size and cadence is known. 
Gear size refers to the effective diameter of the wheel. Gear size 
multiplied by pi (3.14) gives the distance travelled with one turn of the 
pedals. Cadence refers to the number of pedal revolutions per minute (rpm). 
The speed in miles per hour is calculated by the following:
Speed (mph) =

This is a program that calculates the speed for a gear size of 100 inches 
and a cadence of 90 rpm. This would be considered a high cadence and a 
maximum gear size for a typical bicycle. In writing your program, don’t 
forget that the expression 1/12 will result in 0, because both 1 and 12 are 
integers, and when the integer division is performed, the fractional part 
is discarded.
*/

class Q6_BicyclistsSpeed
{
	//Decalring constant variables
	public static final double pi = 3.14, 
					foot = 1,
					inches = 12,
					feet = 5280,
					mile = 1,
					minutes = 60,
					hour = 1;
	
	public static void main(String[] args)
	{
		//Declaring variables
		double gearSize = 100,
			cadence = 90,
			speed;
		
		//Inserting values into formula
		speed = gearSize * pi * (foot/inches) * (mile/feet) * cadence * (minutes/hour);
		
		//Printing the resutls
		System.out.println("The speed is: " + speed + "mph");
	}
}
