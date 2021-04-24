package models;

import java.util.ArrayList;
import java.util.Date;

public class Venda {

	public Venda() {
		setCriadoEm(new Date());
	}
	
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<ItemVenda> itensVenda;
	private Date criadoEm;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public ArrayList<ItemVenda> getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
}





