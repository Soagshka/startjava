public class Calculator {

	public void calculate(int number1, String operator, int number2) {
		if (number1 > 0 && number2 > 0) {
			switch (operator) {
				case "+":
					System.out.println("Сумма : " + (number1 + number2));
					break;
				case "-":
					System.out.println("Разность : " + (number1 - number2));
					break;
				case "*":
					System.out.println("Произведение : " + (number1 * number2));
					break;
				case "/":
					System.out.println("Частное : " + (number1 / number2));
					break;
				case "^":
					int result = 1;
					for (int i = 0; i < number2; i++) {
						result *= number1;
					}
					System.out.println("Возведение в степень : " + result);
					break;
				case "%":
					System.out.println("Остаток от деления : " + (number1 % number2));
					break;
				default:
					System.out.println("Неправильный знак операции!");
					break;
			}
	    } else {
			System.out.println("One or more numbers are negative...");
		}
	}
}