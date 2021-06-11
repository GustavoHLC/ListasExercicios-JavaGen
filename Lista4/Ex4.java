package Lista4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[][] alpha = new int[2][2];
		int[][] bravo = new int[2][2];
		int[][] charlie = new int [2][2];
		int constante, opcao;
		System.out.println("Digite valores para as matriz Alpha: ");
		for (int l=0; l<alpha.length; l++) {
			for (int c=0; c < alpha[l].length; c++) {
				alpha[l][c] = ler.nextInt();	
			}
		}
		
		System.out.println("Digite valores para as matriz Bravo: ");
		for (int l=0; l<bravo.length; l++) {
			for (int c=0; c < bravo[l].length; c++) {
				bravo[l][c] = ler.nextInt();	
			}
		}
		
		System.out.println("digite a atividade que deseja executar; 1 - soma, 2 - subtração, 3 - constante, 4 - mostrar as matrizes:");
		opcao = ler.nextInt();
		
		if (opcao == 1) {
			System.out.println("---------------");
			System.out.println("Valor de charlie em soma: ");
			for (int l=0; l<charlie.length; l++) {
				for (int c=0; c < charlie[l].length; c++) {
					charlie[l][c] = alpha[l][c] + bravo[l][c];
					System.out.println(charlie[l][c]);
				}
			}
		}
		
		else if (opcao == 2) {
			System.out.println("---------------");
			System.out.println("Valor de charlie em subtração: ");
			for (int l=0; l<charlie.length; l++) {
				for (int c=0; c < charlie[l].length; c++) {
					charlie[l][c] = alpha[l][c] - bravo[l][c];
					System.out.println(charlie[l][c]);
				}
			}
		}
		
		else if(opcao == 3) {
			System.out.print("digite a constante: ");
			constante = ler.nextInt();
			
			System.out.println("---------------");
			System.out.println("Resultado da constante de alpha: ");
			for (int l=0; l<2; l++) {
				for (int c=0; c < 2; c++) {
					alpha[l][c] = alpha[l][c] + constante;
					System.out.println(alpha[l][c]);
				}
			}
	
			System.out.println("---------------");
			System.out.println("Resultado da constante de bravo: ");
			for (int l=0; l<2; l++) {
				for (int c=0; c < 2; c++) {
					bravo[l][c] = bravo[l][c] + constante;	
					System.out.println(bravo[l][c]);
				}
			}
		}
		
		else if (opcao == 4) {
			System.out.println("---------------");
			System.out.println("Alpha impresso");
			for (int l=0; l< alpha.length; l++) {
				for (int c=0; c < alpha.length; c++) {	
					System.out.println(alpha[l][c]);
				}
			}
			
			System.out.println("---------------");
			System.out.println("Bravo impresso");
			for (int l=0; l< bravo.length; l++) {
				for (int c=0; c < bravo.length; c++) {	
					System.out.println(bravo[l][c]);
				}
			}
		}
		ler.close();
	}
}
