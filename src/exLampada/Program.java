package exLampada;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		lampada lampada1 = new lampada();
		lampada lampada2 = new lampada();
		lampada lampada3 = new lampada();
		
		lampada1.setEstado("APAGADA");
		lampada2.setEstado("ACESA");
		lampada3.setEstado("meioApagada");
		
		System.out.println("Status lampada 1: " + lampada1.getEstado());
		System.out.println("Status lampada 2: " + lampada2.getEstado());
		System.out.println("Status lampada 3: " + lampada3.getEstado());
		
		sc.close();
	}

}
