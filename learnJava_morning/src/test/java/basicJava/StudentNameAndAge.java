package basicJava;

public class StudentNameAndAge {

	public static void main(String[] args) {
		String name[] = {"name1", "name2", "name3", "name4"};
		int age[] = {36, 40, 25, 26};
		System.out.println(name[0] + " " + age[0]);
		
		for (int i = 0; i<name.length; i++) {
			System.out.println("from loop. Name: " + name[i] + ". Age: " + age[i]);
		}
		
	}

}
