public class WolfTest {
	public static void main(String[] args) {
		// создайте объект типа Wolf
		// присвойте в нем полям экземпляра класса Wolf какие-то значения
		// считайте эти значения из полей и отобразите в консоли
		// вызовите методы объекта
		Wolf direwolf = new Wolf();
		direwolf.name = "Nymeria";
		direwolf.sex = 'F';
		direwolf.age = 3;
		direwolf.weight = 10;
		direwolf.color = "Grey";
		System.out.println("name = " + direwolf.name);
		System.out.println("sex = " + direwolf.sex);
		System.out.println("age = " + direwolf.age);
		System.out.println("weight = " + direwolf.weight);
		System.out.println("color = " + direwolf.color);
		direwolf.go();
		direwolf.sit();
		direwolf.run();
		direwolf.woof();
		direwolf.hunt();
	}
}