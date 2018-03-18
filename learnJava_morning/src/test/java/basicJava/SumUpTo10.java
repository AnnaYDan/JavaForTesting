package basicJava;

public class SumUpTo10 {

	public static void main(String[] args) {
		// Sum up to 100 equals to  ?????
		int i = 0;
		int sumi = 0;
		while (i<100) {
			i = i + 1;
			sumi = sumi + i;
//			System.out.println("hello " + i + " times");
//			System.out.println("Sum up to " + i + " equals to " + sumi);
		}
		System.out.println("Sum up to " + i + " equals to " + sumi);
	}

}
