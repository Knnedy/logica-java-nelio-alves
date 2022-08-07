import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario1, salario2;
		String nome1, nome2;
		int idade;
		char sexo;
		
		System.out.println("Nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		System.out.println("Salário da primeira pessoa: ");
		salario1 = sc.nextDouble();
		
		System.out.println("Nome da segunda pessoa: ");
		sc.nextLine(); // ------------- limpeza de buffer
		nome2 = sc.nextLine();
		System.out.println("Salário da segunda pessoa: ");
		salario2 = sc.nextDouble();
		
		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();
		System.out.println("Digite um sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Nome da primeira pessoa: " + nome1);
		System.out.println("Salario da primeira pessoa: " + String.format("%.2f", salario1) + "\n");
		System.out.println("Nome da segunda pessoa: " + nome2);
		System.out.println("Salário da segunda pessoa: " + String.format("%.2f", salario2));
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
	
		sc.close();
		
	}

}
