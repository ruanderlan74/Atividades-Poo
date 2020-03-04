package Q1;


public class Principal {
	public static void main(String[] args){
		TrianguloRetangulo t = new TrianguloRetangulo(3, 4, 5);
		Circulo c = new Circulo(5);
		Retangulo r = new Retangulo(4, 2);
		
		System.out.println(r.toString());
		System.out.println(c.toString());
		System.out.println(t.toString());
		
	}
}
