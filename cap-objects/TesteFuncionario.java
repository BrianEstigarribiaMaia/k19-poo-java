package br.com.k19poo.objects.testes;

import br.com.k19poo.objects.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionarioA = new Funcionario();
		funcionarioA.setNome("Juca");
		funcionarioA.setSalario(500);
		
		Funcionario funcionarioB = new Funcionario();
		funcionarioB.setNome("Juca");
		funcionarioB.setSalario(500);
		
		System.out.println(funcionarioA == funcionarioB);
		System.out.println(funcionarioA.equals(funcionarioB));
	}

}
