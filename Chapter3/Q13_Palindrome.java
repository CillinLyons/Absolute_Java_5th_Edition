/*
The file words.txt on the book’s website contains 87,314 words from the 
English language. 
Write a program that reads through this file and finds the longest word
that is a palindrome.
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q13_Palindrome
{
	public static void main(String[] args)
	{
		String longestPalindrome = "";
		String nextWord = "";
		String reverse = "";
		int i;
		int nextWordLength;
		int palindromeLength;
		
		//Declaring scanner object
		Scanner fileIn = null ; // Initializes fileIn to empty
		
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
		
		while(fileIn.hasNextLine())
		{
			nextWord = fileIn.nextLine();
			nextWordLength = nextWord.length();
			palindromeLength = longestPalindrome.length();
			
			for(i = nextWordLength - 1; i >= 0; i--) 
			{
			   reverse = reverse + nextWord.charAt(i);
			}
			
			if(reverse.equals(nextWord))
			{
				if(nextWordLength > palindromeLength)
					longestPalindrome = nextWord;
			}
			
			nextWord = "";
			reverse = "";
		}
		
		System.out.printf("The longest palindrome in the file is: %s", longestPalindrome);
		
		fileIn.close();
	}
}