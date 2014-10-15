// Exercise 5.10: Printing.java
// What does the following program do?
//
// Java How to Program, 9th Ed. (Deitel) Page 193
//
// Ray Santos
// October 15, 2104

public class Printing
{
   public static void main( String[] args )
   {
      for ( int i = 1; i <= 10; i++ )
      {
         for ( int j = 1; j <= 5; j++ )
            System.out.print( '@' );

         System.out.println();
      }
   }
}

/* raysantos manual code walkthrough

i    j    output
-    -    ------
1    1    @
     2    @
     3    @
     4    @
     5    @
          newline
2    1    @
     2    @
     3    @
     4    @
     5    @
          newline
3    1    @
     2    @
     3    @
     4    @
     5    @
          newline
4    1    @
     2    @
     3    @
     4    @
     5    @
          newline
5    1    @
     2    @
     3    @
     4    @
     5    @
          newline
6    1    @
     2    @
     3    @
     4    @
     5    @
          newline
7    1    @
     2    @
     3    @
     4    @
     5    @
          newline
8    1    @
     2    @
     3    @
     4    @
     5    @
          newline
9    1    @
     2    @
     3    @
     4    @
     5    @
          newline
10   1    @
     2    @
     3    @
     4    @
     5    @
          newline

Final displayed output

@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@

*/

/* Code execution

@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@

*/
