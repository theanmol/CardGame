public class Player {

     private Card hand;
     private String name;

     public Player(String name) {
          hand = new Card(); 
          this.name = name;
     }

     public void takeCard(CardDeck deck){

       hand = deck.deal();

     }


          public Card getHand() {
               return this.hand;
          }


     public void displayHand() {
          System.out.println(name + "\'s Card is " + hand.toString());
     }


}
