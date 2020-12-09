package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class CadAluno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char status;
		String curso="";
		
		Aluno aluno1 = new Aluno();
		
		System.out.print("Insira o número de matrícula: ");
		aluno1.setMatricula(input.nextInt());
		System.out.print("Insira o nome do aluno: ");
		aluno1.setNome(input.next());
		System.out.print("Insira o ano de nascimento: ");
		aluno1.setAnoNascimento(input.nextInt());
		System.out.print("Insira o gênero [M/F/O]: ");
		aluno1.setGenero(input.next().toUpperCase().charAt(0));
		System.out.print("Aluno está ativo ou inativo? [A/I]: ");	
		status = input.next().toUpperCase().charAt(0);
		
		System.out.print("\n-------------------------------------------");
		System.out.print("\nBem vindo "+aluno1.obterGenero());
		if (aluno1.idade() <= 13)
		{
			System.out.println("! Você está no Ensino Fundamental");
			curso = "Ensino Fundamental";
		}
		
		else if (aluno1.idade() > 13 && aluno1.idade() <= 17)
		{
			System.out.println("! Você está no Ensino Médio");
			curso = "Ensino Médio";
		}
		
		else if (aluno1.idade() > 17)
		{
			System.out.println("! Você está no Ensino Superior");
			curso = "Ensino Superior";
		}
		System.out.print("-------------------------------------------\n");
		System.out.println("Matrícula: "+aluno1.getMatricula());
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("Ano de nascimento: "+aluno1.getAnoNascimento());
		System.out.println("Gênero: "+aluno1.getGenero());
		if(aluno1.situacao() == true)
		{
			System.out.println("Ativo: Sim");
		}
		else if(aluno1.situacao() == false)
		{
			System.out.println("Ativo: Não");
		}
		System.out.println("Curso: "+curso);

	}

}
