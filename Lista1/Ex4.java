package Lista1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		int numeroA, numeroB, numeroC, R, S, D;
		
		System.out.print("Escreva o valor de A: ");
		numeroA = valor.nextInt();
		System.out.print("Escreva o valor de B: ");
		numeroB = valor.nextInt();
		System.out.print("Escreva o valor de C: ");
		numeroC = valor.nextInt();
		
		R = (numeroA + numeroB)^2;
		S = (numeroB + numeroC)^2;
		D = (R + S) / 2;
		
		System.out.println("O valor de D é: " + D);
		
		valor.close();
	}
}
