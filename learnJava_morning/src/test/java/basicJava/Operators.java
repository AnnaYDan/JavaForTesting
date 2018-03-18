package basicJava;

public class Operators {

	public static void main(String[] args) {
		// Using Operators. To assign a value we use "="
		int a = 500;
		int b = 25;
		// Arithmetic Operators: +, -, *, / , %(Remainder ) , ++ , --
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
		sum = 400 + 500;
		System.out.println("Sum of 400 and 500 is " + sum); // it will bring sum as 900
		sum = 5000 * 3;
		System.out.println("Sum of 400 and 500 is " + sum); // it will bring sum as 15,000 not 900
		int mul = a * b; // 12500
		mul = mul * 10; // 125000
		System.out.println("Multiplication " + a + " * " +  b  + " = " +  mul); // it will bring 125000
		a = 1000;
		// convert data types
		// put the result of division two integer variables a and b in variable with double data type
		// to do this we are using shortcut by writing new data type in round brackets 
		double div = (double) a/b;
		System.out.println("Division " + a +  "/" + b + " = " + div);
		// Reminder
		a = 8;
		b = 2;
		int rem = a%b;
		System.out.println("Reminder " + a + " % " +  b + " = " +  rem);
		a = 10;
		a++; // a = a + 1 , so that we should get 11
		a++; // a = a + 1 , so that we should get 12
		System.out.println("After two increments for variable a " + a);
		a--; // a = a - 1 , so that we should get 11
		System.out.println("After one decrements for variable a " + a);
	}
}
