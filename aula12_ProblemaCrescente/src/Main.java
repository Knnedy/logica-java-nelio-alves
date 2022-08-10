/**
 * "Problema Crescente"
 * Leia uma quantidade indeterminada de de dúplas de valores inteiros Xe Y.
 * Escreva para cada Xe Y uma mensagem que indique se estes valores foram 
 * digitados em ordem crescente ou decrescente. O programa deve finalizar
 * quando forem digitados valores iguais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int x, y;

			System.out.println("Digite os dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			while (x != y) {
				if (x < y) {
					System.out.println("Crescente!");
				}
				else {
					System.out.println("Decrescente!");
				}
				System.out.println("Digite outros dois números: ");
				x = sc.nextInt();
				y = sc.nextInt();

			}
		}
	}
}
