// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
//
// Java How to Program, 9th Ed. (Deitel) Page 215
//
// Ray Santos
// October 20, 2014

import java.util.Random;

public class Craps
{
   private static final Random randomNumbers = new Random();

   private enum Status { CONTINUE, WON, LOST };

   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   public static void main( String[] args )
   {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus;

      int sumOfDice = rollDice();

      switch ( sumOfDice )
      {
         case SEVEN: // win with 7 on first roll
         case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll
         case BOX_CARS: // lose with 12 on first roll
            gameStatus = Status.LOST;
            break;
         default: // di not win or lose, so remember point
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point
            System.out.printf( "Point is %d\n", myPoint );
            break;
      }

      while ( gameStatus == Status.CONTINUE )
      {
         sumOfDice = rollDice();

         if ( sumOfDice == myPoint ) // win by making point
            gameStatus = Status.WON;
         else
            if ( sumOfDice == SEVEN ) // lsoe by rolling 7 before point
               gameStatus = Status.LOST;
      }

      // display won or lost message
      if ( gameStatus == Status.WON )
         System.out.println( "Player wins" );
      else
         System.out.println( "Player loses" );
   }

   public static int rollDice()
   {
      int die1 = 1 + randomNumbers.nextInt( 6 );
      int die2 = 1 + randomNumbers.nextInt( 6 );

      int sum = die1 + die2;

      System.out.printf( "Player rolled %d + %d = %d\n",
         die1, die2, sum );

      return sum;
   }
}
