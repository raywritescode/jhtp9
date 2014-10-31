// Fig. 7.4: InitArray3.java
// Calculate the values to be placed into the elements of an array.
//
// Java How to Program, 9th Ed. (Deitel) Page 246
//
// Ray Santos
// October 30, 2014

public class InitArray3
{
   public static void main( String[] args )
   {
      final int ARRAY_LENGTH = 10;
      int[] array = new int[ ARRAY_LENGTH ];

      for ( int counter = 0; counter < array.length; counter++ )
         array[ counter ] = 2 + 2 * counter;

      System.out.printf( "%s%8s\n", "Index", "Value" );

      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
   }
}

/* Code execution

Index   Value
    0       2
    1       4
    2       6
    3       8
    4      10
    5      12
    6      14
    7      16
    8      18
    9      20

*/
