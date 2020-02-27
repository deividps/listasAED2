package listaAED2;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = 0.0;
		double sum = 0.0;
		
		while(n != -1) {
			
			System.out.println("Digite um número: ");
			n = sc.nextDouble();
			sum += n;
			
			if(n == -1) {
				System.out.println(sum +1);
			}
		}
		
		
		sc.close();

	}

}
