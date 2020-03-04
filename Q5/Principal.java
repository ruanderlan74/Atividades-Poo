package Q5;


public class Principal {
	public static void main(String[] args){
		CirculoColorido c1 = new CirculoColorido(0, 0, 2, "azul", "vermelho");
		CirculoColorido c2 = new CirculoColorido(6, 0, 4, "branco", "azul");
		CirculoColorido c3 = new CirculoColorido(13, 0, 6, "vermelho", "branco");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		c3.mover(17, 57);
		c3.setCor_interna("verde");
		c2.diminuir();
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	} 
}
