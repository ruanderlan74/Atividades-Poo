package Q3;

public class Cds extends Produto {
	
	private int Numero_de_faixas;

	
	public Cds(String nome, double preco,String codigo_de_barra, int numero_de_faixas ){
		SetCodigo_de_barra(codigo_de_barra);
		SetNome(nome);
		SetPreco(preco);
		this.Numero_de_faixas = numero_de_faixas;
	}
	
	public String toString() {
		
		return tostring()+"Numero de Faixas:"+Numero_de_faixas;
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
