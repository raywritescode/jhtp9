// Fig. 7.20: VarargsTest.java
// Using variable-length argument lists.
//
// Java How to Program, 9t Ed. (Deitel) Page 278
//
// Ray Santos
// November 4, 2014

public class VarargsTest
{
   public static double average( double... numbers )
   {
      double total = 0.0;

      for ( double d : numbers )
         total += d;

      return total / numbers.length;
   }

   public static void main( String[] args )
   {
      double d1 = 10.0;
      double d2 = 20.0;
      double d3 = 30.0;
      double d4 = 40.0;

      System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
         d1, d2, d3, d4 );

      System.out.printf( "Average of d1 and d2 is %.1f\n",
         average( d1, d2 ) );

      System.out.printf( "Average of d1, d2 and d3 is %.1f\n",
         average( d1, d2, d3 ) );

      System.out.printf( "Average of d1, d2, d3 and d4 is %.1f\n",
         average( d1, d2, d3, d4 ) );
   }
}

/* Code execution

$ java VarargsTest 
d1 = 10.0
d2 = 20.0
d3 = 30.0
d4 = 40.0

Average of d1 and d2 is 15.0
Average of d1, d2 and d3 is 20.0
Average of d1, d2, d3 and d4 is 25.0

*/
