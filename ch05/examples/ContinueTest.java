// Fig. 5.13: ContinueTest.java
// continue statement terminating an iteration of a for statement
//
// Java How to Program, 9th Ed. (Deitel) Page 173
//
// Ray Santos
// October 13, 2014

public class ContinueTest
{
   public static void main( String[] args )
   {
      for ( int count = 1; count <= 10; count++ )
      {
         if ( count == 5 )
            continue; // skip remaining code in loop

         System.out.printf( "%d ", count );
      }

      System.out.println( "\nUsed continue to skip printing 5" );
   }
}

/* Code execution

1 2 3 4 6 7 8 9 10 
Used continue to skip printing 5

*/
