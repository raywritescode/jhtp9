// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.
//
// Java How to Program, 9th Ed. (Deitel) Pagel 324
//
// Ray Santos
// November 13, 2014

public class Time2Test
{
   public static void main( String[] args )
   {
      Time2 t1 = new Time2();
      Time2 t2 = new Time2( 2 );
      Time2 t3 = new Time2( 21, 34 );
      Time2 t4 = new Time2( 12, 25, 42 );
      Time2 t5 = new Time2( t4 );

      System.out.println( "Constructed with:" );
      System.out.println( "t1: all arguments defaulted" );
      System.out.printf( "   %s\n", t1.toUniversalString() );
      System.out.printf( "   %s\n", t1.toString() );

      System.out.println(
         "t2: hour specified; minute and second defaulted" );
      System.out.printf( "   %s\n", t2.toUniversalString() );
      System.out.printf( "   %s\n", t2.toString() );

      System.out.println(
         "t3: hour and minute specified; second defaulted" );
      System.out.printf( "   %s\n", t3.toUniversalString() );
      System.out.printf( "   %s\n", t3.toString() );

      System.out.println(
         "t4: hour, minute, and second specified" );
      System.out.printf( "   %s\n", t4.toUniversalString() );
      System.out.printf( "   %s\n", t4.toString() );

      System.out.println( "t5: Time2 object t4 specified" );
      System.out.printf( "   %s\n", t5.toUniversalString() );
      System.out.printf( "   %s\n", t5.toString() );

      try
      {
         Time2 t6 = new Time2( 27, 74, 99 ); // attempt to initialize t6 with invalid values
      }
      catch ( IllegalArgumentException e )
      {
         System.out.printf( "\nException while initializing t6: %s\n",
            e.getMessage() );
      }
   }
}

/* Code execution

$ java Time2Test
Constructed with:
t1: all arguments defaulted
   00:00:00
   12:00:00 AM
t2: hour specified; minute and second defaulted
   02:00:00
   2:00:00 AM
t3: hour and minute specified; second defaulted
   21:34:00
   9:34:00 PM
t4: hour, minute, and second specified
   12:25:42
   12:25:42 PM
t5: Time2 object t4 specified
   12:25:42
   12:25:42 PM

Exception while initializing t6: hour must be 0-23

*/
