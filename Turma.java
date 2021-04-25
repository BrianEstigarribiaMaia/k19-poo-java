package br.com.k19.poo.escola;

public class Turma {

	private String periodo, sigla, tipoDeEnsino;
	private int serie;
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getTipoDeEnsino() {
		return tipoDeEnsino;
	}
	public void setTipoDeEnsino(String tipoDeEnsino) {
		this.tipoDeEnsino = tipoDeEnsino;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String toString(){
		String texto = "Periodo: "+this.periodo+ " | Sigla: "+this.sigla+
				"\nTipo de Ensino: "+this.tipoDeEnsino+ " |  Série: "+this.serie;
		return texto;
	}
}
