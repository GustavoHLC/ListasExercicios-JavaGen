package Lista2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println ("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println ("Sua categoria � a infantil");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println ("Sua categoria � a juvenil");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println ("Sua categoria � a adulta");
		}
		else {
			System.out.println ("Idade n�o classificada para a inscri��o");
		}
		ler.close();
	}
}
