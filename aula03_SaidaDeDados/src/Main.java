import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int x, y;
		x = 10;
		y = 20;
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.print("Bom dia");
		System.out.print("Boa noite");
		System.out.println("Bom dia");
		System.out.println("Bom dia");
		
		double a;
		a = 2.3456;
		System.out.println(String.format("%.2f", a));
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 28;
		salario = 1200.0;
		nome = "Kennedy";
		sexo = 'M';
		
		System.out.println("O funcionario " + nome + ", sexo " + sexo + ", ganha R$"
						   + String.format("%.2f", salario) + " e tem " + idade +" anos.");
		
	}

}
