// Fig. 7.7: RollDie.java
// Die-rolling program using arrays instead of switch
//
// Java How to Program, 9th Ed. (Deitel) Page 250
//
// Ray Santos
// November 1, 2014

import java.util.Random;

public class RollDie
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random();
      int[] frequency = new int[ 7 ];

      for ( int roll = 1; roll <= 6000000; roll++ )
         ++frequency[ 1 + randomNumbers.nextInt( 6 ) ];

      System.out.printf( "%s%10s\n", "Face", "Frequency" );

      // output each array element's value
      for ( int face = 1; face < frequency.length; face++ )
         System.out.printf( "%4d%10d\n", face, frequency[ face ] );
   }
}

/* Code execution. Three times

Face Frequency
   1    998888
   2    999770
   3   1001480
   4    999470
   5    999672
   6   1000720

Face Frequency
   1   1000643
   2    999354
   3    999159
   4    999920
   5   1000276
   6   1000648

Face Frequency
   1    998945
   2    999473
   3   1001434
   4   1000152
   5    999718
   6   1000278

*/
