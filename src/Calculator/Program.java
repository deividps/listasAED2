package Calculator;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a opera��o desejada: \n '+', \n '-', \n '*', \n '/ '");
		char option = sc.next().charAt(0);
		Calculadora calc = new Calculadora();
		calc.setTipo(option);
		
		if(calc.getTipo()== '+') {
			System.out.println("Digite primeiro n�mero: ");
			double num1 = sc.nextDouble();
			System.out.println("Digite o segundo n�mero: ");
			double num2 = sc.nextDouble();
			calc.Somar(num1, num2);
		}else if(calc.getTipo()== '-') {
			System.out.println("Digite primeiro n�mero: ");
			double num1 = sc.nextDouble();
			System.out.println("Digite o segundo n�mero: ");
			double num2 = sc.nextDouble();
			calc.Subtrair(num1, num2);
		}else if(calc.getTipo()== '/') {
			try {
				System.out.println("Digite primeiro n�mero: ");
				double num1 = sc.nextDouble();
				System.out.println("Digite o segundo n�mero: ");
				double num2 = sc.nextDouble();
				calc.Dividir(num1, num2);
			}
			catch(ArithmeticException ar) {
				ar.getMessage();
			}

		}else if(calc.getTipo()== '*') {
			System.out.println("Digite primeiro n�mero: ");
			double num1 = sc.nextDouble();
			System.out.println("Digite o segundo n�mero: ");
			double num2 = sc.nextDouble();
			calc.Multiplicar(num1, num2);
		}
		
		System.out.println("Resultado do c�lculo " + calc.getResult());
		sc.close();
	}

}
