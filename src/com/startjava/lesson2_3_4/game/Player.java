package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] numbers = new int[10];
	private int triesCount;

	public Player(String name) {
		this.name = name;
	}

	public void setTriesCount(int triesCount) {
		this.triesCount = triesCount;
	}

	public String getName() {
		return name;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, triesCount + 1);
	}

	public int getNumber(int iteration) {
		return numbers[iteration];
	}
	public void setNumber(int number, int index) {
		numbers[index] = number;
	}

	public void clear() {
		Arrays.fill(numbers, 0, numbers.length, 0);
	}
}