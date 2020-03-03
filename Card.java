
public class Card {

     private int suit; // 1 spades, 2 heart, 3 club, 4 diamonds
     private int value; // 1.. 11 J, 12 Q, 13 K


     public Card() {
          this.suit = 1;
          this.value = 1;
     }

     public Card(int suit, int value) { // Construct a speciifc card
          this.suit = suit;
          this.value = value;
     }

     public int getSuit() {
          return this.suit;
     }

     public int getValue() {
          return this.value;
     }

     public void setSuit(int suit) {
          this.suit = suit;
     }

     public void setValue(int value) {
          this.value = value;
     }

     public String getName() {
          String name = "";

          // Convert int value to name of face value

          if (this.value == 1)
               name = "A"; //For ace
          else if (value == 11)
               name = "J";
          else if (value == 12)
               name = "Q";
          else if (value == 13)
               name = "K";
          else
               name = Integer.toString(value);

          // Convert int suit to name of suit as String

          if (suit == 1)
               name += "Spades";
          else if (suit == 2)
               name += "Heart";
          else if (suit == 3)
               name += "Club";
          else if (suit == 4)
               name += "Diamond";

          return name;
     }

     public String toString() {
          return getName();
     }
}
