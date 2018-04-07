package basicJava;

public class Java06ForLoopFindOddMult {

	public static void main(String[] args) {
		// program to find odd numbers from 1 to 10 multiplied by 3
		
		for (int i = 1; i <= 5; i++) 
		{
			// multiply number by 3
			int newi = i * 3;
			
			// we check reminder for newi variable divided by 2 
			if (newi % 2 > 0) {
				// if reminder is greater than 0 we are printing odd number
				System.out.println("You got an odd number " + newi);
			}else{
				// if reminder equals 0 we are printing even number
				System.out.println("You got an even number " + newi);
			}
			
		System.out.println("iteration >>>>> " + i);
		}
		
		System.out.println("out of for loop");

	}

}
