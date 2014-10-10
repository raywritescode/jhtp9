// Fig. 5.5: Sum.java
// Summing integers with the for statement.
//
// Java How to Program, 9th Ed. (Deitel) Page 158
//
// Ray Santos
// October 9, 2014

public class Sum
{
   public static void main( String[] args )
   {
      int total = 0;

      for ( int number = 2; number <= 20; number += 2 )
      {
         System.out.printf( "number is currently %d", number ); // not in example code
         System.out.printf( "\trunning total is %d\n", total += number ); // modifies example code
      }

      System.out.printf( "\nSum is %d\n", total );
   }
}

/* Code execution

number is currently 2	running total is 2
number is currently 4	running total is 6
number is currently 6	running total is 12
number is currently 8	running total is 20
number is currently 10	running total is 30
number is currently 12	running total is 42
number is currently 14	running total is 56
number is currently 16	running total is 72
number is currently 18	running total is 90
number is currently 20	running total is 110

Sum is 110

*/
