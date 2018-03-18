package advJava;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountWords {

	public static void main(String[] args) {
		// this program is to count how many times one word is using in paragraph
		// we take a paragraph
		String paragraph = "The primary new feature in Selenium 2.0 is the integration of the WebDriver API."
				+ " WebDriver is designed to provide a simpler, more concise programming interface in"
				+ " addition to addressing some limitations in the Selenium-RC API. Selenium-WebDriver"
				+ " was developed to better support dynamic web pages where elements of a page may change"
				+ " without the page itself being reloaded. WebDriver’s goal is to supply a well-designed"
				+ " object-oriented API that provides improved support for modern advanced web-app testing problems.";

		// we parse paragraph by space
		String words[] = paragraph.split("\\s+");
		// with for loop we put each word in Map collection (you may use HashMap if you
		// do not need sorted keys)
		Map<String, Integer> hs = new TreeMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (hs.get(words[i]) != null) {
				hs.put(words[i], hs.get(words[i]) + 1);
			} else {
				hs.put(words[i], 1);
			}
		}

		// with for loop we are printing our results
		Set<String> s = hs.keySet();
		for (String m : s) {
			System.out.println(m + "-------" + hs.get(m));
		}

	}

}
