package basicJava;

public class GradesIfElseCondition {

	public static void main(String[] args) {

		int grade = 100;

		if (grade > 100) {

			System.out.println("result is out of range");

		} else if (grade >= 80) {

			if (grade >= 99) {

				System.out.println("you score A+");

			} else {

				System.out.println("you score A");

			}

		} else if (grade > 70) {

			System.out.println("you score B");

		} else if (grade > 60) {

			System.out.println("you score C");

		} else if (grade > 50) {

			System.out.println("you score D");

		} else if (grade >= 0) {

			System.out.println("You score F");

		} else if (grade < 0) {

			System.out.println("out of range");

		}

	}

}