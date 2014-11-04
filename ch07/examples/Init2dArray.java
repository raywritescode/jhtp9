// Fig. 7.17: Init2dArray.java
// Initialize two-dimentional arrays.
//
// Java How to Program, 9th Ed. (Deitel) Page 270
//
// Ray Santos
// November 3, 2014

public class Init2dArray
{
   public static void main( String[] args )
   {
      int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
      int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

      System.out.println( "Values in array1 by row are" );
      outputArray( array1 );

      System.out.println( "\nValues in array2 by row are" );
      outputArray( array2 );
   }

   public static void outputArray( int[][] array )
   {
      for ( int row = 0; row < array.length; row++ )
      {
         for ( int column = 0; column < array[ row ].length; column++ )
            System.out.printf( "%d  ", array[ row ][ column ] );

         System.out.println();
      }
   }
}

/* Code execution

$ java Init2dArray 
Values in array1 by row are
1  2  3  
4  5  6  

Values in array2 by row are
1  2  
3  
4  5  6  

*/
