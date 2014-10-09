// Exercise 4.17: GasTest.java
// Create Gas object and invoke its inputTripInfo method.
//
// Java How To Program, 9th Ed. (Deitel) Page 146
//
// Ray Santos
// October 8, 2014

public class GasTest
{
   public static void main( String[] args )
   {
      Gas mileage = new Gas();
      mileage.inputTripInfo();
   }
}

/* Test run

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
