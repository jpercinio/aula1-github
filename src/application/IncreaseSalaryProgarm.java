package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee_II;

public class IncreaseSalaryProgarm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee_II> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int nr = sc.nextInt();
								
		for (int i = 0; i < nr; i++ ) {
			System.out.println();
			sc.nextLine();
			System.out.println("Employee #" + (i+1));
			System.out.print("Enter the id number: ");
			Integer id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee_II(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase:");
		int si_id = sc.nextInt();
				
		//busca na lista pelo id
		Employee_II employee = list.stream()
				.filter(x -> x.getId() == si_id)
				.findFirst().orElse(null);
		
		if (employee != null) {
			System.out.print("Enter the percentage:");
			double perc = sc.nextDouble();
			employee.SalaryIncrease(perc);			
		}else {
			System.out.println("This id does not exist!!!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee_II x : list) {
			System.out.println(x.toString());
		}
		
		sc.close();

	}
	
//	função para procura de um elemento em uma Lista sem usar lambda
	
//	public static Integer position(List<Employee_II> list, int id) {
//		for(int i = 0; i < lista.size(); i++) {
//			if(lista.get(i).getId() == id) {
//				return i;				
//			}			
//		}
//		return null;
//	}
}
