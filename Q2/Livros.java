package Q2;

public class Livros extends Produto{
	
	private String autor;
	
	public Livros(String nome, double preco, String autor) {
		SetNome(nome);
		SetPreco(preco);
		this.autor = autor;
	}
	
	public String toString() {
		return tostring()+"Nome do autor:"+autor;
	}

}
