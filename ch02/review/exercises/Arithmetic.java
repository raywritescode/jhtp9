// Arithmetic.java
// November 14, 2015
// JHTP9, Exercise 2.15 (Arithmetic), page 66
// Ray Santos
// 
// Write an application that asks the user to enter two integers, obtains
// them from the user and prints their sum, product, difference and quotient.

import java.util.Scanner;

public class Arithmetic
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int firstNum;
      int secondNum;

      System.out.print( "Enter first integer: " );
      firstNum = input.nextInt();

      System.out.print( "Enter second integer: ");
      secondNum = input.nextInt();

      System.out.printf( "%d + %d = %d\n", firstNum, secondNum, firstNum + secondNum );
      System.out.printf( "%d * %d = %d\n", firstNum, secondNum, firstNum * secondNum );
      System.out.printf( "%d - %d = %d\n", firstNum, secondNum, firstNum - secondNum );
      System.out.printf( "%d / %d = %d\n", firstNum, secondNum, firstNum / secondNum );
   }
}

/* Example runs

$ javac Arithmetic.java 
$ java Arithmetic 
Enter first integer: 50
Enter second integer: 25
50 + 25 = 75
50 * 25 = 1250
50 - 25 = 25
50 / 25 = 2

$ java Arithmetic 
Enter first integer: 25
Enter second integer: 50
25 + 50 = 75
25 * 50 = 1250
25 - 50 = -25
25 / 50 = 0
 
*/
