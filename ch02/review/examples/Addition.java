// Addition.java
// November 12, 2015
// JHTP9, page 47
// Ray Santos

import java.util.Scanner; // program uses class Scanner

public class Addition
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int number1;
      int number2;
      int sum;

      System.out.print( "Enter first integer: " );
      number1 = input.nextInt();

      System.out.print( "Enter second integer: " );
      number2 = input.nextInt();   

      sum = number1 + number2;

      System.out.printf( "Sum is %d\n", sum );
   }
}

/* Example run

$ javac Addition.java 
$ java Addition 
Enter first integer: 45
Enter second integer: 72
Sum is 117

*/
