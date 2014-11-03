// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.
//
// Java How to Program, 9th Ed. (Deitel) Page 257
//
// Ray Santos
// November 3, 2014

public class DeckOfCardsTest
{
   public static void main( String[] args )
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle();

      for ( int i = 1; i <= 52; i++ )
      {
         System.out.printf( "%-19s", myDeckOfCards.dealCard() );

         if ( i % 4 == 0 ) // output a newline after every fourth card
            System.out.println();
      }
   }
}

/* Code execution examples

$ java DeckOfCardsTest 

Queen of Diamonds  Ace of Clubs       Eight of Spades    Three of Hearts    
Seven of Diamonds  Five of Spades     Ten of Diamonds    Ten of Hearts      
Nine of Diamonds   King of Clubs      Four of Spades     Queen of Hearts    
Ace of Spades      Queen of Spades    King of Diamonds   Six of Clubs       
Ten of Spades      Deuce of Spades    Nine of Spades     Five of Hearts     
Four of Clubs      Seven of Clubs     Five of Clubs      Seven of Hearts    
Eight of Clubs     Deuce of Diamonds  Deuce of Hearts    Nine of Hearts     
Nine of Clubs      Jack of Diamonds   King of Spades     Ten of Clubs       
Jack of Hearts     Four of Hearts     Five of Diamonds   Jack of Spades     
Jack of Clubs      Three of Spades    Three of Clubs     Four of Diamonds   
Queen of Clubs     Six of Hearts      Deuce of Clubs     Seven of Spades    
Eight of Hearts    Three of Diamonds  Eight of Diamonds  King of Hearts     
Six of Spades      Ace of Hearts      Six of Diamonds    Ace of Diamonds  

$ java DeckOfCardsTest 

Ace of Spades      Six of Spades      Ten of Spades      Ten of Diamonds    
Nine of Hearts     King of Hearts     Four of Spades     Eight of Spades    
Five of Spades     Six of Clubs       Deuce of Diamonds  Three of Clubs     
Three of Diamonds  Eight of Clubs     Eight of Hearts    Ace of Clubs       
Three of Spades    King of Spades     King of Diamonds   Nine of Clubs      
Nine of Spades     Queen of Spades    Queen of Diamonds  Jack of Hearts     
Queen of Clubs     Four of Diamonds   Five of Hearts     Ten of Clubs       
Nine of Diamonds   Six of Diamonds    Ten of Hearts      Six of Hearts      
Jack of Spades     Jack of Clubs      Eight of Diamonds  Jack of Diamonds   
Seven of Diamonds  Five of Clubs      Deuce of Spades    Three of Hearts    
Seven of Spades    Ace of Hearts      Seven of Hearts    Ace of Diamonds    
Queen of Hearts    Deuce of Clubs     Seven of Clubs     King of Clubs      
Five of Diamonds   Deuce of Hearts    Four of Hearts     Four of Clubs     

*/

