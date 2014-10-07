// Fig. 4.15: Increment.java
// Prefix increment and postfix increment operators
//
// Java How To Program, 9th Ed. (Deitel) Page 132
//
// Ray Santos
// October 6, 2014

public class Increment
{
   public static void main( String[] args )
   {
      int c;

      // demonstrate postfix increment operator
      c = 5;
      System.out.println( c );   // prints 5
      System.out.println( c++ ); // prints 5 then postincrements
      System.out.println( c );   // prints 6

      System.out.println();

      // demonstrate prefix increment operator
      c = 5;
      System.out.println( c );   // prints 5
      System.out.println( ++c ); // preincrements then prints 6
      System.out.println( c );   // prints 6
   }
}

/* Test run

5
5
6

5
6
6

*/
