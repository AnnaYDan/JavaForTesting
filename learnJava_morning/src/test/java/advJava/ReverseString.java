package advJava;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(stringBufferReverser("Happy Birthday"));
		System.out.println(stringBuilderReverser("String Builder"));
		System.out.println(ReverseUsingArryayIterator("Reverse with String Array"));

	}

	public static String stringBufferReverser(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}

	public static String stringBuilderReverser(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public static String ReverseUsingArryayIterator(String s) {
		char chars[] = s.toCharArray();
		String r = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			r = r + chars[i];
		}
		return r;

	}

}
