
//Modificadores de acesso -> public, private e protected
//Definir o modelo de cliente dentro da aplica��o
public class Cliente {
	
	//Caracter�sticas, atributos ou propriedades
	private String nome;
	
	//Getter and Setters
	public void setNome(String nome) {	
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome();
	}
	
}













