package Q3;

public class Principal {
	static public void main(String[] ags){
		String s = "";
		Dvds d1 = new Dvds("EraDoGelo", 2.30,"00000000", 2.00);
		Dvds d2 = new Dvds("EraDoGelo2", 10.40,"11111111", 1.30);
		Cds c1 = new Cds("Raimundos", 10.00,"22222222", 10);
		Cds c2 = new Cds("Matanza", 1.00,"33333333", 100);
		Livros l1 = new Livros("Biblia", 0.00,"44444444", "Deus");
		Livros l2 = new Livros("Eletronica I", 10.00,"55555555", "boylestad ");
		Livros l3 = new Livros("Eletronica II", 20.00,"66666666", "boylestad ");
		
		Produto vet[] = new Produto[7];
		vet[0]  = d1;
		vet[1]  = d2;
		vet[2]  = c1;
		vet[3]  = c2;
		vet[4]  = l1;
		vet[5]  = l2;
		vet[6]  = l3;
		
		s = Encontrar_Produto(d1, vet);
		
		System.out.println(s);
		
		for(int i = 0 ;i < 7; i++){
			 System.out.println(vet[i].toString());
		}
		
		Cds c3 = new Cds("Raimundos", 10.00,"22222222", 10);
		Cds c4 = new Cds("Raimundos", 10.00,"77777777", 10);
		
		s = Encontrar_Produto(c3, vet);
		
		System.out.println(s);
		 
		s = Encontrar_Produto(c4, vet); 
		
		System.out.println(s);
		 
		
	}
	
	public static String  Encontrar_Produto(Produto p, Produto[] vet){
		String s = "";
		int po = 1; 
		int flag = 0;
		for(int i = 0; i < vet.length;i++){
			if(p == vet[i]){
				po = po + i;
				s = "Produto encontrado na posicao "+po+"";
				flag = 1;
			}
		}
		if(flag == 0) s = "Produto não encontrado";
		
		return s;
	}
}
