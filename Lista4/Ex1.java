package Lista4;

public class Ex1 {
	public static void main(String[] args) {
		int entradas[] = {1,0,5,-2,-5,7};
		int soma, mod = 105;
		
		soma = entradas[0] + entradas[1] + entradas[5];
		System.out.println("A soma do vetor 1, 2 e 6 é: " + soma);
		
		mod += entradas[4];
		System.out.println("Novo valor do vetor 4 é: " + mod);
		entradas[4] = mod;
		
		for(int i = 0; i<=5;i++) {
			System.out.println(i + " - " + entradas[i]);
		}
	}	
}

