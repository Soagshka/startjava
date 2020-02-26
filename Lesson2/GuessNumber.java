import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void playGame(int randomNumber) {
		Scanner in = new Scanner(System.in, "UTF-8");
		System.out.print("Введите число первого игрока : ");
		int playerOneNumber = in.nextInt();
		playerOne.setNumber(playerOneNumber);
		checkNumber(playerOne.getName(), randomNumber, playerOne.getNumber());
		System.out.print("Введите число второго игрока : ");
		int playerTwoNumber = in.nextInt();
		playerTwo.setNumber(playerTwoNumber);
		checkNumber(playerTwo.getName(), randomNumber, playerTwo.getNumber());
	}

	public void checkNumber(String name, int randomNumber, int playerNumber) {
		if (playerNumber < randomNumber) {
			System.out.println("Введенное " + name + " число меньше того, что загадал компьютер");
		} else if (playerNumber > randomNumber) {
			System.out.println("Введенное " + name + " число больше того, что загадал компьютер");
		} else {
			System.out.println(name + " угадал!");
		}
	}
}