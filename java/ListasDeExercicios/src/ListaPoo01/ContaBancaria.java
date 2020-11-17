package ListaPoo01;

public class ContaBancaria {

	public String cpf;
	public String nomeCliente;
	public String tipoConta;
	public double saldo;
	
	ContaBancaria()
	{
		
	}

	public ContaBancaria(String cpf, String nomeCliente, String tipoConta, double saldo) {
		this.cpf = cpf;
		this.nomeCliente = nomeCliente;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	}
	
	public void imprimedados()
	{
		System.out.print("\n\n\tDados Conta Bancaria");
		System.out.print("\n--------------------------------");
		System.out.print("\nCPF: "+this.cpf+("."));
		System.out.print("\nCliente: "+this.nomeCliente+("."));
		System.out.print("\nTipo de conta: "+this.tipoConta+("."));
		System.out.print("\nSaldo: R$"+this.saldo+("."));
		System.out.print("\n--------------------------------");
	}
	
	
}
