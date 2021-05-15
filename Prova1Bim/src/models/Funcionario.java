package models;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario {
	
	public Funcionario() {
		setCriadoEm(new Date());
	}
	
	private String nome;
	private String cpf;
	private Date nascimento;
	private Date criadoEm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome();
	}
	
}
