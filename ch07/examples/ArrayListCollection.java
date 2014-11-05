// Fig. 7.24: ArrayListCollection.java
// Generaic ArrayList<T> collection demonstration.
//
// Java How to Program, 9th Ed. (Deitel) Page 285
//
// Ray Santos
// November 5, 2014

import java.util.ArrayList;

public class ArrayListCollection
{
   public static void main( String[] args )
   {
      ArrayList< String > items = new ArrayList< String >();

      items.add( "red" );
      items.add( 0, "yellow" );

      System.out.print(
         "Display list contents with counter-controlled loop:" );

      for ( int i = 0; i < items.size(); i++ )
         System.out.printf( " %s", items.get( i ) );

      display( items,
         "\nDisplay list contents with the enhanced for statement:" );

      items.add( "green" ); 
      items.add( "yellow" );
      display( items, "list with two new elements:" );

      items.remove( "yellow" );
      display( items, "Remove first instance of yellow:" );

      items.remove( 1 ); // removes item as index 1
      display( items, "Remove second list element (green):" );

      // check if a value is in the list
      System.out.printf( "\"red\" is %sin the list\n",
         items.contains( "red" ) ? "": "not " );

      System.out.printf( "Size: %s\n", items.size() );
   }

   // display the ArrayList's elements on the console
   public static void display( ArrayList< String > items, String header )
   {
      System.out.print( header );

      for ( String item : items )
         System.out.printf( " %s", item );

      System.out.println();
   }
}

/* Code execution

$ java ArrayListCollection
Display list contents with counter-controlled loop: yellow red
Display list contents with the enhanced for statement: yellow red
list with two new elements: yellow red green yellow
Remove first instance of yellow: red green yellow
Remove second list element (green): red yellow
"red" is in the list
Size: 2

*/
