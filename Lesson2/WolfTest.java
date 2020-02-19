public class WolfTest {
	public static void main(String[] args) {
		Wolf direwolf = new Wolf();
		direwolf.setName("Nymeria");
		direwolf.setSex('F');
		direwolf.setAge(4);
		direwolf.setWeight(10);
		direwolf.setColor("Grey");
		System.out.println("name = " + direwolf.getName());
		System.out.println("sex = " + direwolf.getSex());
		System.out.println("age = " + direwolf.getAge());
		System.out.println("weight = " + direwolf.getWeight());
		System.out.println("color = " + direwolf.getColor());
		direwolf.go();
		direwolf.sit();
		direwolf.run();
		direwolf.woof();
		direwolf.hunt();
	}
}