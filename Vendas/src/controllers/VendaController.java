package controllers;

import java.util.ArrayList;

import models.Cliente;
import models.Venda;

public class VendaController {

	private static ArrayList<Venda> vendas = new ArrayList<Venda>();

	public static ArrayList<Venda> listar(){
		return vendas;
	}

	public static boolean cadastrar(Venda venda) {
		vendas.add(venda);
		return true;
	}
}



















