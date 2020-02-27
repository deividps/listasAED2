package listaAED2;

import java.util.Scanner;

public class numerosNaturaisImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números ímpares deseja ver exibir: ");
		n = sc.nextInt();
		
		int cont = -1;
		
		for(int i = 0; i<n; i++) {
			cont += 2;
			System.out.println(cont);
		}
		
		sc.close();

	}

}
