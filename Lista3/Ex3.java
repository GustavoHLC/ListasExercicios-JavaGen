package Lista3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int menores = 0, maiores = 0, idade;
		
		System.out.print("Digite a idade das pessoas: ");
		idade = ler.nextInt();
		
		while (idade != -99) {
			if(idade < 21) {
				menores++;
			}
			if (idade > 50){
				maiores++;
			}
			System.out.print("Digite a idade das pessoas(para encerrar digite -99): ");
			idade = ler.nextInt();
		}
		System.out.println("Menores de 21: " + menores);
		System.out.println("Maiores de 50: " + maiores);
		ler.close();
	}
}
