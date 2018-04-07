package basicJava;

public class Java04RelationalOperators {

	public static void main(String[] args) {
		// Relational Operators
		// ==, !=, >, <, >=, <=
		int seven = 7;
		int ten = 10;
		
		// data type for relational operator is boolean : true or false
		//(firstValue relationalOperator secondValue)
		boolean equalCheck = seven == ten;
		System.out.println("is " + seven + " == " + ten + "? >>>>>>>>>>>>>>>>>>>>>> " +  (equalCheck)    ); // equal false
		System.out.println("is " + seven + " != " + ten + "? <<<<<<<<<<<<<<<<<< " +  (seven != ten)    ); // not equal true
		System.out.println("is " + seven + " > " + ten + "? >>>>>>>>> " +  (seven > ten)    ); // greater false
		System.out.println("is " + seven + " >= " + ten + "? >>>>>>>>> " +  (seven >= ten)    ); // greater or equal false
		System.out.println("is " + seven + " < " + ten + "? >>>>>>>>> " +  (seven < ten)    ); // less true
		System.out.println("is " + 10 + " <= " + ten + "? >>>>>>>>> " +  (10 <= ten)    ); //  true
		
		// is (a > b and b> c), we need for such type logical operators 
		// && for and operator, and || or Operator 
		//( is (a> b a|| a <c)
		
	}
	
}
