// HeartRatesTest.java
// Test Application for Target-Heart-Rate Calculator
// Java How to Program, 9th Ed. (Deitel) Page 101
// Exercise 3.16
//
// Ray Santos
// October 2, 2014

import java.util.Scanner;

public class HeartRatesTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter your first name: ");
      String firstName = input.nextLine();

      System.out.print( "Enter your last name: ");
      String lastName = input.nextLine();

      System.out.print( "Enter your age: ");
      int age = input.nextInt();

      HeartRates person1 = new HeartRates( firstName, lastName, age );

      System.out.printf( "Calculations for %s %s age %d\n", 
         person1.getFirstName(), person1.getLastName(), person1.getAge() );

      System.out.printf( "Maximum Heart Rate: %d BPM (beats per minute)\n", person1.getMaxHeartRate() );

      System.out.print( "Target Heart Rate Range is: ");
      person1.displayTargetHeartRateRange();
      System.out.println();
   }
}

/* Test Run

Enter your first name: Ray
Enter your last name: Santos
Enter your age: 36
Calculations for Ray Santos age 36
Maximum Heart Rate: 184 BPM (beats per minute)
Target Heart Rate Range is: 92.0 to 156.4 BPM (beats per minute)

*/
