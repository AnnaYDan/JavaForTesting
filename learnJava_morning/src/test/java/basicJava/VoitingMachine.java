package basicJava;

import java.util.Scanner;

public class VoitingMachine {

	public static void main(String[] args) {
		// This machine id to do voiting
		// only 18+ age can vote
		while (true) { //any statement which is true, start with 1==1
//		for (int a=1; a<10; a++) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Type your age: ");
			int age = sc.nextInt();
			if  (18 <= age && age <= 80) {
				System.out.println("Go to the next room and do voiting"); 
			}else {
				System.out.println("You are not allowed to vote, sorry"); 
			}
			//sc.close();
		}
		
	}

}
