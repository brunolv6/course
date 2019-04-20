package application;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome da disciplina: ");
		String nomeDisciplina = sc.nextLine();
		System.out.printf("Número de alunos inscritos na disciplina %s: ", nomeDisciplina);
		int n_alunos = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("%s, %d", nomeDisciplina, n_alunos);
		
	}

}