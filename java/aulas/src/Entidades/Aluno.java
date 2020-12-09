package Entidades;

import java.util.Scanner;

public class Aluno {
	
	Scanner input = new Scanner(System.in);
	
	//attributes
	private int matricula;
	private String nome;
	private int anoNascimento;
	private char genero;
	private boolean ativo;
		
	//constructors
	public Aluno()
	{
		
	}
		
	public Aluno(int matricula, String nome)
	{
		this.matricula = matricula;
		this.nome = nome;
	}

	//getters and setters
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
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	//methods
	public String obterGenero()
	{
		String texto= "";
		
		if(this.genero == 'F')
		{
			texto = "Aluna";
		}
		
		else if(this.genero == 'M')
		{
			texto = "Aluno";
		}
		
		else if(this.genero == 'O')
		{
			texto = "Alune";
		}
		
		return texto;
	}
	
	public int idade()
	{
		return 2020-this.anoNascimento;
	}
	
	public int idade(int anoAtual)
	{
		return anoAtual-this.anoNascimento;
	}
	
	public boolean situacao()
	{
		return this.ativo;
	}
	
	public void situacao(char status)
	{			
			if(status== 'A')
			{
				this.ativo = true;
			}
			else 
			{
				this.ativo = false;
			}	
	}
	
	

}
