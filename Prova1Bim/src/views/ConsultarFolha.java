package views;

import java.util.Scanner;

import controllers.FolhaController;
import models.Folha;

public class ConsultarFolha {


	private static Scanner sc = new Scanner(System.in);
	private static Folha folha;
	private static String cpf;
	private static int mes, ano;

	public static void renderizar() {
		System.out.println("\n".repeat(15));
		folha = new Folha();
		System.out.println("\n-- CADASTRAR FOLHA --\n");
		System.out.println("\nDigite o CPF do funcionário:");
		cpf = sc.next();
		System.out.println("\nDigite o mês:");
		mes = sc.nextInt();
		System.out.println("\nDigite o ano:");
		ano = sc.nextInt();
		folha = FolhaController.buscarPorFuncionarioMesAno(cpf, mes, ano);
		if(folha != null) {			
//			double bruto = FolhaController.calcularBruto(folha.getHoras(), folha.getValor());
			double bruto = folha.calcularBruto();
			double fgts = FolhaController.calcularFGTS(bruto);
			double inss = FolhaController.calcularINSS(bruto);
			double ir = FolhaController.calcularIR(bruto);
			double liquido = FolhaController.calcularLiquido(bruto, inss, ir);

			System.out.println("\nFuncionário: " + folha.getFuncionario().getNome());
			System.out.println("Bruto: " +  bruto);
			System.out.println("INSS: " +  inss);
			System.out.println("FGTS: " +  fgts);
			System.out.println("IR: " +  ir);
			System.out.println("Líquido: " +  liquido);
		}else {
			System.out.println("Folha não encontrada");
		}
	}
}