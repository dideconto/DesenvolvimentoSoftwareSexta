package views;

import java.util.Scanner;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {
	
	private static Scanner sc = new Scanner(System.in);
	private static Cliente cliente;
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		cliente = new Cliente();
		System.out.println("\n-- CADASTRAR CLIENTE --\n");
		System.out.println("\nDigite o nome do cliente:");
		cliente.setNome(sc.next());
		System.out.println("\nDigite o CPF do cliente:");
		cliente.setCpf(sc.next());
		if(ClienteController.cadastrar(cliente)) {
			System.out.println("Cliente cadastrado com sucesso!!!");
		}else {
			System.out.println("Esse cliente j? existe!!!");
		}		
	}
}




