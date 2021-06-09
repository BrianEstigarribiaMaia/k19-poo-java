package br.com.k19poo.exceptions.testes;

import br.com.k19poo.exceptions.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		try {
			funcionario.aumentarSalario(-500);
		} catch (IllegalArgumentException e) {
			System.out.println("Houve um erro ao aumentar o salário: "+ e);
		}

	}

}
