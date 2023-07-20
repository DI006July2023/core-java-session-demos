import java.util.Scanner;
import java.util.Random;

    public class SnakeLadders {

        public static void main(String[] args) {
            System.out.println("\uD83D\uDC0D Welcome to the thrilling world of Snakes and Ladders! \uD83D\uDC0D\n" +
                    "\n" +
                    "Get ready for an exciting journey filled with ups and downs, twists and turns, and unexpected surprises. " +
                    "Will you climb the ladders to reach new heights, or will the treacherous snakes send you sliding back to the start? " +
                    "The dice will decide your fate!\n" +
                    "\n" +
                    "Prepare yourself for the ultimate adventure, where strategy, luck, and anticipation blend into an unforgettable experience. " +
                    "Embark on this thrilling quest and see if you have what it takes to conquer the game of Snakes and Ladders!\n");

            Scanner scanner = new Scanner(System.in);
            boolean playAgain = true;

            while (playAgain) {
                int totalRounds = getRoundsToPlay(scanner);
                if (totalRounds == 0) {
                    System.out.println("Thanks for playing Snakes and Ladders!");
                    break;
                }

                playGame(totalRounds);

                System.out.print("Do you want to play again? Enter 1 for Yes or 2 for No: ");
                int playChoice = scanner.nextInt();
                playAgain = (playChoice == 1);
            }
        }

        // get rounds to play
        public static int getRoundsToPlay(Scanner scanner) {
            int totalRounds;
            do {
                System.out.print("How many rounds do you want to play? (Enter 0 to quit): ");
                totalRounds = scanner.nextInt();

                if (totalRounds < 0) {
                    System.out.println("The number you entered is not valid.");
                }
            } while (totalRounds < 0);

            return totalRounds;
        }

        // play game function
        public static void playGame(int totalRounds) {
            int playerPosition = 0;
            int computerPosition = 0;
            int playerWins = 0;
            int computerWins = 0;

            Random random = new Random();

            for (int round = 1; round <= totalRounds; round++) {
                System.out.println("\n--- Round " + round + " ---");
                System.out.println("Player position: " + playerPosition);
                System.out.println("Computer position: " + computerPosition);
                System.out.println();

                int playerRoll = rollDice(random);
                int computerRoll = rollDice(random);

                System.out.println("Player rolled a " + playerRoll);
                System.out.println("Computer rolled a " + computerRoll);

                playerPosition = updatePosition(playerPosition, playerRoll);
                computerPosition = updatePosition(computerPosition, computerRoll);

                System.out.println("Player position: " + playerPosition);
                System.out.println("Computer position: " + computerPosition);

                if (playerPosition >= 100 || computerPosition >= 100) {
                    declareWinner(playerPosition, computerPosition);
                    if (playerPosition >= 100) {
                        playerWins++;
                    } else {
                        computerWins++;
                    }
                    break;
                }
            }

            System.out.println("\n--- Game Summary ---");
            System.out.println("Player wins: " + playerWins);
            System.out.println("Computer wins: " + computerWins);
        }

        // roll dice
        public static int rollDice(Random random) {
            return random.nextInt(6) + 1;
        }

        // update position
        public static int updatePosition(int currentPosition, int roll) {
            int newPosition = currentPosition + roll;

            if (newPosition > 100) {
                newPosition = currentPosition;
            } else {
                int[] snakes = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
                int[] ladders = {1, 4, 9, 21, 28, 36, 51, 71, 80};
                newPosition = checkSnakesAndLadders(newPosition, snakes, ladders);
            }

            return newPosition;
        }

        // check for snakes and ladders
        public static int checkSnakesAndLadders(int position, int[] snakes, int[] ladders) {
            for (int i = 0; i < snakes.length; i++) {
                if (position == snakes[i]) {
                    System.out.println("Oops! A snake bit you. Go down to position " + (i + 1));
                    return i + 1;
                }
            }

            for (int i = 0; i < ladders.length; i++) {
                if (position == ladders[i]) {
                    System.out.println("Woohoo! You found a ladder. Climb up to position " + (i + 1));
                    return i + 1;
                }
            }

            return position;
        }

        // declare the winner
        public static void declareWinner(int playerPosition, int computerPosition) {
            if (playerPosition >= 100 && computerPosition >= 100) {
                System.out.println("\nIt's a tie! You both reached 100.");
            } else if (playerPosition >= 100) {
                System.out.println("\nCongratulations! You won the game!");
            } else {
                System.out.println("\nSorry, the computer won the game.");
            }
        }
    }