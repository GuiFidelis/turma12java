package ListaPoo02;

public class Fornecedor extends Pessoa{
	
	//attributes
	private double valorCredito;
	private double valorDivida;
	
	//constructor
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida)
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	

	public Fornecedor()
	{
		super();
	}



	//getters and setters
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//methods
	public double obterSaldo()
	{
		
		return (this.valorCredito - this.valorDivida);
	}
	
	

}
