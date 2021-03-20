import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
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
				System.out.println("Nome: " + cliente.getNome());
//				cpf = sc.next();
				break;
			case 2:			
				System.out.println("\n-- LISTAR CLIENTES --\n");		
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










