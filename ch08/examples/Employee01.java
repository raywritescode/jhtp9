// Fig. 8.12: Employee01.java
// Static variable used to maintain a count of the number
// of Employee objects in memory.
//
// Java How to Program, 9th Ed. (Deitel) Page 336
//
// Ray Santos
// November 23, 2014

public class Employee01
{
   private String firstName;
   private String lastName;
   private static int count = 0;

   public Employee01( String first, String last )
   {
      firstName = first;
      lastName = last;

      ++count;
      System.out.printf( "Employee01 constructor: %s %s; count = %d\n",
         firstName, lastName, count );
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public static int getCount()
   {
      return count;
   }
}
