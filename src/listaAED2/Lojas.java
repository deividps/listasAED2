package listaAED2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lojas {

	public static void main(String[] args) throws IOException {
		
		double total1 = 0.0;
		double media1 = 0.0;
		double total2 = 0.0;
		double media2 = 0.0;
		double total3 = 0.0;
		double media3 = 0.0;
		double total4 = 0.0;
		double media4 = 0.0;
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");
		
		try {
			String path = "C:\\ProgramData\\TEMP\\arquivo.txt";
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			//double data = Integer.parseInt(line);
			double data = Double.parseDouble(line);
			
			while(line != null) {
				
				data = sc.nextDouble();
				
				if(data == 1) {
					total1 += sc.nextDouble();
					media1 += 1; 
				} else if(data == 2) {
					total2 += sc.nextDouble();
					media2 += 1;
				} else if (data == 3) {
					total3 += sc.nextDouble();
					media3 += 1;
				} else if(data == 4) {
					total3 += sc.nextDouble();
					media4 += 1;
				}
			}
		} catch(FileNotFoundException f) {
			f.getMessage();
			

	}
		sc.close();
		
		
		System.out.println("Total de vendas da filial 1: "+ total1);
		System.out.println("Media de vendas da filial 1: "+ (total1/media1));
		System.out.println("Total de vendas da filial 2: "+ total2);
		System.out.println("Media de vendas da filial 1: "+ (total2/media2));
		System.out.println("Total de vendas da filial 1: "+ total3);
		System.out.println("Media de vendas da filial 1: "+ (total3/media3));
		System.out.println("Total de vendas da filial 1: "+ total4);
		System.out.println("Media de vendas da filial 1: "+ (total4/media4));
}
}