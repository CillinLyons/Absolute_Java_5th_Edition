/*
Write a program that starts with a line of text and then outputs that line of text
with the first occurrence of "hate" changed to "love" . For example, a possible
sample output might be
The line of text to be changed is:
I hate you.
I have rephrased that line to read:
I love you.
You can assume that the word "hate" occurs in the input. If the word "hate"
occurs more than once in the line, your program will replace only the first occurrence
of "hate" . Since we will not discuss input until Chapter 2 , use a defined
constant for the string to be changed. To make your program work for another
string, you should only need to change the definition of this defined constant.
*/

import java.util.Scanner;

class Q9_NoHate
{
	public static final String hate = "hate";
	
	public static void main(String[] args)
	{
		//Declaring scanner object
		Scanner userInput = new Scanner(System.in);
		
		//Declaring string variable
		String sentence;
		
		//Entering and storing data
		System.out.println("Enter a sentence with the word hate in it: ");
		sentence = userInput.nextLine();
		
		//Calculating position of the word 'hate'
		int position = sentence.indexOf("hate");
		
		//Ending starts from index 6. (postion(2) + hate.length()(4) = 6)
		String ending = sentence.substring(position + "hate".length());
		
		System.out.println(sentence);
		System.out.println("The word \"hate\" starts at index " + position);
		
		//Takes 'i' from sentence.
		//concatenates the string adore.
		//Concatenates the value of the variable ending.
		sentence = sentence.substring(0, position) + "love" + ending;
		System.out.println("The changed string is:");
		System.out.println(sentence);
	}
}