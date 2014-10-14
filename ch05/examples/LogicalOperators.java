// Fig. 5.18: LogicalOperators.java
// Logical operators.
//
// Java How to Program, 9th Ed. (Deitel) Page 177
//
// Ray Santos
// October 13, 2014

public class LogicalOperators
{
   public static void main( String[] args )
   {
      // truth table for && (conditional AND) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional AND (&&)", "false && false", ( false && false ),
         "false && true", ( false && true ),
         "true && false", ( true && false ),
         "true && true", ( true && true ) );

      // truth table for || (conditional OR) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional OR (||)", "false || false", ( false || false ),
         "false || true", ( false || true ),
         "true || false", ( true || false ),
         "true || true", ( true || true ) );

      // truth table for & (boolean logical AND) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
         "Boolean logical AND (&)", "false & false", ( false & false ),
         "false & true", ( false & true ),
         "true & false", ( true & false ),
         "true & true", ( true & true ) );

      // truth table for | (boolean logical inclusive OR) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical inclusive OR (|)",
         "false | false", ( false | false ),
         "false | true", ( false | true ),
         "true | false", ( true | false ),
         "true | true", ( true | true ) );

      // truth table for ^ (boolean logical exclusive OR) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical exclusive OR (^)",
         "false ^ false", ( false ^ false ),
         "false ^ true", ( false ^ true ),
         "false ^ false", ( false ^ false ),
         "true ^ true", ( true ^ true ) );

      // truth table for ! (logical negation) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
         "!false", ( !false ), "!true", ( !true ) );

   }
}

/* Code execution

Conditional AND (&&)
false && false: false
false && true: false
true && false: false
true && true: true

Conditional OR (||)
false || false: false
false || true: true
true || false: true
true || true: true

Boolean logical AND (&)
false & false: false
false & true: false
true & false: false
true & true: true

Boolean logical inclusive OR (|)
false | false: false
false | true: true
true | false: true
true | true: true

Boolean logical exclusive OR (^)
false ^ false: false
false ^ true: true
false ^ false: false
true ^ true: false

Logical NOT (!)
!false: true
!true: false

*/
