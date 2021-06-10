package br.com.k19poo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class LeituraDeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream arquivo = new FileInputStream("entrada.txt");
		Scanner scanner = new Scanner(arquivo);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		scanner.close();
	}

}
