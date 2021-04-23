package br.com.k19.poo.banco;

public class SeguroVeiculo extends Servico{

	private Veiculo veiculo;
	private double valorDoSeguroDeVeiculo;
	private double franquia;
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getValorDoSeguroDeVeiculo() {
		return valorDoSeguroDeVeiculo;
	}
	public void setValorDoSeguroDeVeiculo(double valorDoSeguroDeVeiculo) {
		this.valorDoSeguroDeVeiculo = valorDoSeguroDeVeiculo;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	
	public double calcularTaxa(){
		double taxa = super.calcularTaxa() * 0.05;
		return taxa;
	}
	
}
