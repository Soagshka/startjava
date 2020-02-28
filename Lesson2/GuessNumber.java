import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
	private int randomNumber;
	Scanner in = new Scanner(System.in, "UTF-8");

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void playGame() {
		Random random = new Random();
		randomNumber = random.nextInt(101);
		do {
			playerOne.setNumber(enterNumber(playerOne));
			if (checkNumber(playerOne)) {
				break;
			}
			playerTwo.setNumber(enterNumber(playerTwo));
			if (checkNumber(playerTwo)) {
				break;
			}
		} while (true);
	}

	private int enterNumber(Player player) {
		System.out.print("Введите пожалуйста свое число " + player.getName() + " : ");
		return in.nextInt();
	}

	private boolean checkNumber(Player player) {
		if (player.getNumber() != randomNumber) {
			if (player.getNumber() < randomNumber) {
				System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
			} else {
				System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
			}
			return false; 
		} else {
				System.out.println(player.getName() + " угадал!");
				return true;
		}
	}
}