package ListaPoo02;

public class Operario extends Pessoa{

	//attributes
	private double valorProducao;
	private double comissao;
	
	//constructor
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public Operario()
	{
		super();
	}

	
	//getters and setters
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		
		return comissao=valorProducao+(valorProducao*porcentagemComissao);
	}
}
