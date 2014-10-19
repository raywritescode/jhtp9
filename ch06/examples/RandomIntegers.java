// Fig. 6.6: RandomIntegers.java
// Shifted and scaled random integers
//
// Java How to Program, 9th Ed. (Deitel) Page 211
//
// Ray Santos
// October 18, 2014

import java.util.Random;

public class RandomIntegers
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random(); // random number generator

      int face; // stores each random integer generated

      for ( int counter = 1; counter <= 20; counter++ )
      {
         // pick random integer from 1 to 6
         face = 1 + randomNumbers.nextInt( 6 );

         System.out.printf( "%d  ", face );

         // if counter is divisible by 5, start a new line of output
         if ( counter % 5 == 0 )
            System.out.println();
      }
   }
}

/* Code execution

First run:

5  1  6  3  6  
3  5  3  2  1  
1  1  5  5  1  
6  2  6  2  4

Second run:

6  6  2  3  1  
1  5  1  5  5  
5  3  1  6  6  
5  5  6  6  3  

*/
