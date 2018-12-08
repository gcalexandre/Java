package While;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a password: ");
		int n = sc.nextInt();	
		
		while (n != 123) {
			
			System.out.println("Password incorret!");
			System.out.println ("Enter a password: ");
			n = sc.nextInt();
		}
		
		System.out.println("Welcome to your work area!");
		
		sc.close();
	}

}
