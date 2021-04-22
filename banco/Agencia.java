package br.com.k19.poo.banco;

public class Agencia {

	private int numeroAgencia;

	public Agencia(int numero){
		this.numeroAgencia = numero;
	}
	
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public String toString(){
		String texto = "Numero da Agencia: "+this.numeroAgencia;
		return texto;
	}
}
