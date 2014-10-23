// Exercise 6.16: MultiplesTest.java
// Test application uses class Multiples
//
// Java How to Program, 9th Ed. (Deitel) Page 236
//
// Ray Santos
// October 22, 2014

import java.util.Scanner;

public class MultiplesTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      Multiples test = new Multiples();

      int intFirst;
      int intSecond;
      int numberOfTests;

      System.out.printf( 
         "This program determines, for a pair of integers, whether\n" +
         "the second integer is a multiple of the first.\n\n" );

      System.out.print( "Enter number of number-pairs to test: " );
      numberOfTests = input.nextInt();
      System.out.println();

      for ( int x = 1; x <= numberOfTests; x++ )
      {
         System.out.print( "Enter first integer: " );
         intFirst = input.nextInt();
         System.out.print( "Enter second integer: " );
         intSecond = input.nextInt();

         if ( test.isMultiple( intFirst, intSecond ) == true )
            System.out.printf( "%d is a multiple of %d\n\n", intSecond, intFirst );
         else
            System.out.printf( "%d is NOT a multiple of %d\n\n", intSecond, intFirst );
      }     
   }
}
