// Fig. 6.9: Scope.java
// Scope class demonstrates field and local variable scopes.
//
// Java How to Program, 9th Ed. (Deitel) Page 220
//
// Ray Santos
// October 21, 2014

public class Scope
{
   // field that is accessible to all methods of this class
   private static int x = 1;

   public static void main( String[] args )
   {
      int x = 5; // method's local variable x shadows field x

      System.out.printf( "local x in main is %d\n", x );

      useLocalVariable(); // method has local x
      useField(); // method uses class Scope's field x
      useLocalVariable(); // reinitializes local x
      useField(); // class Scope's field x retains its value

      System.out.printf( "\nlocal x in main is %d\n", x );     
   }

   // create and initialize local variable x during each call
   public static void useLocalVariable()
   {
      int x = 25; // initialized each time useLocalVariable is called

      System.out.printf(
         "\nlocal x on entering method useLocalVariable is %d\n", x );

      ++x; // modifies this method's local variable x

      System.out.printf(
         "local x before exiting method useLocalVariable is %d\n", x );
   }

   // modify class Scope's field x during each call
   public static void useField()
   {
      System.out.printf(
         "\nfield x on entering method useField is %d\n", x );

      x *= 10; // modifies class Scope's field x
   
      System.out.printf(
         "field x before exiting method useField is %d\n", x );
   }
}

/* Code execution

local x in main is 5

local x on entering method useLocalVariable is 25
local x before exiting method useLocalVariable is 26

field x on entering method useField is 1
field x before exiting method useField is 10

local x on entering method useLocalVariable is 25
local x before exiting method useLocalVariable is 26

field x on entering method useField is 10
field x before exiting method useField is 100

local x in main is 5

*/
