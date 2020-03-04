package Q4;

public class PessoaJuridica extends Cliente{
	String cnpj;
	String fantasia;
	
	
	public PessoaJuridica(String cnpj, String fantasia, String Nome, String Telefone, String Endereco) {

		this.cnpj = cnpj;
		this.fantasia = fantasia;
		Nome(Nome);
		Endereco(Endereco);
		Telefone(Telefone);
	}

	@Override
	public void Nome(String Nome) {
		this.nome = Nome;
		
	}

	@Override
	public void Endereco(String Endereco) {
		this.endereco = Endereco;
		
	}

	@Override
	public void Telefone(String Telefone) {
		this.telefone = Telefone;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return toString()+" CNPJ: "+cnpj+" Fantasia: "+fantasia;
	}

}
