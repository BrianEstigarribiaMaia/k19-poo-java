package br.com.k19poo.polimorfismo;

public class TesteGeradorDeExtrato {

	public static void main(String[] args) {
		GeradorDeExtrato gerador = new GeradorDeExtrato();
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setSaldo(1000);
		
		ContaCorrente corrente =  new ContaCorrente();
		corrente.setSaldo(1500);
		
		gerador.imprimirExtratoBasico(corrente);
		gerador.imprimirExtratoBasico(poupanca);

	}

}
