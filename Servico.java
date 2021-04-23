package br.com.k19.poo.banco;

public class Servico {

	private Cliente contratante;
	private Funcionario responsavel;
	private String dataDeContratacao;
	
	public Cliente getContratante() {
		return contratante;
	}
	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	public String getDataDeContratacao() {
		return dataDeContratacao;
	}
	public void setDataDeContratacao(String dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}
	
	public double calcularTaxa(){
		return 5;
	}
}
