package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CompraDollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		System.out.println();
		System.out.printf("Amount to be paid in Reais = %.2f",
				CurrencyConverter.amountToBePaid(dollarPrice, quantity));
		
		sc.close();

	}

}
