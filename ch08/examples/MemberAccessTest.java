// Fig. 8.3: MemberAccessTest.java
// Private members of class Time1 are not accessible.
//
// Java How to Program, 9th Ed. (Deitel) Page 317
//
// Ray Santos
// November 9, 2014

public class MemberAccessTest
{
   public static void main( String[] args )
   {
      Time1 time = new Time1();

      time.hour = 7; // error: hour has private access in Time1
      time.minute = 15; // error: minute has private access in Time1
      time.second = 30; // error: second has private access in Time1
   }
}

/* Results of compiling MemberAccessTest.java

$ javac MemberAccessTest.java 
MemberAccessTest.java:15: error: hour has private access in Time1
      time.hour = 7; // error: hour has private access in Time1
          ^
MemberAccessTest.java:16: error: minute has private access in Time1
      time.minute = 15; // error: minute has private access in Time1
          ^
MemberAccessTest.java:17: error: second has private access in Time1
      time.second = 30; // error: second has private access in Time1
          ^
3 errors

*/
