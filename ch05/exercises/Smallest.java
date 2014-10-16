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
   private int values; 
   private int number; 
   private int smallest; 

   public void inputValues()
   {
      System.out.print( "Enter the number of integer values to compare: " );

      Scanner input = new Scanner( System.in );
      values = input.nextInt();

      for ( int i = 1; i <= values; i++ )
      {
         System.out.printf( "Enter an integer for value %d: ", i ); 
         number = input.nextInt();

         if ( i == 1 )
            smallest = number; 
         else
            if ( number < smallest )
               smallest = number; 
      }
   }

   public void displaySmallest()
   {
      System.out.printf( "\nThe smallest integer is %d\n\n", smallest );
   }
}

/* Code execution

Enter the number of integer values to compare: 5
Enter an integer for value 1: 3
Enter an integer for value 2: 5
Enter an integer for value 3: 7
Enter an integer for value 4: 6
Enter an integer for value 5: 2

The smallest integer is 2

Enter the number of integer values to compare: 4
Enter an integer for value 1: 0
Enter an integer for value 2: 1
Enter an integer for value 3: 2
Enter an integer for value 4: 3

The smallest integer is 0

Enter the number of integer values to compare: 4
Enter an integer for value 1: 5
Enter an integer for value 2: 4
Enter an integer for value 3: 0
Enter an integer for value 4: 1

The smallest integer is 0

*/
