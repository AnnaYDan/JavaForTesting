package basicJava;

public class LoopFindOddMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) 
		{
			System.out.println(i);
			int newi = i * 3;
			if (newi % 2 > 0) {
				System.out.println("You got an odd number " + newi);
			}
		}
	}

}
