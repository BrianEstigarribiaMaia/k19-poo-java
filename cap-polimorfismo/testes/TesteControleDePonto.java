package br.com.k19poo.polimorfismo.testes;

import br.com.k19poo.polimorfismo.ControleDePonto;
import br.com.k19poo.polimorfismo.Gerente;
import br.com.k19poo.polimorfismo.Telefonista;

public class TesteControleDePonto {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setCodigo(1);
		gerente.setUsuario("brian.maia");
		gerente.setSenha("654321");
		
		Telefonista telefonista = new Telefonista();
		telefonista.setCodigo(2);
		telefonista.setRamal(15);
		
		ControleDePonto controle = new ControleDePonto();
		controle.registrarEntrada(gerente);
		controle.registrarEntrada(telefonista);
		
		controle.registrarSaida(gerente);
		controle.registrarSaida(telefonista);
		
	}

}
