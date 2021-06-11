package Lista1;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		double x1, y1, x2, y2, R, D;
		
		System.out.print("Insira a entrada x1: ");
		x1 = valor.nextDouble();
		System.out.print("Insira a entrada x2: ");
		x2 = valor.nextDouble();
		System.out.print("Insira a entrada y1: ");
		y1 = valor.nextDouble();
		System.out.print("Insira a entrada y2: ");
		y2 = valor.nextDouble();
		
		R = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
		D = R;
		System.out.print("O valor da distância de D é:" + D);
		
		valor.close();
	}
}
