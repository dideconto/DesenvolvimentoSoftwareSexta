
public class JogoEletronico {
	
	private String titulo;
	private String genero;
	private String plataforma;
	private String lancamento;
	private String desenvolvedora;
	private double valor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getLancamento() {
		return lancamento;
	}
	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		JogoEletronico outroObjeto = (JogoEletronico) obj;
		return outroObjeto.getTitulo() == getTitulo() && outroObjeto.getValor() == getValor();
	}
	
	@Override
	public String toString() {
		return "Nome: " + getTitulo() + " | Valor: " + getValor();
	}
	
}






//public class Desenvolvedora{
//	private String nome;
//	private String localizacao;
//	private int avaliação;
//	private String presidente;
//	private String identificacao;
//}
