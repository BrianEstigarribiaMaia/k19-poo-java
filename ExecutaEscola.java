package br.com.k19.poo.escola;

import java.util.Scanner;

public class ExecutaEscola {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.setNome(ler.next());
		funcionario.setCargo("Professor");
		funcionario.setSalario(2000);
		
		int opcao;
		do{
			System.out.println("***** MENU FUNCIONÁRIO *****");
			System.out.println("1 - Aumentar salario: ");
			System.out.println("2 - Alterar nome");
			System.out.println("3 - Mostrar Informações do Funcionário:");
			System.out.println("0 - Sair");
			opcao = ler.nextInt();
			
			switch(opcao){
			case 1:
				System.out.println("Digite o valor a ser acrescentado ao salário: ");
				funcionario.aumentarSalario(ler.nextDouble()); break;
			case 2:
				System.out.println("Digite o novo nome do Funcionario: ");
				funcionario.setNome(ler.next()); break;
			case 3:
				System.out.println("*** FUNCIONARIO ***");
				System.out.println(funcionario);
				System.out.println("--------------------------------------");break;
			case 0:
				System.out.println("Sistema Encerrado"); break;
			default: System.out.println("Opção Inválida!");
			}
		}while(opcao != 0);
		
		ler.close();
		
		Turma turma1 =  new Turma();
		turma1.setPeriodo("Manhã");
		turma1.setSigla("T01-M");
		turma1.setTipoDeEnsino("Presencial");
		turma1.setSerie(5);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Juquinha");
		aluno.setDataDeNascimento("23/05/1997");
		aluno.setRG(810666666);
		
		aluno.turma = turma1;
		
		System.out.println("*** TURMA ***");
		System.out.println(aluno.turma);
		System.out.println("--------------------------------------");
		System.out.println("*** ALUNO ***");
		System.out.println(aluno);
		System.out.println("--------------------------------------");
		
	}

}
