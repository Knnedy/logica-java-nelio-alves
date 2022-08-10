import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
		
			double salario1, salario2;
			String nome1, nome2;
			int idade;
			char sexo;
			System.out.println("--------------------------------------");
			System.out.print("Nome da primeira pessoa: ");
			nome1 = sc.nextLine();
			System.out.print("Salário da primeira pessoa: R$");
			salario1 = sc.nextDouble();
			System.out.println("--------------------------------------");

			System.out.print("Nome da segunda pessoa: ");
			sc.nextLine(); // ------------- limpeza de buffer
			nome2 = sc.nextLine();
			System.out.print("Salário da segunda pessoa: R$");
			salario2 = sc.nextDouble();
			System.out.println("--------------------------------------");

			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			System.out.println("Digite um sexo: ");
			sexo = sc.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			System.out.println("--------------------------------------");

			System.out.println("\nNome da primeira pessoa: " + nome1);
			System.out.println("Salario da primeira pessoa: R$" + String.format("%.2f", salario1) + "\n");
			System.out.println("Nome da segunda pessoa: " + nome2);
			System.out.println("Salário da segunda pessoa: R$" + String.format("%.2f", salario2));
			System.out.println("Idade: " + idade);
			System.out.println("Sexo: " + sexo);
			
		}	
	}
}
