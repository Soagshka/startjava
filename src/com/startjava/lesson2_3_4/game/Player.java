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
		return Arrays.copyOf(numbers, length);
	}

	public void setNumber(int number, int index) {
		numbers[index] = number;
	}

	public void clear(int toIndex) {
		Arrays.fill(numbers, 0, toIndex + 1, 0);
	}
}