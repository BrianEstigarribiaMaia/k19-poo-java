package br.com.k19poo.interfaces.testes;

import br.com.k19poo.interfaces.Conta;
import br.com.k19poo.interfaces.ContaCorrente;
import br.com.k19poo.interfaces.ContaPoupanca;
import br.com.k19poo.interfaces.GeradorDeExtrato;

public class TesteGeradorDeExtrato {

	public static void main(String[] args) {
		Conta corrente = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		corrente.depositar(500);
		poupanca.depositar(500);
		
		GeradorDeExtrato gerador = new GeradorDeExtrato();
		gerador.gerarExtrato(corrente);
		gerador.gerarExtrato(poupanca);
	}
}
