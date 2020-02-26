import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String userDesire = "";
		Scanner in = new Scanner(System.in, "UTF-8");
		do {
			System.out.print("Введите первое число: ");
			int number1 = in.nextInt();
			System.out.print("Введите знак математической операции: ");
			in.nextLine();
			String operator = in.nextLine();
			System.out.print("Введите второе число: ");
			int number2 = in.nextInt();
			Calculator calc = new Calculator();
			calc.calculate(number1, operator, number2);
			in.nextLine();
			do {
				System.out.print("Хотите продолжить? [da/net]: ");
				userDesire = in.nextLine();
				//System.out.println("userDesire = " + userDesire);
			} while (!(userDesire.equals("da") || userDesire.equals("net")));
		} while (userDesire.equals("da"));
	}
}