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
	
	public void imprimedados()
	{
		System.out.print("\tDados do Cliente");
		System.out.print("\n--------------------------------");
		System.out.print("\nNome: "+this.nomeCompleto+("."));
		System.out.print("\nIdade: "+this.idade+("."));
		System.out.print("\nCPF: "+this.cpf+("."));
		System.out.print("\nGênero: "+this.genero+("."));
		System.out.print("\n--------------------------------");
	}
	
}


