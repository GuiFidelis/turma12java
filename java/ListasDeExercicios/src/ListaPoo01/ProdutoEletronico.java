package ListaPoo01;

public class ProdutoEletronico {
	
	public String aparelho;
	public String modelo;
	public String fabricante;
	public double valor;
	
	public ProdutoEletronico(){
		
	}

	public ProdutoEletronico(String aparelho, String modelo, String fabricante, double valor) {
		this.aparelho = aparelho;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.valor = valor;
	}
	
	public void imprimedados()
	{
		System.out.print("\n\n\tDados do Produto");
		System.out.print("\n--------------------------------");
		System.out.print("\nProduto: "+this.aparelho+("."));
		System.out.print("\nModelo: "+this.modelo+("."));
		System.out.print("\nFabricante: "+this.fabricante+("."));
		System.out.print("\nValor de Compra: R$"+this.valor+("."));
		System.out.print("\n--------------------------------");
	}
}
