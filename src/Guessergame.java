
import java.util.Scanner;

class Guesser {
	int guessNum;
	int rangeOfNum;

	public int rangeOfNumToGuess() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser - Enter the number to be guessed below the range ");
		rangeOfNum = scan.nextInt();
		return rangeOfNum;
	}

	public int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser - please enter the number to guess : ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player {
	int numToGuess;

	public int numberToGuess() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player - Guess the number");
		numToGuess = scan.nextInt();
		return numToGuess;
	}
}

class Umpire {
	int numFromGuesser;
	int rangeForNumtoGuess;
	int guessNumFromP1;
	int guessNumFromP2;
	int guessNumFromP3;

	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		rangeForNumtoGuess = g.rangeOfNumToGuess();
		numFromGuesser = g.guessNumber();
		System.out.println("Range in which number to be guessed : " + rangeForNumtoGuess);
		System.out.println("Number entered by Guesser : " + numFromGuesser);

	}

	public void collectNumFromPlayer1() {
		Player p1 = new Player();
		guessNumFromP1 = p1.numberToGuess();
		System.out.println("Number entered by Player1 : " + guessNumFromP1);
	}

	public void collectNumFromPlayer2() {
		Player p2 = new Player();
		guessNumFromP2 = p2.numberToGuess();
		System.out.println("Number entered by Player2 : " + guessNumFromP2);
	}

	public void collectNumFromPlayer3() {
		Player p3 = new Player();
		guessNumFromP3 = p3.numberToGuess();
		System.out.println("Number entered by Player3 : " + guessNumFromP3);
	}

	public int compareNumBtwGuesserPlayerInSemis() {
		boolean player1payer2 = false;
		boolean player1payer3 = false;
		boolean player2player3 = false;
		boolean player123 = false;

		/*
		 * If Players guess the number which is more than specified range then player is
		 * treated as Loser in match
		 */
		if (guessNumFromP1 > rangeForNumtoGuess) {
			System.out.println(
					"Player1 lost the game!!!!!  Number guessed by Player1 is more than specified range by guesser");
		} else if (guessNumFromP2 > rangeForNumtoGuess) {
			System.out.println(
					"Player2 lost the game!!!!! Number guessed by Player2 is more than specified range by guesser");
		} else if (guessNumFromP3 > rangeForNumtoGuess) {
			System.out.println(
					"Player3 lost the game!!!!! Number guessed by Player3 is more than specified range by guesser");
		}
		System.out.println(" ");

		/* Semis comparison between players */
		if (numFromGuesser == guessNumFromP1) {
			if (numFromGuesser == guessNumFromP2 && numFromGuesser == guessNumFromP3) {
				System.out.println("All three players has guessed correct number - Game tie");
				player123 = true;
			} else if (numFromGuesser == guessNumFromP2) {
				System.out.println("Player 1 and Player 2 has guessed same number, so players qualified to finals");
				player1payer2 = true;
			} else if (numFromGuesser == guessNumFromP3) {
				System.out.println("Player1 and Player 3 has guessed same number, so players qualified to finals");
				player1payer3 = true;
			} else
				System.out.println("***** Player 1 has won the game in Semis!!!! ***** ");
		} else if (numFromGuesser == guessNumFromP2) {
			if (numFromGuesser == guessNumFromP3) {
				System.out.println("Player 2 and Player 3 has guessed same number, so players qualified to finals");
				player2player3 = true;

			} else {
				System.out.println("***** Player 2 has won the game in Semis!!!!! *****");
			}
		} else if (numFromGuesser == guessNumFromP3) {
			System.out.println("***** Player3 has won the game in Semis!!!! *****");
		} else {
			System.out.println("Game lost - try again!");
			
		}
		/* return codes to conduct final match */
		/* If player1 player2 guesses same number in semis*/
		if (player1payer2 == true) {
			return 12;
		} else if (player1payer3 == true) {
			/* If player1 player3 guesses same number in semis*/
			return 13;
		} else if (player2player3 == true) {
			/* If player2 player3 guesses same number in semis*/
			return 23;
		} else if (player123 == true) {
			/* If player1, player2 and player3 guesses same number in semis*/
			return 123;
		}else {
			return 0;
		}
	}
	/* Finals comparison between players */
	public void compareNumBtwGuesserPlayerInFinals(int playerCode) {
		/* resetting guessNum based on playerCode, as values of guessNumFromPlayers are retained in finalCode execution */
		if (playerCode == 12) {
			guessNumFromP3 = 0;
		} else if (playerCode == 13) {
			guessNumFromP2 = 0;
		} else if (playerCode == 23) {
			guessNumFromP1 =0;
		}
		/*
		 * If Players guess the number which is more than specified range then player is
		 * treated as Loser in match
		 */
		if (guessNumFromP1 > rangeForNumtoGuess && playerCode != 23) {
			System.out.println(
					"Player1 lost the game in Finals!!!!!  Number guessed by Player1 is more than specified range by guesser");
		} else if (guessNumFromP2 > rangeForNumtoGuess && playerCode != 13) {
			System.out.println(
					"Player2 lost the game in Finals!!!!! Number guessed by Player2 is more than specified range by guesser");
		} else if (guessNumFromP3 > rangeForNumtoGuess && playerCode != 12) {
			System.out.println(
					"Player3 lost the game in Finals!!!!! Number guessed by Player3 is more than specified range by guesser");
		}
		System.out.println(" ");
		
		if (numFromGuesser == guessNumFromP1) {
			if (numFromGuesser == guessNumFromP2) {
				System.out.println("Player1 guessed num is : "+ guessNumFromP1+ " Player2 guessed num is : " +guessNumFromP2);
				System.out.println(
						"***** Player 1 and Player 2 has guessed the correct number in finals, so Player1 and Player2 has won the match *****");
			} else if (numFromGuesser == guessNumFromP3) {
				System.out.println("Player1 guessed num is : "+ guessNumFromP1+ " Player3 guessed num is : " +guessNumFromP3);

				System.out.println(
						"***** Player 1 and Player 3 has guessed the correct number in finals, so Player1 and Player2 has won the match ***** ");
			} else {
				System.out.println("***** Player1 has won the match in Finals!!!! *****");
			}
		} else if (numFromGuesser == guessNumFromP2) {
			if (numFromGuesser == guessNumFromP3) {
				System.out.println("Player2 guessed num is : "+ guessNumFromP2+ " Player3 guessed num is : " +guessNumFromP3);

				System.out.println(
						"***** Player 2 and Player 3 has guessed the correct number in finals, so Player2 and Player3 has won the match *****");
			} else {
				System.out.println("***** Player2 has won the match in Finals!!!! *****");
			}
		} else if (numFromGuesser == guessNumFromP3) {
			System.out.println("***** Player3 has won the match in Finals!!!! *****");
		}

	}
}

public class Guessergame {

	public static void main(String[] args) {
		int playerCode;
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer1();
		u.collectNumFromPlayer2();
		u.collectNumFromPlayer3();
	    playerCode = u.compareNumBtwGuesserPlayerInSemis();

		if (playerCode == 12) {
			u.collectNumFromGuesser();
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer2();
			u.compareNumBtwGuesserPlayerInFinals(playerCode);
		} else if (playerCode == 13) {
			u.collectNumFromGuesser();
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer3();
			u.compareNumBtwGuesserPlayerInFinals(playerCode);
		} else if (playerCode == 23) {
			u.collectNumFromGuesser();
			u.collectNumFromPlayer2();
			u.collectNumFromPlayer3();
			u.compareNumBtwGuesserPlayerInFinals(playerCode);
		} else if (playerCode == 123) {
			System.out.println("***** Re-execute the program as None of the player has won the match *****");
			
		}
	}

}
