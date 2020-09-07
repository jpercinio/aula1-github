package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExerciseProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the row number (M): ");
		int rn = sc.nextInt();
		System.out.print("Enter the column number (N): ");
		int cn = sc.nextInt();
		
		int[][] mat = new int[rn][cn];
		
		//preenchimento da matriz 3x4
		System.out.println();
		System.out.println("Filling the matrix:");
		for(int i = 0; i<mat.length; i++) { //percorre as linhas
			for(int j=0; j<mat[i].length; j++) { // percorre as colunas
				mat[i][j] = sc.nextInt();
			}
		}
				
		System.out.println();
		System.out.print("Enter the number for to search (X): ");
		int xn = sc.nextInt();
		sc.nextLine();
		System.out.println();
		for(int i = 0; i<mat.length; i++) { //percorre as linhas
			for(int j=0; j<mat[i].length; j++) { // percorre as colunas		
				if(mat[i][j] == xn) {
					System.out.println("Position: " + i + "," + j);
					if (j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j<(mat[i].length) - 1) {
						System.out.println("Right: " + mat[i][j+1]);						
					}
					
					if (i<(mat.length) - 1) {
						System.out.println("Down: " + mat[i+1][j]);						
					}
					System.out.println();
				}			
			}
		}
		
		
		
		
		
		
		sc.close();
		
	
	}
	
}

/* ler 2 números M e N. Ler uma matriz de M linhas por N
 *  colunas contendo números inteiros. Ler um número inteiro X
 *  que pertence a matriz. Para cada ocorrência de X mostrar
 *  os valores a esquerda, acima, a direita e abaixo de X,
 *  quando houver
 *  ex.: M = 3, N = 4
 *  10 8 15 12 
 *  21 11 23 8
 *  14 5 13 19
 *  
 *  X = 8
 *  Position 0,1:
 *  Left: 10
 *  Right: 15
 *  Down: 11
 *  
 *  Position 1,3:
 *  Left: 23
 *  Down: 19
 *  Up: 12 */
