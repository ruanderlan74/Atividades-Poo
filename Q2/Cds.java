package Q2;

public class Cds extends Produto {
	
	private int Numero_de_faixas;
	
	public Cds(String nome, double preco, int numero_de_faixas ){
		SetNome(nome);
		SetPreco(preco);
		this.Numero_de_faixas = numero_de_faixas;
	}
	
	public String toString() {
		
		return tostring()+"Numero de Faixas:"+Numero_de_faixas;
	}
}
