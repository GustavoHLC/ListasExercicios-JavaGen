package Lista4;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[][] numeros = new int[3][3];
		int quant = 0, soma = 0;
		System.out.println("insira os números: ");
		for (int l=0; l<numeros.length; l++) {
			for (int c=0; c < numeros[l].length; c++) {
				numeros[l][c] = ler.nextInt();
				if(numeros[l][c] >= 10) {
					quant++;
					soma = soma + numeros[l][c];
				}
			}
		}
		System.out.println("Quantos números maiores que 10 foram digitados: " + quant);
		System.out.println("A soma dos números maiores que 10: " + soma);
		ler.close();
	}
}
