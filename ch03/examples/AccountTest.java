// Fig. 3.14: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
// Java How to Program, 9th Ed. (Deitel) Page 90
//
// Ray Santos
// October 2, 2014

import java.util.Scanner;

public class AccountTest
{
   public static void main( String[] args )
   {
      Account account1 = new Account( 50.00 );
      Account account2 = new Account( -7.53 ); // object will initialize with $0.00 balance

      // Display initial balances
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

      Scanner input = new Scanner( System.in );
      double depositAmount;

      System.out.print( "Enter deposit amount for account1: " );
      depositAmount = input.nextDouble();
      System.out.printf( "\nAdding %.2f to account1 balance\n\n", depositAmount );
      account1.credit( depositAmount );

      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

      System.out.print( "Enter deposit amount for account2: " );
      depositAmount = input.nextDouble();
      System.out.printf( "\nAdding %.2f to account2 balance\n\n", depositAmount );
      account2.credit( depositAmount );

      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
   }
}

/* Test Run

account1 balance: $50.00
account2 balance: $0.00

Enter deposit amount for account1: 25.53

Adding 25.53 to account1 balance

account1 balance: $75.53
account2 balance: $0.00

Enter deposit amount for account2: 123.45

Adding 123.45 to account2 balance

account1 balance: $75.53
account2 balance: $123.45

*/
