import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int N, i;
			System.out.print("Quantos números você vai digitar? ");
			N = sc.nextInt();
			
			double[] doubleVet = new double[N];
			
			for (i = 0; i < N; i++) {
				System.out.print("Digite um número: ");
				doubleVet[i] = sc.nextDouble();
			}
			System.out.println("\nNÚMEROS DIGITADOS: ");
			for (i = 0; i < N; i++) {
				System.out.println(String.format("%.1f", doubleVet[i]));
			}
			
			System.out.println("\nArray gerada: \n" + Arrays.toString(doubleVet));
			System.out.println("Length do Array: " + doubleVet.length);
			
			sc.close();
		}
		
	}

}
