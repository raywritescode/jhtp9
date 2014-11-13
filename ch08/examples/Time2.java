// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.
//
// Java How to Program, 9th Ed. (Deitel) Page 320
//
// Ray Santos
// November 12, 2014

public class Time2
{
   private int hour;
   private int minute;
   private int second;

   // Time2 no-argument constructor
   public Time2()
   {
      this( 0, 0, 0 );
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2( int h )
   {
      this( h, 0, 0 );
   }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2( int h, int m )
   {
      this( h, m, 0 );
   }

   // Time2 constructor: hour, minute, and second supplied
   public Time2( int h, int m, int s )
   {
      setTime( h, m, s );
   }

   // Time2 constructor: another Time2 object supplied
   public Time2( Time2 time )
   {
      this( time.getHour(), time.getMinute(), time.getSecond() );
   }

   public void setTime( int h, int m, int s)
   {
      setHour( h );
      setMinute( m );
      setSecond( s );
   }

   public void setHour( int h )
   {
      if ( h >= 0 && h < 24 )
         hour = h;
      else
         throw new IllegalArgumentException( "hour must be 0-23" );
   }

   public void setMinute( int m )
   {
      if ( m >= 0 && m < 60 )
         minute = m;
      else
         throw new IllegalArgumentException( "minute must be 0-59" );
   }

   public void setSecond( int s )
   {
      if ( s >= 0 && s < 60 )
         second = ( ( s >= 0 && s < 60 ) ? s : 0 );
      else
         throw new IllegalArgumentException( "second must be 0-59" );
   }

   public int getHour()
   {
      return hour;
   }

   public int getMinute()
   {
      return minute;
   }

   public int getSecond()
   {
      return second;
   }

   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   }

   public String toString()
   {
      return String.format( "%d:%02d:%02d %s",
         ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   }
}
