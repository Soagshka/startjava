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

	public void setTriesCount(int triesCount) {
		this.triesCount = triesCount;
	}

	public int[] getNumbers() {
		if (triesCount <10) {
			return Arrays.copyOf(numbers, triesCount + 1);
		} else {
			return Arrays.copyOf(numbers, triesCount - 1);
		}
	}

	public void setNumber(int number, int index) {
		numbers[index] = number;
	}

	public void clear(int toIndex) {
		if (toIndex < 10) {
			Arrays.fill(numbers, 0, toIndex + 1, 0);
		} else {
			Arrays.fill(numbers, 0);
		}
	}
}