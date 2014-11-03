// Fig. 7.9: Card.java
// Card class represents a playing card.
//
// Java How to Program, 9th Ed. (Deitel) Page 254
//
// Ray Santos
// November 3, 2014

public class Card
{
   private String face;
   private String suit;

   public Card( String cardFace, String cardSuit )
   {
      face = cardFace;
      suit = cardSuit;
   }

   public String toString()
   {
      return face + " of " + suit;
   }
}
