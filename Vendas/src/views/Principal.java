package views;
import java.util.Scanner;

import utils.Console;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Cadastrar vendedor");
			System.out.println("4 - Listar vendedores");
			System.out.println("5 - Cadastrar produto");
			System.out.println("6 - Listar produtos");
			System.out.println("7 - Cadastrar venda");
			System.out.println("0 - Sair");
			opcao = Console.lerInteiro("\nDigite a opção desejada:");
			switch (opcao) {
			case 1:
				CadastrarCliente.renderizar();
				break;
			case 2:	
				ListarClientes.renderizar();
				break;
			case 3:	
				CadastrarVendedor.renderizar();
				break;
			case 4:	
				ListarVendedores.renderizar();
				break;
			case 5:	
				CadastrarProduto.renderizar();
				break;
			case 6:	
				ListarProdutos.renderizar();
				break;	
			case 7:		
				CadastrarVenda.renderizar();
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










