
//Modificadores de acesso -> public, private e protected
//Definir o modelo de cliente dentro da aplicação
public class Cliente {
	
	//Características, atributos ou propriedades
	private String nome;
	private String cpf;
	
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
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf();
	}
	
}













