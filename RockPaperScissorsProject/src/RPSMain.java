import java.util.Scanner;

public class RPSMain {

	/*
	 * The program first asks the user how many rounds he/she wants to play.
			Maximum number of rounds = 10, minimum number of rounds = 1.
			If the user asks for something outside this range, the program prints an error message and quits.
			If the number of rounds is in range, the program plays that number of rounds.
		Each round is played according to the requirements below.
			For each round of Rock, Paper, Scissors, the program does the following:
			The computer asks the user for his/her choice (Rock, Paper, or Scissors).
			Hint: 1 = Rock, 2 = Paper, 3 = Scissors
		After the computer asks for the user’s input, the computer randomly chooses Rock, Paper, or Scissors and displays the result of the round (tie, user win, or computer win).
			Hint: Use the Random class.
			The program must keep track of how many rounds are ties, user wins, or computer wins.
			Hint: Create three variables to keep track of these items and update them correctly after each round.
		At the end of the last round, the program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.
		After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
			If the user says No, the program prints out a message like, “Thanks for playing!” and then exits.
			If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.
	 */
	public static void main(String[] args) {
		
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		char option = 'n';
		
		Scanner scan = new Scanner(System.in); // System.in in java refers to the keyboard
		
		do {
			int ties = 0;
			int userWins = 0;
			int computerWins = 0;
			
			System.out.println("Let's start the game!! Please enter the number of rounds you would like to play? ");
			int rounds = scan.nextInt();
			
			if(rounds < 1 || rounds > 10) {
				System.out.println("Sorry!The number of rounds entered is not in the range of 1 to 10. Exiting... ");
				System.exit(-1);
			}
			
			for(int i=0;i<rounds;i++) {
				// creating variables to keep track of the wins for a particular round
				int tiesRound = 0;
				int computerWinRound = 0;
				int userWinRound = 0;
				
				// get user input for user choice
				int userChoice = getUserChoice();
				
				// get computer's choice
				int computerChoice = getComputerChoice();
				
				// find who won the round
				if(userChoice == computerChoice) {
					tiesRound++;
					ties++;
				}else if(userChoice == ROCK) {
					if(computerChoice == PAPER) {
						computerWinRound++;
						computerWins++;
					}else if(computerChoice == SCISSORS) {
						userWinRound++;
						userWins++;
					}
				}else if(userChoice == PAPER) {
					if(computerChoice == ROCK) {
						userWinRound++;
						userWins++;
					}else if(computerChoice == SCISSORS) {
						computerWinRound++;
						computerWins++;
					}
				}else if(userChoice == SCISSORS) {
					if(computerChoice == ROCK) {
						computerWinRound++;
						computerWins++;
					}else if(computerChoice == PAPER) {
						userWinRound++;
						userWins++;
					}
				}
				
				// print the result of this particular round
				System.out.println("Results of Round: " + (i+1));
				System.out.println("****************************");
				System.out.println("You chose:" + userChoice);
				System.out.println("Computer chose:" + computerChoice);
				System.out.println("****************************");
				if(tiesRound==1) {
					System.out.println("It is a tie...");
				}else if(computerWinRound == 1) {
					System.out.println("Computer wins...");
				}else if(userWinRound == 1) {
					System.out.println("User wins...");
				}
				System.out.println("****************************");
		
			}
			
			// print the ties, user wins and computer wins
			System.out.println("****************************");
			System.out.println("End of this game!");
			System.out.println("Final result....");
			System.out.println("****************************");
			System.out.println("Total number of Ties:" + ties);
			System.out.println("Total number of user wins:" + userWins);
			System.out.println("Total number of computer wins:" + computerWins);
			// declare who is the overall winner
			if(userWins > computerWins) {
				System.out.println("You have won the game...");
			}else if(computerWins > userWins) {
				System.out.println("Computer has won the game...");
			}else if(computerWins == userWins) {
				System.out.println("It is a draw...");
			}
			System.out.println("****************************");

			// ask if user wants to play again
			System.out.println("Do you to want to continue?(y/n):");
			option = scan.next().charAt(0);	
		}while(option=='y');
		
		System.out.println("Thanks for playing!");
	}

	private static int getComputerChoice() {
		return ((int)(Math.random() * 3) + 1);
	}

	private static int getUserChoice() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1-Rock");
		System.out.println("2-Paper");
		System.out.println("3-Scissors");
		System.out.println("Please enter your choice:");
		int userChoiceInMethod = scan.nextInt();
		return userChoiceInMethod;
	}

}
