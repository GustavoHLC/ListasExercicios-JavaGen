package Lista3;

public class Ex2 {
	public static void main(String[] args) {
		
		int par = 0, impar = 0;
		for (int N = 1; N < 10; N++) {
			if ( N % 2 ==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Números pares: "+ par +"; Números impares: " + impar);
	}
}
