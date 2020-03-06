package com.startjava.lesson2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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
        System.out.println(Arrays.toString(playerOne.getNumbers(10)));
        System.out.println(Arrays.toString(playerTwo.getNumbers(10)));
        playerOne.clear();
        playerTwo.clear();
        System.out.println("У вас 10 попыток");
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(" i === " + i);
            playerOne.setNumber(enterNumber(playerOne));
            playerOne.setNumberToArray(playerOne.getNumber(), i);
            if (checkNumber(playerOne, i)) {
                break;
            }

            playerTwo.setNumber(enterNumber(playerTwo));
            playerTwo.setNumberToArray(playerTwo.getNumber(), i);
            if (checkNumber(playerTwo, i)) {
                break;
            }
        }
        printPlayerNumbers(playerOne, i);
        printPlayerNumbers(playerTwo, i);
    }

    private int enterNumber(Player player) {
        System.out.print("Введите пожалуйста свое число " + player.getName() + " : ");
        return in.nextInt();
    }

    private boolean checkNumber(Player player, int iteration) {
        if (player.getNumber() != randomNumber) {
            if (player.getNumber() < randomNumber) {
                System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
            } else {
                System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
            }
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + (iteration + 1) + " попытки");
            return true;
        }
    }

    private void printPlayerNumbers(Player player, int length) {
        System.out.print("Массив игрока " + player.getName() + " :");
        for (int value : player.getNumbers(length+1)) {
            System.out.print(value + " ");
        }
		System.out.println();
    }
}