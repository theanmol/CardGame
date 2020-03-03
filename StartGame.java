import java.util.*;

public class StartGame {

    private static CardDeck deck = new CardDeck(true);
    private static Player playerOne = new Player("Player1");
    private static Player playerTwo = new Player("Player2");
    private static int roundsPlayed = 1;


    public static void main(String[] args) {


        playGame();

    }


    public static void playGame() {
        System.out.println("Starting Game");
        System.out.println();

        for(int i=0;i<10;i++){
          System.out.println("Playing Round "+ roundsPlayed);
        dealCard(); // Deal 1 card to each player
        displayCards();
        declareWinner(); // Declare the winner
        roundsPlayed++;
      }
    }

    // Deal 1 card each
    public static void dealCard() {

            playerOne.takeCard(deck);
            playerTwo.takeCard(deck);

    }

    // Displays each player's current hand
    public static void displayCards() {
        playerOne.displayHand();
        playerTwo.displayHand();
    }

    // Declare the winner
    public static void declareWinner() {
        Card play1Card = playerOne.getHand();
        Card play2Card = playerTwo.getHand();

        if(play1Card.getValue() == play2Card.getValue() && play1Card.getSuit() < play2Card.getSuit())  // suit spade is one and should be less to win
          System.out.println("Player 1 Wins round " + roundsPlayed);
        else if (play1Card.getValue() == play2Card.getValue())
          System.out.println("Player 2 Wins round " + roundsPlayed);

        else if(play1Card.getValue() > play2Card.getValue() )
          System.out.println("Player 1 Wins round " + roundsPlayed);
        else
          System.out.println("Player 2 Wins round " + roundsPlayed);

        System.out.println();

    }
}
