// Fig 4.12: Analysis.java
// Analysis of examination results using nested control statements.
//
// Java How To Program, 9th Ed. (Deitel) Page 128
//
// Ray Santos
// October 6, 2014

import java.util.Scanner;

public class Analysis
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int passes = 0;
      int failures = 0;
      int studentCounter = 1;
      int result;

      // process 10 students using counter-controlled loop
      while ( studentCounter <= 10 )
      {
         System.out.print( "Enter result (1 = pass, 2 = fail): ");
         result = input.nextInt();

         if ( result == 1 )
            passes = passes + 1;
         else
            failures = failures + 1;

         studentCounter = studentCounter + 1;
      }

      System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

      if ( passes > 8 )
         System.out.println( "Bonus to instructor! " );
   }
}

/* Test runs

Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 2
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Passed: 9
Failed: 1
Bonus to instructor! 


Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 2
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 2
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 2
Enter result (1 = pass, 2 = fail): 2
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Enter result (1 = pass, 2 = fail): 1
Passed: 6
Failed: 4

*/
