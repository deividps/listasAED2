package Calculator;

public class Calculadora {

	private double num1;
	private double num2;
	private double result;
	private char tipo;
	
	public Calculadora() {
	}

	public Calculadora(double num1, double num2, char tipo) {
	
		this.num1 = num1;
		this.num2 = num2;
		this.tipo = tipo;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public double getResult() {
		return result;
	}
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public double Somar(double num1, double num2) {
		result = num1 + num2;
		return result;
	}
	
	public double Subtrair(double num1, double num2) {
		result = num1 - num2;
		return result;

	}
	
	public double Dividir(double num1, double num2) {
		result = num1 / num2;
		return result;

	}
	
	public double Multiplicar(double num1, double num2) {
		result = num1 * num2;
		return result;

	}
	
}
