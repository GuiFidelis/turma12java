package ListaPoo01;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Cliente cliente1 =  new Cliente("Guilherme Fidelis",  28,"999999999999", 'M');
		Aviao aviao1 = new Aviao("Boing", 747, 300, "Internacional");
		ProdutoEletronico produto1 = new ProdutoEletronico("Celular", "PWE500T", "Nokia", 2000.00);
		Funcionario funcionario1 = new Funcionario(2020230, "Beltranho Ciclano", "Assistente Técnico", "Diurno");
		Patinete patinete1 = new Patinete("Alumínio", "Caloi", 5, 300);
		ContaBancaria conta1 = new ContaBancaria("999999999999", "Mario Bros", "Conta Corrente", 0.01);
		Paciente paciente1 = new Paciente("Neymar", "Fisioterapia", 20, "Anti-inflamatórios");
		
		cliente1.imprimedados();
		aviao1.imprimedados();
		produto1.imprimedados();
		funcionario1.imprimedados();
		patinete1.imprimedados();
		conta1.imprimedados();
		paciente1.imprimedados();
		
		
		
		
		
		
		
		
		
		
	

	}

}
