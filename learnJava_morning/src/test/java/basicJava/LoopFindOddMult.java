package basicJava;

public class LoopFindOddMult {

	public static void main(String[] args) {
		// program to find odd numbers from 1 to 10 multiplied by 3
		for (int i = 1; i <= 10; i++) 
		{
			// multiply number by 3
			int newi = i * 3;
			
			// if reminder is greater than 0 we are printing this number
			if (newi % 2 > 0) {
				System.out.println("You got an odd number " + newi);
			}else{
				System.out.println("You got an even number " + newi);
			}
		}
	}

}
