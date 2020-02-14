public class Calculator {
	public static void main(String[] args) {
		char operator = '^';
		int number1 = 6;
		int number2 = 3;
		int result = 0;

		if (number1 > 0 && number2 > 0) {
			if (operator == '+') {
				result = number1 + number2;
			} else if (operator == '-') {
				result = number1 - number2;
			} else if (operator == '*') {
				result = number1 * number2;
			} else if (operator == '/') {
				result = number1 / number2;
			} else if (operator == '^') {
				result = 1;
				for (int i = 0; i < number2; i++) {
					result *= number1;
				}	
			} else if (operator == '%') {
				result = number1 % number2;
			} else {
				System.out.println("No such operator..");
			}

			System.out.println("Result : " + result);
		} else {
			System.out.println("One or more numbers are negative...");
		}
	}
}