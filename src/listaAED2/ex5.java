package listaAED2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) throws FileNotFoundException, IOException{

		String path = "C:\\ProgramData\\TEMP\\out.txt";
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			System.out.println("O que deseja gravar? ");
			String words = sc.nextLine();
			bw.write(words);
			
		} catch(FileNotFoundException nfe) {
			nfe.getMessage();
		} 
		sc.close();
	}
	 
}