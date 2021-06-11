package Lista6;

public class testeAnimais {
	public static void main(String[] args) {
		
		dog cao1 = new dog();
		horse cavalo1 = new horse();
		preguiça preguica1 = new preguiça();
		
		//System.out.println("-------Cachorro-------");
		//cao1.setNome("Rogerin");
		//cao1.setIdade(4);
		//cao1.latir();
		//cao1.corre();
		//System.out.println(cao1.getNome() + " tem " + cao1.getIdade() + " anos.");
		System.out.println("-------Cachorro-------");
		cao1.somAnimal();
		cao1.dormir();
		
		
		//System.out.println("-------Cavalo-------");
		//cavalo1.setNome("Pablo");
		//cavalo1.setIdade(15);
		//cavalo1.relinchar();
		//cavalo1.galopar();
		//System.out.println(cavalo1.getNome() + " tem " + cavalo1.getIdade() + " anos.");
		System.out.println("-------Cavalo-------");
		cavalo1.somAnimal();
		cavalo1.dormir();

		
		//System.out.println("-------Preguiça-------");
		//preguica1.setNome("Olavo");
		//preguica1.setIdade(45);
		//preguica1.soneca();
		//preguica1.escalada();
		//System.out.println(preguica1.getNome() + " tem " + preguica1.getIdade() + " anos.");
		System.out.println("-------Preguiça-------");
		preguica1.somAnimal();
		preguica1.dormir();
		
		
	}
}
