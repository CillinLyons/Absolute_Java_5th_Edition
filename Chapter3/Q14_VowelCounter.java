/*
The file words.txt on the book’s website contains 87,314 words from the 
English language. 
Write a program that reads through this file and finds the word that
has the most consecutive vowels. For example, the word "bedouin" has three
consecutive vowels.
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q14_VowelCounter
{
	//Declaring and initializing constant variables
	public static final char A = 'a', 
								E = 'e',
								I = 'i',
								O = 'o',
								U = 'u';
	
	public static void main(String[] args)
	{
		
		//Declaring scanner object
		Scanner fileIn = null ; // Initializes fileIn to empty
		
		//Declaring and initializing variables
		String longestVowelWord = "";
		String nextWord = "";
		int i, nextWordLength;
		int vowelCount = 0;
		int numberOfVowels = 0;
		
		//Try catch statement to try and open file
		try
		{
		// Attempt to open the file
		fileIn = new Scanner(new FileInputStream("words.txt"));
		}
		catch (FileNotFoundException e)
		{
			// This block executed if the file is not found
			// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		
		//Read file until end
		while(fileIn.hasNextLine())
		{
			//Storing each word into a string and counting 
			//the number of letters in each word
			nextWord = fileIn.nextLine();
			nextWordLength = nextWord.length();
			
			//Counting number of vowels in each word
			for(i = nextWordLength - 1; i >= 0; i--) 
			{
			    if(nextWord.charAt(i) == A)
				   vowelCount++;
			    else if(nextWord.charAt(i) == E)
				   vowelCount++;
			    else if(nextWord.charAt(i) == I)
				   vowelCount++;
			    else if(nextWord.charAt(i) == O)
				   vowelCount++;
			    else if(nextWord.charAt(i) == U)
				   vowelCount++;
			}
			
			//Calculating which word in the file has the most vowels
			if(vowelCount > 0)
			{
				if(numberOfVowels == 0)
				{
					numberOfVowels = numberOfVowels + vowelCount;
					longestVowelWord = nextWord;
				}
				if(numberOfVowels > 0)
				{
					if(vowelCount > numberOfVowels)
					{
						numberOfVowels = 0;
						numberOfVowels = numberOfVowels + vowelCount;
						longestVowelWord = nextWord;
					}
				}
			}
			
			nextWord = "";
			vowelCount = 0;
		}
		
		//Printing the results
		System.out.println("Longest vowel word: " + longestVowelWord);
		System.out.println("Vowel count = " + numberOfVowels);
		
		//Closing file
		fileIn.close();
	}
}