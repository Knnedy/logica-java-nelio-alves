import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int N, i, x, soma;
			
			System.out.print("Quantos números serão digitados? ");
			N = sc.nextInt();
			
			soma = 0;
			for (i = 1; i <= N; i++) {
				System.out.print("Digite um número: ");
				x = sc.nextInt();
				soma = soma + x;
			}
			
			if (soma % 2 == 0) {
				System.out.println("SOMA = " + soma + " par.");
			} else {
				System.out.println("SOMA = " + soma + " ímpar.");
			}
			
			sc.close();
		}
	}
}
