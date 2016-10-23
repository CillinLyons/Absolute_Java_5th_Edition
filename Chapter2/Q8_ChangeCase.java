/*
Write a program that reads in a line of text and then outputs that line 
of text first in all uppercase letters and then in all lowercase letters.
*/

import java.util.Scanner;

public class Q8_ChangeCase
{
	public static void main(String[] args)
	{
		//Declaring scanner object variable
		Scanner input = new Scanner(System.in);
		
		//Entering a storing the data
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		//Printing using %S
		System.out.println("Sentence in uppercase using %S:");
		System.out.printf("%S %n", sentence);
		
		//Printing using toUpperCase()
		System.out.println("Sentence to uppercase using the toUpperCase() method:");
		System.out.println(sentence.toUpperCase());
		
		//Printing using toLowerCase()
		System.out.println("Sentence to lowercase using the toLowerCase() method:");
		System.out.println(sentence.toLowerCase());
	}
}