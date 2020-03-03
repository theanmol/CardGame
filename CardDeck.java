import java.util.*;

public class CardDeck {

     private Card deck[]; // An array of Card objects
     private int next; // Holds position of next card

     public CardDeck(boolean shuffleTrue) {
          deck = new Card[53]; // Indices 1-52

          // Fill the deck with cards
          for (int i = 1; i <= 13; i++) {
               // Place cards in order in deck, shuffle later
               deck[i] = new Card(1, i); // First suit, spades
               deck[i+13] = new Card(2, i); // Second suit, heart
               deck[i+26] = new Card(3, i); // Third suit, club
               deck[i+39] = new Card(4, i); // Fourth suit, diamonds
          }

          next = 1; // Set next to 1 since first card is in index 1

          if (shuffleTrue == true) {
               shuffle();
          }
     }

     public void shuffle() {
          Random randomNumber = new Random();

          for (int card = 1; card <= 52; card++) {
               // Find a random place in the deck
               int rand = randomNumber.nextInt(52) + 1;

               // Swap cards in deck
               Card temp = deck[card]; // Card from random position
               deck[card] = deck[rand];
               deck[rand] = temp;
          }

          next = 1; // Reset next
     }

     public Card deal() { // Deals one card at a time
          if (next > 53) // If deck is depleted
               shuffle();

          Card c = deck[next];
          next++;

          return c;
     }
}
