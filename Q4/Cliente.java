package Q4;

abstract class Cliente {
	String nome;
	String endereco;
	String telefone;
	
	public abstract void Nome(String Nome);
	
	public abstract void Endereco(String Endereco);
	
	public abstract void Telefone(String Telefone);
	
	@Override
	public String toString() {
		
		return "Nome: "+nome+" Endereco: "+endereco+" Telefone: "+telefone;
	}


}
