package br.com.k19.poo.escola;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario = 200;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public String toString(){
		String texto = "Nome: "+this.nome+ " | Cargo: "+this.cargo+ 
				"\nSalário: "+this.salario;
		return texto;
	}
}
