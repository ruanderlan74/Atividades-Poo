package Q2;

abstract class Produto {
	private String nome;
	private double preco;
	
	public void SetNome(String nome){
		this.nome = nome;
	}
		
	public void SetPreco(double preco){
		this.preco = preco;	
	
	}
	
	public String tostring() {
		
		return "Nome:"+nome+"Preco:"+preco;
	}
	

}
