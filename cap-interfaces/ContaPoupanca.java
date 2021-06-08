package br.com.k19poo.interfaces;

public class ContaPoupanca implements Conta{

	private double saldo;

	public double pegarSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
}
