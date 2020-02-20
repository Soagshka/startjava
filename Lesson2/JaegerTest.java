public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Gipsy Danger (Jaeger)");
		jaegerOne.setMark("Mark-3");
		jaegerOne.setOrigin("USA");
		jaegerOne.setHeight(79.25f);
		jaegerOne.setWeight(1.980f);
		jaegerOne.setSpeed(7);
		jaegerOne.setStrenght(8);
		jaegerOne.setArmor(6);
		jaegerOne.setStatus("-");
		jaegerOne.setBodyLanguage("Street Fighter");
		jaegerOne.move();
		jaegerOne.scanKaiju();
		System.out.println("Speed = " + jaegerOne.getSpeed());
		System.out.println("Origin = " + jaegerOne.getOrigin());
		System.out.println("Name = " + jaegerOne.getModelName());
		System.out.println("Armor = " + jaegerOne.getArmor());
		
		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Gipsy Avenger");
		jaegerTwo.setMark("Mark-6");
		jaegerTwo.setOrigin("-");
		jaegerTwo.setHeight(81.77f);
		jaegerTwo.setWeight(2.004f);
		jaegerTwo.setSpeed(10);
		jaegerTwo.setStrenght(4);
		jaegerTwo.setArmor(8);
		jaegerTwo.setStatus("Destroyed");
		jaegerTwo.setBodyLanguage("Street Fighter");
		jaegerTwo.drift();
		System.out.println("Status = " + jaegerTwo.getStatus());
		System.out.println("Weight = " + jaegerTwo.getWeight());
		System.out.println("Mark = " + jaegerTwo.getMark());
		System.out.println("BodyLanguage = " + jaegerTwo.getBodyLanguage());
	}
}