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

      int miles = 0; // Initialize trip miles to zero (as integer)
      int gallons = 0; // Initialize trip gallons to zero (as integer)
      double mpg = 0.0; // Initialize trip miles per gallon to zero (as double)
      int total_miles = 0; //Initialize total miles to zero (as integer)
      int total_gallons = 0; //Initialize total gallons to zero (as integer)
      double total_mpg = 0.0; //Initialize total miles per gallon to zero (as double)
      int trips = 0; // Initialize trips counter to zero

      // Prompt the user for the first trip miles
      System.out.print( "Enter trip 1 mileage (as integer) or -1 to quit: ");
      miles = input.nextInt(); // Input the first trip miles (possibly the sentinel)
      if ( miles != -1 )
      { 
         // Prompt the user for the first trip gallons
         System.out.print( "Enter trip 1 gallons (as integer): ");
         gallons = input.nextInt(); // Input the first trip gallons
         trips++; // Add one to the trip counter
      }

      // While the user has not yet entered the sentinel
      while ( miles != -1 )
      {
         total_miles += miles; // Add this trip's miles to the running total
         total_gallons += gallons; // Add this trip's gallons to the running total
         total_mpg = (double) total_miles / total_gallons;

         // Calculate this trip's miles per gallon (as double)
         mpg = (double) miles / gallons;        

         // Display this trip's miles per gallon (as double)
         System.out.printf( "Trip %d's mpg (miles per gallon) is %.1f\n", trips, mpg );
   
         // Display combined trips miles (as integer)
         if ( trips > 1 )
         {
            System.out.printf( "\n   Total miles of your %d trips is %d\n", trips, total_miles );
            System.out.printf( "   Total gallons of your %d trips is %d\n", trips, total_gallons );
         
            // Display combined trips miles per gallon (as double)
            System.out.printf( "   Combined mpg if your %d trips is %.1f\n", trips, total_mpg );
         }   

         // Prompt the user for the next trip miles (possibly the sentinel)
         trips++; // Add one to the trip counter
         System.out.printf( "\nEnter trip %d mileage (as integer) or -1 to quit: ", trips );
         miles = input.nextInt();
         if ( miles != -1 )
         {
            // Prompt the user for the next trip gallons
            System.out.printf( "Enter trip %d gallons (as integer): ", trips );
            gallons = input.nextInt();
         }

      } // end while

      // If total miles per gallon is not equal to zero
      if ( total_miles != 0 )
      {
         // Print the final total miles driven (as integer)
         System.out.printf( "\nFinal total miles driven is: %d\n", total_miles );

         // Print the final total gallons used (as integer)
         System.out.printf( "Final total gallons used is: %d\n", total_gallons );
   
         // Print the final total miles per gallon (as double)
         System.out.printf( "Final combined mpg is: %.1f\n\n", total_mpg );
      }
      else
         // Print "No trip information was entered"
         System.out.printf( "No trip information was entered.\n\n" );

   } // end method getTripInfo
} // end class Gas
