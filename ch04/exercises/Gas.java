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

/* Pseudocode

Initialize trip miles to zero (as integer)
Initialize trip gallons to zero (as integer)
Initialize trip miles per gallon to zero (as double)
Initialize total miles to zero (as integer)
Initialize total gallons to zero (as integer)
Initialize total miles per gallon to zero (as double)

Prompt the user for the first trip miles 
Input the first trip miles (possibly the sentinel)

Prompt the user for the first trip gallons
Input the first trip gallons (possibly the sentinel)

While the user has not yet entered the sentinel
   Add this trip's miles to the running total
   Add this trip's gallons to the running total
   Calculate this trip's miles per gallon (as double)
   Display this trip's miles per gallon (as double)
   Display combined trips miles (as integer)
   Display combined trips miles per gallon (as double)
   Prompt the user for the next trip miles (possibly the sentinel)
   Prompt the user for the next trip gallons (possibly the sentinel)

If total miles per gallon is not equal to zero
   Print the final total miles driven (as integer)
   Print the final total gallons used (as integer)
   Print the final total miles per gallon (as double)
else
   Print "No trip information was entered"

*/
