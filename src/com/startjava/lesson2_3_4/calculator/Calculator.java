package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    public void calculate(String srcExpression) {
        String[] splitExpression = srcExpression.split(" ");
        int number1 = Integer.parseInt(splitExpression[0]);
        int number2 = Integer.parseInt(splitExpression[2]);
        if (number1 > 0 && number2 > 0) {
            switch (splitExpression[1]) {
                case "+":
                    System.out.println("Сумма : " + Math.addExact(number1, number2));
                    break;
                case "-":
                    System.out.println("Разность : " + Math.subtractExact(number1, number2));
                    break;
                case "*":
                    System.out.println("Произведение : " + Math.multiplyExact(number1, number2));
                    break;
                case "/":
                    System.out.println("Частное : " + (number1 / number2));
                    break;
                case "^":
                    System.out.println("Возведение в степень : " + Math.pow(number1, number2));
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