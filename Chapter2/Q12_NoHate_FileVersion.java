/*
(This is a variant of an exercise from Chapter 1 .) Create a text file that 
contains the text "I hate programming!" Write a program that reads in this 
line of text from the file and then the text with the first occurrence of 
"hate" changed to "love" . In this case, the program would output 
"I love programming!" 
Your program should work with any line of text that contains the word "hate",
not just the example given in this problem. If the word "hate" occurs more 
than once in the line, your program should replace only the first occurrence 
of "hate" .
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q12_NoHate_FileVersion
{
	public static void main(String[] args)
	{
		//Initializing file in to empty.
		Scanner fileIn = null;
		
		//Opening file
		try
		{
			fileIn = new Scanner(new FileInputStream("SampleText.txt"));
		}
		catch(FileNotFoundException e)
		{
			//This block is executed if the file is not found
			//And then the program exits
			System.out.println("File not found..");
			System.exit(0);
		}
		
		//Declaring string variable
		String firstSentence;
		
		//Storing first line in text file to string variable
		firstSentence = fileIn.nextLine();
		
		int position = firstSentence.indexOf("hate");
		
		//Ending starts from index 6. (postion(2) + hate.length()(4) = 6)
		String ending = firstSentence.substring(position + "hate".length());
		
		System.out.println(firstSentence);
		System.out.println("The word \"hate\" starts at index " + position);
		
		//Takes 'i' from sentence.
		//concatenates the string adore.
		//Concatenates the value of the variable ending.
		firstSentence = firstSentence.substring(0, position) + "love" + ending;
		System.out.println("The changed string is:");
		System.out.println(firstSentence);
	}
}