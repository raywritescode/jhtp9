// Fig. 7.3: InitArray2.java
// Initializing the elements of an array with an array initializer.
//
// Java How to Program, 9th Ed. (Deitel) Page 246
//
// Ray Santos
// October 30, 2014

public class InitArray2
{
   public static void main( String[] args )
   {
      int[] array = { 32, 27, 18, 95, 14, 90, 70, 60, 37 };

      System.out.printf( "%s%8s\n", "Index", "Value" );

      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
   }
}

/* Code execution

Index   Value
    0      32
    1      27
    2      18
    3      95
    4      14
    5      90
    6      70
    7      60
    8      37

*/
