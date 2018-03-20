package basicJava;

public class Java02DataTypesAndVariables {

	public static void main(String[] args) {
		/* this program is to learn data types and variables
		how to store you data in variables
		<data type> <variable name> = <variable value>;
		 string variable
		 */
		String name = "Java";
		// Eclipse shows warning
		String lastName;
		lastName = "JavaLastName";
		// integer variable
		int age = 22;
		// double variable
		double index = 5.65;
		// char variable
		char firstLetter ='J';
		
		// printing with concatenation strings and variables. plus sign is for concatenation
		System.out.println("<<<<<< My name is >>>>> " + name);
		System.out.println("<<<<<< My age is >>>>> " + age);
		System.out.println("<<<<<< My index is >>>>> " + index);
		System.out.println("<<<<<< First letter in my name is >>>>> " + firstLetter);
	
	}
	
}
