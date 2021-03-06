package advJava;

public class ReverseString {

	public static void main(String[] args) {
		// this program for reverse string with String class, String Buffer, String
		// Builder

		// print results of calling methods which declared below
		System.out.println(stringBufferReverser("Happy Birthday"));
		System.out.println(stringBuilderReverser("String Builder"));
		System.out.println(ReverseUsingArryayIterator("Reverse with String Array"));

	}

	// the method using StringBuffer
	public static String stringBufferReverser(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}

	// the method using StringBuilder
	public static String stringBuilderReverser(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	// the method using String Class
	public static String ReverseUsingArryayIterator(String s) {
		char chars[] = s.toCharArray();
		String r = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			r = r + chars[i];
		}
		return r;

	}

}
