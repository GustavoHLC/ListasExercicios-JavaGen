package Lista1;

import java.util.Scanner;

public class Ex1e2 {
	public static void main(String[] args) {
		Scanner idade = new Scanner (System.in);
		int Idade, idadeDia, idadeSemanas, idadeMeses;
		
		System.out.println("Digite sua idade: ");
		Idade = idade.nextInt();
		
		idadeDia = Idade * 365;
		idadeSemanas = Idade * 48;
		idadeMeses = Idade * 12;
		
		System.out.println("Sua idade em anos � " +idade+ ", sua idade em meses � " +idadeMeses+ ", sua idade em semanas � " +idadeSemanas+ " e sua idade em dias � " +idadeDia+ ".");
		
		idade.close();
	}
}
