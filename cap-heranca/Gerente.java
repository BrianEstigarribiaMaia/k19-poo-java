package br.com.k19poo.heranca;

public class Gerente extends Funcionario{

	private String usuario, senha;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public double calcularBonificacao(){
		return this.getSalario() * 0.6 + 100;
	}
	
	@Override
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Usuario: "+this.usuario);
		System.out.println("Senha: "+this.senha);
	}
}
