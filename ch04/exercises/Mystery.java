// Exercise 4.16: Mystery.java
// What does the following program print?
//
// Java How to Program, 9th Ed. (Deitel) Page 145
//
// Ray Santos
// October 7, 2014

public class Mystery
{
   public static void main( String[] args )
   {
      int y;
      int x = 1;
      int total = 0;

      while ( x <= 10 )
      {
         y = x * x;
         System.out.println( y );
         total += y;
         ++x;
      }

      System.out.printf( "Total is %d\n\n", total );
   }
}

/* raysantos manual code walkthrough

loop    y    x     total   output
----    ----------------   ------
 0           1       0
 1      1    2       1       1
 2      4    3       5       4
 3      9    4       14      9
 4      16   5       30      16
 5      25   6       55      25
 6      36   7       91      36
 7      49   8       140     49
 8      64   9       204     64
 9      81   10      285     81
 10     100  11      385     100
                             Total is 385
*/

/* Code execution 

1
4
9
16
25
36
49
64
81
100
Total is 385

*/
