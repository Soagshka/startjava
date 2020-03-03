package com.startjava.lesson2_3.game;

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
        System.out.println("У вас 10 попыток");
        int[] numbersPlayer1 = new int[10];
        int[] numbersPlayer2 = new int[10];
        String winnerName = null;
        int i;
        for (i = 0; i < 10; i++) {
            playerOne.setNumber(enterNumber(playerOne));
            if (checkNumber(playerOne)) {
                winnerName = playerOne.getName();
                i++;
                break;
            }
            numbersPlayer1[i] = playerOne.getNumber();
            playerOne.setNumbers(numbersPlayer1);

            playerTwo.setNumber(enterNumber(playerTwo));
            if (checkNumber(playerTwo)) {
                winnerName = playerTwo.getName();
                i++;
                break;
            }
            numbersPlayer2[i] = playerTwo.getNumber();
            playerTwo.setNumbers(numbersPlayer2);
        }
        if (winnerName != null) {
            System.out.println("Игрок " + winnerName + " угадал число " + randomNumber + " с " + i + " попытки");
        } else {
            checkCountOfTries(playerOne);
            printArray(playerOne);
            checkCountOfTries(playerTwo);
            printArray(playerTwo);
        }
    }

    private int enterNumber(Player player) {
        System.out.print("Введите пожалуйста свое число " + player.getName() + " : ");
        return in.nextInt();
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() != randomNumber) {
            if (player.getNumber() < randomNumber) {
                System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
            } else {
                System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
            }
            return false;
        } else {
            System.out.println(player.getName() + " угадал!");
            return true;
        }
    }

    private void printArray(Player player) {
        System.out.print("Массив игрока " + player.getName() + " :");
        for (int i = 0; i < player.getNumbers().length; i++) {
            System.out.print(player.getNumbers()[i] + " ");
        }
		System.out.println();
    }

    public void checkCountOfTries(Player player) {
        if (player.getNumbers().length == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }
}