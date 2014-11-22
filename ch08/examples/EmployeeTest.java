// Fig. 8.9: EmployeeTest.java
// Composition demonstration
//
// Java How to Program, 9th Ed. (Deitel) Page 330
//
// Ray Santos
// November 22, 2014

public class EmployeeTest
{
   public static void main( String[] args )
   {
      Date birth = new Date( 7, 24, 1949 );
      Date hire = new Date( 3, 12, 1988 );
      Employee employee = new Employee( "Bob", "Blue", birth, hire );

      System.out.println( employee );
   }
}

/* Code execution

$ java EmployeeTest
Date object constructor for date 7/24/1949
Date object constructor for date 3/12/1988
Blue, Bob  Hired: 3/12/1988  Birthday: 7/24/1949

*/
