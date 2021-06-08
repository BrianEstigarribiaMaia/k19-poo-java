package br.com.k19poo.interfaces;

public interface Conta {

	public void depositar(double valor);
	public void sacar(double valor);
	double pegarSaldo();
}
