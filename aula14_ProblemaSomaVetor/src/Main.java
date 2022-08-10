/**
 * Problema "Soma vetor"
 * Faça um programa que leia N números reais e armazene-s em um vtor.
 * Em seguida:
 * - Imprimir todos os elementos do vetor
 *  - Mostrar na tela a soma e a média do elementos do vetor
 */

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);

			int n;
			double soma, media;

			System.out.print("Você quer um VETOR de quantos elementos? ");
			n = sc.nextInt();

			double[] vet = new double[n];

			for (int i = 0; i < n; i++) {
				System.out.print("Digite um número: ");
				vet[i] = sc.nextDouble();

			}

			System.out.println();
			System.out.print("VALORES = ");
			for (int i = 0; i < n; i++) {
				System.out.print(String.format("%.1f ", vet[i]));

			}	

			soma = 0;
			for (int i = 0; i < n; i++) {
				soma = soma + vet[i];
			}

			System.out.println("\nSOMA = " + String.format("%.2f", soma));
			
			media = soma / n;
			System.out.println("MÉDIA = " + String.format("%.2f", media));
			System.out.println("Array gerada: \n" + Arrays.toString(vet));
			System.out.println("Length do Array: " + vet.length);
		}
	}
}
