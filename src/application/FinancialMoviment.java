package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class FinancialMoviment {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("\nEnter the holder name: ");
		String holderName = sc.nextLine();
		
		System.out.print("\nIs there an initial deposit (y/n)? ");
		String initDepYesNo = sc.next();
		
		double initialDeposit = 0;
		if(initDepYesNo.equalsIgnoreCase("y")) {
			System.out.print("\nEnter initial deposit value: ");
			initialDeposit = sc.nextDouble();			
		}

		Client client = new Client(accountNumber, holderName, initialDeposit);

		System.out.println();
		
		System.out.println("Acount data:");
		System.out.println(client.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
		client.deposit(depositValue);
		
		System.out.println("\nUpdate Acount data: ");
		System.out.println(client.toString());
		
		System.out.print("\nEnter a withdraw value: ");
		double withDraw = sc.nextDouble();
		
		client.withDraw(withDraw);
		
		System.out.println("\nUpdate Acount data: ");
		System.out.println(client.toString());
	
		sc.close();
	}
}
