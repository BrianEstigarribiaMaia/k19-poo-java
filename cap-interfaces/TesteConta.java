package br.com.k19poo.interfaces.testes;

import br.com.k19poo.interfaces.Conta;
import br.com.k19poo.interfaces.ContaCorrente;
import br.com.k19poo.interfaces.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		Conta corrente = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		corrente.depositar(500);
		poupanca.depositar(500);
		
		corrente.sacar(150);
		poupanca.sacar(50);
		
		System.out.println(corrente.pegarSaldo());
		System.out.println(poupanca.pegarSaldo());
	}

	
}
