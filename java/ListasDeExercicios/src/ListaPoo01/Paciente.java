package ListaPoo01;

public class Paciente {
	
	public String nome;
	public String tipoTratamento;
	public int duracaDias;
	public String medicacao;
	
	public Paciente()
	{
		
	}

	public Paciente(String nome, String tipoTratamento, int duracaDias, String medicacao) {
		this.nome = nome;
		this.tipoTratamento = tipoTratamento;
		this.duracaDias = duracaDias;
		this.medicacao = medicacao;
	}
	
	public void imprimedados()
	{
		System.out.print("\n\n\tDados do Paciente");
		System.out.print("\n--------------------------------");
		System.out.print("\nNome: "+this.nome+("."));
		System.out.print("\nTipo de tratamento: "+this.tipoTratamento+("."));
		System.out.print("\nTempo de tratamento: "+this.duracaDias+(" dias."));
		System.out.print("\nMedicação: "+this.medicacao+("."));
		System.out.print("\n--------------------------------");
	}

	
	
}
