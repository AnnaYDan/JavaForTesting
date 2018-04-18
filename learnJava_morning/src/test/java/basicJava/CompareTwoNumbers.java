package basicJava;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		int num1, num2;
		num1 = 8;
		num2 = 8;

		if (num1 > num2) {
			System.out.println(num1 + " greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " less than " + num2);
		} else {
			System.out.println(num1 + " equals " + num2);
		}

	}

}
