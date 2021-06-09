package br.com.k19poo.exceptions;

public class Funcionario {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double aumento){
		if(aumento < 0){
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}
	}
	
	
}
