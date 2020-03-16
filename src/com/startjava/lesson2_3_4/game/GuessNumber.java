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
        int iteration;
        for (iteration = 0; iteration < 10; iteration++) {
            if (doAction(playerOne, iteration)) {
                break;
            }

            if (doAction(playerTwo, iteration)) {
                break;
            }
        }
        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.clear();
        playerTwo.clear();
    }

    private boolean doAction(Player player, int iteration) {
        player.setNumber(enterNumber(player), iteration);
        return checkNumber(player, iteration);
    }

    private int enterNumber(Player player) {
        System.out.print("Введите пожалуйста свое число " + player.getName() + " : ");
        return in.nextInt();
    }

    private boolean checkNumber(Player player, int iteration) {
        if (player.getNumber(iteration) != randomNumber) {
            if (player.getNumber(iteration) < randomNumber) {
                System.out.println("Введенное " + player.getName() + " число меньше того, что загадал компьютер");
            } else {
                System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
            }
            if (iteration == 9) {
                System.out.println("У игрока " + player.getName() + " кончились попытки!");
            }
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + (iteration + 1) + " попытки");
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