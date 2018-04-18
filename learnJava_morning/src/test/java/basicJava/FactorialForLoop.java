package basicJava;

public class FactorialForLoop {

	public static void main(String[] args) {

		int n = 5;
		int result = 1;
		
		for (int i=1; i<=n; i++) {
			System.out.println("i value = " + i);
			System.out.println("result before value = " + result);
			result = result * i;
			System.out.println("result after value = " + result);
		}
	
		System.out.println("Factorial of " + n + " is equal to " + result + ".");
	}

}
