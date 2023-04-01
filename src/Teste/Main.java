package Teste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Arquivos.LerArquivo;
import Arquivos.SalvarArquivo;

public class Main {
	public static void main(String[] args) throws IOException {
		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;
		
		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Pera; 200; pct; R$4,50");
		conteudo.add("Morango; 400; cx; R$6,50");
		conteudo.add("Abacaxi; 280; un; R$5,00");
		conteudo.add("Banana; 500; un; R$8,00");
		
		SalvarArquivo.gravarEstoque(nomeDoArquivo, caminho, conteudo);
		LerArquivo.lerEstoque(caminho);
	}

}
