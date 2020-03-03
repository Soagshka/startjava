package com.startjava.lesson2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Gipsy Danger (Jaeger)", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6, "-", "Street Fighter");
		jaegerOne.move();
		jaegerOne.scanKaiju();

		System.out.println("Speed = " + jaegerOne.getSpeed());
		System.out.println("Origin = " + jaegerOne.getOrigin());
		System.out.println("Name = " + jaegerOne.getModelName());
		System.out.println("Armor = " + jaegerOne.getArmor());

		Jaeger jaegerTwo = new Jaeger("Gipsy Avenger", "Mark-6", "-", 81.77f, 2.004f, 10, 4, 8, "Destroyed", "Street Fighter");
		jaegerTwo.drift();

		System.out.println("Status = " + jaegerTwo.getStatus());
		System.out.println("Weight = " + jaegerTwo.getWeight());
		System.out.println("Mark = " + jaegerTwo.getMark());
		System.out.println("BodyLanguage = " + jaegerTwo.getBodyLanguage());
	}
}