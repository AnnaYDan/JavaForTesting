package miniCalcV2;

public class MiniCalcV2 {

	public static void main(String[] args) {
		
		int x = add(5,3);
		System.out.println(add(10,2));
		System.out.println(sub(10,2));
		System.out.println(mult(10,2));
		System.out.println(div(10,2));

	}
		public static int add(int a, int b) {
			int result = a + b;
			return result;
		}
		
		public static int sub(int a, int b) {
			int result = a - b;
			return result;
		}

		public static int mult(int a, int b) {
			int result = a * b;
			return result;
		}
		
		public static int div(int a, int b) {
			int result = a * b;
			return result;
		}
	
}
