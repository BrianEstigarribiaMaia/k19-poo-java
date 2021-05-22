package br.com.k19poo.orientacaoaobjetos.testes;

import java.util.Scanner;

import br.com.k19poo.orientacaoaobjetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome do funcionario: ");
		String nome = ler.nextLine();
		funcionario.setNome(nome);

		int opcao = 1;

		while(opcao != 0){
			System.out.println("Escolha a opção desejada:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aumentar salário");
			System.out.println("2 - Corrigir nome do funcionário");
			System.out.println("3 - Imprimir dados");

			String valorDigitado = ler.nextLine();
			opcao = Integer.parseInt(valorDigitado);

			if(opcao == 1){

				System.out.println("Digite o quento voce deseja aumentar: ");
				valorDigitado = ler.nextLine();
				int aumentar = Integer.parseInt(valorDigitado);

				if(aumentar < 0){

					System.out.println("ERRO!");

				}else{

					funcionario.aumentarSalario(aumentar);;
					System.out.println("Aumento efetuado com sucesso");

				}
			}else if(opcao == 2){

				System.out.println("Nome atual: "+funcionario.getNome());
				System.out.println("Digite o nome: ");
				valorDigitado = ler.nextLine();
				funcionario.setNome(valorDigitado);
				System.out.println("Subistituição feita com sucesso.");

			}else if(opcao == 3){
				System.out.println("Dados atuais: ");
				System.out.println(funcionario);
			}
		}

		ler.close();
	}
}
