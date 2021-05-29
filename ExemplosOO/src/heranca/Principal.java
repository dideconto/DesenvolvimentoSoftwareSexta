package heranca;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.setId(1);
		livro.setTitulo("Orientação a objetos");
		livro.setEdicao("1ª");
		livro.setEditora("Diogo Deconto");
		livro.setAutor("José da Silva");
		livro.setIsbn("13123-123-123-132");
		
		System.out.println(livro);
	}

}
