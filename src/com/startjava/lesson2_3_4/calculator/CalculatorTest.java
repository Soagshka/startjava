package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String userDesire = "";
		Scanner in = new Scanner(System.in, "UTF-8");
		do {
			System.out.print("Введите математическое выражение: ");
			Calculator calc = new Calculator();
			calc.calculate(in.nextLine());
			do {
				System.out.print("Хотите продолжить? [da/net]: ");
				userDesire = in.nextLine();
				//System.out.println("userDesire = " + userDesire);
			} while (!(userDesire.equals("da") || userDesire.equals("net")));
		} while (userDesire.equals("da"));
	}
}