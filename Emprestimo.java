package br.com.k19.poo.banco;

public class Emprestimo extends Servico{

	private double valor;
	private double taxa;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularTaxa(){
		double taxa = super.calcularTaxa() * 0.1;
		return taxa;
	}
}
