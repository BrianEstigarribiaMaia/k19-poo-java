package br.com.k19poo.interfaces;

public class GeradorDeExtrato {

	public void gerarExtrato(Conta conta){
		System.out.println("=====EXTRATO=====");
		System.out.println("Saldo: "+conta.pegarSaldo());
	}
}
