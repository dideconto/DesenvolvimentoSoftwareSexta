package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = lerInteiro("Digite uma idade: ");
		System.out.println("Idade: " + idade);

	}
	
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
	
	public static void teste() {
		try {
			//abrir conexão com o banco
			//consulta
			//guardar o resultado em uma váriavel/lista/objeto
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();
			int n5 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Mensagem da linha um");
		} catch (Exception e) {
			System.out.println("Mensagem da linha dois");
		} finally {
			//Fechar a conexão
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}