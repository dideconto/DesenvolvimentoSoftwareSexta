package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	public static int lerInteiro(String msg) {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		boolean numeroLido = false;
		do {
			try {
				System.out.println(msg);
				//ParseInt é método que converte uma String para inteiro
				valor = Integer.parseInt(sc.next());
				numeroLido = true;
			}catch (InputMismatchException e) {
				System.out.println("Apenas números!");
			}
		}while(!numeroLido);
		return valor;
	}
}
