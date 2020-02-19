public class Calculator {
	public int sum(int number1, int number2) {
		return number1 + number2;
	}

	public int diff(int number1, int number2) {
		return number1 - number2;
	}

	public int multiply(int number1, int number2) {
		return number1 * number2;
	}

	public int exponentiation(int number1, int number2) {
		int result = 1;
		for (int i = 0; i < number2; i++) {
			result *= number1;
		}
		return result;
	}

	public int mod(int number1, int number2) {
		return number1 % number2;
	}

	public int divide(int number1, int number2) {
		return number1 / number2;
	}
}