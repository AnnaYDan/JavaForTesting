package basicJava;

public class LoopFindOddMult {

	public static void main(String[] args) {
		// program to find odd numbers from 1 to 10 multiplied by 3
		for (int i = 1; i < 11; i++) 
		{
			// printing which loop is executing
			// System.out.println(i);
			
			// multiply number by 3
			int newi = i * 3;
			
			// if reminder is greater than 0 we are pringting this number
			if (newi % 2 > 0) {
				System.out.println("You got an odd number " + newi);
			}
		}
	}

}
