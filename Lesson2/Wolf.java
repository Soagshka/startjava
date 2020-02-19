public class Wolf {
	private char sex;
	private String name;
	private int weight;
	private int age;
	private String color;

	public void go() {
		System.out.println("Nymeria go");
	}

	public void sit() {
		System.out.println("Nymeria sit");
	}

	public void run() {
		System.out.println("Nymeria run");
	}

	public void woof() {
		System.out.println("Nymeria woof");
	}

	public void hunt() {
		System.out.println("Nymeria hunt");
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		}
		else {
			this.age = age;
		}
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}