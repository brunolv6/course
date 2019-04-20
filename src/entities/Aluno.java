package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	//atributos
	private int matricula;
	private String nome;
	private List<Double> notas_provas = new ArrayList<>();
	private Double nota_trabalho;
	
	//construtor
	public Aluno (int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	//métodos
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getNota_trabalho() {
		return nota_trabalho;
	}
	
	public void setNota_trabalho(Double nota_trabalho) {
		this.nota_trabalho = nota_trabalho;
	}
	
	public void addNotasProvas(Double nota) {
		//adiciona caso não haja as duas notas
		if(notas_provas.size()<2) {
			notas_provas.add(nota);
		}else {
			System.out.println("Já foram adicionadas as duas notas de prova!");
		}
	}
	
	public void removeNotasProvas(Double nota) {
		notas_provas.remove(nota);
		System.out.println("Nota removida com sucesso!");
	}
	
	public Double getMedia() {
		Double provas = 0.0;
		Double media = -1.0;
		if(notas_provas.size() == 2 && nota_trabalho != null) {
			media = 0.0;
			for(Double n : notas_provas) {
				provas += n;
			}
			media = ((5*provas)+(2*nota_trabalho))/7;
		} else {
			System.out.println("Falta alguma nota para o cálculo da média, será atribuído -1 a variável");
		}
		return media;
	}
}
