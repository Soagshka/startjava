import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
	private int randomNumber;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void playGame() {
		Random random = new Random();
		randomNumber = random.nextInt(101);
		Scanner in = new Scanner(System.in, "UTF-8");
		boolean isGuessedPlayerOne = false;
		boolean isGuessedPlayerTwo = false;
		do {
			System.out.print("Введите пожалуйста свое число " + playerOne.getName() + " : ");
			int playerOneNumber = in.nextInt();
			playerOne.setNumber(playerOneNumber);
			isGuessedPlayerOne = checkNumber(playerOne, randomNumber);
			System.out.print("Введите пожалуйста свое число " + playerTwo.getName() + " : ");
			int playerTwoNumber = in.nextInt();
			playerTwo.setNumber(playerTwoNumber);
			isGuessedPlayerTwo = checkNumber(playerTwo, randomNumber);
		} while (!isGuessedPlayerOne || !isGuessedPlayerTwo);
	}

	public boolean checkNumber(Player player, int randomNumber) {
		if (player.getNumber() < randomNumber) {
			System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
			return false;
		} else if (player.getNumber() > randomNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
			return false;
		} else {
			System.out.println(player.getName() + " угадал!");
			return true;
		}
	}
}