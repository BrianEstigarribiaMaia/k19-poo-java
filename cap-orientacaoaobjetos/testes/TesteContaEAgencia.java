package br.com.k19poo.orientacaoaobjetos.testes;

import br.com.k19poo.orientacaoaobjetos.Agencia;
import br.com.k19poo.orientacaoaobjetos.Conta;

public class TesteContaEAgencia {

	public static void main(String[] args) {
		Agencia agencia1 = new Agencia(3654);
		Conta conta1 = new Conta(112233, 200, 100, agencia1);
		Conta conta2 = new Conta(445566, 300, 100, agencia1);
		
		System.out.println(conta1);
		conta1.depositar(2000);
		conta1.imprimirExtrato();
		System.out.println("Sacar 150");
		conta1.sacar(150);
		conta1.imprimirExtrato();
		System.out.println("Saldo disponivel: "+conta1.consultarSaldoDisponivel());
		
		conta1.transferir(conta2, 100);
		System.out.println("Origem saldo:  "+conta2.getSaldo());
		System.out.println("Destino saldo: "+conta1.getSaldo());
		
	}

}
