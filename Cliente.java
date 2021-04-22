package br.com.k19.poo.banco;

public class Cliente {

	private String nome;
	private int codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} 
	
	public String toString(){
		String texto = "Nome: "+this.nome+ "\nCódigo: "+this.codigo;
		return texto;
	}
}
