package While;

import java.util.Scanner;


public class While_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc = new Scanner (System.in);
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
			
				while (n <= 0 ) {
			System.out.println("N must be positive! Try again: ");
		    n = sc.nextInt();
			
		}
		
		int higher = Integer.MIN_VALUE;		
		for (int i =1; i <= n; i++) {
			
			System.out.print("Value #" + i + ": ");
			int  x = sc.nextInt();
			if (x > higher ) {
				higher = x;
			}
		    
					
		}
		
		System.out.println("Higher = " + higher);
		sc.close();
		
	}

}
