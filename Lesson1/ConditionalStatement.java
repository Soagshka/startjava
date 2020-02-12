public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 39;
		System.out.println("age === " + age);
		if (age > 20) {
			System.out.println("Age more then 20!");
		}

		char sex = 'M';
		System.out.println("sex === " + sex);
		if (sex == 'M') {
			System.out.println("Male");
		}
		if (sex != 'M') {
			System.out.println("Female");
		}

		double height = 1.92;
		System.out.println("height === " + height);
		if (height > 1.80) {
			System.out.println("height more then 1.80");
		} else {
			System.out.println("height less then 1.80");
		}

		char firstNameLetter = 'I';
		System.out.println("firstNameLetter === " + firstNameLetter);
		if (firstNameLetter == 'M') {
			System.out.println("First Name starts with letter M");
		} else if (firstNameLetter == 'I') {
			System.out.println("First Name starts with letter I");
		} else {
			System.out.println("First Name starts with some other letter");
		}	
	}
}