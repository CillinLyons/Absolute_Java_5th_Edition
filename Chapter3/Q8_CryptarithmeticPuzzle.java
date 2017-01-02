/*
In cryptarithmetic puzzles, mathematical equations are written using letters. 
Each letter can be a digit from 0 to 9, but no two letters can be the same. 
Here is a sample problem:
SEND + MORE = MONEY
A solution to the puzzle is S = 9, R = 8, O = 0, M = 1, Y = 2, E = 5, N = 6,
D = 7. 
Write a program that finds a solution to the cryptarithmetic puzzle of the
following:
TOO + TOO + TOO + TOO = GOOD
The simplest technique is to use a nested loop for each unique letter 
(in this case T, O, G, D). 
The loops would systematically assign the digits from 0 to 9 to each
letter. 
For example, it might first try 
T = 0, O = 0, G = 0, D = 0, then 
T = 0, O = 0, G = 0, D = 1, 
then T = 0, O = 0, G = 0, D = 2, etc., up to T = 9, O = 9, G = 9, D = 9. 
In the loop body, test that each variable is unique and that the equation is
satisfied. Output the values for the letters that satisfy the equation.
*/

public class Q8_CryptarithmeticPuzzle
{	
    public static void main(String[] args)
    {
		int T = 0, O = 0, G = 0, D = 0;
		
        for (T = 0 ;  T < 10 ; T++)  
        {    
            for (O = 0 ; O < 10 ; O++)  
            {    
                for (G = 0 ; G < 10 ; G++) 
                {    
                    for (D = 0 ; D < 10 ; D++)
                    {    
                        if ((D == G) || (D == O) || (D == T) || (G == O) || (G == T) || (O == T))
                        {
                           
                        }
                        else if (400*T + 40*O + 4*O == 1000*G + 100*O + 10*O + D)
                        {      
                            System.out.println("T = " + T);
                            System.out.println("O = " + O);
                            System.out.println("G = " + G);
                            System.out.println("D = " + D);
                            System.exit(0);
                        }
                    }
                }
            }      
        }
    }
}