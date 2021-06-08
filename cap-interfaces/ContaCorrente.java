package br.com.k19poo.interfaces;

public class ContaCorrente implements Conta{

	private double saldo, taxaPorOperacao = 0.45;

	public double pegarSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaPorOperacao() {
		return taxaPorOperacao;
	}

	public void setTaxaPorOperacao(double taxaPorOperacao) {
		this.taxaPorOperacao = taxaPorOperacao;
	}
	
	public void depositar(double valor){
		this.saldo += valor - this.taxaPorOperacao;
	}
	
	public void sacar(double valor){
		this.saldo -= valor + this.taxaPorOperacao;
	}
	
}
