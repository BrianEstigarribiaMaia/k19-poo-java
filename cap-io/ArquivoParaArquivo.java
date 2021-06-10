package br.com.k19poo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ArquivoParaArquivo {

	public static void main(String[] args) throws IOException {
		InputStream arquivo1 = new FileInputStream("entrada.txt");
		Scanner scanner = new Scanner(arquivo1);
		
		FileOutputStream arquivo2 = new FileOutputStream("saida.txt");
		PrintStream printStream = new PrintStream(arquivo2);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			printStream.println(linha);
		}
		scanner.close();
		printStream.close();
	}

}
