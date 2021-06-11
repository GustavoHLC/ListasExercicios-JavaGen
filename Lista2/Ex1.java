package Lista2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner numeral = new Scanner (System.in);
		int N1, N2, N3, maior;
		
		System.out.println("insira o primeiro numero: ");
		N1 = numeral.nextInt();
		System.out.println("insira o segundo numero: ");
		N2 = numeral.nextInt();
		System.out.println("insira o terceiro numero: ");
		N3 = numeral.nextInt();
		
		if (N1 > N2 && N1 > N3) {
			maior = N1;
			System.out.println("O maior número é: " + maior);
		}
		else if (N2 > N1 && N2 > N3) {
			maior = N2;
			System.out.println("O maior número é: " + maior);
		}
		else if (N3 > N1 && N3 > N2) {
			maior = N3;
			System.out.println("O maior número é: " + maior);
		}
		else if (N1==N2 && N1==N3 && N3==N2){
			System.out.println("Os números possuem os mesmos valores");
		}
		numeral.close();
	}
}
