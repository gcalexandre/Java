package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
			
	public static double paid_in_reais(double reais, double dollar) {
				return reais * dollar * IOF;
	}
		
}
