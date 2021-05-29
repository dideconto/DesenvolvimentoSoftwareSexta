package heranca;

import java.util.Date;

public abstract class Midia {
	
	public Midia() {
		setCriadoEm(new Date());
	}
	
	private int id;
	private String titulo;
	private Date criadoEm;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "\nId: " + getId() + 
				"\nTítulo: " + getTitulo() + 
				"\nCriado em: " + getCriadoEm();
	}
	
}












