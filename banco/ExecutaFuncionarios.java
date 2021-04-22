package br.com.k19.poo.banco;

public class ExecutaFuncionarios {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Paulo");
		gerente.setSalario(8000);
		gerente.setUsuario("paulogerente.adm");
		gerente.setSenha("12a34");
		gerente.setCodigo(666);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Carolina");
		secretaria.setSalario(1600);
		secretaria.setRamal(108);
		secretaria.setCodigo(555);
		
		ControleDePonto controle =  new ControleDePonto();
		
		System.out.println("*****GERENTE*****");
		System.out.println(gerente);
		controle.resgistrarEntrada(gerente);
		System.out.println("-------------------------------");
		System.out.println("*****SECRETÁRIA*****");
		System.out.println(secretaria);
		controle.resgistrarEntrada(secretaria);
		System.out.println("-------------------------------");

	}

}
