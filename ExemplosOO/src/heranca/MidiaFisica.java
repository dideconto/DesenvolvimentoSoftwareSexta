package heranca;

public abstract class MidiaFisica extends Midia {
	
	private String editora;
	private String edicao;
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nEditora: " + getEditora() + 
				"\nEdição: " + getEdicao();
	}	
}













