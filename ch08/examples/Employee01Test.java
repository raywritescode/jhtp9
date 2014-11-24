// Fig. 8.13: Employee01Test.java
// static member demonstration
//
// Java How to Program, 9th Ed. (Deitel) Page 337
//
// Ray Santos
// November 23, 2014

public class Employee01Test
{
   public static void main( String[] args )
   {
      System.out.printf( "Employee01s before instantiation: %d\n",
         Employee01.getCount() );
   
      Employee01 e1 = new Employee01( "Susan", "Baker" );
      Employee01 e2 = new Employee01( "Bob", "Blue" );

      System.out.println( "\nEmployee01s after instantiation: " );
      System.out.printf( "via e1.getCount(): %d\n", e1.getCount() );
      System.out.printf( "via e2.getCount(): %d\n", e2.getCount() );
      System.out.printf( "via Employee01.getCount(): %d\n",
         Employee01.getCount() );

      System.out.printf( "\nEmployee01 1: %s %s\nEmployee01 2: %s %s\n",
         e1.getFirstName(), e1.getLastName(),
         e2.getFirstName(), e2.getLastName() );

      // in this example, there is only one reference to each Employee01,
      // so the following two statements indicate that these objects
      // are eligible for garbage collection
      e1 = null;
      e2 = null;
   }
}

/* Code execution

$ java Employee01Test
Employee01s before instantiation: 0
Employee01 constructor: Susan Baker; count = 1
Employee01 constructor: Bob Blue; count = 2

Employee01s after instantiation: 
via e1.getCount(): 2
via e2.getCount(): 2
via Employee01.getCount(): 2

Employee01 1: Susan Baker
Employee01 2: Bob Blue

*/
