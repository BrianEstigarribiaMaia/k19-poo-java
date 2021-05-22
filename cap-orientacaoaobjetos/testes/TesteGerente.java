package br.com.k19poo.orientacaoaobjetos.testes;

import br.com.k19poo.orientacaoaobjetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setSalario(10000);
		System.out.println("Salario: "+gerente.getSalario());
		gerente.aumentarSalario();
		System.out.println("Salario aumentado em 10%: "+gerente.getSalario());
		gerente.aumentarSalario(0.3);
		System.out.println("Salario aumentado em 30%: "+gerente.getSalario());
		

	}

}
