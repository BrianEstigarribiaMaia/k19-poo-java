package br.com.k19.poo.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
	
	private int diaDeAniversario;

     public ContaPoupanca(int numero, Agencia agencia) {
		this.numeroConta = numero;
		this.agencia = agencia;
	}
     
	public ContaPoupanca() {
	
	}

	public int getDiaDeAniversario() {
		return diaDeAniversario;
	}

	public void setDiaDeAniversario(int diaDeAniversario) {
		this.diaDeAniversario = diaDeAniversario;
	}

	@Override
	public void imprimirExtratoDetalhado() {
		System.out.println("EXTRATO DETALHADO DA CONTA POUPANÇA");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("DATA: "+formato.format(agora));
		System.out.println("SALDO: "+this.getSaldo());
		System.out.println("ANIVERSÁRIO: "+this.diaDeAniversario);
		
	}
}
