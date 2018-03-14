package basicJava;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 105;
		int b = 20;
		int sum = a + b;
		System.out.println("Sum = " + sum);
		int subs = a - b;
		System.out.println("Subs = " + subs);
		int mult = a * b;
		System.out.println("Mult = " + mult);
		int div = a / b;
		System.out.println("Div = " + div);
		int rem = a % b;
		System.out.println("Rem = " + rem);
		
		addition(10,30);
	}
	
	public static void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is equal to " + sum);
	}

	protected static void substraction(int a, int b) {
		int sum = a - b;
		System.out.println("Substraction of " + a + " and " + b + " is equal to " + sum);
	}

	private static void multiplication(int a, int b) {
		int sum = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is equal to " + sum);
	}
	
	public static void division(int a, int b) {
		int sum = a / b;
		System.out.println("Division of " + a + " and " + b + " is equal to " + sum);
	}
	
	public static void reminder(int a, int b) {
		int sum = a % b;
		System.out.println("Reminder of " + a + " and " + b + " is equal to " + sum);
	}
	
}
