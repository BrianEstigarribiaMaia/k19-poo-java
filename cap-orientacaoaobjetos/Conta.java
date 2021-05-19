package br.com.k19poo.orientacaoaobjetos;

public class Conta {

	private int numero;
	private double saldo, limite = 100;
	private Agencia agencia;
	
	public Conta(int numero, double saldo, double limite, Agencia agencia) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void imprimirExtrato(){
		System.out.println("SALDO: "+this.saldo);
	}
	
	public void transferir(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	public double consultarSaldoDisponivel(){
		double saldoDisponivel = this.saldo + this.limite;
		return saldoDisponivel;
	}
}
