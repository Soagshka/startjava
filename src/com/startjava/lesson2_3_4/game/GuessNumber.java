package com.startjava.lesson2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int randomNumber;
    Scanner in = new Scanner(System.in, "UTF-8");

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void playGame() {
        Random random = new Random();
        randomNumber = random.nextInt(101);
        System.out.println("У вас 10 попыток");
        for (int i = 0; i < 10; i++) {
            if (makeMove(playerOne, i)) {
                break;
            }

            if (makeMove(playerTwo, i)) {
                break;
            }
        }
        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.clear();
        playerTwo.clear();
    }

    private boolean makeMove(Player player, int i) {
        player.setNumber(enterNumber(player), i);
        return checkNumber(player, i);
    }

    private int enterNumber(Player player) {
        System.out.print("Введите пожалуйста свое число " + player.getName() + " : ");
        return in.nextInt();
    }

    private boolean checkNumber(Player player, int i) {
        if (player.getNumber(i) != randomNumber) {
            if (player.getNumber(i) < randomNumber) {
                System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
            } else {
                System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
            }
            if (i == 9) {
                System.out.println("У игрока " + player.getName() + " кончились попытки!");
            }
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + (i + 1) + " попытки");
            return true;
        }
    }

    private void printPlayerNumbers(Player player) {
        System.out.print("Массив игрока " + player.getName() + " : ");
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}