package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class DollarExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Hoe many dollars will be bought? ");
		double reais = sc.nextDouble();
		
		double x = CurrencyConverter.paid_in_reais(reais, dollar);
		
		System.out.printf("Amount to be paid in reais:  %.2f%n", x);
	
		sc.close();

	}

}
