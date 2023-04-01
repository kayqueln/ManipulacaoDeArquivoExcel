package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class LerArquivo {
	public static void lerEstoque(String caminho) {
		try {
			FileReader stream = new FileReader(caminho);
			BufferedReader reader = new BufferedReader(stream);
			
			String linha = reader.readLine();
			
			while(linha != null) {			
				System.out.println(linha);
				linha = reader.readLine();
			}
			reader.close();
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
