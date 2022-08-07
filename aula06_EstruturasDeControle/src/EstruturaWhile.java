import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resposta;
		
		do {
			System.out.print("Digite a temp em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f", F , "º");
			System.out.println("\nDeseja repetir [s/n]?");
			
			resposta = sc.next().charAt(0);
		} while (resposta == 's');
		sc.close();
		
	}

}
