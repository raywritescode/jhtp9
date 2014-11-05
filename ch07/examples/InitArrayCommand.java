// Fig. 7.21: InitArrayCommand.java
// Initializing an array using command-line arguments.
//
// Java How to Program, 9th Ed. (Deitel) Page 280
//
// Ray Santos
// November 4, 2014

public class InitArrayCommand
{
   public static void main( String[] args )
   {
      if ( args.length != 3 )
         System.out.println(
            "Error: Please re-enter the entire command, including\n" +
            "an array size, initial value and increment." );
      else
      {
         // get array size from first command-line argument
         int arrayLength = Integer.parseInt( args[ 0 ] );
         int[] array = new int[ arrayLength ];

         // get initial value and increment from command-line arguments
         int initialValue = Integer.parseInt( args[ 1 ] );
         int increment = Integer.parseInt( args[ 2 ] );

         // calculate value for each array element
         for ( int counter = 0; counter < array.length; counter++ )
            array[ counter ] = initialValue + increment * counter;

         System.out.printf( "%s%8s\n", "Index", "Value" );

         // display array index and value
         for ( int counter = 0; counter < array.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array[ counter ] );
      }
   }
}

/* Code execution

$ java InitArrayCommand
Error: Please re-enter the entire command, including
an array size, initial value and increment.

java InitArrayCommand 8 1 2
Index   Value
    0       1
    1       3
    2       5
    3       7
    4       9
    5      11
    6      13
    7      15

$ java InitArrayCommand 9 2 6
Index   Value
    0       2
    1       8
    2      14
    3      20
    4      26
    5      32
    6      38
    7      44
    8      50

*/
