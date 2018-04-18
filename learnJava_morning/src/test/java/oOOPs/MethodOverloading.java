package oOOPs;

public class MethodOverloading {
	public static void main(String args[]) {
		SimpleCalculator obj = new SimpleCalculator();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(10, 5.6));
		System.out.println(obj.add(5.6, 10));

	}
}

class SimpleCalculator {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(int b, double a) {
		return a + b;
	}
	
	double add(double a, int b) {
		return a + b;
	}
}