package com.startjava.lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String userDesire = "";
		Scanner in = new Scanner(System.in, "UTF-8");
		do {
			System.out.print("Введите имя первого игрока : ");
			String playerOneName = in.nextLine();
			Player playerOne = new Player(playerOneName);
			System.out.print("Введите имя второго игрока : ");
			String playerTwoName = in.nextLine();
			Player playerTwo = new Player(playerTwoName);
			GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
			guessNumber.playGame();
			do {
				System.out.print("Хотите продолжить? [da/net]: ");
				userDesire = in.nextLine();
			} while (!(userDesire.equals("da") || userDesire.equals("net")));
		} while (userDesire.equals("da"));
	}
}