public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 39;
		char sex = 'M';
		double height = 1.92;
		char firstNameLetter = 'I';

		System.out.println("age === " + age);
		System.out.println("sex === " + sex);
		System.out.println("height === " + height);
		System.out.println("firstNameLetter === " + firstNameLetter);

		if (age>20) {
			System.out.println("Age more then 20!");
		}
		if (sex=='M') {
			System.out.println("Male");
		}
		if (sex!='M') {
			System.out.println("Female");
		}
		if (height>1.80) {
			System.out.println("height more then 1.80");
		}
		else {
			System.out.println("height less then 1.80");
		}
		if (firstNameLetter == 'M') {
			System.out.println("First Name starts with letter M");
		}
		else if (firstNameLetter == 'I') {
			System.out.println("First Name starts with letter I");
		}
		else {
			System.out.println("First Name starts with some other letter");
		}	
	}
}