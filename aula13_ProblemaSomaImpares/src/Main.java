/**
 * Problema ""Soma Ímpares
 * Leia 2 valores inteiros X e Y (em qualuqer ordem). A seguir,
 * calcule e mostre a soma dos números ímpares entre eles.
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			Locale.setDefault(Locale.US);

			int x, y, troca, soma;

			System.out.println("Digite os dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > y) {
				troca = x;
				x = y;
				y = troca;
			}

			soma = 0;
			for (int i = x + 1; i < y; i++) {
				if(i % 2 != 0) {
					soma = soma + i;
				}
			}

			System.out.println("SOMA DOS ÍMPARES :" + soma);
		}

	}

}
