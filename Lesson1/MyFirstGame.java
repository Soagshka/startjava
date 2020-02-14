public class MyFirstGame {
	public static void main(String[] args) {
		int randomNumber = 45;
		int playerNumber = 0;

		do {
			if (playerNumber < randomNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNumber++;
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNumber--;
			} 
		} while (playerNumber != randomNumber);
		System.out.println("Вы угадали!");
	}
}