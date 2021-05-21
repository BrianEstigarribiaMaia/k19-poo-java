package br.com.k19poo.orientacaoaobjetos.testes;

import br.com.k19poo.orientacaoaobjetos.Aluno;
import br.com.k19poo.orientacaoaobjetos.Turma;

public class TesteAlunoETurma {

	public static void main(String[] args) {
		Turma turma1 = new Turma();
		turma1.setPeriodo("tarde");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Brian Estigarribia");
		aluno1.setRg("8888888888");
		aluno1.setDataDeNascimento("23/12/1994");
		aluno1.setTurma(turma1);
		
		Turma turma2 = new Turma();
		turma2.setPeriodo("manhã");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Silvio Santos");
		aluno2.setRg("6666666666");
		aluno2.setDataDeNascimento("10/05/1990");
		aluno2.setTurma(turma2);
		
		System.out.println(aluno1);
		System.out.println(aluno2);
		
	}
}
