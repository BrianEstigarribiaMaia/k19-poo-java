package br.com.k19poo.orientacaoaobjetos.testes;

import br.com.k19poo.orientacaoaobjetos.Agencia;
import br.com.k19poo.orientacaoaobjetos.Conta;

public class TesteContaEAgencia {

	public static void main(String[] args) {
		Agencia agencia1 = new Agencia(3654);
		Conta conta1 = new Conta(112233, 200, 100, agencia1);
		
		System.out.println(conta1);
		
	}

}
