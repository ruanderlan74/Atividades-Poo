package Q3;

abstract class Produto {
	 String nome;
	 double preco;
	 String codido_de_barra;
	
	
	public abstract void SetCodigo_de_barra(String codigo_de_barra);
	
	public abstract void SetNome(String nome);
		
	public abstract void SetPreco(double preco);

	
	public boolean equals(Produto p){
		boolean flag = false;
		if(this.codido_de_barra == p.codido_de_barra){
			flag = true; 
		} 
		return flag;
		
	}
	
	
	public String tostring() {
		
		return "Nome:"+nome+"Codigo de Barra"+codido_de_barra+"Preco:"+preco;
	}
	

}
