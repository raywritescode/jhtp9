// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators,
// and equality operators.
// Page 57
//
// Ray Santos
// September 29, 2014

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

/* Test runs

Enter first integer: 777
Enter second integer: 777
777 == 777
777 <= 777
777 >= 777

Enter first integer: 1000
Enter second integer: 2000
1000 != 2000
1000 < 2000
1000 <= 2000

Enter first integer: 2000
Enter second integer: 1000
2000 != 1000
2000 > 1000
2000 >= 1000

*/
