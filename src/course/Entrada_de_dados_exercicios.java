package course;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your full name:");
		String name3 = sc.next();
		System.out.println("How many bedrooms are there in your house?");
		sc.nextLine();
		int Qtbed = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String name4 = sc.next();
		int age2 = sc.nextInt();
		double height2 = sc.nextDouble();
		
		System.out.println(name3);
		System.out.println(Qtbed);
		System.out.println(price);
		System.out.println(name4);
		System.out.println(age2);
		System.out.println(height2);
		
		sc.close();
	}

}
