package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int triesCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, triesCount + 1);
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public void setNumber(int number, int i) {
        triesCount = i;
        numbers[i] = number;
    }

    public void clear() {
        Arrays.fill(numbers, 0, triesCount + 1, 0);
    }
}