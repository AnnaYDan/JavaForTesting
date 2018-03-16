package basicJava;

public class Calculator {

	public static void main(String[] args) {
		// this program demonstrate basic operators in Java
		// declare integer variable with name a and value 105
		int a = 105;
		// declare integer variable with name b and value 105
		int b = 20;
		// declare and print integer variable with name sum and value a plus b
		int sum = a + b;
		System.out.println("Sum = " + sum);
		// declare and print integer variable with name sum and value a minus b
		int subs = a - b;
		System.out.println("Subs = " + subs);
		// declare and print integer variable with name sum and value a multiply b
		int mult = a * b;
		System.out.println("Mult = " + mult);
		// declare and print integer variable with name sum and value a divide b
		int div = a / b;
		System.out.println("Div = " + div);
		// declare and print integer variable with name sum and value a reminder b
		int rem = a % b;
		System.out.println("Rem = " + rem);
		
		// calling method addition from this class (see below)
		addition(10,30);
	}
	
	// method addition
	public static void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is equal to " + sum);
	}

	// method subtraction
	protected static void subtraction(int a, int b) {
		int sum = a - b;
		System.out.println("Subtraction of " + a + " and " + b + " is equal to " + sum);
	}

	// method multiplication
	private static void multiplication(int a, int b) {
		int sum = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is equal to " + sum);
	}
	
	// method division
	public static void division(int a, int b) {
		int sum = a / b;
		System.out.println("Division of " + a + " and " + b + " is equal to " + sum);
	}
	
	// method reminder
	public static void reminder(int a, int b) {
		int sum = a % b;
		System.out.println("Reminder of " + a + " and " + b + " is equal to " + sum);
	}
	
}
