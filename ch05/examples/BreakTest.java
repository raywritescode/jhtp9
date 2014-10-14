// Fig. 5.12: BreakTest.java
// break statement exiting a for statement
//
// Java How to Program, 9th Ed. (Deitel) Page 172
//
// Ray Santos
// October 13, 2014

public class BreakTest
{
   public static void main( String[] args )
   {
      int count;

      for ( count = 1; count <= 10; count++ )
      {
         if ( count == 5 )
            break;

         System.out.printf( "%d ", count );
      }

      System.out.printf( "\nBroke out of loop at count = %d\n", count );
   }
}

/* Code execution

1 2 3 4 
Broke out of loop at count = 5

*/ 
