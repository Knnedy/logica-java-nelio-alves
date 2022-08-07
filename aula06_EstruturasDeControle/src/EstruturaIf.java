import java.util.Scanner;

public class EstruturaIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int hora;
		System.out.print("Digite uma hoa do dia: ");
		hora = sc.nextInt();
		
		if (hora >= 0 && hora <= 4) {
			System.out.println("Madrugada!");
		} else if (hora >= 3 && hora <= 11.59) {
			System.out.println("Manhã!");
		} else if (hora >=  12 && hora <= 18) {
			System.out.println("Tarde!");
		} else {
			System.out.println("Noite!");
		}
	 
		sc.close();
	} 

}