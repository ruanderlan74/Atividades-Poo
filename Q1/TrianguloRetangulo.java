package Q1;


public class TrianguloRetangulo extends FormaGeometrica {
	
	private double base;
	private double altura;
	private double hipotenusa;
	
	public TrianguloRetangulo(double base, double altura, double hipotenusa) {
		this.base = base;
		this.altura = altura;
		this.hipotenusa = hipotenusa;
		
	}
	
	public double area() {
		
		return (base*altura)/2.0;
	}
	public double perimetro() {
		
		return base+altura+hipotenusa;
	}
	
	public String toString() {
		return "Triangulo->"+super.toString();
	}
}
