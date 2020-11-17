package ListaPoo02;

public class Vendedor extends Pessoa{

	//attributes
	private double valorVendas;
	private double comissao;
	
	//constructor
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	
	//getters and setters
	public Vendedor()
	{
		super();
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	//methods
	public double comissao()
	{
		double porcentagemComissao = 0.10;
		
		return this.comissao=valorVendas+(valorVendas*porcentagemComissao);
	}
	
	
	
	
}
