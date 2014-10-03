// HeartRates.java
// A Target-Heart-Rate Calculator
// Java How to Program, 9th Ed. (Deitel) Page 101
// Exercise 3.16
//
// Ray Santos
// October 2, 2014

public class HeartRates
{
   private String firstName;
   private String lastName;
   private int age; // decided to prompt for age instead of calculating it.
   // private int birthMonth;
   // private int birthDay;
   // private int birthYear;

   // Constructor
   public HeartRates( String first, String last, int currentAge )
   // public HeartRates( String first, String last, int month, int day, int year )
   {
      firstName = first;
      lastName = last;
      age = currentAge;
      
      // birthMonth = month;
      // birthDay = day;
      // birthYear = year;
   } 

   public int getMaxHeartRate()
   {
      return 220 - getAge();
   }

   public void displayTargetHeartRateRange()
   {
      System.out.printf( "%.1f to %.1f BPM (beats per minute)", 
         getMaxHeartRate() * 0.50, getMaxHeartRate() * 0.85 );
   }

   // Setters
   public void setFirstName( String first )
   {
      firstName = first;
   }

   public void setLastName( String last )
   {
      lastName = last;
   }

   public void setAge( int currentAge )
   {
      age = currentAge;
   }

/*
   public void setBirthMonth( int month )
   {
      birthMonth = month;
   }

   public void setBirthDay( int day )
   {
      birthDay = day;
   }

   public void setBirthYear( int year )
   {
      birthYear = year;
   }
*/

   // Getters
   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getAge()
   {
      return age;
   }

/*
   public int getBirthMonth()
   {
      return birthMonth;
   }

   public int getBirthDay()
   {
      return birthDay;
   }

   public int getBirthYear()
   {
      return birthYear;
   }
*/
}
