import java.util.Scanner;

class DeckCardsGame {
    // Suits and Ranks of a deck
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Number of cards in the deck
    private static final int numOfCards = suits.length * ranks.length;

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < numOfCards; i++) {
            int randomIndex = i + (int) (Math.random() * (numOfCards - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute n cards to x players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > numOfCards) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[x][n];
        int index = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }

        System.out.println("\nPlayers and their cards:");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  - " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute and print players' cards
        String[][] distributedCards = distributeCards(deck, cardsPerPlayer, players);
        printPlayersCards(distributedCards);       
    }
}
