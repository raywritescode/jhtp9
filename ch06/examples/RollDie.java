// Fig. 6.7: RollDie.java
// Roll a six-sided die 6,000,000 times
//
// Java How to Program, 9th Ed. (Deitel) Page 212
//
// Ray Santos
// October 19, 2014

import java.util.Random;

public class RollDie
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random();

      int frequency1 = 0; // maintains counts of 1s rolled
      int frequency2 = 0; // counts of 2s rolled
      int frequency3 = 0;
      int frequency4 = 0;
      int frequency5 = 0;
      int frequency6 = 0;
      int face; // most recently rolled value

      // tally counts for 6,000,000 rolls of a die
      for ( int roll = 1; roll <= 6000000; roll++ )
      {
         face = 1 + randomNumbers.nextInt( 6 ); // number from 1 to 6

         switch ( face )
         {
            case 1:
               ++frequency1;
               break;
            case 2:
               ++frequency2;
               break;
            case 3:
               ++frequency3;
               break;
            case 4:
               ++frequency4;
               break;
            case 5:
               ++frequency5;
               break;
            case 6:
               ++frequency6;
               break;
         }
      }

      System.out.println( "Face\tFrequency" ); // output headers
      System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
         frequency1, frequency2, frequency3, frequency4,
         frequency5, frequency6 );
   }
}

/* Code executions

Face	Frequency
1	999290
2	1000878
3	999957
4	998204
5	1000802
6	1000869

Face	Frequency
1	1000597
2	1000353
3	1000191
4	1001021
5	999141
6	998697

Face	Frequency
1	1000790
2	998972
3	998760
4	1001060
5	1000367
6	1000051

*/
