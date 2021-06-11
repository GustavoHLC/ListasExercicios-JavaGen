package Lista3;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, soma = 0;
		
		do{
			System.out.println("Digite um número: ");
			i = ler.nextInt();
			soma+=i;
		}
		while( i != 0);
		System.out.println("O valor da soma dos números adicionados é: " + soma);
			
		ler.close();
	}
}
