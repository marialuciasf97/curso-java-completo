package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollarPrice, double amount) {
		return amount * dollarPrice * (1.0 + IOF);
	}
}
