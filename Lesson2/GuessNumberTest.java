import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		String userDesire = "";
		Scanner in = new Scanner(System.in, "UTF-8");
		do {
			Random random = new Random();
			int randomNumber = random.nextInt(101);
			System.out.print("Введите имя первого игрока : ");
			String playerOneName = in.nextLine();
			System.out.print("Введите число первого игрока : ");
			int playerOneNumber = in.nextInt();
			Player playerOne = new Player(playerOneName, playerOneNumber);
			GuessNumber guessNumber = new GuessNumber();
			guessNumber.playGame(playerOne.getName(), randomNumber, playerOne.getNumber());
			in.nextLine();
			System.out.print("Введите имя второго игрока : ");
			String playerTwoName = in.nextLine();
			System.out.print("Введите число второго игрока : ");
			int playerTwoNumber = in.nextInt();
			Player playerTwo = new Player(playerTwoName, playerTwoNumber);
			guessNumber.playGame(playerTwo.getName(), randomNumber, playerTwo.getNumber());
			in.nextLine();
        	do {
        		System.out.print("Хотите продолжить? [da/net]: ");
	        	userDesire = in.nextLine();
	        	//System.out.println("userDesire = " + userDesire);
        	} while (!(userDesire.equals("da") || userDesire.equals("net")));
		} while (userDesire.equals("da"));
	}
}