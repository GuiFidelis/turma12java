package ListaPoo01;

public class Aviao {

	public String tipo;
	public int numeracao;
	public int capacidade;
	public String tipoDeViagem;
	
	public Aviao()
	{
		
	}
	
	public Aviao(String tipo, int numeracao, int capacidade, String tipoDeViagem)
	{
		this.tipo = tipo;
		this.numeracao = numeracao;
		this.capacidade = capacidade;
		this.tipoDeViagem = tipoDeViagem;
	}
	
	public void imprimedados()
	{
		System.out.print("\n\n\tDados do Avi�o");
		System.out.print("\n--------------------------------");
		System.out.print("\nTipo do avi�o: "+this.tipo+("."));
		System.out.print("\nNumera��o: "+this.numeracao+("."));
		System.out.print("\nCapacidade: "+this.capacidade+(" passageiros."));
		System.out.print("\nTipo de viagem: "+this.tipoDeViagem+("."));
		System.out.print("\n--------------------------------");
	}
	
	
}
