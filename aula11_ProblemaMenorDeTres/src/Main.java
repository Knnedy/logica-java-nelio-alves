/**
 * "Problema Menor de três"
 * Fazer um programa para ler três números inteiros. Em seguida,
 * mostrar qual o menor dentre os três números lidos. Em caso de empate,
 * mostrar apenas uma vez.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;

		System.out.println("Primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Segundo valor: ");
		b = sc.nextInt();
		System.out.println("Terceiro valor: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
			menor = a;
		} 
		else if (b < c && b < a) {
			menor = b;
		}
		else {
			menor = c;
		}
		
		System.out.println("MENOR = " + menor);
		
		
		sc.close();
	}

}
