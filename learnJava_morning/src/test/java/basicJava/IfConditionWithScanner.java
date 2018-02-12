package basicJava;

import java.util.Scanner;

public class IfConditionWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter you number: ");
			int a = sc.nextInt();
			if (a%2 ==0) {
				System.out.println(a + " is even number");
			}else{
				System.out.println(a + " is odd number");
			}			
		}catch(Exception e) {
			System.out.println("Your input is not interger");
		}
		
		sc.close();
	}

}
