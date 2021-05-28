package br.com.k19poo.heranca;

public class Secretaria extends Funcionario{

	private int ramal;
	
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Ramal "+this.ramal);
	}
}
