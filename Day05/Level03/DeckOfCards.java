import java.util.Scanner;

public class DeckOfCards {

    // Suits and ranks of the cards
    private static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    // Method to initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Populate the deck with "rank of suit"
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n * players > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute!");
        }

        String[][] playerCards = new String[players][n];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }

    // Method to print the players and their cards
    public static void printPlayerCards(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Take user input for the number of cards and players
        System.out.print("Enter the number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        try {
            // Distribute the cards
            String[][] playerCards = distributeCards(deck, cardsPerPlayer, players);

            // Print the players and their cards
            printPlayerCards(playerCards);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
