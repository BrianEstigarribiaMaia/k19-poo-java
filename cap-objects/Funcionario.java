package br.com.k19poo.objects;

public class Funcionario {

	private double salario;
	private String nome;
			
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Funcionario [salario: " + salario + ", nome: " + nome + "]";
	}
	
	
	
	
}
