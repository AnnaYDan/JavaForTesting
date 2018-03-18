package basicJava;

public class Operators {

	public static void main(String[] args) {
		// Using Operators. To assign a value we use "="
		int a = 500;
		int b = 25;
		// Arithmetic Operators: +, -, *, / , %(Remainder ) , ++ , --
		int sum = a + b;
		System.out.println( "Sum of " +a +" and " +b +"is " + sum);
		sum = 400 + 500;
		System.out.println("sum of 400 and 500" + sum);
		int mul= a * b;
		System.out.println(a + " * " +  b  + " = " +  mul);
		a=1000;
		double  div= (double) a/b;
		System.out.println(a+  "/" + b + " = " + div);
		// Remainder
		a= 8;
		b= 2;
		int rem = a%b;
		System.out.println(a + " % " +  b + " = " +  rem);
		a = 10;
		a++;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
	}
}
