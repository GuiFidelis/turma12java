package ListaPoo01;

public class Cliente {

	public String nomeCompleto;
	public int idade;
	public String cpf;
	public char genero;
	
	
	public Cliente()
	{
		
	}
	
	public Cliente(String nomeCompleto, int idade, String cpf, char genero)
	{
		
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
	}
	
	public int anoNasc(int anoNasc)
	{
		anoNasc = 2020 - anoNasc;
		
		return anoNasc;
	}
	
}


