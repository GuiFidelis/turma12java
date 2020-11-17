package ListaPoo02;

public class Pessoa 
{
	//attributes
	private String nome;
	private String endereco;
	private String telefone;
	
	
	//constructors
	public Pessoa()
	{
		
	}

	public Pessoa(String nome, String endere�o, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}

	
	//getters and setters
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getTelefone()
	{
		return telefone;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

}
