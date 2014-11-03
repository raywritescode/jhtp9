// Fig. 7.12: EnhancedForTest.java
// Using the enhanced for statement to total integers in an array.
//
// Java How to Program, 9th Ed. (Deitel) Page 259
//
// Ray Santos
// November 3, 2014

public class EnhancedForTest
{
   public static void main( String[] args )
   {
      int[] myArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      int total = 0;

      for ( int number : myArray ) // for every int we'll call number in array myArray
         total += number;

      System.out.printf( "Total of array elements: %d\n", total );
   }
}

/* Code execution

$ java EnhancedForTest 
Total of array elements: 849

*/
