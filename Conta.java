package br.com.k19poo.abstratas;

public abstract class Conta {

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void imprimeExtratoDetalhado();
}
