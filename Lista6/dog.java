package Lista6;

public class dog extends animal implements superAnimal {
	
	
	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: auauau");
		
	}
	@Override
	public void dormir() {
		System.out.println("O  cachorro dormindo: zzzzzz");
		
	}
	

}
