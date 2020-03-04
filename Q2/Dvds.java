package Q2;

public class Dvds extends Produto {
	private double Duracao_em_horas;
	
	public Dvds(String nome, double preco, double duracao_em_horas) {
		SetNome(nome);
		SetPreco(preco);
		this.Duracao_em_horas = duracao_em_horas;
		
	}
	
	public String toString() {
		
		return tostring()+"Duracao em Horas"+Duracao_em_horas;
	}
}
