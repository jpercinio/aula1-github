package util;

public class CurrencyConverter {

	public static double amountToBePaid(double vlunit, double qde) {
		return (vlunit * qde)*1.06; //1.06 => 6% de IOF
	}
}
