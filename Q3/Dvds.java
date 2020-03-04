package Q3;

public class Dvds extends Produto {
	private double Duracao_em_horas;
	
	public Dvds(String nome, double preco,String codigo_de_barra, double duracao_em_horas) {
		SetCodigo_de_barra(codigo_de_barra);
		SetNome(nome);
		SetPreco(preco);
		this.Duracao_em_horas = duracao_em_horas;
		
	}
	
	public String toString() {
		
		return tostring()+"Duracao em Horas"+Duracao_em_horas;
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
