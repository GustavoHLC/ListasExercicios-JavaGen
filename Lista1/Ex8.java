package Lista1;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		int valorFab, impostos, distribuidor, CustoFinal;
		
		System.out.println("Escreva o valor do automóvel passado pela fábrica");
		valorFab = valor.nextInt();
		
		impostos = (int) (0.28 * valorFab);
		distribuidor = (int) (0.45 * valorFab);
		CustoFinal = impostos + distribuidor + valorFab;
		System.out.println("-------------------------");
		System.out.println("Valor da porcentagem do distribuidor: " +distribuidor);
		System.out.println("Valor do imposto: " +impostos);
		System.out.println("Valor para o consumidor final: " +CustoFinal);


		valor.close();
	}
}
