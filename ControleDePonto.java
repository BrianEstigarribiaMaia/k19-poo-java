package br.com.k19.poo.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	public void resgistrarEntrada(Funcionario funcionario){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Entrada: "+funcionario.getCodigo());
		System.out.println("Data: "+formato.format(agora));
	}
	
	public void resgistrarSaida(Funcionario gerente){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Entrada: "+gerente.getCodigo());
		System.out.println("Data: "+formato.format(agora));
	}
}
