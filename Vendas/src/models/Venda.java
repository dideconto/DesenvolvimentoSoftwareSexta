package models;

import java.util.ArrayList;
import java.util.Date;

public class Venda {

	public Venda() {
		
	}
	
	private Cliente cliente;
	private Vendedor vendedor;
//	private ArrayList<Produto> produtos;
//	private ArrayList<Integer> quantidades;
//	private ArrayList<Double> precos;
//	private ArrayList<Date> datas;
	private Date criadoEm;

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
