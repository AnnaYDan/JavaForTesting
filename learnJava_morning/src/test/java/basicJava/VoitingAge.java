package basicJava;

import java.util.Scanner;

public class VoitingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		System.out.println("Enter your age: ");
		Scanner scanner = new Scanner(System.in);
		String userAgesrt = scanner.nextLine();
		System.out.println("Your age is " + userAgesrt);
		
		try {
			int userAge = Integer.parseInt(userAgesrt);
				if (userAge >= age) {
					System.out.println("You may vote");
				}else {
					System.out.println("You may vote in " + (age - userAge));
				}
		
		}catch (NumberFormatException nfe)
		{
		System.out.println("NumberFormatException: " + nfe.getMessage());
		}
		if(scanner != null) {
		    scanner.close();
		}
	}

}
