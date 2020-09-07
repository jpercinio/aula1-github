package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_IV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee(); 
		System.out.println("Enter the Name, Gross Salary, Tax: ");
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: "+employee.toString());
		
		System.out.println("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("\nUpdate data: "+employee.toString());
		
		sc.close();

	}

}
