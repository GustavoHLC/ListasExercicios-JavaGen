package Lista1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner nota = new Scanner (System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Escreva a primeira nota (peso 2): ");
		nota1 = nota.nextDouble();
		System.out.print("Escreva a segunda nota (peso 3): ");
		nota2 = nota.nextDouble();
		System.out.print("Escreva a terceira nota (peso 5): ");
		nota3 = nota.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3)+ (nota3 * 5)) / 10;
		System.out.println("sua média final é: " + media);
		
		nota.close();
	}
}
