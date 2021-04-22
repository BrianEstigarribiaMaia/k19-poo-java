package br.com.k19.poo.banco;

public class CartaoDeCredito {
	
	private int numero;
    private String dataDeValidade;
    Cliente cliente;
    
    public CartaoDeCredito(int numero) {
		this.numero = numero;
	}
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	
	public String toString(){
		String texto = "Cartão de Crédito Numero: "+this.numero+ "\nData de validade: "+this.dataDeValidade;
		return texto;
	}
}
