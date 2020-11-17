package ListaPoo01;

public class Funcionario {
	
	public int codigo;
	public String nomeCompleto;
	public String cargo;
	public String periodoTrabalho;
	
	
	public Funcionario()
	{
		
	}
	
	public Funcionario(int codigo, String nomeCompleto, String cargo, String periodoTrabalho) {
		this.codigo = codigo;
		this.nomeCompleto = nomeCompleto;
		this.cargo = cargo;
		this.periodoTrabalho = periodoTrabalho;
	}
	
	public void imprimedados()
	{
		System.out.print("\n\n      Dados do Funcionário");
		System.out.print("\n--------------------------------");
		System.out.print("\nCódigo: "+this.codigo+("."));
		System.out.print("\nNome: "+this.nomeCompleto+("."));
		System.out.print("\nCargo: "+this.cargo+("."));
		System.out.print("\nPeríodo de trabalho: "+this.periodoTrabalho+("."));
		System.out.print("\n--------------------------------");
	}

	

}
