package basicJava;

public class Java05IfCondition {

	public static void main(String[] args) {
		//check number is even or odd
		int myNumber = 3;
		int reminder = myNumber%2;
		// reminder = 0;
		// syntax: if (<condition>) {<code for true>} else {<code for false>}
		if (reminder == 0) {
			System.out.println(myNumber + " is even number");
		}else{
			System.out.println(myNumber + " is odd number");
		}

	}

}
