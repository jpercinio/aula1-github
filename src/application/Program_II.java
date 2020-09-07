package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_II {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Preço: ");
		Double price = sc.nextDouble();

//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
//		Product product = new Product(name, price, quantity);
		Product product = new Product(name, price);
		
		product.setName("Computer");
		product.setPrice(1200.00);
		System.out.println("\nUpdated name: " + product.getName());
		System.out.println("Updated price: " + product.getPrice());
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");		
		int quantity = sc.nextInt();
		product.addProducts(quantity);		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		sc.close();
	}

}
