package br.com.k19poo.orientacaoaobjetos;

public class CartaoDeCredito {

	private int numero;
	private String dataDeValidade;
	private Cliente cliente;
	
	public CartaoDeCredito(int numero, String dataDeValidade, Cliente cliente) {
		this.numero = numero;
		this.dataDeValidade = dataDeValidade;
		this.cliente = cliente;
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "CartaoDeCredito [numero=" + numero + ", dataDeValidade=" + dataDeValidade + ", cliente=" + cliente
				+ "]";
	}
	
	
}
