package br.com.k19.poo.escola;

public class Aluno {

	private String nome;
	private String dataDeNascimento;
	private int RG;
	Turma turma;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	
	public String toString(){
		String texto = "Nome: "+this.nome+ "\nData de nascimento: "+this.dataDeNascimento+
				"\nRG: "+this.RG;
		return texto;
	}
	
}
