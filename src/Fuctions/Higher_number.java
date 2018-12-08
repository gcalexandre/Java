package Fuctions;

import java.util.Scanner;

public class Higher_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter there numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b ,c);
		
		ShowResult(higher);
		
		sc.close();
				

	}
	
	public static int max(int x, int y, int z) { 
	
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void ShowResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	}
