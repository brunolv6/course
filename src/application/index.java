package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Disciplina;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome da disciplina: ");
		String nomeDisciplina = sc.nextLine();
		System.out.printf("Número de alunos inscritos na disciplina %s: ", nomeDisciplina);
		int n_alunos = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("%s, %d %n", nomeDisciplina, n_alunos);
		
		Disciplina disciplina = new Disciplina(nomeDisciplina);
		for(int i = 0; i<n_alunos; i++) {
			System.out.print("Insira número da matrícula do aluno: ");
			int matricula = sc.nextInt();
			sc.nextLine();
			System.out.print("Insira nome do aluno: ");
			String nome = sc.nextLine();
			
			Aluno aluno = new Aluno(matricula, nome);
			
			System.out.printf("Deseja inserir a nota da P1 do %s: ", nome);
			Double p1 = sc.nextDouble();
			sc.nextLine();
			
			aluno.addNotasProvas(p1);
			
			System.out.printf("Deseja inserir a nota da P2 do %s: ", nome);
			Double p2 = sc.nextDouble();
			sc.nextLine();
			
			aluno.addNotasProvas(p2);
			
			System.out.printf("Deseja inserir a nota do trabalho do %s: ", nome);
			Double trabalho = sc.nextDouble();
			sc.nextLine();
			
			aluno.setNota_trabalho(trabalho);
			
			disciplina.addAluno(aluno);
			
			System.out.println(aluno.getMedia());
		}
		
		
	}

}