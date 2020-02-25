public class Calculator {

	public int calculate(String operator, int number1, int number2) {
		int result = 0;
		if (number1 > 0 && number2 > 0) {
			switch (operator) {
	        case "+":
	            result = number1 + number2;
	            System.out.println("Сумма : " + result);
	            break;
	        case "-":	
	            result = number1 - number2;
	            System.out.println("Разность : " + result);
	            break;
	        case "*":	
	            result = number1 * number2;
	            System.out.println("Произведение : " + result);
	            break;
	        case "/":	
	            result = number1 / number2;
	            System.out.println("Частное : " + result);
	            break;
	        case "^":	
	            result = 1;
				for (int i = 0; i < number2; i++) {
					result *= number1;
				}	
	            System.out.println("Возведение в степень : " + result);
	            break;
	        case "%":
	            result = number1 % number2;
	            System.out.println("Остаток от деления : " + result);
	            break;
	        default: 
	            System.out.println("Неправильный знак операции!");
	            break;
        	}
		} else {
			System.out.println("One or more numbers are negative...");
		}
		return result;
	}
}