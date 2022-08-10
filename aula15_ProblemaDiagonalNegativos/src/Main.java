/**
 * Problema "Diagonal negativos"
 * Fazer um programa para ler um número inteiro N (máximo 10) e uma matriz
 * quadrada de ordem N contendo números inteiros. Em seguida, mostrar a 
 * diagonal principal e a quantidade  de valores negativos da matriz.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			Locale.setDefault(Locale.US);

			int n, cont;

			System.out.print("Qual a ordem da matriz? ");
			n = sc.nextInt();

			int[][] matriz = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("Elemento [" + i + "," + j +"]: ");
					matriz[i][j] = sc.nextInt();
				}
			}

			System.out.println("DIAGONAL PRINCIPAL");
			
			for (int i = 0; i < n; i++) {
				System.out.print(matriz[i][i] + " ");
			}
			System.out.println();
			
			cont = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (matriz[i][j] < 0) {
						cont++;
					}
				}	
			}
			System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		}
	}
}
