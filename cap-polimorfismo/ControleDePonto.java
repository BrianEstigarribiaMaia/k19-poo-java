package br.com.k19poo.polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {

	public void registrarEntrada(Funcionario funcionario){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("ENTRADA: "+funcionario.getCodigo());
		System.out.println("DATA: "+formato.format(agora));
	}
	
	public void registrarSaida(Funcionario funcionario){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("SAIDA: "+funcionario.getCodigo());
		System.out.println("DATA: "+formato.format(agora));
	}
}
