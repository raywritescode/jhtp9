// Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
//
// Java How to Program, 9th Ed. (Deitel) Page 255
//
// Ray Santos
// November 3, 2014

import java.util.Random;

public class DeckOfCards
{
   private Card[] deck;
   private int currentCard;
   private static final int NUMBER_OF_CARDS = 52;
   private static final Random randomNumbers = new Random();

   public DeckOfCards()
   {
      String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
      String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

      deck = new Card[ NUMBER_OF_CARDS ];
      currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]

      // populate deck with Card objects
      for ( int count = 0; count < deck.length; count++ )
         deck[ count ] =
            new Card( faces[ count % 13 ], suits[ count / 13 ] );
   }

   public void shuffle()
   {
      // after shuffling, dealing should start at deck[ 0 ] again
      currentCard = 0;

      for ( int first = 0; first < deck.length; first++ )
      {
         // select a random number between 0 and 51
         int second = randomNumbers.nextInt( NUMBER_OF_CARDS );

         // swap current Card with randomly selected Card
         Card temp = deck[ first ];
         deck[ first ] = deck[ second ];
         deck[ second ] = temp;
      }
   }

   public Card dealCard()
   {
      // determine whether Cards remain to be dealt
      if ( currentCard < deck.length ) 
         return deck[ currentCard++ ]; // return current Card in array
      else
         return null; // indicates that all cards were dealt
   }
}
