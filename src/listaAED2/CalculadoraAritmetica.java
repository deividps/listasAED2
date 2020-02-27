package listaAED2;

import java.util.Scanner;

public class CalculadoraAritmetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		System.out.println("Escolha: \n 1 - Multiplicar \n 2 - Dividir \n 3 - Somar \n 4 - Subtrair \n 5 - Sair do Programa ");
		option = sc.nextInt();
		
		switch(option) {
		case 1: {
			
			while(option == 1) {
				int num1, num2 = 1;
				int result;
				
				System.out.println("Primeiro número: ");
				num1 = sc.nextInt();
				
				System.out.println("Segundo número: ");
				num2 = sc.nextInt();
				
				result = num1 * num2;
				
				System.out.println(result);
				
				System.out.print("\n Escolha: \n 1 - Multiplicar \n 2 - Dividir \n 3 - Somar \n 4 - Subtrair \n 5 - Sair do Programa ");
				
				option = sc.nextInt();
			}
			
		}
		
		case 2: {
			while(option == 2) {
				int num1, num2 = 0;
				int result;
				
				System.out.println("Primeiro número: ");
				num1 = sc.nextInt();
				
				System.out.println("Segundo número: ");
				num2 = sc.nextInt();
				
				if(num1 == 0 || num2 == 0) {
					System.out.print("Divisão impossível! \n");
				}
				
				else {
					result = num1 / num2;
					System.out.println(result);
				}
			
				System.out.print("Escolha: \n 1 - Multiplicar \n 2 - Dividir \n 3 - Somar \n 4 - Subtrair \n 5 - Sair do Programa ");
				
				option = sc.nextInt();
			}
				
		}
		
		case 3: {
			
			while(option == 3) {
				int num1, num2 = 0;
				int result;
				
				System.out.println("Primeiro número: ");
				num1 = sc.nextInt();
				
				System.out.println("Segundo número: ");
				num2 = sc.nextInt();
				
				result = num1 + num2;
				
				System.out.println(result);
				
				System.out.print("Escolha: \n 1 - Multiplicar \n 2 - Dividir \n 3 - Somar \n 4 - Subtrair 5 - Sair do Programa ");
				
				option = sc.nextInt();
			}

		}
		
		case 4: {
			
			while(option == 4) {
				int num1, num2 = 1;
				int result;
				
				System.out.println("Primeiro número: ");
				num1 = sc.nextInt();
				
				System.out.println("Segundo número: ");
				num2 = sc.nextInt();
				
				result = num1 - num2;
				
				System.out.println(result);
				
				System.out.print("Escolha: \n 1 - Multiplicar \n 2 - Dividir \n 3 - Somar \n 4 - Subtrair 5 - Sair do Programa ");
				
				option = sc.nextInt();
			}

			
		}
		
		case 5: {
			System.out.println("Obrigado por usar nosso programa! ");
		}
		
		}
		sc.close();

	}

}
