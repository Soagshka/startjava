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
		do {
			playerOne.setNumber(enterNumbers(playerOne));
			if (checkNumber(playerOne, randomNumber)) {
				break;
			}
			playerTwo.setNumber(enterNumbers(playerTwo));
			if (checkNumber(playerTwo, randomNumber)) {
				break;
			}
		} while (true);
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

	public int enterNumber(Player player) {
		Scanner in = new Scanner(System.in, "UTF-8");
		System.out.print("Введите пожалуйста свое число " + player.getName() + " : ");
		int playerNumber = in.nextInt();
		return playerNumber;
	}
}