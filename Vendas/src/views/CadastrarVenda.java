package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ClienteController;
import controllers.ProdutoController;
import controllers.VendaController;
import controllers.VendedorController;
import models.Cliente;
import models.ItemVenda;
import models.Produto;
import models.Venda;
import models.Vendedor;

public class CadastrarVenda {

	private static Scanner sc = new Scanner(System.in);
	private static Venda venda;
	private static Cliente cliente;
	private static Vendedor vendedor;
	private static Produto produto;
	private static ItemVenda item;
	private static ArrayList<ItemVenda> itens;
	private static String cpfCliente, cpfVendedor, nomeProduto, opcao;

	public static void renderizar() {
		venda = new Venda();
		cliente = new Cliente();
		vendedor = new Vendedor();
		itens = new ArrayList<ItemVenda>();

		System.out.println("\n".repeat(15));
		System.out.println("\n-- CADASTRAR VENDA --\n");
		//Cliente
		System.out.println("\nDigite o CPF do cliente:");
		cpfCliente = sc.next();
		cliente = ClienteController.buscarPorCpf(cpfCliente); 
		if(cliente != null) {
			venda.setCliente(cliente);
			//Vendedor
			System.out.println("\nDigite o CPF do vendedor:");
			cpfVendedor = sc.next();
			vendedor = VendedorController.buscarPorCpf(cpfVendedor); 
			if(vendedor != null) {
				venda.setVendedor(vendedor);
				//Produtos
				do {
					produto = new Produto();
					item = new ItemVenda();
					System.out.println("\nDigite o NOME do produto:");
					nomeProduto = sc.next();
					produto = ProdutoController.buscarPorNome(nomeProduto);
					if(produto != null) {
						item.setProduto(produto);
						item.setValor(produto.getValor());
						System.out.println("\nDigite a quantidade do produto:");
						item.setQuantidade(sc.nextInt());
						itens.add(item);
					}else {
						System.out.println("\nEsse produto não existe!");
					}					
					System.out.println("\nDeseja adicionar mais produtos?");
					opcao = sc.next();
				}while(opcao.equals("S"));
				venda.setItensVenda(itens);
				VendaController.cadastrar(venda);
				System.out.println("\nVenda cadastrada com sucesso!");

			}else {
				System.out.println("\nEsse vendedor não existe!");			
			}
		}else {
			System.out.println("\nEsse cliente não existe!");			
		}
	}	
}


//Passo a passo do cadastro da venda
//1 - Pedir o CPF do cliente
//2 - Criar um método que busca o cliente por CPF
//3 - Pegar o retorno método e testar para ver ser o cliente existe
//4 - Se o cliente existir, armazenar ele dentro da venda
//5, 6, 7 e 8 - Vendedor
//9 - Criar um laço de repetição e perguntar para o usuário se ele deseja adicionar mais produtos
//10 - Pedir o NOME do produto
//11 - Criar um método que busca o produto por NOME
//12 - Pegar o retorno método e testar para ver ser o produto existe
//13 - Preencher um objeto de ItemVenda com base no produto buscado
//14 - Adicionar o ItemVenda dentro da venda ou dentro de uma lista de ItemVenda
//15 - Quando o usuário não precisar mais adicionar produtos na venda, a venda precisa ser cadastrada 
//(controller)



















