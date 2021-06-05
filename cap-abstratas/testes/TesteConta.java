package br.com.k19poo.abstratas.testes;

import br.com.k19poo.abstratas.ContaPoupanca;
import br.com.k19poo.abstratas.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new ContaPoupanca();
		
		conta.setSaldo(2500);
		conta.imprimeExtratoDetalhado();

	}

}
