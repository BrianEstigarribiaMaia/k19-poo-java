package br.com.k19poo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class EscritaDeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		PrintStream printStream = new PrintStream(arquivo);

		printStream.println("Primeira linha!!!");
		printStream.println("Segunda linha!!!");
		printStream.println("Terceira linha!!!");

		printStream.close();
	}

}
