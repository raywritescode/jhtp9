// Fig. 5.1: WhileCounter.java
// Counter-controlled repetition with the while repetition statement.
//
// Java How to Program, 9th Ed. (Deitel) Page 152
//
// Ray Santos
// October 9, 2014

public class WhileCounter
{
   public static void main( String[] args )
   {
      int counter = 1;

      while ( counter <= 10 )
      {
        System.out.printf( "%d  ", counter );
        ++counter;
      } 
   
      System.out.println();
   }
}

/* Code execution

1  2  3  4  5  6  7  8  9  10 

*/
