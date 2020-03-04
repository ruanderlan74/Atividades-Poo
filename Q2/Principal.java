package Q2;

public class Principal {
	static public void main(String[] ags){
		Dvds d1 = new Dvds("EraDoGelo", 2.30, 2.00);
		Dvds d2 = new Dvds("EraDoGelo2", 10.40, 1.30);
		Cds c1 = new Cds("Raimundos", 10.00, 10);
		Cds c2 = new Cds("Matanza", 1.00, 100);
		Livros l1 = new Livros("Biblia", 0.00, "Deus");
		Livros l2 = new Livros("Eletronica I", 10.00, "ad");
		Livros l3 = new Livros("Eletronica II", 20.00, "da");
		
		Produto vet[] = new Produto[7];
		vet[0]  = d1;
		vet[1]  = d2;
		vet[2]  = c1;
		vet[3]  = c2;
		vet[4]  = l1;
		vet[5]  = l2;
		vet[6]  = l3;
		
		for(int i = 0 ;i < 7; i++){
			 System.out.println(vet[i].toString());
		}
	}
}
