package miniCalcV1;

public class MiniCalcV1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		
		int sum = a + b;
		System.out.println(sum);

		a = a + 1;
		b = b + 2;
			
		int sub = a - b;
		System.out.println(sub);
		
		b = b - 1;
		
		int mult = a * b;
		System.out.println(mult);
		
		a = a * 2;
		a = a + b;
		int div = a / b;
		System.out.println(div);
		
	}

}
