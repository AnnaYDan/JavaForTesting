package advJava;

public class forLoopCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String value = "java";

        // Loop from 0 to length() of the string.
        for (int i = 0; i < value.length(); i++) {
            // Get letters with charAt method.
            char letter = value.charAt(i);
            System.out.println(letter);
        }
	}

}
