package Lista6;

public class horse extends animal implements superAnimal{

	@Override
	public void somAnimal() {
		System.out.println("O som do cavalo: auauau");
	}

	@Override
	public void dormir() {
		System.out.println("O cavalo dormindo: ioinnn zzz");
		
	}
	
	
	
}
