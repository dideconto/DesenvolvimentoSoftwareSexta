import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		final double VALOR_DOLAR = 5.55, VALOR_EURO = 6.64, VALOR_PESO = .06;		
		double real, dolar, euro, peso;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em real (R$): ");
		real = sc.nextDouble();

		dolar = real / VALOR_DOLAR;
		euro = real / VALOR_EURO;
		peso = real / VALOR_PESO;
		
		System.out.println("Dolar: " + dolar);
		System.out.println("Euro: " + euro);
		System.out.println("Peso argentino: " + peso);

		sc.close();

	}

}
