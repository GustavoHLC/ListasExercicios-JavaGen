package Lista2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero, par, impar, equacao;
		
		System.out.println ("Digite um número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			par = numero;
			equacao =Math.sqrt(par);
			System.out.println ("O numero inserido é par e sua raiz quadrada: " + equacao);
		}
		else if (numero % 2 != 0) {
			impar = numero;
			equacao = Math.pow(impar, 2);
			System.out.println ("O numero inserido é impar e sua potencia: " + equacao);
		}
		ler.close();
	}
}
