public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strenght;
	private int armor;
	private String status;
	private String bodyLanguage;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor, String status, String bodyLanguage) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strenght = strenght;
		this.armor = armor;
		this.status = status;
		this.bodyLanguage = bodyLanguage;
	}

	public String getBodyLanguage() {
		return bodyLanguage;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrenght() {
		return strenght;
	}

	public int getArmor() {
		return armor;
	}

	public String getStatus() {
		return status;
	}

	public boolean drift() {
		System.out.println("Вы вошли в дрифт");
		return true;
	}

	public void move() {
		System.out.println("Вы прошли 5 шагов");
	}

	public String scanKaiju() {
		return "nothing";
	}
}