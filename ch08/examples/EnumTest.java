// Fig. 8.11: EnumTest.java
// Testing enum type Book.
//
// Java How to Program, 9th Ed. (Deitel) Page 332
//
// Ray Santos
// November 22, 2014

import java.util.EnumSet;

public class EnumTest
{
   public static void main( String[] args )
   {
      System.out.println( "All books:\n" );

      for ( Book book : Book.values() )
         System.out.printf( "%-10s%-45s%s\n", book,
            book.getTitle(), book.getCopyrightYear() );

      System.out.println( "\nDisplay a range of enum constants:\n" );

      // print first four books
      for ( Book book : EnumSet.range( Book.JHTP, Book.CPPHTP ) )
         System.out.printf( "%-10s%-45s%s\n", book,
            book.getTitle(), book.getCopyrightYear() );
   }
}

/* Code execution

All books:

JHTP      Java How to Program                          2012
CHTP      C How to Program                             2007
IW3HTP    Internet & World Wide Web How to Program     2008
CPPHTP    C++ How to Program                           2012
VBHTP     Visual Basic 2010 How to Program             2011
CSHARPHTP Visual C# 2010 How to Program                2011

Display a range of enum constants:

JHTP      Java How to Program                          2012
CHTP      C How to Program                             2007
IW3HTP    Internet & World Wide Web How to Program     2008
CPPHTP    C++ How to Program                           2012

*/
