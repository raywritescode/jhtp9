// Exercise 5.11: SmallestTest.java
// Test application for class Smallest
//
// Java How to Program, 9th Ed. (Deitel) Page 193
//
// Ray Santos
// October 15, 2104

public class SmallestTest
{
   public static void main( String[] args )
   {
      Smallest smallest = new Smallest();

      smallest.inputValues();
      smallest.displaySmallest();
   }
}

/* Code execution

Enter the number of integer values to compare: 5
Enter an integer for value 1: 3
Enter an integer for value 2: 5
Enter an integer for value 3: 7
Enter an integer for value 4: 6
Enter an integer for value 5: 2

The smallest integer is 2

Enter the number of integer values to compare: 4
Enter an integer for value 1: 0
Enter an integer for value 2: 1
Enter an integer for value 3: 2
Enter an integer for value 4: 3

The smallest integer is 0

Enter the number of integer values to compare: 4
Enter an integer for value 1: 5
Enter an integer for value 2: 4
Enter an integer for value 3: 0
Enter an integer for value 4: 1

The smallest integer is 0

*/
