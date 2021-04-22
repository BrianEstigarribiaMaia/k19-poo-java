package br.com.k19.poo.banco;

public class ExecutaGerador {

	public static void main(String[] args) {
		GeradorDeExtrato gerador =  new GeradorDeExtrato();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaPoupanca.setSaldo(1500);
		contaCorrente.setSaldo(2000);
		
		gerador.imprimeExtratoBasico(contaCorrente);
		gerador.imprimeExtratoBasico(contaPoupanca);

	}

}
