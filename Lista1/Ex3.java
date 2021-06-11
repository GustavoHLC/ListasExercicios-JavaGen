package Lista1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner tempo = new Scanner (System.in);
		double segundos, minutos, horas, arredondarMin, arredondarHora;
		
		System.out.print ("quanto segundos teve o evento: ");
		segundos = tempo.nextDouble();
		
		minutos = segundos / 60;
		horas = minutos / 60;
		arredondarMin = Math.ceil(minutos);
		arredondarHora= Math.ceil(horas);
		
		System.out.println("O evento durou " +arredondarHora+ "horas, " +arredondarMin+ " minutos e " +segundos+ ".");
		
		tempo.close();
	}
}
