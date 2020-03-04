package Q1;

abstract class FormaGeometrica {
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public String toString() {
	
	return"Area:"+area()+"\nPerimetro"+perimetro();
	}
}
