package basicJava;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		while (true){		
			System.out.print("Enter your result mark: ");
			int grade = sc.nextInt();
			if (grade >= 80) {
				System.out.println("You get A");
			}else if (grade >= 70) {
				System.out.println("You get B");
			}else if (grade >= 60) {
				System.out.println("You get C");
			}else if (grade >= 50) {
				System.out.println("You get D");
			}else if (grade >= 0) {
				System.out.println("You get F");
			}else {
				System.out.println("Invalid");
			}
			
			if(sc != null) {
			    sc.close();
			}
	}
	
	}
}