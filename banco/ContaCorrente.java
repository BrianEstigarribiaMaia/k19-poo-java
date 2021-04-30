package br.com.k19.poo.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta{
	
	private double limiteContaCorrente;
	
	public ContaCorrente(int numero, Agencia agencia) {
		this.numeroConta = numero;
		this.agencia = agencia;
	}

	public ContaCorrente() {
		
	}

	public double getLimiteContaCorrente() {
		return limiteContaCorrente;
	}

	public void setLimiteContaCorrente(double limiteContaCorrente) {
		this.limiteContaCorrente = limiteContaCorrente;
	}

	@Override
	public void imprimirExtratoDetalhado() {
		System.out.println("EXTRATO DETALHADO DA CONTA CORRENTE");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("DATA: "+formato.format(agora));
		System.out.println("SALDO: "+this.getSaldo());
		System.out.println("LIMITE: "+this.limiteContaCorrente);
		
	}
	
	
}
