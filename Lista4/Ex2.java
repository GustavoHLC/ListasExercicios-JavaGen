package Lista4;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[] valores = new int [6];
		int somapar = 0, somaimpar = 0;
		
		System.out.println("Digite 6 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = ler.nextInt();
			if (valores[i] % 2 == 0) {
				System.out.println("n�mero par: " + valores[i]);
				somapar += valores[i];
			}
			if (valores[i] % 2 != 0 ) {
				System.out.println("n�mero impar: " + valores[i]);
				somaimpar += valores[i];
			}
		}
		System.out.println("A soma dos valores pares �: " + somapar);
		System.out.println("A soma dos valores impares �: " + somaimpar);
		ler.close();
	}
}
