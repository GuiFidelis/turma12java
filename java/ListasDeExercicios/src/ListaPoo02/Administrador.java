package ListaPoo02;

public class Administrador extends Pessoa {

	//attributes
	private double ajudaDeCusto;

	//constructor
	public Administrador(String nome, String endereco, String telefone,double ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//getters and setters
	public Administrador()
	{
		super();
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
