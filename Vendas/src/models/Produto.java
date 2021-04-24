package models;

import java.util.Date;

public class Produto {
	
	public Produto() {
		setCriadoEm(new Date());
	}

	private String nome;
	private double valor;
	private int quantidade;
	private Date criadoEm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | Valor: " + getValor() + " | Quantidade: " + getQuantidade() +
				" | Criado em: " + getCriadoEm();
	}
	
}










