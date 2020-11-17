package Entidades;

public class Produto {

	public String nomeProduto;
    public double medida;
    public int quantidade ;
    public double valorProdutoUni;
    
    public Produto()
    {
    	
    }
    
    public Produto( String nomeProduto, double medida, int quantidade, double valorProdutoUni)
    {
    	
    	this.nomeProduto =  nomeProduto;
    	this.medida = medida;
    	this.quantidade = quantidade;
    	this.valorProdutoUni = valorProdutoUni;

    }
}
