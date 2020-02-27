package listaAED2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Filiais {

	public static void main(String[] args) throws IOException {
	
		Locale.setDefault(Locale.US);
		
		double total1 = 0.0;
		double media1 = 0.0;
		double total2 = 0.0;
		double media2 = 0.0;
		double total3 = 0.0;
		double media3 = 0.0;
		double total4 = 0.0;
		double media4 = 0.0;
		
		try{
			String path = "C:\\ProgramData\\TEMP\\arquivo.txt";
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String line;
			
			while(br.ready()) {
				line = br.readLine();
				
				if(Integer.parseInt(line.substring(0, 1))== 1) {
					total1 = total1 + Double.parseDouble(line.substring(2));
					media1++;
				}else {
					if(Integer.parseInt(line.substring(0, 1))==2) {
						total2 = total2 + Double.parseDouble(line.substring(2));
						media2++;
						
					} else {
						if(Integer.parseInt(line.substring(0, 1))== 3){
							total3 = total3 + Double.parseDouble(line.substring(2));
							media3++;
						} else {
							if(Integer.parseInt(line.substring(0, 1))== 4) {
								total4 = total4 + Double.parseDouble(line.substring(2));
								media4++;
							}
						}
					}
				}
			}
			
			br.close();
			
			System.out.println("Filial 1");
			System.out.println("Total " + total1);
			System.out.println("Media filial 1 " + total1/media1);
			System.out.println("Filial 2");
			System.out.println("Total " + total2);
			System.out.println("Media filial 2 " + total2/media2);
			System.out.println("Filial 3");
			System.out.println("Total " + total3);
			System.out.println("Media filial 3 " + total3/media3);
			System.out.println("Filial 4");
			System.out.println("Total " + total4);
			System.out.println("Media filial 4 " + total4/media4);
		} catch(FileNotFoundException f) {
			f.getMessage();
		}
}}

