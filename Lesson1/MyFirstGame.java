public class MyFirstGame {
	public static void main(String[] args) {

		int value = 45;
		int i = 0;
		boolean isGuessed = false;

		while (isGuessed==false) {
			if (i<value) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			}
			else if (i>value) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			}
			else {
				System.out.println("Вы угадали!");
				isGuessed = true;
			}
		}
		
	}
}