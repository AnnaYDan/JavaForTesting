package basicJava;

public class Java05IfCondition {

	public static void main(String[] args) {
		//check number is even or odd
		int a = 64;
		// syntax: if (<condition>) {<code for true>} else {<code for false>}
		if (a%2 == 0) {
			System.out.println(a + " is even number");
		}else{
			System.out.println(a + " is odd number");
		}

	}

}
