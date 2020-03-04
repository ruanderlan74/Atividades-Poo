package Q5;

public class CirculoColorido extends Circulo{
	private String cor_do_tracado;
	private String cor_interna;
	
	public CirculoColorido(double x, double y, double r) {
		super(x, y, r);
		
	}
	public CirculoColorido(double x, double y, double r,String cor_do_tracado, String cor_interna) {
		super(x, y, r);
		this.cor_do_tracado = cor_do_tracado;
		this.cor_interna = cor_interna;
		
	}
	
	public String getCor_do_tracado() {
		return cor_do_tracado;
	}

	public void setCor_do_tracado(String cor_do_tracado) {
		this.cor_do_tracado = cor_do_tracado;
	}

	public String getCor_interna() {
		return cor_interna;
	}

	public void setCor_interna(String cor_interna) {
		this.cor_interna = cor_interna;
	}

	@Override
	public String toString() {
		return super.toString()+" Cor do tracado: "+cor_do_tracado+ "Cor interna: "+cor_interna;
	}
	
	
	

}
