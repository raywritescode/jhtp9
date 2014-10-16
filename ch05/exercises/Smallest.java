// Exercise 5.11: Smallest.java
// Find the smallest value
//
// Write an application that finds the smallest of several integers.
// Assume that the first value read specifies the number of values
// to input from the user.
//
// Java How to Program, 9th Ed. (Deitel) Page 193
//
// Ray Santos
// October 15, 2014

import java.util.Scanner;

public class Smallest
{
   private int values; // Initialize values to zero (as integer)
   private int number; // Initialize number to zero (as integer)
   private int smallest; // Initialize smallest to zero (as integer)

   public void inputValues()
   {
      // Prompt the user for number of values
      System.out.print( "Enter the number of integer values to compare: " );

      // Input the values
      Scanner input = new Scanner( System.in );
      values = input.nextInt();

      // For the number of values
      for ( int i = 1; i <= values; i++ )
      {
         // Prompt the user for a number
         System.out.printf( "Enter an integer for value %d: ", i ); 
         // Input the number
         number = input.nextInt();

         // If the number is the first input
         if ( i == 1 )
            smallest = number; // assign number to smaller
         else
            // If the number is less than smaller
            if ( number < smallest )
               smallest = number; // assign number to smaller
      }
   }

   // Print the smallest number
   public void displaySmallest()
   {
      System.out.printf( "\nThe smallest integer is %d\n\n", smallest );
   }
}
