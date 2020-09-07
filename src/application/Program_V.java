package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Employee;

public class Program_V {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno(); 
		System.out.println("Entre o name e as notas dos trimestres: ");
		aluno.nome = sc.nextLine();
		aluno.notaTrim1 = sc.nextDouble();
		aluno.notaTrim2 = sc.nextDouble();
		aluno.notaTrim3 = sc.nextDouble();
		
		System.out.println("\nFINAL GRADE = "+ String.format("%.2f",aluno.finalGrade()));
		
		if(aluno.finalGrade() >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", 60 - aluno.finalGrade()));		
		}
		
		sc.close();
	}

}
