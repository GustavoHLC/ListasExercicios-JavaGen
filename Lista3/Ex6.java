package Lista3;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, soma = 0, entradas=0;
		
		do{
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			
			if (n % 3 == 0) {
				soma += n;
				entradas++;
				System.out.println("número impar somado: " + soma);
			}
		}
		while (n != 0);
		int media = soma / entradas;
		System.out.println("A conta feita para ter a média de números multiplos de 3: "+soma+"/"+ entradas + "= " + media);
		
		ler.close();
	}
}
