package models;

import java.util.Date;

public class Vendedor {

	public Vendedor() {
		setCriadoEm(new Date());
	}
	//Características, atributos ou propriedades
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	//Getter and Setters
	public void setNome(String nome) {	
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf() + " | Criado em: " + getCriadoEm();
	}
	
}
