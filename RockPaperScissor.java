import java.util.Scanner;

public class RockPaperScissor {

    // Method to get computer's choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomIndex = (int) (Math.random() * 3);
        return choices[randomIndex];
    }

    // Method to determine the winner
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        }
        return "Computer";
    }

    // Method to calculate win percentages
    public static String[][] calculateWinStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];

        double playerWinPercentage = ((double) playerWins / totalGames) * 100;
        double computerWinPercentage = ((double) computerWins / totalGames) * 100;

        stats[0][0] = "Player Wins";
        stats[0][1] = playerWins + " (" + String.format("%.2f", playerWinPercentage) + "%)";

        stats[1][0] = "Computer Wins";
        stats[1][1] = computerWins + " (" + String.format("%.2f", computerWinPercentage) + "%)";

        return stats;
    }

    // Method to display game results
    public static void displayResults(String[][] gameResults, String[][] winStats) {
        System.out.println("Game Results:");
        System.out.println("Game No.\tPlayer\tComputer\tWinner");

        for (String[] row : gameResults) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t" + row[2] + "\t\t" + row[3]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Category\tWins (Percentage)");
        for (String[] row : winStats) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int numGames = sc.nextInt();
        sc.nextLine(); // Consume newline

        int playerWins = 0, computerWins = 0;
        String[][] gameResults = new String[numGames][4];

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String playerChoice = sc.nextLine().trim();

            playerChoice = playerChoice.substring(0, 1).toUpperCase() + playerChoice.substring(1).toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            // Track wins
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            // Store game results
            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = playerChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        // Calculate win stats
        String[][] winStats = calculateWinStats(playerWins, computerWins, numGames);

        // Display results
        displayResults(gameResults, winStats);       
    }
}
