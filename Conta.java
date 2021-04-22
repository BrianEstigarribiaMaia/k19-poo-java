package br.com.k19.poo.banco;

public class Conta {

	private int numeroConta;
	private double saldo;
	private double limite = 500;
	Agencia agencia;

	public Conta(int numero, Agencia agencia){
		this.numeroConta = numero;
		this.agencia = agencia;
	}
	
	public Conta(){
		
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void depositar(double valor){
		this.saldo =+ valor;
	}
	
	public void sacar(double valor){
		this.saldo =- valor;
	}
	
	public double consultarSaldoDisponivel(){
		double saldoDisponivel = this.saldo  + this.limite;	
		return saldoDisponivel;
	}
	
	public void transferir(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	public String toString(){
		String texto = "Numero da Conta: "+this.numeroConta+"\nLimite: "+this.limite;
		return texto;
	}
}
