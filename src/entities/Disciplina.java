package entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	//atributos da classe
	private String nome;
	private List<Aluno> alunos = new ArrayList<>(); 
	
	//contrutores
	public Disciplina(String nome) {
		this.nome = nome;
	}
	
	//métodos da classe
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addAluno(Aluno aluno_novo) {
		alunos.add(aluno_novo);
	}
	
	public void remove(Aluno aluno_retirar) {
		alunos.remove(aluno_retirar);
	}
}
