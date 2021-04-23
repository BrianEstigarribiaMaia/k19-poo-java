package br.com.k19.poo.banco;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario = 200;
	private int codigo;
	
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
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public double calcularBonificacao(){
		double bonificacao = this.salario * 0.1;
		return bonificacao;
	}

}
