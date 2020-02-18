public class Person {
	//TODO : Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
	//Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
	char sex = 'M';
	String name = "Alexander";
	float height = 1.95f;
	int weight = 88;
	int age = 24;

	void go() {
		System.out.println("Go");
	}

	void sit() {
		System.out.println("sit");
	}

	void run() {
		System.out.println("run");
	}

	void talk() {
		System.out.println("talk");
	}

	void learnJava() {
		System.out.println("learnJava");
	}
}