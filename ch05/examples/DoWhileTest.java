// Fig. 5.7: DoWhileTest.java
// do...while repetition statement
//
// Java How to Program, 9th Ed. (Deitel) Page 162
//
// Ray Santos
// October 9, 2014

public class DoWhileTest
{
   public static void main( String[] args )
   {
      int counter = 1;

      do
      {
         System.out.printf( "%d  ", counter );
         ++counter;
      } while ( counter <= 10 );

      System.out.println();
   }
}

/* Code execution

1  2  3  4  5  6  7  8  9  10 

*/
