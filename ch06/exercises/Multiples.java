// Exercise 6.16: Multiples.java
//
// Write a method isMultiple that determines, for a pair of integers, whether
// the second integer is a multiple of the first. The method should take two
// integer arguments and return true if the second is a multiple of the first
// and false otherwise. [Hint: Use the remainder operator]. Incorporate this
// method into an application that inputs a series or pairs of integers
// (one pair at a time) and determines whether the second value in each pair
// is a multiple of the first.
//
// Java How to Program, 9th Ed. (Deitel) Page 236
//
// Ray Santos
// October 22, 2014

public class Multiples
{
   public boolean isMultiple( int firstInt, int secondInt )
   {
      if ( secondInt % firstInt == 0 ) 
         return true; 
      else 
         return false; 
   }
}

/* Sample numbers

First   Second    Calculation    Remainder   Return Value
-----   ------    -----------    ---------   ------------
  3        7         7 % 3           1          false
  3        6         6 % 3           0          true

*/ 
