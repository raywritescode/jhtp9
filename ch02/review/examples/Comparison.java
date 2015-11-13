// Comparison.java
// November 12, 2015
// JHTP9, page 57
// Ray Santos

import java.util.Scanner;

public class Comparison
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int number1;
      int number2;

      System.out.print( "Enter first integer: " );
      number1 = input.nextInt();

      System.out.print( "Enter second integer: " );
      number2 = input.nextInt();

      if ( number1 == number2 )
         System.out.printf( "%d == %d\n", number1, number2 );

      if ( number1 != number2 )
         System.out.printf( "%d != %d\n", number1, number2 );

      if ( number1 < number2 )
         System.out.printf( "%d < %d\n", number1, number2 );

      if ( number1 > number2 )
         System.out.printf( "%d > %d\n", number1, number2 );

      if ( number1 <= number2 )
         System.out.printf( "%d <= %d\n", number1, number2 );

      if ( number1 >= number2 )
         System.out.printf( "%d >= %d\n", number1, number2 );
   }
}

/* Example run

$ javac Comparison.java 
$ java Comparison 
Enter first integer: 777
Enter second integer: 777
777 == 777
777 <= 777
777 >= 777
$ java Comparison 
Enter first integer: 1000
Enter second integer: 2000
1000 != 2000
1000 < 2000
1000 <= 2000
$ java Comparison 
Enter first integer: 2000
Enter second integer: 1000
2000 != 1000
2000 > 1000
2000 >= 1000

*/
