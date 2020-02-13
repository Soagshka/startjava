public class Calculator {
	public static void main(String[] args) {
		char operator = '^';
		int value1 = 6;
		int value2 = 3;
		int result = 0;

		if (value1 > 0 && value2 > 0) {
			if (operator == '+') {
				result = value1 + value2;
			} else if (operator == '-') {
				result = value1 - value2;
			} else if (operator == '*') {
				result = value1 * value2;
			} else if (operator == '/') {
				result = value1 / value2;
			} else if (operator == '^') {
				result = 1;
				for (int i = 0; i < value2; i++) {
					result *= value1;
				}	
			} else if (operator == '%') {
				result = value1 % value2;
			} else {
				System.out.println("No such operator..");
			}

			System.out.println("Result : " + result);
		} else {
			System.out.println("One or more numbers are negative...");
		}
	}
}