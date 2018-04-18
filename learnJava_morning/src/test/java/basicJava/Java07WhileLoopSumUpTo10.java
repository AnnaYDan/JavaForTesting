package basicJava;

public class Java07WhileLoopSumUpTo10 {

	public static void main(String[] args) {
		// Sum up to 100 equals to ??? let find it
		int i = 0;
		int sumi = 0;
		while (i < 10) {
			i = i + 1; // if comment this line while loop will execute ?? times
			sumi = sumi + i;
			// printing line inside while loop
//			System.out.println("hello from while loop for " + i + " time");
			System.out.println("Sum up to from while loop " + i + " equals to " + sumi);
		}
		
		// printing line after while loop stop to execute
		System.out.println("Sum up to " + i + " equals to " + sumi);
	}

}
