import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	//Falta o conteúdo de Construtor
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		int opcao;		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Casdastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada:");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:		
				System.out.println("\n-- CADASTRAR DO CLIENTE --\n");
				System.out.println("\nDigite o nome do cliente");
				cliente.setNome(sc.next());
				clientes.add(cliente);
				System.out.println("Cliente cadastrado com sucesso!!!");
				break;
			case 2:			
				System.out.println("\n-- LISTAR CLIENTES --\n");	
				System.out.println(clientes);
				break;
			case 0:		
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\n-- OPÇÃO INVÁLIDA!!! --\n");		
				break;
			}
		} while (opcao != 0);		
		sc.close();
	}
}










