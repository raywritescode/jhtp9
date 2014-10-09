// Exercise 4.17: Gas.java
// Gas Mileage
//
// Java How To Program, 9th Ed. (Deitel) Page 146
//
// Ray Santos
// October 8, 2014
//
// Drivers are concerned with the mileage their automobiles get. One driver has
// kept track of several trips by recording the miles driven and gallons used for
// each tankful.
//
// Develop a Java application that will input the miles driven and gallons used
// (both as integers) for each trip.
//
// The program should calculate and display the miles per gallon obtained for each
// trip and print the combined miles per gallon obtained for all trips up to this point.
// 
// All averaging calculations should produce floating-point results. Use class Scanner
// and sentinel-controlled repetition to obtain the data from the user.

import java.util.Scanner;

public class Gas
{
   public void inputTripInfo()
   {
      Scanner input = new Scanner( System.in );

      int miles = 0; 
      int gallons = 0; 
      double mpg = 0.0; 
      int total_miles = 0; 
      int total_gallons = 0; 
      double total_mpg = 0.0; 
      int trips = 0; 

      System.out.print( "Enter trip 1 mileage (as integer) or -1 to quit: ");
      miles = input.nextInt(); 
      if ( miles != -1 )
      { 
         System.out.print( "Enter trip 1 gallons (as integer): ");
         gallons = input.nextInt(); 
         trips++; 
      }

      // While the user has not yet entered the sentinel
      while ( miles != -1 )
      {
         total_miles += miles; 
         total_gallons += gallons; 
         total_mpg = (double) total_miles / total_gallons;

         mpg = (double) miles / gallons;        

         System.out.printf( "Trip %d's mpg (miles per gallon) is %.1f\n", trips, mpg );
   
         if ( trips > 1 )
         {
            System.out.printf( "\n   Total miles of your %d trips is %d\n", trips, total_miles );
            System.out.printf( "   Total gallons of your %d trips is %d\n", trips, total_gallons );
            System.out.printf( "   Combined mpg if your %d trips is %.1f\n", trips, total_mpg );
         }   

         // Prompt the user for the next trip miles (possibly the sentinel)
         trips++; 
         System.out.printf( "\nEnter trip %d mileage (as integer) or -1 to quit: ", trips );
         miles = input.nextInt();
         if ( miles != -1 )
         {
            System.out.printf( "Enter trip %d gallons (as integer): ", trips );
            gallons = input.nextInt();
         }
      } 

      if ( total_miles != 0 )
      {
         System.out.printf( "\nFinal total miles driven is: %d\n", total_miles );
         System.out.printf( "Final total gallons used is: %d\n", total_gallons );
         System.out.printf( "Final combined mpg is: %.1f\n\n", total_mpg );
      }
      else
         System.out.printf( "No trip information was entered.\n\n" );

   } // end method getTripInfo
} // end class Gas

/* Test run of Gas object

Enter trip 1 mileage (as integer) or -1 to quit: 100
Enter trip 1 gallons (as integer): 10
Trip 1's mpg (miles per gallon) is 10.0

Enter trip 2 mileage (as integer) or -1 to quit: 335
Enter trip 2 gallons (as integer): 10
Trip 2's mpg (miles per gallon) is 33.5

   Total miles of your 2 trips is 435
   Total gallons of your 2 trips is 20
   Combined mpg if your 2 trips is 21.8

Enter trip 3 mileage (as integer) or -1 to quit: 220
Enter trip 3 gallons (as integer): 30
Trip 3's mpg (miles per gallon) is 7.3

   Total miles of your 3 trips is 655
   Total gallons of your 3 trips is 50
   Combined mpg if your 3 trips is 13.1

Enter trip 4 mileage (as integer) or -1 to quit: -1

Final total miles driven is: 655
Final total gallons used is: 50
Final combined mpg is: 13.1
 
*/
