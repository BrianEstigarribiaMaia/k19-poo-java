package br.com.k19poo.polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorDeExtrato {

	public void imprimirExtratoBasico(Conta conta){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("DATA: "+formato.format(agora));
		System.out.println("SALDO: "+conta.getSaldo());
	}
}
