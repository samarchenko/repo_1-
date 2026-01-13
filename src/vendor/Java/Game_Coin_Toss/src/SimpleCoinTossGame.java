package Coin_Toss_Heads_OR_Tails;

// adding a random class and scanner
import java.util.Random;
import java.util.Scanner;

// This is a class announcement, specifically a game announcement.
public class CoinTossGame {

    // this is the key to run our code
    public static void main(String[] args) {

        // I create a scanner and random to use them
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // the game's virtual menu, which explains what the game is about and what you need to do in it
        System.out.println("\n\n╔════════════ Game of heads or tails ════════════╗");
        System.out.println("║ Guess what will come up: heads (1) or tails (2)║" );
        System.out.print("║ Developer: Samarchenko Anton 127757            ║\n");
        System.out.print("║ Contact: 127757@student.san.edu.pl             ║\n");
        System.out.print("╚════════════════════════════════════════════════╝");

        // initially created changes for game statistics
        int victories = 0;
        int defeat = 0;
        int totalGames = 0;

        // main game cycle that will repeat continuously until I exit the game (by pressing 0)
        // Endless cycle - the game continues until the player gets tired of playing
        while (true) {
            // displaying the menu and what the player needs to do
            System.out.println("\n\t═══════ Heads or Tails ═══════");
            System.out.print("your choice (1 - heads, 2 - tails, 0 - exit):  ");

            // the player's choice whether the player wants to choose heads or tails
            byte choice = scan.nextByte();

            // If a player wants to exit the game, they must enter 0, which triggers the conditional operator ‘if’, which stops and exits the cycle, and the game ends.
            if (choice == 0) {
                break;
            }

            // conditional operator ‘if’ which checks that the player has not selected other options the player has only 3 options to choose from 1 - Heads 2 - Tails, 0 - Exit the game
            if (choice != 1 && choice != 2) {
                System.out.print("Error: select the correct option 1 or 2\n");
                continue;
            }

            //coin toss
            // generates a random result of Heads or Tails and imitates the tossing of a coin
            int coin = random.nextInt(2) + 1;
            System.out.print("the coin flies ....\n");

            // imitates a coin in the air
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            // Displaying the result of a coin toss
            // conditional operators that check which coin was selected and display in the console which coin was selected at random
            if (coin == 1) {
                System.out.print("\nThe coin fell: heads\n");
            } else if (coin == 2) {
                System.out.print("\nThe coin fell: tails\n");
            } else {
                System.out.print("ERROR");
            }

            // The conditional operator checks whether the player guessed the coin correctly. If so, one win is counted; if not, one loss is counted.
            if (choice == coin) {
                System.out.println(" ✅ Correct! You guessed right.\n");
                victories++;
            } else {
                System.out.print("❌ didn't guess :-(\n");
                defeat++;
            }

            // for statistics, counts how many games a player has played
            totalGames++;

            // current statistics displayed during the game
            System.out.print("\nStatistics: \n");
            System.out.print("Number of games played: " + totalGames + "\n"); // How many games in total
            System.out.print("Number of wins: " + victories + "\n"); // How many victories
            System.out.println("number of losses: " + defeat + "\n"); // How many defeats

            // calculates the overall win percentage using the formula: Number of wins divided by  Total number of games and then multiplied by  100%
            if (totalGames > 0) {
                double winRate = ((double) victories / totalGames) * 100.0;
                System.out.print("Overall win percentage: " + winRate + "%\n");

                // conditional operators that check the percentage of wins if a player has scored more than 50% of wins, then he plays very well  if exactly 50%, then the balance is even, and if less than 50%, then he plays poorly
                if(winRate > 50) {
                    System.out.print("\uD83C\uDF89 You play better than the statistics!\n\n");
                }
                else if (winRate == 50) {
                        System.out.print("⚖\uFE0F The perfect balance!\n\n");
                }
                else if (winRate < 50) {
                    System.out.print("\uD83D\uDE0A try to win!\n\n");
                }
            }
        }

        // Final statistics after leaving the game
        System.out.println("\n\n╔══════════════════════════════════════╗");
        System.out.println("║           FINAL STATISTICS           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf("║ Number of games played: %-11d  ║\n", totalGames); // How many games in total
        System.out.printf("║ Number of wins: %-20d ║\n", victories); // How many games in total
        System.out.printf("║ Number of losses: %-18d ║\n", defeat); // How many defeats

        // The percentage of wins in the final statistics is also calculated using the formula that has already been
        if (totalGames > 0) {
            double winRate = ((double) victories / totalGames) * 100.0;
            String winRateStr = String.format("%.1f%%", winRate);
            System.out.printf("║ Overall win percentage: %-11s  ║\n", winRateStr);
        } else {
            System.out.printf("║ Overall win percentage: %-11s  ║\n", "0.0%");
        }

        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║     THANK YOU FOR THE GAME!          ║");
        System.out.println("╚══════════════════════════════════════╝\n\n");

        // closes Scanner good practice
        scan.close();
    }
}


