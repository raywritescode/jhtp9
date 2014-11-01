// Fig. 7.5: SumArray.java
// Computing the sum of the elements of an array.
//
// Java How to Program, 9th Ed. (Deitel) Page 248
//
// Ray Santos
// October 31, 2014

public class SumArray
{
   public static void main( String[] args )
   {
      int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      int total = 0;

      for ( int counter = 0; counter < array.length; counter++ )
         total += array[ counter ];

      System.out.printf( "Total of array element: %d\n", total );
   }
}

/* Code execution

Total of array element: 849
 
*/
