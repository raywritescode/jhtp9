// Fig. 8.7: Date.java
// Date class declaration.
//
// Java How to Program, 9th Ed. (Deitel) Page 328
//
// Ray Santos
// November 14,2014

public class Date
{
   private int month;
   private int day;
   private int year;

   private static final int[] daysPerMonth =
      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth );
      day = checkDay( theDay );
      year = theYear; // intentionally not validating the year

      System.out.printf(
         "Date object constructor for date %s\n", this );
   }

   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 )
         return testMonth;
      else
         throw new IllegalArgumentException( "month must be 1-12" );
   }

   private int checkDay( int testDay )
   {
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;

      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;

      throw new IllegalArgumentException(
         "day out-of-range for the specified month and year" );
   }

   public String toString()
   {
      return String.format( "%d/%d/%d", month, day, year );
   }
}
