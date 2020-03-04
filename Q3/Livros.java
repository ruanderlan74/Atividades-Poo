package Q3;

public class Livros extends Produto{
	
	private String autor;
	
	public Livros(String nome, double preco, String codigo_de_barra ,String autor) {
		SetCodigo_de_barra(codigo_de_barra);
		SetNome(nome);
		SetPreco(preco);
		this.autor = autor;
	}
	
	public String toString() {
		return tostring()+"Nome do autor:"+autor;
	}

	@Override
	public void SetCodigo_de_barra(String codigo_de_barra) {
		this.codido_de_barra = codigo_de_barra;
		
	}

	@Override
	public void SetNome(String nome) {
		this.nome = nome;
		
		
	}

	@Override
	public void SetPreco(double preco) {
		this.preco = preco;	
	}

}
