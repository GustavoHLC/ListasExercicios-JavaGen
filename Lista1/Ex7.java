package Lista1;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		double A, B, C, D, E, F, X, Y, ArredondarX, ArredondarY;
		
		System.out.print ("Digite o valor de A: ");
		A = valor.nextDouble();
		System.out.print ("Digite o valor de B: ");
		B = valor.nextDouble();
		System.out.print ("Digite o valor de C: ");
		C = valor.nextDouble();
		System.out.print ("Digite o valor de D: ");
		D = valor.nextDouble();
		System.out.print ("Digite o valor de E: ");
		E = valor.nextDouble();
		System.out.print ("Digite o valor de F: ");
		F = valor.nextDouble();
		
		X = ((C*E) - (B*F)) / ((A*E) - (B*D));
		Y = ((A*F) - (C*D)) / ((A*E) - (B*D));
		ArredondarX = Math.ceil(X);
		ArredondarY = Math.ceil(Y);
		System.out.println("O valor de x é: " +ArredondarX);
		System.out.println("O valor de y é: " +ArredondarY);
		
		valor.close();
	}
}
