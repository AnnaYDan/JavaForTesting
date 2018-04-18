package basicJava;

public class Java08DoLoop {

	public static void main(String[] Args) {
		// program about printing sum for number from 0 up to 10;
		
		// declare number
		int i = 0;
		// declare sum
		int sum = 0;

		do {
			// may print how many times we run our loop
			// System.out.println("sum of numbers " + i + "times" );
			// give a new value
			sum = sum + i;
			// print result
			System.out.println("INSIDE DO loop: sum of numbers from 0 to " + i + " is " + sum);
			// increment by one; shortcut is to code with this line i++;
			i = i + 1;
			// Checking our condition while we should execute our loop
		} while (i <= 10);
		
		// printing final result
		System.out.println("After DO loop result for sum of nubmers up to 10 is " + sum);
	}

}
