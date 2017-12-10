package basicJava;

import java.util.Scanner;

public class Voiting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		



		while (true){		

			System.out.print("Enter your age: ");
			int userAge = sc.nextInt();

			if (userAge >= 18) {
				System.out.println("You may vote");
			}else if (userAge >=0 && userAge < 18) {
				System.out.println("You may vote later");
			}else {
				System.out.println("Invalid");
			}

			if(sc != null) {
				sc.close();
			}
			
		}


	}

}
