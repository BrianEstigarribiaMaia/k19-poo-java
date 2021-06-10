package br.com.k19poo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TecladoParaArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner ler = new Scanner(System.in);
		
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		PrintStream ps = new PrintStream(arquivo);

		while (ler.hasNextLine()) {
			String linha = ler.nextLine();
			ps.println(linha);
		}

		ler.close();
		ps.close();
	}

}
