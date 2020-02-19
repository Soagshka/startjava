import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String userDesire = "";
		do {
			Scanner in = new Scanner(System.in, "UTF-8");
			System.out.print("Введите первое число: ");
			int number1 = in.nextInt();
			System.out.print("Введите знак математической операции: ");
			in.nextLine();
			String operator = in.nextLine();
			System.out.print("Введите второе число: ");
			int number2 = in.nextInt();
			Calculator calc = new Calculator();
			switch (operator) {
	            case "+":	System.out.println("Сумма : " + calc.sum(number1, number2));
	                    	break;
	            case "-":	System.out.println("Разность : " + calc.diff(number1, number2));
	                    	break;
	            case "*":	System.out.println("Произведение : " + calc.multiply(number1, number2));
	                    	break;
	            case "/":	System.out.println("Частное : " + calc.divide(number1, number2));
	                    	break;
	            case "^":	System.out.println("Возведение в степень : " + calc.exponentiation(number1, number2));
	                    	break;
	            case "%":	System.out.println("Остаток от деления : " + calc.mod(number1, number2));
	                    	break;
	            default: System.out.println("Неправильный знак операции!");
	                     break;
        	}
        	in.nextLine();
        	do {
        		System.out.print("Хотите продолжить? [da/net]: ");
	        	userDesire = in.nextLine();
	        	//System.out.println("userDesire = " + userDesire);
        	} while (!(userDesire.equals("da") || userDesire.equals("net")));
		} while (userDesire.equals("da"));
	}
}