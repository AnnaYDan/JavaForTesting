package basicJava;

public class Java02HelloWorld {

	public static void main(String[] args) {
/* 
 * first program in Java
 * this line is printing text "Hello, World!"
 * multi-line comment between slashes and stars	
 * one-line comment after two slashes
*/
		System.out.println("Hello, World!");
		// this line is asking for space for string type of variable with name FirstName and value Java
		String firstName = "*** Java ***";
		// this line is printing string variable with concatenation with some text
		System.out.println("My name is >>>> " + firstName + " <<<< some text here");
		// declare integer variable with name age and value 22
		int age = 22;
		// this line is printing integer variable with concatenation with some text
		System.out.println("I was born " + age + " years ago.");
		
		double engine = 2.5;
		System.out.println(engine);
		
	}

}
