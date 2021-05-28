package br.com.k19poo.heranca.teste;

import br.com.k19poo.heranca.Gerente;
import br.com.k19poo.heranca.Secretaria;
import br.com.k19poo.heranca.Telefonista;


public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Brian Estigarribia");
		gerente.setSalario(15000);
		gerente.setUsuario("brian.maia");
		gerente.setSenha("GER1234");
		System.out.println("=====GERENTE=====");
		gerente.mostrarDados();
		System.out.println("-------------------------");
		
		Telefonista telefonista = new Telefonista(); 
		telefonista.setNome("Jhonny Stone");
		telefonista.setSalario(2000);
		telefonista.setEstacaoDeTrabalho(24);
		System.out.println("=====TELEFONISTA=====");
		telefonista.mostrarDados();
		System.out.println("-------------------------");
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Jean Dorneles");
		secretaria.setSalario(2000);
		secretaria.setRamal(3);
		System.out.println("=====SECRETARIA=====");
		secretaria.mostrarDados();
		System.out.println("-------------------------");

	}
}
