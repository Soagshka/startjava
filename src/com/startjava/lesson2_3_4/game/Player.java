package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getNumbers(int length) {
		if (length <10) {
			return Arrays.copyOf(numbers, length);
		} else {
			return Arrays.copyOf(numbers, length - 1);
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