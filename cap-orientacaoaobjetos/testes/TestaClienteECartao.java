package br.com.k19poo.orientacaoaobjetos.testes;

import br.com.k19poo.orientacaoaobjetos.CartaoDeCredito;
import br.com.k19poo.orientacaoaobjetos.Cliente;

public class TestaClienteECartao {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Ruan Sousa");
		cliente1.setCodigo(666);
		
		CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(223344, "05/12/2025", cliente1);
		
		System.out.println(cartaoDeCredito);

	}

}
