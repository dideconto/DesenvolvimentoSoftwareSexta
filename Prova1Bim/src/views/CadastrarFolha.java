package views;

import java.util.Scanner;

import controllers.FolhaController;
import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;

public class CadastrarFolha {
	
	private static Scanner sc = new Scanner(System.in);
	private static Folha folha;
	private static Funcionario funcionario;
	private static String cpf;
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		folha = new Folha();
		System.out.println("\n-- CADASTRAR FOLHA --\n");
		
		System.out.println("\nDigite o CPF do funcionário:");
		cpf = sc.next();
		funcionario = FuncionarioController.buscarPorCpf(cpf);
		if(funcionario != null) {
			folha.setFuncionario(funcionario);
			System.out.println("\nDigite o mês:");
			folha.setMes(sc.nextInt());
			System.out.println("\nDigite o ano:");
			folha.setAno(sc.nextInt());
			System.out.println("\nDigite o valor da hora:");
			folha.setValor(sc.nextDouble());
			System.out.println("\nDigite a quantidade de hroas:");
			folha.setHoras(sc.nextInt());
			if(FolhaController.cadastrar(folha)) {
				System.out.println("Folha cadastrada com sucesso!!!");
			}else {
				System.out.println("Essa f já existe!!!");
			}	
		}else {
			System.out.println("Esse funcionário não existe!!!");
		}
	}

}







