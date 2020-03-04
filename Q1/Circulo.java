package Q1;


public class Circulo extends FormaGeometrica{
	
	private double raio;
	
	
	public Circulo(double raio) {
		
		this.raio = raio;
	}
	
	public double area() {
		
		return Math.PI * raio;
	}

	public double perimetro() {
		
		return Math.PI * raio * 2;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Circulo ->"+super.toString();
	}
}
