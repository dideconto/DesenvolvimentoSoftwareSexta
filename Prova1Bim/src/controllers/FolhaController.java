package controllers;

import java.util.ArrayList;

import models.Folha;

public class FolhaController {

	private static ArrayList<Folha> folhas = new ArrayList<Folha>();

	public static boolean cadastrar(Folha folha) {
		String cpf = folha.getFuncionario().getCpf();
		int ano = folha.getAno();
		int mes = folha.getMes();
		if(buscarPorFuncionarioMesAno(cpf, mes, ano) == null) {
			folhas.add(folha);
			return true;
		}
		return false;
	}

	public static Folha buscarPorFuncionarioMesAno(String cpf, int mes, int ano) {
		for(Folha folhaCadastrada : folhas) {
			if(folhaCadastrada.getFuncionario().getCpf().equals(cpf) &&
					folhaCadastrada.getMes() == mes && 
					folhaCadastrada.getAno() == ano) {
				return folhaCadastrada;
			}
		}
		return null;
	}
	
	public static ArrayList<Folha> listarPorMesAno(int mes, int ano) {
		ArrayList<Folha> folhasFiltradas = new ArrayList<Folha>();
		for(Folha folhaCadastrada : folhas) {
			if(folhaCadastrada.getMes() == mes &&  folhaCadastrada.getAno() == ano) {
				folhasFiltradas.add(folhaCadastrada);
			}
		}
		return folhasFiltradas;
	}
	
	public static double calcularBruto(int horas, double valor) {
		return horas * valor;
	}
	
	public static double calcularFGTS(double bruto) {
		return bruto * .08;
	}
	
	public static double calcularINSS(double bruto) {
		if(bruto <= 1693.72) {
			return bruto *.08;
		}else if(bruto <= 2822.90){
			return bruto *.09;
		}else if(bruto <= 5645.80) {
			return bruto * .11;
		}else {
			return 621.03;
		}
	}

	public static double calcularIR(double bruto) {
		if(bruto <= 1903.98) {
			return 0;
		}else if(bruto <= 2826.65){
			return (bruto *.075) - 142.8;
		}else if(bruto <= 3751.05) {
			return (bruto *.15) - 354.8;
		}else if(bruto <= 4664.68) {
			return (bruto *.225) - 636.13;
		}else {
			return (bruto *.275) - 869.36;
		}
	}	
	
	public static double calcularLiquido(double bruto, double inss, double ir) {
		return bruto - ir - inss;
	}
	
}



















