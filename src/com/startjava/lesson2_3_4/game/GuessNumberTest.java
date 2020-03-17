package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String userDesire = "";
        Scanner in = new Scanner(System.in, "UTF-8");
        System.out.print("Введите имя первого игрока : ");
        Player playerOne = new Player(in.nextLine());
        System.out.print("Введите имя второго игрока : ");
        Player playerTwo = new Player(in.nextLine());
        do {
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.playGame();
            do {
                System.out.print("Хотите продолжить? [da/net]: ");
                userDesire = in.nextLine();
            } while (!(userDesire.equals("da") || userDesire.equals("net")));
        } while (userDesire.equals("da"));
    }
}