package ListaPoo02;

public class Empregado extends Pessoa {
	
	//attributes
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	//constructors
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	
	//getters and setters
	public Empregado()
	{
		super();
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	//methods
	
	public double imposto()
	{
		imposto = 10;
		
		return imposto;
	}
	
	public double calcularSalario()
	{
		return (salarioBase -(salarioBase*(imposto()/100)));
	}
	
	
	
	

}
