package ListaPoo01;

public class Patinete {
	
	public String material;
	public String fabricante;
	public int idadeMinima;
	public double valor;
	
	public Patinete()
	{
		
	}

	public Patinete(String material, String fabricante, int idadeMinima, double valor) {
		this.material = material;
		this.fabricante = fabricante;
		this.idadeMinima = idadeMinima;
		this.valor = valor;
	}
	
	public void imprimedados()
	{
		System.out.print("\n\n\tDados do Patinte");
		System.out.print("\n--------------------------------");
		System.out.print("\nMaterial: "+this.material+("."));
		System.out.print("\nFabricante: "+this.fabricante+("."));
		System.out.print("\nPara crianças maiores de: "+this.idadeMinima+(" Anos."));
		System.out.print("\nValor de Compra: R$"+this.valor+("."));
		System.out.print("\n--------------------------------");
	}

}
