// Fig. 6.3: MaximumFinder.java
// Programmer-declared method maximum with three double parameters
//
// Java How to Program, 9th Ed. (Deitel) Page 202
//
// Ray Santos
// October 17, 2014

import java.util.Scanner;

public class MaximumFinder
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print(
         "Enter three floating-point values separated by spaces: " );

      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();

      // assignment calls the static maximum method defined further below
      double result = maximum( number1, number2, number3 );

      System.out.println( "Maximum is " + result );
   }

   public static double maximum( double x, double y, double z )
   {
      double maximumValue = x; // assume x is the largest to start

      if ( y > maximumValue )
         maximumValue = y;

      if ( z > maximumValue )
         maximumValue = z;

      return maximumValue;
   }
}

/* Code execution

Enter three floating-point values separated by spaces: 9.35 2.74 5.1
Maximum is 9.35

Enter three floating-point values separated by spaces: 5.8 12.45 8.32
Maximum is 12.45

Enter three floating-point values separated by spaces: 6.46 4.12 10.54
Maximum is 10.54

*/
