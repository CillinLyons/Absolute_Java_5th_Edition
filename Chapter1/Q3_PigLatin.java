/*
Write a program that starts with the string variable first set to your first name
and the string variable last set to your last name. 
Both names should be all lowercase.
Your program should then create a new string that contains your full name in
pig latin with the first letter capitalized for the first and last name. 
Use only the pig latin rule of moving the first letter to the end of the word and adding ay. Output
the pig latin name to the screen. Use the substring and toUpperCase methods
to construct the new name.
*/

import java.util.Scanner;

class Q3_PigLatin
{
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner userInput = new Scanner(System.in);
		
		//Declaring variables
		String firstName,
			lastName;
		char firstNameLetter,
			lastNameLetter;
		String firstSubString,
			lastSubString;
		String pigLatinFirstName,
			pigLatinLastName;
		String capitalPigFirstName,
			capitalPigLastName;
		String pigLatinFullName;
		
		//Enter and store name
		System.out.println("Enter your first name: ");
		firstName = userInput.next();
		System.out.println("Enter your last name: ");
		lastName = userInput.next();
		
		//Store first letters of names of char variables
		firstNameLetter = firstName.charAt(0);
		lastNameLetter = lastName.charAt(0);
		
		//Store names without first letters to string
		firstSubString = firstName.substring(1);
		lastSubString = lastName.substring(1);
		
		//Create pig latin first and last names
		pigLatinFirstName = firstSubString + firstNameLetter + "ay";
		pigLatinLastName = lastSubString + lastNameLetter + "ay";
		
		//Making the first letters uppercase
		capitalPigFirstName = pigLatinFirstName.substring(0,1).toUpperCase() + pigLatinFirstName.substring(1);
		capitalPigLastName = pigLatinLastName.substring(0,1).toUpperCase() + pigLatinLastName.substring(1);
		
		//Concatenate 2 names
		pigLatinFullName = capitalPigFirstName + " " + capitalPigLastName;
		
		//Print the result
		System.out.println("Your pig latin name is: " + pigLatinFullName);
	}
}
