package br.com.k19poo.abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{

	private int diaDoAniversario = 5;

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}

	@Override
	public void imprimeExtratoDetalhado() {
		System.out.println("EXTRATO DETALHADO DA CONTA POUPANÇA");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("DATA: "+formato.format(agora));
		System.out.println("SALDO: "+this.getSaldo());
		System.out.println("ANIVERSÁRIO: "+this.diaDoAniversario);
		
	}
	
}
