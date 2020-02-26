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
			Player playerOne = new Player(playerOneName);
			System.out.print("Введите имя второго игрока : ");
			String playerTwoName = in.nextLine();
			Player playerTwo = new Player(playerTwoName);
			GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
			guessNumber.playGame(randomNumber);
        	do {
        		System.out.print("Хотите продолжить? [da/net]: ");
	        	userDesire = in.nextLine();
	        	//System.out.println("userDesire = " + userDesire);
        	} while (!(userDesire.equals("da") || userDesire.equals("net")));
		} while (userDesire.equals("da"));
	}
}