public class MyFirstGame {
	public static void main(String[] args) {
		int randomComputerNumber = 45;
		int playerNumber = 0;

		do {
			if (playerNumber < randomComputerNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} 
			playerNumber++;
		} while (playerNumber!=randomComputerNumber);
		System.out.println("Вы угадали!");
	}
}