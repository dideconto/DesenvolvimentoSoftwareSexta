package controllers;

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static boolean cadastrar(Funcionario funcionario) {
		if(buscarPorCpf(funcionario.getCpf()) == null) {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}

	public static Funcionario buscarPorCpf(String cpf) {
		for(Funcionario clienteCadastrado : funcionarios) {
			if(clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}
}
