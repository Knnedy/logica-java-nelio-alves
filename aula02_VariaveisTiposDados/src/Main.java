import java.io.PrintStream;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// definindo o separador como o . e não ,
		Locale.setDefault(Locale.US);
		
		PrintStream out = System.out;
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 1000.5;
		altura = 1.80;
		genero = 'F';
		nome = "Maria Silva";
		
		out.println("IDADE = " + idade);
		out.println("SALARIO = " + String.format("%.2f", salario)); // ponto flutuante/casas decimais
		out.println("ALTURA = " + String.format("%.2f", altura));
		out.println("GENERO = " + genero);
		out.println("NOME = " + nome);
		
	}

}
