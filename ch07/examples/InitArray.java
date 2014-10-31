// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.
//
// Java How to Program, 9th Ed. (Deitel) Page 244
//
// Ray Santos
// October 30, 2014

public class InitArray
{
   public static void main( String[] args )
   {
      int[] array;

      array = new int[ 10 ];

      System.out.printf( "%s%8s\n", "Index", "Value" );

      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
   }
}

/* Code execution

Index   Value
    0       0
    1       0
    2       0
    3       0
    4       0
    5       0
    6       0
    7       0
    8       0
    9       0

*/
