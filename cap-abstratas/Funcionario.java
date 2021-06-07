package br.com.k19poo.abstratas;

abstract public class Funcionario {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double calcularBonificacao();
}
