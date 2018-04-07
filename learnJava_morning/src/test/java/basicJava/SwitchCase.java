package basicJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// How to use switch case to print week days
				// 1 -> Sunday, 2 -> Monday, 3 -> Tuesday, ...
				
				// you can not compare string 
				// it compares only byte, short, int or char
				// == operation works 
				int iDay=7;
				switch(iDay){	
				case 1:
					System.out.println("Today is Sunday");
					break;
				case 2:
					System.out.println("Today is Monday");
					break;
				case 3: 
					System.out.println("Today is Tuesday");
					break;
				case 4:
					System.out.println("Today is Wednesday");
					break;
				case 5:
					System.out.println("Today is Thursday");
					break;	
				case 6:
					System.out.println("Today is Friday");
					break;
				case 7:
					System.out.println("Today is Saturday");
					break;
					
				default:
					//this will run
					
					System.out.println("No day maching  that");
					break;
				
				}

				
				/*		Scanner sc = new Scanner(System.in);
						try {
							System.out.print("Enter web browser: ");
							String choice = sc.nextLine();
							
							switch (choice) {
					        case "Chrome":
					        	System.out.println("Your choice is Chrome");
					            break;
					        case "Firefox":
					        	System.out.println("Your choice is Firefox");
					            break;
					        case "Edge":
					        	System.out.println("Your choice is Edge");
					            break;
					        case "Opera":
					        	System.out.println("Your choice is Opera");
					            break;
					        default:
					            throw new IllegalArgumentException("Invalid choice: " + choice);
					    }
										
						}catch(Exception e) {
							System.out.println("Your input is invalid");
						}
						
						sc.close();
						
				*/		
						

	}

}
