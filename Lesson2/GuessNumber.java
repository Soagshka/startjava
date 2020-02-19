public class GuessNumber {
	public void playGame(String name, int randomNumber, int playerNumber) {
		if (playerNumber < randomNumber) {
			System.out.println("Введенное " + name + " число меньше того, что загадал компьютер");
		} else if (playerNumber > randomNumber) {
			System.out.println("Введенное " + name + " число больше того, что загадал компьютер");
		} else {
			System.out.println(name + " угадал!");
		}
	}
}