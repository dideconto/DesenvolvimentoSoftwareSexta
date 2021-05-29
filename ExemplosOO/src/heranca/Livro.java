package heranca;

public class Livro extends MidiaFisica{
	
	private String autor;
	private String isbn;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return super.toString() +
				"\nAutor: " + getAutor() + 
				"\nISBN: " + getIsbn();
	}

}











