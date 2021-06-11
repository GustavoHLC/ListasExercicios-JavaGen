package Lista3;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade, sexo, humor, i=0, cond1=0, cond2=0, cond3=0, cond4=0, cond5=0, cond6=0;
		
		while (i < 150){
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.print("Digite sua sexo(1-masculino,2-femino,3-outros): ");
			sexo = ler.nextInt();
			System.out.print("Digite sua humor(1-calmo,2-nervosa,3-agressiva): ");
			humor = ler.nextInt();
			
			if (humor == 1) {
				cond1++;
			}
			if (sexo==2 && humor==2) {
				cond2++;
			}
			if (sexo==1 && humor==3) {
				cond3++;
			}
			if (sexo==3 && humor==1) {
				cond4++;
			}
			if (idade>=40 && humor==2) {
				cond5++;
			}
			if (idade<=18 && humor==1) {
				cond6++;
			}
			
			i++;
		}
		System.out.println("o número de pessoas calmas: " + cond1);
		System.out.println("o número de mulheres nervosas: " + cond2);
		System.out.println("o número de homens agressivos: " + cond3);
		System.out.println("o número de outros calmos: " + cond4);
		System.out.println("o número de pessoas nervosas com mais de 40 anos: " + cond5);
		System.out.println("o número de pessoas calmas com menos de 18 anos: " + cond6);
		ler.close();
	}
}
