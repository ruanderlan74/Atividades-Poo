package Q4;

public class PessoaFisica extends Cliente{
	String cpf;

	public PessoaFisica(String cpf, String Nome, String Telefone, String Endereco) {
		this.cpf = cpf;
		Nome(Nome);
		Endereco(Endereco);
		Telefone(Telefone);
		
	}
	
	@Override
	public String toString() {
	
		return toString()+"Cpf = "+cpf;
		
	}

	@Override
	public void Nome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public void Endereco(String endereco) {
		this.endereco = endereco;
		
	}

	@Override
	public void Telefone(String telefone) {
		this.telefone = telefone;
		
	}
	
	
}
